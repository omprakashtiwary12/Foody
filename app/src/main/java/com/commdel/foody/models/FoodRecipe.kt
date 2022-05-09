package com.commdel.foody.models


import com.commdel.foody.models.Result
import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>
)