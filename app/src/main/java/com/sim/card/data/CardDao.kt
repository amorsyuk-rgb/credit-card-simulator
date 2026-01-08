package com.sim.card.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CardDao {
    @Query("SELECT * FROM cards")
    suspend fun getAllCards(): List<Card>
    
    @Insert
    suspend fun insertCard(card: Card)
    
    @Query("DELETE FROM cards WHERE id = :cardId")
    suspend fun deleteCard(cardId: Int)
}
