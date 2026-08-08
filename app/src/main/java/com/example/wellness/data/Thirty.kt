package com.example.wellness.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.wellness.R

data class Thirty(
    @StringRes val dayRes:Int,
    @StringRes val titleRes:Int,
    @DrawableRes val imageRes:Int,
    @StringRes val descriptionRes: Int
)
val thirtys = listOf(
    Thirty(
        dayRes = R.string.day1_title,
        titleRes = R.string.day1_heading,
        imageRes = R.drawable.android_superhero1,
        descriptionRes = R.string.day1_description,

    ),
    Thirty(
        dayRes = R.string.day2_title,
        titleRes = R.string.day2_heading,
        imageRes = R.drawable.android_superhero2,
        descriptionRes = R.string.day2_description,

    ),
    Thirty(
        dayRes = R.string.day3_title,
        titleRes = R.string.day3_heading,
        imageRes = R.drawable.android_superhero3,
        descriptionRes = R.string.day3_description,

    ),
    Thirty(
        dayRes = R.string.day4_title,
        titleRes = R.string.day4_heading,
        imageRes = R.drawable.android_superhero4,
        descriptionRes = R.string.day4_description,

    ),
    Thirty(
        dayRes = R.string.day5_title,
        titleRes = R.string.day5_heading,
        imageRes = R.drawable.android_superhero5,
        descriptionRes = R.string.day5_description,

    )
)