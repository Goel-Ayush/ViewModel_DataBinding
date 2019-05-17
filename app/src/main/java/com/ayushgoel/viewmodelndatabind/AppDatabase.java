package com.ayushgoel.viewmodelndatabind;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;


@Database(entities = {TaskEntry.class},version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
        private static final String DATABASE_NAME ="todolist";
        private static final Object LOCK = new Object();
        private static AppDatabase sInsatnce;

        public static AppDatabase getInstance(Context context){
            if(sInsatnce == null){
                synchronized (LOCK){
                    sInsatnce = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class,AppDatabase.DATABASE_NAME)
                            //Temporary
                            //Not preferred
                            .allowMainThreadQueries()
                            .build();
                }
            }

            return sInsatnce;

        }

        public abstract TaskDAO TaskDao();
}
