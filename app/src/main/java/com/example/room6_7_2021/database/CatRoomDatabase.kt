package com.example.room6_7_2021.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room6_7_2021.dao.CatDao
import com.example.room6_7_2021.data.Cat

@Database(
    entities = [Cat:: class],
    version = 1,
    exportSchema = false
)
abstract class CatRoomDatabase: RoomDatabase() {
    abstract fun catDao(): CatDao
    companion object {
        @Volatile
        private var INSTANCE: CatRoomDatabase? = null

        fun getDatabase(context: Context): CatRoomDatabase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CatRoomDatabase::class.java,
                    "cat_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance

                val PREPOPULATE_DATA = listOf(
                    Cat(1,"name", "kind", "null", "null"),
                    Cat(2,"name", "kind", "null", "null"),
                    Cat(3,"name", "kind", "null", "null")
                )
                return instance
            }

        }
    }
}