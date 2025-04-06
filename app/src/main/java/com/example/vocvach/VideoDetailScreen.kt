package com.example.vocvach

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.vocvach.ui.theme.VocvachTheme


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VideoDetailScreen(modifier: Modifier = Modifier, openCategoryScreen: () -> Unit) {

    val listVideos = fakeVideodata()
    val listState = rememberLazyListState()//no hien thi part nao do khi scroll
    val isShowFilterCategory by remember {
        derivedStateOf{
            listState.firstVisibleItemIndex > 0 //hien thi khi out khoi phan tu 0
        }
    }

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        state = listState
        ) {
        stickyHeader {//giu co dinh header
            VideoDetail(
                videoThumb = R.drawable.video_thumbnail,
                videoTitle = "Jetpack Compose List and Grid",
                views = 1000,
                timeAgo = "1000 years ago",
                isShowFilterCategory = isShowFilterCategory,
                openCategoryScreen = openCategoryScreen
            )
        }
        items(listVideos){
            video ->
            NextVideo(videoTitle = video.videoTitle, views = video.views, timeAgo = video.timeAgo)
        }

    }
}


fun fakeVideodata(): List<Video>{
    val list = mutableListOf<Video>()
    for (index in 0..10){
        val video = Video(videoTitle = "Video $index", views = index, timeAgo = "$index days")
        list.add(video)
    }
    return list
}

@Composable
fun FilterCategory(modifier: Modifier = Modifier, openCategoryScreen: () -> Unit){
    var selected by remember { mutableStateOf<Int?>(null) }
    val listCategories = fakeCategoy()
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        contentPadding = PaddingValues(horizontal = 12.dp) //có padding nhưng ko ăn mất khi scroll
    ) {
        items(listCategories){
            category ->
            val isSelected = selected == category.id
            FilterChip(
                onClick = {
                    selected = if (isSelected) null else category.id
                    openCategoryScreen()
                          },
                label = {Text(text = category.name) },
                selected = isSelected,
                leadingIcon = if (isSelected) {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
//                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
    }
}

fun fakeCategoy(): List<VideoCategory>{
    val list = mutableListOf<VideoCategory>()
    for (index in 0..10){
        val category = VideoCategory(id = index, name = "Category $index")
        list.add(category)
    }
    return list
}

@Composable
fun VideoActionItem(modifier: Modifier = Modifier, @DrawableRes icon: Int, name: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {

        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.height(2.dp))

        Text(name, style = TextStyle(fontSize = 12.sp))
    }
}

@Composable
fun VideoAction(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        VideoActionItem(icon = R.drawable.ic_thumbup, name = "25.6K")
        VideoActionItem(icon = R.drawable.ic_thumbdown, name = "200K")
        VideoActionItem(icon = R.drawable.ic_share, name = "Share")
        VideoActionItem(icon = R.drawable.ic_download, name = "Download")
        VideoActionItem(icon = R.drawable.ic_save_to_playlist, name = "Save")

    }
}

@Composable
fun VideoDetailInfo(
    modifier: Modifier = Modifier,
    videoTitle: String,
    views: Int,
    timeAgo: String
) {
    Column(modifier = modifier.fillMaxWidth()) {

        Row(verticalAlignment = Alignment.Top) {
            Text(
                videoTitle,
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.weight(1f)
            )
            Icon(
                painterResource(id = R.drawable.ic_arrow_down),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Text(
                "$views views",
                style = TextStyle(
                    color = Color(0xff6C6C6C),
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                timeAgo,
                style = TextStyle(
                    color = Color(0xff6C6C6C),
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            )
        }
    }
}

@Composable
fun VideoDetail(
    modifier: Modifier = Modifier,
    @DrawableRes videoThumb: Int,
    videoTitle: String,
    views: Int,
    timeAgo: String,
    isShowFilterCategory: Boolean,
    openCategoryScreen: () -> Unit
) {

    Column(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = videoThumb), contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(top = 12.dp)
        ) {
            if (isShowFilterCategory){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                        .background(color = Color.White)
                ){
                    FilterCategory(openCategoryScreen = openCategoryScreen)
                }
            }
            else{
                VideoDetailInfo(
                    videoTitle = videoTitle,
                    views = views,
                    timeAgo = timeAgo,
                    modifier = Modifier.padding(horizontal = 12.dp)
                )
                VideoAction()
            }
        }
    }
}


@Composable
fun NextVideoInfo(videoTitle: String, views: Int, timeAgo: String, modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = modifier.fillMaxWidth()) {
        val (imgAvatar, tvVideoTitle, layoutInfo, imgMore) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.jetpack_compose),
            contentDescription = null,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .constrainAs(imgAvatar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )

        Image(
            painter = painterResource(id = R.drawable.ic_more),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .constrainAs(imgMore) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }
        )

        Text(text = videoTitle, style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.constrainAs(tvVideoTitle) {
                start.linkTo(imgAvatar.end, margin = 4.dp)
                end.linkTo(imgMore.start, margin = 4.dp)
                top.linkTo(parent.top)
                width = Dimension.fillToConstraints
            }
        )

        Row(modifier = Modifier.constrainAs(layoutInfo) {
            top.linkTo(tvVideoTitle.bottom, margin = 4.dp)
            start.linkTo(tvVideoTitle.start)
        }) {
            Text(
                "$views views",
                style = TextStyle(
                    color = Color(0xff6C6C6C),
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                timeAgo,
                style = TextStyle(
                    color = Color(0xff6C6C6C),
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            )
        }
    }

}

@Composable
fun NextVideo(videoTitle: String, views: Int, timeAgo: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.thumbnail_next_video),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
        )
        Spacer(modifier = Modifier.height(12.dp))
        NextVideoInfo(
            videoTitle = videoTitle,
            views = views,
            timeAgo = timeAgo,
            modifier = Modifier.padding(horizontal = 12.dp)
        )
    }
}



//@Composable
//@Preview(name = "Video Info Item Preview", showBackground = true)
//fun VideoActionItemPreview() {
//    VocvachTheme {
//        VideoActionItem(icon = R.drawable.ic_thumbup, name = "25.6K")
//    }
//}
//
//@Composable
//@Preview(name = "Video Info Preview", showBackground = true)
//fun VideoActionPreview() {
//    VocvachTheme {
//        VideoAction()
//    }
//}
//
//@Composable
//@Preview(name = "video detail preview", showBackground = true)
//fun VideoDetailPreview() {
//    VideoDetail(
//        videoThumb = R.drawable.video_thumbnail,
//        videoTitle = "Android Jetpack Compose List and Grid",
//        views = 999,
//        timeAgo = "1 day ago"
//    )
//}
//
//@Composable
//@Preview(name = "Next video preview", showBackground = true)
//fun NextVideoPreview() {
//    NextVideo(videoTitle = "Jetpack Compose Basic Layout", views = 22, timeAgo = " 20 years ago")
//}

@Composable
@Preview(name = "Video Detail Preview", showSystemUi = true, showBackground = true)
fun VideoDetailScreenPreview() {
    VocvachTheme {
        VideoDetailScreen(){

        }
    }
}