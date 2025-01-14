package com.example.coffe.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.coffe.R
import com.example.coffe.ui.component.BottomNavbar

@Composable
fun CoffeeAppUI() {
    val coffeeItems = listOf(
        CoffeeItemData("Caffe Mocha", "Deep Foam", "$4.53", R.drawable.caffemocha),
        CoffeeItemData("Flat White", "Espresso", "$3.53", R.drawable.flatwhite),
        CoffeeItemData("Cappuccino", "Milk Foam", "$3.53", R.drawable.cappucino),
        CoffeeItemData("Espresso", "Strong", "$2.53", R.drawable.espresso)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        // Black background box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .background(brush = Brush.linearGradient(
                    colors = listOf(Color(0xff111111), Color(0xff313131)),
                    start = Offset(375f, 0f),
                    end = Offset(0f, 280f)
                ))
        )

        // Main content
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            // Location
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 32.dp, bottom = 16.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Location",
                        color = Color(0xffa2a2a2),
                        lineHeight = 10.sp,
                        style = TextStyle(fontSize = 12.sp)
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Bilzen, Tanjungbalai",
                            color = Color(0xffd8d8d8),
                            lineHeight = 10.sp,
                            style = TextStyle(fontSize = 14.sp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.locationarrow),
                            contentDescription = "Icon",
                            tint = Color(0xffd8d8d8),
                            modifier = Modifier.requiredSize(size = 14.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                // Search Bar
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .weight(1f)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color(0xff2a2a2a))
                        .padding(all = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "Icon",
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "Search coffee",
                        color = Color(0xffa2a2a2),
                        lineHeight = 8.57.em,
                        style = TextStyle(fontSize = 14.sp)
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                // filter button
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = Color(0xffc67c4e))
                        .padding(all = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.filter),
                        contentDescription = "Icon",
                        tint = Color.White,
                        modifier = Modifier.requiredSize(size = 20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Promo Banner
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.banner),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Category Tabs
            val categories = listOf("All Coffee", "Machiato", "Latte", "Americano")
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
            ){
                LazyRow {
                    items(categories) { category ->
                        Text(
                            text = category,
                            modifier = Modifier
                                .padding(horizontal = 4.dp, vertical = 4.dp)
                                .background(if (category == "All Coffee") Color(0xFFC67C4E) else Color.White, RoundedCornerShape(6.dp))
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                            color = if (category == "All Coffee") Color.White else Color.Black
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Coffee Items
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.padding(horizontal = 16.dp),
                content = {
                    items(coffeeItems) { item ->
                        CoffeeItem(name = item.name, type = item.type, price = item.price, imageResId = item.imageResId)
                    }
                }
            )
        }

        // Bottom Navbar
        BottomNavbar(modifier = Modifier.align(Alignment.BottomCenter))
    }
}

data class CoffeeItemData(val name: String, val type: String, val price: String, val imageResId:Int)

@Composable
fun CoffeeItem(name: String, type: String, price: String, imageResId: Int) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(Color.White, RoundedCornerShape(15.dp))
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .requiredHeight(128.dp)
                .requiredWidth(140.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Spacer(modifier = Modifier.height(6.dp))
        Text(type, color = Color.Gray, fontSize = 12.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(price, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFC67C4E))
                    .clickable {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "Add to cart",
                    tint = Color.White,
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.Center)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CoffeeAppUIPreview() {
    CoffeeAppUI()
}