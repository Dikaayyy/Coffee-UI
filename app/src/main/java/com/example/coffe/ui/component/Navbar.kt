package com.example.coffe.ui.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.coffe.R

@Composable
fun BottomNavbar(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(56.dp, Alignment.CenterHorizontally),
        modifier = modifier
            .fillMaxWidth()
            .height(99.dp)
            .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(color = Color.White)
            .padding(all = 24.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.homefig),
                contentDescription = "Home",
                tint = Color(0xffc67c4e),
                modifier = Modifier.size(24.dp)
            )
            Box(
                modifier = Modifier
                    .requiredWidth(width = 10.dp)
                    .requiredHeight(height = 5.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffc67c4e))
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = "Heart",
            tint = Color(0xffa2a2a2),
            modifier = Modifier.size(24.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.tas),
            contentDescription = "Tas",
            tint = Color(0xffa2a2a2),
            modifier = Modifier.size(24.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.notif),
            contentDescription = "Notif",
            tint = Color(0xffa2a2a2),
            modifier = Modifier.size(24.dp)
        )
    }
}