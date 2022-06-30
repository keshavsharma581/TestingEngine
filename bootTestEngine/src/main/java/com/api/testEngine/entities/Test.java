package com.api.testEngine.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="test")

public class Test {

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(String test_name, String max_marks, String time, String title) {
		super();
		this.test_name = test_name;
		this.max_marks = max_marks;
		this.time = time;
		this.title = title;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", test_name=" + test_name + ", max_marks=" + max_marks + ", time=" + time + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTest_name() {
		return test_name;
	}
	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}
	public String getMax_marks() {
		return max_marks;
	}
	public void setMax_marks(String max_marks) {
		this.max_marks = max_marks;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private int id;
	private String test_name;
	private String max_marks;
	private String time;
	private String title;
	
	
	
	
	
}
