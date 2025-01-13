package com.example.coffe.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.coffe.R

data class ProductCategoryItem(
    val imageImageCoffee: Int,
    val imageStar: Int,
    val gridData421: String,
    val textCaffeMocha: String,
    val textDeepFoam: String,
    val price: String,
    val imageIconaddplus: Int
)

@Composable
fun HighFidelityHome(modifier: Modifier = Modifier) {
    val coffeeTypes = listOf("All Coffee", "Machiato", "Latte", "Americano")
    val gridData = listOf(
        ProductCategoryItem(R.drawable.kopi, R.drawable.heart, "4.8", "Caffe Mocha", "Deep Foam", "$ 4.53", R.drawable.kopi),
        ProductCategoryItem(R.drawable.kopi, R.drawable.kopi, "4.8", "Caffe Mocha", "Deep Foam", "$ 4.53", R.drawable.kopi),
        ProductCategoryItem(R.drawable.kopi, R.drawable.kopi, "4.8", "Caffe Mocha", "Deep Foam", "$ 4.53", R.drawable.kopi),
        ProductCategoryItem(R.drawable.kopi, R.drawable.kopi, "4.8", "Caffe Mocha", "Deep Foam", "$ 4.53", R.drawable.kopi)
    )
    Box(
        modifier = modifier
            .requiredWidth(width = 375.dp)
            .requiredHeight(height = 812.dp)
            .background(color = Color(0xfff9f9f9))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .offset(x = 0.dp, y = (-1).dp)
                .requiredWidth(width = 375.dp)
                .requiredHeight(height = 436.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp, y = 0.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 327.dp)
                ) {
                    coffeeTypes.forEach { coffeeType ->
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = if (coffeeType == "All Coffee") Color(0xffc67c4e) else Color(0xffededed).copy(alpha = 0.35f))
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = coffeeType,
                                color = if (coffeeType == "All Coffee") Color.White else Color(0xff313131),
                                lineHeight = 10.71.em,
                                style = TextStyle(fontSize = 14.sp)
                            )
                        }
                    }
                }
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    horizontalArrangement = Arrangement.spacedBy(15.dp),
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    content = {
                        items(gridData.size) { index ->
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .clip(shape = RoundedCornerShape(16.dp))
                                    .background(color = Color.White)
                                    .padding(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 12.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 140.dp)
                                        .requiredHeight(height = 128.dp)
                                ) {
                                    Property1CoffeeProperty22(
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .offset(x = 0.dp, y = 0.dp),
                                        imageImageCoffee = gridData[index].imageImageCoffee
                                    )
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(alignment = Alignment.TopEnd)
                                            .offset(x = 0.dp, y = 0.dp)
                                            .requiredWidth(width = 51.dp)
                                            .clip(shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 24.dp))
                                            .background(brush = Brush.linearGradient(
                                                colors = listOf(Color(0xff111111), Color(0xff313131)),
                                                start = Offset(51f, 0f),
                                                end = Offset(0f, 28f)
                                            ))
                                            .padding(all = 8.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.kopi),
                                            contentDescription = null,
                                            modifier = Modifier.requiredSize(size = 12.dp)
                                        )
                                        Text(
                                            text = gridData[index].gridData421,
                                            color = Color.White,
                                            lineHeight = 18.75.sp,
                                            style = TextStyle(fontSize = 8.sp)
                                        )
                                    }
                                }
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically)
                                ) {
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top)
                                    ) {
                                        Text(
                                            text = gridData[index].textCaffeMocha,
                                            color = Color(0xff242424),
                                            lineHeight = 9.38.sp,
                                            style = TextStyle(fontSize = 16.sp)
                                        )
                                        Text(
                                            text = gridData[index].textDeepFoam,
                                            color = Color(0xffa2a2a2),
                                            lineHeight = 10.sp,
                                            style = TextStyle(fontSize = 12.sp)
                                        )
                                    }
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(32.dp, Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = gridData[index].price,
                                            color = Color(0xff050505),
                                            lineHeight = 8.33.sp,
                                            style = TextStyle(fontSize = 18.sp),
                                            modifier = Modifier.requiredWidth(width = 76.dp)
                                        )
                                        TypedefaultLibraryplus(
                                            imageIconaddplus = gridData[index].imageIconaddplus
                                        )
                                    }
                                }
                            }
                        }
                    },
                    modifier = Modifier.requiredWidth(width = 327.dp).requiredHeight(height = 500.dp)
                )
            }
        }
        Box(
            modifier = Modifier.requiredWidth(width = 375.dp).requiredHeight(height = 280.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp, y = 0.dp)
                    .requiredWidth(width = 375.dp)
                    .requiredHeight(height = 280.dp)
                    .background(brush = Brush.linearGradient(
                        colors = listOf(Color(0xff111111), Color(0xff313131)),
                        start = Offset(375f, 0f),
                        end = Offset(0f, 280f)
                    ))
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp, y = 211.dp)
                    .requiredWidth(width = 327.dp)
                    .requiredHeight(height = 140.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .offset(x = 0.dp, y = 0.dp)
                        .requiredWidth(width = 327.dp)
                        .requiredHeight(height = 140.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.banner),
                    contentDescription = "Banner 1",
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .offset(x = 0.dp, y = 0.dp)
                        .requiredWidth(width = 327.dp)
                        .requiredHeight(height = 140.dp)
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 24.dp, y = 13.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(color = Color(0xffed5151))
                            .padding(horizontal = 6.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "Promo",
                            color = Color.White,
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier
                                .requiredWidth(width = 48.dp)
                                .requiredHeight(height = 18.dp)
                        )
                    }
                    Box(
                        modifier = Modifier.requiredWidth(width = 204.dp).requiredHeight(height = 80.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp, y = 54.dp)
                                .requiredWidth(width = 149.dp)
                                .requiredHeight(height = 23.dp)
                                .background(brush = Brush.linearGradient(
                                    colors = listOf(Color(0xff111111), Color(0xff313131)),
                                    start = Offset(149f, 0f),
                                    end = Offset(0f, 23f)
                                ))
                        )
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp, y = 15.dp)
                                .requiredWidth(width = 200.dp)
                                .requiredHeight(height = 27.dp)
                                .background(brush = Brush.linearGradient(
                                    colors = listOf(Color(0xff111111), Color(0xff313131)),
                                    start = Offset(200f, 0f),
                                    end = Offset(0f, 27f)
                                ))
                        )
                        Text(
                            text = "Buy one get one FREE",
                            color = Color.White,
                            style = MaterialTheme.typography.headlineLarge,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 1.dp, y = 0.dp)
                                .requiredWidth(width = 203.dp)
                        )
                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(122.dp, Alignment.Start),
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 24.dp, y = 68.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top)
                ) {
                    Text(
                        text = "Location",
                        color = Color(0xffa2a2a2),
                        lineHeight = 10.sp,
                        style = TextStyle(fontSize = 12.sp)
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Bilzen, Tanjungbalai",
                            color = Color(0xffd8d8d8),
                            lineHeight = 10.71.sp,
                            style = TextStyle(fontSize = 14.sp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Icon",
                            colorFilter = ColorFilter.tint(Color(0xffd8d8d8)),
                            modifier = Modifier.requiredSize(size = 14.dp)
                        )
                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 24.dp,
                        y = 135.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 259.dp)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color(0xff2a2a2a))
                        .padding(all = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "Icon",
                        tint = Color.White,
                        modifier = Modifier
                            .requiredSize(size = 20.dp))
                    Text(
                        text = "Search coffee",
                        color = Color(0xffa2a2a2),
                        lineHeight = 8.57.em,
                        style = TextStyle(
                            fontSize = 14.sp))
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color(0xffc67c4e))
                        .padding(all = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "Icon",
                        tint = Color.White,
                        modifier = Modifier
                            .requiredSize(size = 20.dp))
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(56.dp, Alignment.CenterHorizontally),
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .offset(x = 0.dp,
                    y = 0.dp)
                .requiredWidth(width = 375.dp)
                .requiredHeight(height = 99.dp)
                .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(color = Color.White)
                .padding(all = 24.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = "Iconly/Bulk/Home",
                    colorFilter = ColorFilter.tint(Color(0xffc67c4e)),
                    modifier = Modifier
                        .requiredSize(size = 24.dp))
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 10.dp)
                        .requiredHeight(height = 5.dp)
                        .clip(shape = RoundedCornerShape(18.dp))
                        .background(color = Color(0xffc67c4e)))
            }
            Icon(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = "Icon",
                tint = Color(0xffa2a2a2))
            Icon(
                painter = painterResource(id = R.drawable.tas),
                contentDescription = "Icon",
                tint = Color(0xffa2a2a2))
            Icon(
                painter = painterResource(id = R.drawable.notif),
                contentDescription = "Icon",
                tint = Color(0xffa2a2a2))
        }
        LibraryHomeIndicator(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .offset(x = 0.dp,
                    y = 0.dp))
    }
}

@Composable
fun Property1CoffeeProperty22(modifier: Modifier = Modifier, imageImageCoffee: Int) {
    Box(
        modifier = modifier
            .requiredWidth(width = 140.dp)
            .requiredHeight(height = 128.dp)
    ) {
        Image(
            painter = painterResource(id = imageImageCoffee),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(12.dp)))
    }
}

@Composable
fun TypedefaultLibraryplus(modifier: Modifier = Modifier, imageIconaddplus: Int) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xffc67c4e))
            .padding(all = 8.dp)
    ) {
        Image(
            painter = painterResource(id = imageIconaddplus),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(size = 16.dp))
    }
}

@Composable
fun LibraryHomeIndicator(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 375.dp)
            .requiredHeight(height = 34.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .offset(x = 0.5.dp,
                    y = (-8).dp)
                .requiredWidth(width = 134.dp)
                .requiredHeight(height = 5.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff242424)))
    }
}

@Preview(widthDp = 375, heightDp = 812)
@Composable
private fun HighFidelityHomePreview() {
    HighFidelityHome(Modifier)
}