package com.technicalsundram.mycardvrec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<CourseModel> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        courseList = new ArrayList<>();
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"Java","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"C","Best Course On C"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"C++","Best Course On C++"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"Python","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"PHP","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"JavaScript","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"GoLang","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"Kotlin","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"Dart","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"TypeScript","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"BlockChain","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"IOT","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"AI","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"Docker","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"Automation","Best Course On Java"));
        courseList.add(new CourseModel(R.drawable.ic_launcher_background,"J2EE","Best Course On Java"));

        CourseAdapter adapter = new CourseAdapter(courseList,this);
        recyclerView.setAdapter(adapter);

    }
}