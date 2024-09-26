package com.tap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;


@Entity
public class FacultyProfile {
    @Id
    private Long userId;

    private String photo;
    private Long departmentId;
    private String officeHours;
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
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public FacultyProfile(Long userId, String photo, Long departmentId, String officeHours) {
		super();
		this.userId = userId;
		this.photo = photo;
		this.departmentId = departmentId;
		this.officeHours = officeHours;
	}

    
}
