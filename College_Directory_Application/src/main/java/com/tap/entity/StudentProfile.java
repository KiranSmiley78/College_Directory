package com.tap.entity;

import jakarta.persistence.*;


@Entity
public class StudentProfile {
    @Id
    private Long userId;

    private String photo;
    private Long departmentId;
    private String year;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public StudentProfile(Long userId, String photo, Long departmentId, String year) {
		super();
		this.userId = userId;
		this.photo = photo;
		this.departmentId = departmentId;
		this.year = year;
	}

   
}
