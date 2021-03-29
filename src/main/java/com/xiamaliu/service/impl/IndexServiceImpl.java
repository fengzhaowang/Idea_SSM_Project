package com.xiamaliu.service.impl;

import com.xiamaliu.dao.IndexDao;
import com.xiamaliu.entity.Student;
import com.xiamaliu.entity.UserInfo;
import com.xiamaliu.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDao indexDao;

    @Override
    public List<Student> findStudent() {
        return indexDao.findStudent();
    }

    @Override
    public List<UserInfo> findUserInfo() {
        return indexDao.findUserInfo();
    }
}
