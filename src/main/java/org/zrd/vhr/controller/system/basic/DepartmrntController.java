package org.zrd.vhr.controller.system.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zrd.vhr.bean.Department;
import org.zrd.vhr.bean.RespBean;
import org.zrd.vhr.service.DepartmentService;

import java.util.List;

/**
 * @Author zrd
 * @Date 2020/11/4
 */
@RestController
@RequestMapping("/system/basic/department")
public class DepartmrntController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/")
    public RespBean addDep(@RequestBody Department department) {
        departmentService.addDep(department);
        if (department.getResult() == 1) {
            return RespBean.ok("添加成功", department);
        }
        return RespBean.error("添加失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteDepById(@PathVariable Integer id) {
        Department department = new Department();
        department.setId(id);
        departmentService.deleteDepById(department);
        if (department.getResult() == -2) {
            return RespBean.error("该部门有子部门，删除失败");
        } else if (department.getResult() == -1) {
            return RespBean.error("该部门下有员工，删除失败");
        } else if (department.getResult() == 1) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }



}
