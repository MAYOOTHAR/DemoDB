package com.emp.demo.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "countries")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "country_id")
	private Set<City> city;

	public Country() {
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
	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
