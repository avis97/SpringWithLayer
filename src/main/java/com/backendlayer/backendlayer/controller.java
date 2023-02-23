package com.backendlayer.backendlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller{

    @Autowired
    service course;


    @GetMapping("/get_info")
    public Main getCourse(@RequestParam("id") int id)
    {
       return course.getCourse(id);
    }

    @PostMapping("/add")
    public String addCourse(@RequestBody Main Course)
    {
        course.addCourse(Course);
        return "Student Added done";
    }

    @DeleteMapping("/delete")
    public String deleteCourse(@RequestParam("id") int id)
    {
        course.deleteCourse(id);
        return "delete done";
    }
}
