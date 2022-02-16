package com.technicalsundram.mycardvrec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseDetails extends AppCompatActivity {
    ImageView courseImg;
    TextView courseName,courseDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        courseImg = findViewById(R.id.courseDetailImage);
        courseName = findViewById(R.id.courseDetailName);
        courseDesc = findViewById(R.id.courseDetailDesc);

        courseImg.setImageResource(getIntent().getExtras().getInt("Image_Id"));
        courseName.setText(getIntent().getExtras().getString("courseName"));
        courseDesc.setText(getIntent().getExtras().getString("courseDescription"));



    }
}