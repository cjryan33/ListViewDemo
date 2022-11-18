package com.example.listview

import androidx.annotation.DrawableRes

data class Foods(val name:String, val ingredients:String, @DrawableRes val image:Int, val price:String)
