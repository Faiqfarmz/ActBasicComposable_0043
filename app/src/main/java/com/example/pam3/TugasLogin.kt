package com.example.pam3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam3.ui.theme.Pam3Theme

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    // Ganti nama drawable di bawah sesuai nama file gambar di res/drawable
    val latar = painterResource(id = R.drawable.gambar3)
    val logo = painterResource(id = R.drawable.gambar2)
    val foto = painterResource(id = R.drawable.gambar1)
    Box(
        modifier = modifier.fillMaxSize()
    ){
        Image(
            painter = latar,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                    text = "Ini adalah halaman login,",
            fontSize = 14.sp,
            color = Color.White
            )
            Spacer(modifier = Modifier.height(48.dp))

            // Logo
            Image(
                painter = logo,
                contentDescription = "Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(140.dp)
            )
            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
            Text(
                text = "Faiq Rizky Maulana",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                    text = "20240140043",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
            )
            Spacer(modifier = Modifier.height(16.dp))


            Image(
                painter = foto,
                contentDescription = "Foto",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(280.dp)
                    .clip(CircleShape)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasLoginPreview() {
    Pam3Theme() {
        TugasLogin()
    }
}



