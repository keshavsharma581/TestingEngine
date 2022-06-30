package com.api.testEngine.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="result")
public class Result {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private int id;
	private String first_name;
	private String last_name;
	private int test_id;
	private String test_title;
	private int max_marks;
	private int marks;
	private boolean percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public String getTest_title() {
		return test_title;
	}
	public void setTest_title(String test_title) {
		this.test_title = test_title;
	}
	public int getMax_marks() {
		return max_marks;
	}
	public void setMax_marks(int max_marks) {
		this.max_marks = max_marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public boolean isPercentage() {
		return percentage;
	}
	public void setPercentage(boolean percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", test_id=" + test_id
				+ ", test_title=" + test_title + ", max_marks=" + max_marks + ", marks=" + marks + ", percentage="
				+ percentage + "]";
	}
	public Result(int id, String first_name, String last_name, int test_id, String test_title, int max_marks, int marks,
			boolean percentage) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.test_id = test_id;
		this.test_title = test_title;
		this.max_marks = max_marks;
		this.marks = marks;
		this.percentage = percentage;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
