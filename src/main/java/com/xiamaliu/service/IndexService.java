package com.xiamaliu.service;

import com.xiamaliu.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {
    public List<Student> findStudent();
}
