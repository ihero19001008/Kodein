package com.example.kodein.model

import com.google.gson.annotations.SerializedName

data class PostRespone(
    @SerializedName("images")
    val list:List<Post>
)