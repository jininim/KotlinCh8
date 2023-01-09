package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

//데이터 액세스 객체(DAO) 데이터베이스 쿼리/검색,삽입,삭제 업데이트를 위한 메서드 제공.
@Dao
interface ItemDao {
    //기본 키가 이미 데이터베이스에 있으면 새 항목을 무시
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    // 정지 함수로 만들어 코루틴에서 이 함수를 호출 할 수 있도록 함.
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    // :id를 가진 값의 정보를 가져옴
   @Query("SELECT * from item WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    // item 테이블의 모든 열을 오름차순으로 반환
    @Query("SELECT * from item ORDER BY name ASC")
    fun getItems(): Flow<List<Item>>
}