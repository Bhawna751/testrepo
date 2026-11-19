package com.learn.demo.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.learn.demo.entity.Student;
 
public interface StudentRepository extends JpaRepository<Student, Integer> {
 
}