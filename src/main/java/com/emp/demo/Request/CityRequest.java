package com.emp.demo.Request;

import java.io.Serializable;

public class CityRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String code;
	private long country_id;

	public CityRequest() {

	}
    public long getId() {
		return id;
	}
    public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    @Override
	public String toString() {
		return "CityRequest [id=" + id + ", name=" + name + ", code=" + code + ", country_id=" + country_id + "]";
	}
   
    
}