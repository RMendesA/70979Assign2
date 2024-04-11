package com.stu70979.moviebookingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingPg(movie: Movie, navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.Red,
                ),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Routes.FirstScreen.route) }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description",
                            tint = Color.Red
                        )
                    }
                },
                title = {
                        Text("MOVIES",
                            modifier = Modifier
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.ExtraBold)
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Black,
                contentColor = Color.LightGray,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "MOVIE BOOKING APP",
                )
            }
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.Black)
        ){
            item{
                Image(
                painter = rememberAsyncImagePainter(movie.image),
                contentDescription = "Movie Poster",
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(600.dp),
                contentScale = ContentScale.Crop
            )
            }
            item{ MovieColumn(movie)}
        }
    }
}

@Composable
fun MovieColumn(movie: Movie) {
    var seatsSelected by remember { mutableStateOf(movie.seatsSelected) }
    var seatsRemaining by remember { mutableStateOf(movie.seatsRemaining) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = movie.name,
                style = typography.titleLarge,
                color = Color.White
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(
                text = "Running time ",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = typography.bodyLarge
            )
            Text(
                text = (movie.runTime / 60).toString() + "hr " + (movie.runTime % 60).toString() + "min",
                color = Color.Gray,
                style = typography.bodyMedium
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = movie.movieDescription,
            color = Color.LightGray,
            style = typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Select Seats",
                color = Color.White,
                style = typography.titleLarge
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(painter = painterResource(id = R.drawable.minus),
                contentDescription = "A minus sign",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
                    .background(Color.Gray)
                    .clickable {
                        if (seatsSelected > 0) {
                            seatsSelected -= 1;
                            seatsRemaining += 1;
                            movie.seatsSelected = seatsSelected
                            movie.seatsRemaining = seatsRemaining
                        }
                    })
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = seatsSelected.toString(),
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(painter = painterResource(id = R.drawable.plus),
                contentDescription = "A plus sign",
                modifier = Modifier
                    .background(Color.Gray)
                    .size(width = 20.dp, height = 20.dp)
                    .clickable {
                        if (seatsRemaining > 0) {
                            seatsSelected += 1
                            seatsRemaining -= 1
                            movie.seatsSelected = seatsSelected
                            movie.seatsRemaining = seatsRemaining
                        }
                    })
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.seat),
                    contentDescription = "A seat",
                    modifier = Modifier
                        .background(Color.Gray)
                        .size(width = 20.dp, height = 20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "$seatsSelected seats remaining",
                    color = Color.White,
                    style = typography.titleLarge
                )
            }
        }
    }
}




