package com.samrez.balgolapp.data.model.leagues

import com.google.gson.annotations.SerializedName

data class RateLimit(
    @field:SerializedName("resets_in_seconds")
    val resetsInSeconds: Int? = null,

    @field:SerializedName("remaining")
    val remaining: Int? = null,

    @field:SerializedName("requested_entity")
    val requestedEntity: String? = null
)
