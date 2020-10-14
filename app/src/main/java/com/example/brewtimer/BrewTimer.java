package com.example.brewtimer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class BrewTimer {
    @PrimaryKey
    public int brewId;

    @ColumnInfo(name = "recipe_name")
    public String recipeName;

    @ColumnInfo(name = "section_times")
    public List<Integer> sectionTimes;

    @ColumnInfo(name = "sectionType")
    public List<sectionType> sectionTypes;

    @ColumnInfo(name = "isntructions")
    public List<String> instructions;

    @ColumnInfo(name = "brews")
    public int brews;

    public enum sectionType{
        POUR,
        STIR,
        BREW,
        PLUNGE
    }

    public static Integer[] sectionIcons = {
            R.drawable.ic_brew,
            R.drawable.ic_brew,
            R.drawable.ic_brew
    };
}

