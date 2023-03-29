package com.teka.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Celeb(
    val name: String,
    val description: String,
    val imageUrl: String
)
