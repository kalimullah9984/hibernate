package com.program;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
public class Art {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Address_id")
	private int AddressId;
	@Column(length=50)
	private String street;
	private String city;
	@Column(name="is_open")
	private boolean isOpen;
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addeDate;
	@Transient
	private double x;
	@Lob
	private byte[] image;
	public Art() {
		super();
		
	}
	public Art(int addressId, String street, String city, boolean isOpen, Date addeDate, double x, byte[] image) {
		super();
		AddressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.addeDate = addeDate;
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
	public Date getAddeDate() {
		return addeDate;
	}
	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
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
		return "Art [AddressId=" + AddressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", addeDate=" + addeDate + ", x=" + x + ", image=" + Arrays.toString(image) + "]";
	}
	
}