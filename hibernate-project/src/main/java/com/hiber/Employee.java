package com.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String name;
private int dob;
public Employee() {
	super();

}
public Employee(int id, String name, int dob) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
}

}