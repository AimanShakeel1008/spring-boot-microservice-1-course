package com.sha.springbootmicroservice1course.service;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.repository.CourseRepository;

import java.time.LocalDateTime;
import java.util.List;

public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course){

        course.setCreateTime(LocalDateTime.now());

        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }
}
