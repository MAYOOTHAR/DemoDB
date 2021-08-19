package com.emp.demo.Request;

import java.io.Serializable;

public class CityRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String cityName;
	private String cityCode;
	private long country_id;

	public CityRequest() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}

	@Override
	public String toString() {
		return "CityRequest [id=" + id + ", cityName=" + cityName + ", cityCode=" + cityCode + ", country_id="
				+ country_id + "]";
	}

}
