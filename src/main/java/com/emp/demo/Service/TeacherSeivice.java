package com.emp.demo.Service;

import java.util.List;


import com.emp.demo.Model.Teacher;

public interface TeacherSeivice {
	Teacher saveTeacher(Teacher teacher);
	List<Teacher> getAllTeachers();
	Teacher teacher(long id);
	Teacher updateTeacher(Teacher teacher,long id);
    void deleteTeacher(long id);
      
}
