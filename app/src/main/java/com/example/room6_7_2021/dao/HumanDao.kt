package com.example.room6_7_2021.dao

import androidx.room.*
import com.example.room6_7_2021.Human

@Dao
interface HumanDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(human: Human)
    @Update
    suspend fun update(human: Human)
    @Delete
    suspend fun delete(human: Human)
}