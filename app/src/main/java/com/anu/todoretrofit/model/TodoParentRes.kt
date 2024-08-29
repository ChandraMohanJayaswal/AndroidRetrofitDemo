package com.anu.todoretrofit.model

data class TodoParentRes(
    val code: Int = 200,
    val success: Boolean = true,
    val timestamp: Long = 1724826077098,
    val message: String = "Paginated Response",
    val items : List<Todo>,
    val meta: Meta
)

data class Meta(
    val total_items : Int,
    val total_pages : Int,
    val per_page_item : Int,
    val current_page : Int,
    val page_size : Int,
    val has_more_page : Boolean
)