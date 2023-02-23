package com.backendlayer.backendlayer;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class daolayer{

    HashMap<Integer,Main> db=new HashMap<>();

    public Main getCourse(int id)
    {
       return db.get(id);
    }

    public void addCourse(Main course)
    {
        db.put(course.getCourseId(),course);
    }

    public void deleteCourse(int id)
    {
        db.remove(id);
    }
}
