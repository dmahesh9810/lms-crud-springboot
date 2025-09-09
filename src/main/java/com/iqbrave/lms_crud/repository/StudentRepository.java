package com.iqbrave.lms_crud.repository;

import com.iqbrave.lms_crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

