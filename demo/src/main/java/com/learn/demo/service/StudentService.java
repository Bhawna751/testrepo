
 
package com.learn.demo.service;
 
import java.util.List;
 
import org.springframework.stereotype.Service;
 
import com.learn.demo.entity.Student;
import com.learn.demo.repository.StudentRepository;
 
@Service
public class StudentService {
 
   private final StudentRepository studentRepository;
 
   public StudentService(StudentRepository studentRepository) {
       this.studentRepository = studentRepository;
   }
 
   public Student saveStudent(Student student) {
       return studentRepository.save(student);
   }
 
   public List<Student> getAllStudents() {
       return studentRepository.findAll();
   }
 
   public Student getStudentById(int id) {
       return studentRepository.findById(id).orElse(null);
   }
 
   public void deleteStudent(int id) {
       studentRepository.deleteById(id);
   }
   public Student updateStudent(int id, Student updateStudent){
        Student existingStudent = studentRepository.findById(id).
        orElseThrow(()->new RuntimeException("Student with id not found"));
        existingStudent.setStudentName(updateStudent.getStudentName());
        existingStudent.setStudentId(updateStudent.getStudentId());
        return studentRepository.save(existingStudent);    
   }
}
 