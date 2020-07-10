package com.college.common.service;


import com.college.common.pojo.College;

import java.util.List;


public interface CollegeService {

    public List<College> getList();


    public boolean addCollege(College college);

}
