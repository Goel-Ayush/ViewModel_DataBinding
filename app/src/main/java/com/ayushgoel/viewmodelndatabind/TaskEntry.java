package com.ayushgoel.viewmodelndatabind;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;
@Entity(tableName ="Tasks")
public class TaskEntry {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private int priority;


    public TaskEntry(int id, String description, int priority){
        this.id = id;
        this.description = description;
        this.priority = priority;

    }

    @Ignore
    public TaskEntry(String description, int priority){
        this.description = description;
        this.priority = priority;
    }



    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}


