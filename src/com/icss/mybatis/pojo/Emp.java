package com.icss.mybatis.pojo;

import java.util.Date;

public class Emp {
    private Integer empId;

    private String empName;

    private Integer empSal;

    private Date empHiredate;

    private Integer empDeptId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Integer empSal) {
        this.empSal = empSal;
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public Integer getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(Integer empDeptId) {
        this.empDeptId = empDeptId;
    }
}