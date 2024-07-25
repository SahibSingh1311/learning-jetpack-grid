package com.example.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringRes: Int,
    val courseId: Int,
    @DrawableRes val imageResourceId : Int
)
