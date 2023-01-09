package com.example.busschedule.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/busschedule/viewmodels/BusScheduleViewModel;", "Landroidx/lifecycle/ViewModel;", "scheduleDao", "Lcom/example/busschedule/database/schedule/ScheduleDao;", "(Lcom/example/busschedule/database/schedule/ScheduleDao;)V", "fullSchedule", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/busschedule/database/schedule/Schedule;", "scheduleForStopName", "name", "", "busSchedule_debug"})
public final class BusScheduleViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.busschedule.database.schedule.ScheduleDao scheduleDao = null;
    
    public BusScheduleViewModel(@org.jetbrains.annotations.NotNull
    com.example.busschedule.database.schedule.ScheduleDao scheduleDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.busschedule.database.schedule.Schedule>> fullSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.busschedule.database.schedule.Schedule>> scheduleForStopName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
}