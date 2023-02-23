package com.backendlayer.backendlayer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service{

    @Autowired
    daolayer service;

    public Main getCourse(int id)
    {
       return service.getCourse(id);
    }

    public void addCourse(Main course)
    {
        service.addCourse(course);
    }

    public void deleteCourse(int id)
    {
        service.deleteCourse(id);
    }
}
