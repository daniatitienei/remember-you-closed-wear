package com.example.rememberyouclosed.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.rememberyouclosed.domain.model.Lock

@Database(
    entities = [Lock::class], version = 1
)
@TypeConverters(LockConverter::class)
abstract class LockDatabase : RoomDatabase() {

    abstract val lockDao: LockDao

    companion object {
        const val DATABASE_NAME = "lock-database"
    }
}