package com.example.tugasretrofit.model

import com.google.gson.annotations.SerializedName

data class FilmModel(

	@field:SerializedName("result")
	val result: List<ResultItem?>? = null
)

data class ResultItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("id")
	val id: Int? = 0,

	@field:SerializedName("title")
	val title: String? = null
)
