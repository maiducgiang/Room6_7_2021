package com.example.room6_7_2021.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cat")
data class Cat(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val catName:String = "Egypt",
    @ColumnInfo(name = "kind")
    val catKind: String,
    @ColumnInfo(name = "color")
    val catColor: String = "null",
    @ColumnInfo(name = "owner")
    val catOwner: String,

)