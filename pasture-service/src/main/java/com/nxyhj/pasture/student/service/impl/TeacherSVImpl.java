package com.nxyhj.pasture.student.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.nxyhj.pasture.student.dao.TeacherMapper;
import com.nxyhj.pasture.student.entity.Teacher;
import com.nxyhj.pasture.student.entity.TeacherExample;
import com.nxyhj.pasture.student.service.interfaces.ITeacherSV;
import com.github.pagehelper.PageHelper;

@Service
public class TeacherSVImpl implements ITeacherSV{
	@Resource
	private TeacherMapper teacherMapper;

	@Override
	public Teacher getTeacherById(String id) {
		return teacherMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Teacher> getTeachers(TeacherExample teacherExample) {
		return teacherMapper.selectByExample(teacherExample);
	}

	@Override
	public int updateTeacherById(Teacher teacher) {
		return teacherMapper.updateByPrimaryKeySelective(teacher);
	}
	
	@Override
	public int updateTeacher(Teacher teacher, TeacherExample teacherExample) {
		return teacherMapper.updateByExampleSelective(teacher, teacherExample);
	}

	@Override
	public int insertTeacher(Teacher teacher) {
		return teacherMapper.insertSelective(teacher);
	}

	@Override
	public int deleteTeacherById(String id) {
		return teacherMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public int deleteTeacher(TeacherExample teacherExample) {
		return teacherMapper.deleteByExample(teacherExample);
	}
}
