package com.example.android_for_beginners_dicoding

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val  name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable
