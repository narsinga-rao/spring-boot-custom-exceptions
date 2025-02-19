package com.nrp.springbootsample.repository;

import com.nrp.springbootsample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student save(Student student);

    List<Student> findByName(String name);

    List<Student> findByEmail(String email);

    List<Student> findAll();

    Optional<Student> findById(int id);

    void deleteById(int id);

    void deleteAll();

}
