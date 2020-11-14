package org.zrd.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zrd.vhr.bean.Employee;
import org.zrd.vhr.bean.RespPageBean;
import org.zrd.vhr.mapper.EmployeeMapper;

import java.util.List;

/**
 * @Author zrd
 * @Date 2020/11/11
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public RespPageBean getEmployeeByPage(Integer page, Integer size, String keyword) {
        if (page != null && size !=null) {
            page = (page - 1) * size;
        }
        List<Employee> data = employeeMapper.getEmployeeByPage(page, size, keyword);
        Long total = employeeMapper.getTotal(keyword);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(data);
        respPageBean.setTotal(total);
        return respPageBean;
    }

    public Integer addEmp(Employee employee) {
        return employeeMapper.insertSelective(employee);
    }

    public Integer maxWordID() {
        return employeeMapper.maxWordID();
    }
}










