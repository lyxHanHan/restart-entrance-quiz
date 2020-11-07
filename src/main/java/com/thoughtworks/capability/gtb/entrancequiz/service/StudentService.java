package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    private static Map<Integer, Student> studentMap = new HashMap<>();

    public StudentService(){
        studentMap.put(1,new Student(1,"小王"));
        studentMap.put(2,new Student(2,"小李"));
    }

    public static List<Student> getAllStudent(){
        return new ArrayList<>(studentMap.values());
    }

}
