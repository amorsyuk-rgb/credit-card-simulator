package com.sim.card.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface CardDao {
    @Query("SELECT * FROM cards")
    suspend fun getAllCards(): List<Card>
    
    @Insert
    suspend fun insertCard(card: Card)
    
    @Query("SELECT * FROM cards WHERE id = :id")
    suspend fun getCardById(id: Int): Card?
    
    @Update
    suspend fun updateCard(card: Card)
    
    @Query("DELETE FROM cards WHERE id = :id")
    suspend fun deleteCard(id: Int)
    
    @Query("DELETE FROM cards")
    suspend fun deleteAllCards()
}
