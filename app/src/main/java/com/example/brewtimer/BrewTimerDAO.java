package com.example.brewtimer;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public class BrewTimerDAO {
    @Dao
    public interface UserDao {
        @Query("SELECT * FROM brewtimer")
        List<BrewTimer> getAll();

        @Query("SELECT * FROM brewtimer WHERE brewId IN (:brewIds)")
        List<BrewTimer> loadAllByIds(int[] brewIds);

        @Query("SELECT * FROM brewtimer WHERE recipe_name LIKE :recipeName")
        BrewTimer findByName(String recipeName);

        @Insert
        void insertAll(BrewTimer... brewTimers);

        @Delete
        void delete(BrewTimer brewTimer);
    }
}
