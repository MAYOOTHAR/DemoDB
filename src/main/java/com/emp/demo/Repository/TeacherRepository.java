package com.emp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.emp.demo.Model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long>{

}
