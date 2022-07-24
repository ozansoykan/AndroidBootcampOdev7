package com.ozansoykan.todoapphomework.room

import androidx.room.*
import com.ozansoykan.todoapphomework.data.entity.Isler

@Dao
interface IslerDao {
    @Query("SELECT * FROM Isler")
    suspend fun tumIsler() : List<Isler>

    @Insert
    suspend fun isEkle(isler:Isler)

    @Update
    suspend fun isGuncelle(isler:Isler)

    @Delete
    suspend fun isSil(isler:Isler)

    @Query("SELECT * FROM Isler WHERE is_aciklama like '%' || :aramaKelimesi || '%'")
    suspend fun isArama(aramaKelimesi:String) : List<Isler>
}