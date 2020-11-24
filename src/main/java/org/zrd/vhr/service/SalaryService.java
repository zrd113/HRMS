package org.zrd.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zrd.vhr.bean.Salary;
import org.zrd.vhr.mapper.SalaryMapper;

import java.util.List;

/**
 * @Author zrd
 * @Date 2020/11/24
 */
@Service
public class SalaryService {

    @Autowired
    SalaryMapper salaryMapper;

    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }
}
