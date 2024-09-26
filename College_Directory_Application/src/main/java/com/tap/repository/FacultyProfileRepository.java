package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.FacultyProfile;



public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {
}
