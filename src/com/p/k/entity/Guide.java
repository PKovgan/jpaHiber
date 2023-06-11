package com.p.k.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guide {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="staff_id", nullable=false)
	private String staffid;
	private String name;
	private Integer salary;
	public Guide(String staffid, String name, Integer salary) {
		this.staffid = staffid;
		this.name = name;
		this.salary = salary;
	}
	public Guide() {
	}
	@Override
	public String toString() {
		return "Guide [id=" + id + ", staffid=" + staffid + ", name=" + name + ", salary=" + salary + "]";
	}

}
