package com.college.common.service;


import com.college.common.pojo.Major;
import com.college.common.pojo.Page;

import java.util.List;


public interface MajorService {

    public List<Major> getAll();
    public List<Major> getList(Integer cid);
    public Major getById(int id);

    public boolean add(Major major);
    public boolean update(Major major);
    public boolean delete(int mid);

    public Page<Major>getFenye(Major major, int pageNo, int limit);

}
