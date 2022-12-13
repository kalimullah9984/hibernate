package com.maven;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;


@Entity
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Address_id")
private int AddressId;
@Column(length=50)
private String street;
private String city;
@Column(name="is_open")
private boolean isOpen;
@Transient
private double x;
@Lob
private byte[] image;
public Address() {
	super();	
}
public Address(int addressId, String street, String city, boolean isOpen, double x, byte[] image) {
	super();
	AddressId = addressId;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	
	this.image = image;
}
public int getAddressId() {
	return AddressId;
}
public void setAddressId(int addressId) {
	AddressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}

public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
@Override
public String toString() {
	return "Address [AddressId=" + AddressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x="
			+ x + ", image=" + Arrays.toString(image) + "]";
}


}
