package com.example.busschedule.database.schedule;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"}, d2 = {"Lcom/example/busschedule/database/schedule/ScheduleDao;", "", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/busschedule/database/schedule/Schedule;", "getByStopName", "stopName", "", "busSchedule_debug"})
public abstract interface ScheduleDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM schedule order by arrival_time ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.busschedule.database.schedule.Schedule>> getAll();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from schedule where stop_name = :stopName order by arrival_time asc")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.busschedule.database.schedule.Schedule>> getByStopName(@org.jetbrains.annotations.NotNull
    java.lang.String stopName);
}