package com.example.busschedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/busschedule/BusStopAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/busschedule/database/schedule/Schedule;", "Lcom/example/busschedule/BusStopAdapter$BusStopViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BusStopViewHolder", "Companion", "busSchedule_debug"})
public final class BusStopAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.busschedule.database.schedule.Schedule, com.example.busschedule.BusStopAdapter.BusStopViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.busschedule.database.schedule.Schedule, kotlin.Unit> onItemClicked = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.busschedule.BusStopAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.busschedule.database.schedule.Schedule> DiffCallback = null;
    
    public BusStopAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.busschedule.database.schedule.Schedule, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.busschedule.BusStopAdapter.BusStopViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.busschedule.BusStopAdapter.BusStopViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/busschedule/BusStopAdapter$BusStopViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/busschedule/databinding/BusStopItemBinding;", "(Lcom/example/busschedule/databinding/BusStopItemBinding;)V", "bind", "", "schedule", "Lcom/example/busschedule/database/schedule/Schedule;", "busSchedule_debug"})
    public static final class BusStopViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.busschedule.databinding.BusStopItemBinding binding;
        
        public BusStopViewHolder(@org.jetbrains.annotations.NotNull
        com.example.busschedule.databinding.BusStopItemBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.busschedule.database.schedule.Schedule schedule) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/busschedule/BusStopAdapter$Companion;", "", "()V", "DiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/busschedule/database/schedule/Schedule;", "busSchedule_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}