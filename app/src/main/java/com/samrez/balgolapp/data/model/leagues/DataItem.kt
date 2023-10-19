package com.samrez.balgolapp.data.model.leagues

import com.google.gson.annotations.SerializedName

data class DataItem(
    @field:SerializedName("sport_id")
    val sportId: Int? = null,

    @field:SerializedName("sub_type")
    val subType: String? = null,

    @field:SerializedName("image_path")
    val imagePath: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("active")
    val active: Boolean? = null,

    @field:SerializedName("has_jerseys")
    val hasJerseys: Boolean? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("last_played_at")
    val lastPlayedAt: String? = null,

    @field:SerializedName("category")
    val category: Int? = null,

    @field:SerializedName("country_id")
    val countryId: Int? = null,

    @field:SerializedName("short_code")
    val shortCode: String? = null
)