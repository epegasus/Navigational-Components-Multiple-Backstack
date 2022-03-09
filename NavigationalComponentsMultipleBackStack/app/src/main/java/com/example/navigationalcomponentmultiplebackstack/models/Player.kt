package com.example.navigationalcomponentmultiplebackstack.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(

    var username: String? = null,
    var age: Int? = null

) : Parcelable


