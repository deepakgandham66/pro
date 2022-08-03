package com.example.pro.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lpId;
	private String laptopName;
	private String brand;
	@OneToOne
	private Employee emp;
	public Long getLpId() {
		return lpId;
	}
	public void setLpId(Long lpId) {
		this.lpId = lpId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, laptopName, lpId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(laptopName, other.laptopName)
				&& Objects.equals(lpId, other.lpId);
	}
	@Override
	public String toString() {
		return "Laptop [lpId=" + lpId + ", laptopName=" + laptopName + ", brand=" + brand + "]";
	}
	
	
}
