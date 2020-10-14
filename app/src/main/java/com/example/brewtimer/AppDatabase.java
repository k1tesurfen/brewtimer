package com.example.brewtimer;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {BrewTimer.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BrewTimerDAO brewTimerDAO();
}
