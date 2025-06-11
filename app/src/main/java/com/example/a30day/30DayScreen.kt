package com.example.a30day

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30day.data.studyPlan
import com.example.a30day.model.Day
import com.example.a30day.model.Week


fun openLink(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent) // Use context to start activity
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun AppScreen() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("30 Days of Kotlin", style = MaterialTheme.typography.bodyLarge, fontSize = 32.sp)}
            )
        }
    ) {innerPadding ->
        WeekScreen(
            week = studyPlan,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun WeekScreen(week: List<Week>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(week) { week ->
            Text(
                text = "Week ${week.weekNumber}",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(
                modifier = Modifier.padding(8.dp),
            ) {
                items(week.days) { day ->
                    AppCard(day = day,
                        )
                }
            }
        }
    }
}

@Composable
fun AppCard(
    day: Day,
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(top = 16.dp,bottom = 16.dp,start = 16.dp,end = 12.dp,)
            .width(240.dp)
            .background(color = MaterialTheme.colorScheme.surface)
        ,
//            .height(418.dp)
        onClick = { expanded = !expanded }
    ) {
        Column() {
            Image(
                painter = painterResource(day.imageRes),
                contentDescription = day.description,
                modifier = Modifier
                    .height(240.dp)
                    .width(240.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
//            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    day.title,
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                if (expanded) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        day.description,
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 14.sp,
                    )
                    Spacer(modifier = Modifier.height(48.dp))
                    Button(
                        modifier = Modifier
                            .width(208.dp)
                            .height(40.dp),
                        onClick = { openLink(context, day.resources.first()) },
                        enabled = day.resources.isNotEmpty(),
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonColors(
                            containerColor = MaterialTheme.colorScheme.secondary,
                            contentColor = MaterialTheme.colorScheme.onSecondary,
                            disabledContainerColor = MaterialTheme.colorScheme.primary,
                            disabledContentColor = MaterialTheme.colorScheme.onPrimary,
                        ),
                    ) {
                        Text(
                            "Resources",
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun AppPreview() {
    AppScreen()
}
