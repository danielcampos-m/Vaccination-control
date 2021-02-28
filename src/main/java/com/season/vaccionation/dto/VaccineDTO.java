package com.season.vaccionation.dto;

import java.io.Serializable;


public class VaccineDTO implements Serializable{

	private static final long serialVersionUID = 2121072898399966830L;
	private Long id;
	private String name;
	private Long userid;
	private String date;
	
	public VaccineDTO () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VaccineDTO other = (VaccineDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VaccineDTO [id=" + id + ", name=" + name + ", userid=" + userid + ", date=" + date + "]";
	}
	
	
}
