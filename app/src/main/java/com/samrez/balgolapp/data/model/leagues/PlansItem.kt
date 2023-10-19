package com.samrez.balgolapp.data.model.leagues

import com.google.gson.annotations.SerializedName

data class PlansItem(
    @field:SerializedName("category")
    val category: String? = null,

    @field:SerializedName("plan")
    val plan: String? = null,

    @field:SerializedName("sport")
    val sport: String? = null
)
