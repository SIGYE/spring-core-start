package com.rest.demo.Controller;

import com.rest.demo.Model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> st;

    @PostConstruct
    public void loadData(){
     st = new ArrayList<>();
        st.add(new Student("Linda","Teta"));
        st.add(new Student("Lisa","Tesi"));
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
                return st;

    }
    @GetMapping("students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return st.get(studentId);
    }
}
