package com.sha.springbootmicroservice1course.service;

import com.sha.springbootmicroservice1course.model.Course;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CourseService {

    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> findAllCourses();
}
