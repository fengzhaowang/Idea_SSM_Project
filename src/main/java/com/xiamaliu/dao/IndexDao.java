package com.xiamaliu.dao;

import com.xiamaliu.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexDao {
    public List<Student> findStudent();
}
