package com.samrez.balgolapp.data.model.leagues

import com.google.gson.annotations.SerializedName

data class Leagues(

	@field:SerializedName("pagination")
	val pagination: Pagination? = null,

	@field:SerializedName("rate_limit")
	val rateLimit: RateLimit? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("subscription")
	val subscription: List<SubscriptionItem?>? = null
)

//data class DataItem(
//
//	@field:SerializedName("sport_id")
//	val sportId: Int? = null,
//
//	@field:SerializedName("sub_type")
//	val subType: String? = null,
//
//	@field:SerializedName("image_path")
//	val imagePath: String? = null,
//
//	@field:SerializedName("name")
//	val name: String? = null,
//
//	@field:SerializedName("active")
//	val active: Boolean? = null,
//
//	@field:SerializedName("has_jerseys")
//	val hasJerseys: Boolean? = null,
//
//	@field:SerializedName("id")
//	val id: Int? = null,
//
//	@field:SerializedName("type")
//	val type: String? = null,
//
//	@field:SerializedName("last_played_at")
//	val lastPlayedAt: String? = null,
//
//	@field:SerializedName("category")
//	val category: Int? = null,
//
//	@field:SerializedName("country_id")
//	val countryId: Int? = null,
//
//	@field:SerializedName("short_code")
//	val shortCode: String? = null
//)

//data class SubscriptionItem(
//
//	@field:SerializedName("meta")
//	val meta: List<Any?>? = null,
//
//	@field:SerializedName("plans")
//	val plans: List<PlansItem?>? = null,
//
//	@field:SerializedName("add_ons")
//	val addOns: List<Any?>? = null,
//
//	@field:SerializedName("widgets")
//	val widgets: List<Any?>? = null
//)

//data class RateLimit(
//
//	@field:SerializedName("resets_in_seconds")
//	val resetsInSeconds: Int? = null,
//
//	@field:SerializedName("remaining")
//	val remaining: Int? = null,
//
//	@field:SerializedName("requested_entity")
//	val requestedEntity: String? = null
//)

//data class PlansItem(
//
//	@field:SerializedName("category")
//	val category: String? = null,
//
//	@field:SerializedName("plan")
//	val plan: String? = null,
//
//	@field:SerializedName("sport")
//	val sport: String? = null
//)

//data class Pagination(
//
//	@field:SerializedName("next_page")
//	val nextPage: Any? = null,
//
//	@field:SerializedName("per_page")
//	val perPage: Int? = null,
//
//	@field:SerializedName("count")
//	val count: Int? = null,
//
//	@field:SerializedName("has_more")
//	val hasMore: Boolean? = null,
//
//	@field:SerializedName("current_page")
//	val currentPage: Int? = null
//)
