package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedule order by arrival_time ASC")
    fun getAll(): Flow<List<Schedule>>
    @Query("select * from schedule where stop_name = :stopName order by arrival_time asc")
    fun getByStopName(stopName: String) : Flow<List<Schedule>>
}