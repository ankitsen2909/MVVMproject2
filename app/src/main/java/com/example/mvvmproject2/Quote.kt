package com.example.mvvmproject2

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "table")
data class Quote(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val text: String,
    val author: String
)
