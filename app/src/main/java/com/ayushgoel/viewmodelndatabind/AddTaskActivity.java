package com.ayushgoel.viewmodelndatabind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.StringReader;

public class AddTaskActivity extends AppCompatActivity {
    public static final String EXTRA_TASK_ID  = "extraTaskID";
    public static final String INSTANCE_TASK_ID  = "instanceTaskID";
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_MEDIUM = 2;
    public static final int PRIORITY_LOW = 3;
    public static final int DEFAULT_TASK_ID = -1;
    private int mTaskID = DEFAULT_TASK_ID;
    EditText editText;
    RadioGroup radioGroup;

    Button button;
    private AppDatabase mdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        mdb = AppDatabase.getInstance(getApplicationContext());
    }
}
