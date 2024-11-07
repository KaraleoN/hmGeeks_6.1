package com.geeks.hmgeeks_61

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        UserProfileHeader()
        Spacer(modifier = Modifier.height(16.dp))

        UserProfileAboutSection()
        Spacer(modifier = Modifier.height(16.dp))

        UserInterestsSection()
        Spacer(modifier = Modifier.height(16.dp))

        UserFriendsSection()
    }
}

@Composable
fun UserProfileHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.user_image_background),
            contentDescription = "User Profile Image",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = "Томми Рузвельт",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(Color.Green)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Онлайн",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

@Composable
fun UserProfileAboutSection() {
    Column {
        Text(
            text = "Обо мне",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Привет! Я мобильный разработчик с опытом работы в Kotlin и Android. Мне нравится создавать приложения и изучать новые технологии.",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.padding(end = 48.dp)
        )

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { }) {
                Text(text = "Редактировать")
            }
        }
    }
}

@Composable
fun UserInterestsSection() {
    Column {
        Text(
            text = "Интересы",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        val interests = listOf("Спорт", "Музыка", "Кино", "Путешествия")
        interests.forEach { interest ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = interest, fontSize = 16.sp)
            }
        }
    }
}

@Composable
fun UserFriendsSection() {
    Column {
        Text(
            text = "Друзья",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LazyRow {
            items(10) {
                Image(
                    painter = painterResource(id = R.drawable.friend_image_background),
                    contentDescription = "Friend Avatar",
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .padding(4.dp)
                )
            }
        }
    }
}