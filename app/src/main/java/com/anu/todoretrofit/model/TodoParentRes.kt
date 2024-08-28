package com.anu.todoretrofit.model

data class TodoParentRes(
    val code: Int = 200,
    val success: Boolean = true,
    val timestamp: Long = 1724826077098,
    val message: String = "Paginated Response",
    val items : List<Todo> //Date issue
//    var meta: Meta
)