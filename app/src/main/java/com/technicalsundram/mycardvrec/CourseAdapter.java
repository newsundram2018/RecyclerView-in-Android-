package com.technicalsundram.mycardvrec;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    List<CourseModel> courseList;
    private Context context;

    public CourseAdapter(List<CourseModel> courseModel , Context context) {
        courseList = courseModel;
        this.context= context;
    }

    @NonNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem,parent,false);
        CourseViewHolder courseViewHolder = new CourseViewHolder(view);
        return courseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        holder.courseImage.setImageResource(courseList.get(position).imageId);
        holder.courseDesc.setText(courseList.get(position).Description);
        holder.course.setText(courseList.get(position).Name);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(),CourseDetails.class);
                intent.putExtra("Image_Id",courseList.get(position).imageId);
                intent.putExtra("courseName",courseList.get(position).Name);
                intent.putExtra("courseDescription",courseList.get(position).Description);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.getApplicationContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView courseDesc , course;
        ImageView courseImage;
        RelativeLayout relativeLayout;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            courseDesc = itemView.findViewById(R.id.courseDesc);
            course = itemView.findViewById(R.id.courseName);
            courseImage = itemView.findViewById(R.id.courseImg);
            relativeLayout = itemView.findViewById(R.id.layout_id);
        }
    }
}
