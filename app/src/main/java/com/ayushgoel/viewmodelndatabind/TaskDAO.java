package com.ayushgoel.viewmodelndatabind;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

public interface TaskDAO {

    @Query("SELECT * FROM Tasks ORDER BY priority")
    List<TaskEntry> loadAllTasks();

    @Insert
    void InsertTask(TaskEntry taskEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void UpdateTask(TaskEntry taskEntry);

    @Delete
    void DeleteTask(TaskEntry taskEntry);

}
