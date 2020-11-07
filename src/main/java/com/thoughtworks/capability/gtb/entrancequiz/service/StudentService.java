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
        studentMap.put(1,new Student(1,"成吉思汗"));
        studentMap.put(2,new Student(2,"鲁班七号"));
        studentMap.put(3,new Student(3,"太乙真人"));
        studentMap.put(4,new Student(4,"钟无艳"));
        studentMap.put(5,new Student(5,"花木兰"));
        studentMap.put(6,new Student(6,"雅典娜"));
        studentMap.put(7,new Student(7,"芈月"));
        studentMap.put(8,new Student(8,"白起"));
        studentMap.put(9,new Student(9,"刘禅"));
        studentMap.put(10,new Student(10,"庄周"));
        studentMap.put(11,new Student(11,"马超"));
        studentMap.put(12,new Student(12,"刘备"));
        studentMap.put(13,new Student(13,"哪吒"));
        studentMap.put(14,new Student(14,"大乔"));
        studentMap.put(15,new Student(15,"蔡文姬"));
    }

    public static List<Student> getAllStudent(){
        return new ArrayList<>(studentMap.values());
    }

}
