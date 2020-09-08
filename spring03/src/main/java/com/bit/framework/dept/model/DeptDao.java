package com.bit.framework.dept.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.dept.model.entity.DeptVo;

public interface DeptDao {
	
	List<DeptVo> selectAll() throws SQLException;
	void insertOne(DeptVo bean) throws SQLException; //삽입
	DeptVo selectOne(int key) throws SQLException; //디테일
	int updateOne(DeptVo bean) throws SQLException; //수정
	int deleteOne(int key) throws SQLException; //삭제
	
}
