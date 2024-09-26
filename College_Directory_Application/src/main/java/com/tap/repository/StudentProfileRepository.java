package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}
