package com.example.a2022kw_winterproj.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class MyEntity (
    @PrimaryKey(autoGenerate = true) val id: Int,// PrimaryKey 를 자동적으로 생성
    @ColumnInfo var theme: String,
    @ColumnInfo var num: Int,
    @ColumnInfo var saying: String,
    @ColumnInfo var author: String
)