package com.bit.framework.service;

import java.util.List;

import com.bit.framework.model.entity.DeptVo;

import java.sql.SQLException;

public interface DeptService {

	List<DeptVo> list() throws SQLException;
	void insert(DeptVo bean) throws SQLException;
	DeptVo detail(int deptno) throws SQLException;
}
