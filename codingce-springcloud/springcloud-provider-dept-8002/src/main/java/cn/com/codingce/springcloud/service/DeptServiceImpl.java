package cn.com.codingce.springcloud.service;

import cn.com.codingce.springcloud.dao.DeptDao;
import cn.com.codingce.pojo.Dept;
import cn.com.codingce.service.DeptClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptClientService {

    @Resource
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }

}
