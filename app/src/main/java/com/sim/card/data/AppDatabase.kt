package com.sim.card.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Entity(tableName = "cards")
data class Card(
    @PrimaryKey val id: String = ""
)

@Dao
interface CardDao

@Database(entities = [Card::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cardDao(): CardDao
}
