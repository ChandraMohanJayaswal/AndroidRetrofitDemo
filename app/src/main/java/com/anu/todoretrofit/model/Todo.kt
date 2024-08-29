package com.anu.todoretrofit.model

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.serialization.Serializable
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

data class Todo(
    val _id: String,
    val created_at: ZonedDateTime ,
    val is_completed: Boolean,
    val description: String,
    val title: String,
    val updated_at: ZonedDateTime,
){

//    val createdAtZoned: ZonedDateTime
//        @RequiresApi(Build.VERSION_CODES.O)
//        get() = ZonedDateTime.parse(created_at, DateTimeFormatter.ISO_ZONED_DATE_TIME)
//
//    val updatedAtZoned: ZonedDateTime
//        @RequiresApi(Build.VERSION_CODES.O)
//        get() = ZonedDateTime.parse(updated_at, DateTimeFormatter.ISO_ZONED_DATE_TIME)

    constructor(
        _id: String,
        created_at: String ,
        is_completed: Boolean,
        title: String,
        description: String,
        updated_at: String,
    ):this(
        _id = _id,
        created_at = ZonedDateTime.parse(created_at, DateTimeFormatter.ISO_ZONED_DATE_TIME),
        is_completed = is_completed,
        title = title,
        description=description,
        updated_at = ZonedDateTime.parse(updated_at, DateTimeFormatter.ISO_ZONED_DATE_TIME)
    )
}

