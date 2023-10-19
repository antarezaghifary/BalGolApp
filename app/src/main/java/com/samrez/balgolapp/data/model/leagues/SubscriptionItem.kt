package com.samrez.balgolapp.data.model.leagues

import com.google.gson.annotations.SerializedName

data class SubscriptionItem(
    @field:SerializedName("meta")
    val meta: List<Any?>? = null,

    @field:SerializedName("plans")
    val plans: List<PlansItem?>? = null,

    @field:SerializedName("add_ons")
    val addOns: List<Any?>? = null,

    @field:SerializedName("widgets")
    val widgets: List<Any?>? = null
)
