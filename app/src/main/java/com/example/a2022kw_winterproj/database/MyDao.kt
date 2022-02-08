package com.example.a2022kw_winterproj.database

import androidx.room.*
import com.example.a2022kw_winterproj.database.MyEntity

@Dao
interface MyDao {

    // 데이터 베이스 불러오기
    @Query("SELECT * from user_table")
    fun getAll(): List<MyEntity>

    @Query("SELECT * FROM user_table WHERE theme LIKE :theme AND num LIKE :num")
    fun findWithThemeAndNum(theme: String, num: Int): List<MyEntity>

    // 데이터 베이스 추가
    @Insert
    fun insert(myentity: MyEntity)

    @Insert
    suspend fun addUserDb(myentity : List<MyEntity>)

    @Delete
    suspend fun deleteUser(myentity : MyEntity)


}