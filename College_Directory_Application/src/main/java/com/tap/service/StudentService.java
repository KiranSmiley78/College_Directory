package com.tap.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.entity.StudentProfile;
import com.tap.repository.StudentProfileRepository;

@Service
public class StudentService {
    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public StudentProfile getStudentProfile(Long userId) {
        return studentProfileRepository.findById(userId).orElse(null);
    }

    public List<StudentProfile> searchStudents(String name, Long departmentId, String year) {
        // Implement search functionality (this is a placeholder)
        return studentProfileRepository.findAll();
    }
}

