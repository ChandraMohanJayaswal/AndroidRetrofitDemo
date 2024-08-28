package com.anu.todoretrofit.model

data class Todo(
    val _id: String,
    val created_at: String,
    val updated_at: String,
    val title: String,
    val description: String,
    val is_completed: Boolean,
)