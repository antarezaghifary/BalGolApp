package com.samrez.balgolapp.data.model.leagues

import com.google.gson.annotations.SerializedName

data class Pagination(
    @field:SerializedName("next_page")
    val nextPage: Any? = null,

    @field:SerializedName("per_page")
    val perPage: Int? = null,

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("has_more")
    val hasMore: Boolean? = null,

    @field:SerializedName("current_page")
    val currentPage: Int? = null
)
