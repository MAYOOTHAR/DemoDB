package com.emp.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.demo.Model.Teacher;
import com.emp.demo.Repository.TeacherRepository;
import com.emp.demo.Service.TeacherSeivice;

@Service
public class TeacherServiceImpl implements TeacherSeivice {
    @Autowired
    TeacherRepository teacherRepository;
    
	
	
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
		
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher teacher(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTeacher(long id) {
		// TODO Auto-generated method stub
		
	}

}
