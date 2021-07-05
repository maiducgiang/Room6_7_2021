package com.example.room6_7_2021

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Gender(val gender: String){
    man("man"), women("women")
}
@Entity(tableName = "human")
data class Human(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val humanName: String,
    @ColumnInfo(name = "gender")
    val humanGender: String,
    @ColumnInfo(name = "year of birth")
    val humanYearOfBirth:Int
)

