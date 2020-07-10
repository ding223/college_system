package com.college.common.service.imp;


import com.college.common.mapper.MajorMapper;
import com.college.common.pojo.Major;
import com.college.common.pojo.Page;
import com.college.common.service.MajorService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;


    @Override
    public List<Major> getAll() {
        return  majorMapper.selectAll();
    }

    @Override
    public List<Major> getList(Integer cid) {
        Example example=new Example(Major.class);
        //sql过滤表达式
        Example.Criteria criteria = example.createCriteria();
        //参数1：实体类字段 参数2：值
        criteria.andEqualTo("cid", cid);
        //criteria.orLike("cid", "%"+cid+"%");
        //example.orderBy("mid").desc();

        List<Major> list = majorMapper.selectByExample(example);
        return list;
    }

    @Override
    public Major getById(int id) {
        return majorMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean add(Major major) {
        int count=majorMapper.insertSelective(major);
        return count>0? true : false;
    }

    @Override
    public boolean update(Major major) {
        int count=majorMapper.updateByPrimaryKeySelective(major);
        return count>0? true : false;
    }

    @Override
    public boolean delete(int mid) {
        return majorMapper.deleteByPrimaryKey(mid)>0? true :false;
    }

    @Override
    public Page<Major> getFenye(Major major, int pageNo, int limit) {
        Example example = new Example(Major.class);
        //sql过滤表达式
        Example.Criteria criteria = example.createCriteria();
        //参数1：实体类字段 参数2：值
        if (major != null && major.getCid() != null && major.getCid() != 0 && major.getCid() != -1) {
            criteria.andEqualTo("cid", major.getCid());
        }

        //通过PageHelper分页
        PageHelper.startPage(pageNo, limit);
        List<Major> list = majorMapper.selectByExample(example);

        Page<Major> myPage = new Page(list);
        return myPage;
    }
}
