package com.example.jetpackcomposemvvm

import androidx.compose.runtime.Composable

@Composable
fun TopScreen(list: List<Conversion>) {
    ConversionMenu(list = list)
}