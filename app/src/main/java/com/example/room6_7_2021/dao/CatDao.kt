package com.example.room6_7_2021.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.room6_7_2021.data.Cat

@Dao
interface CatDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(cat: Cat)
    @Update
    suspend fun update(cat: Cat)
    @Delete
    suspend fun delete(cat: Cat)
    @Query("select * from cat where name = :name")
    fun getCat(name: String): LiveData<List<Cat>>
}