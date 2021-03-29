package com.xiamaliu.service;

import com.xiamaliu.entity.Student;
import com.xiamaliu.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {
    public List<Student> findStudent();
    public List<UserInfo> findUserInfo();
}
