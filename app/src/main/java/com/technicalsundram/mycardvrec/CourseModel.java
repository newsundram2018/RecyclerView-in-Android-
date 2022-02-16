package com.technicalsundram.mycardvrec;

public class CourseModel {
    int imageId;
    String Name;
    String Description;

    public CourseModel(int imageId, String name, String description) {
        this.imageId = imageId;
        Name = name;
        Description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
