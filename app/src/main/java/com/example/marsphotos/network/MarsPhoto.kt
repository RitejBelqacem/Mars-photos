package com.example.marsphotos.network
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

class MarsPhoto {


    @Serializable
    data class MarsPhoto(
        @SerialName(value = "img_src")
        val imgSrc: String
    )
}