package com.example.rememberyouclosed.data.data_source

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.TypeConverters
import com.example.rememberyouclosed.domain.model.Lock
import kotlinx.coroutines.flow.Flow

@Dao
interface LockDao {
    @Query("SELECT * FROM lock")
    fun getAllLocks(): Flow<List<Lock>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertLock(lock: Lock)
}