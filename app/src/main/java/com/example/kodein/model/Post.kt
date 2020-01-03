package com.example.kodein.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Class which provides a model for post
 * @constructor Sets all properties of the post
 * @property userId the unique identifier of the author of the post
 * @property id the unique identifier of the post
 * @property title the title of the post
 * @property body the content of the post
 */
@Entity
data class Post(

    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("url")
    @Expose
    val url: String,
    @SerializedName("large_url")
    @Expose
    val large_url: String,
    @SerializedName("source_id")
    @Expose
    val source_id: Any,
    @SerializedName("site")
    @Expose
    val site:String,
    @SerializedName("copyright")
    @Expose
    val copyright: String
)