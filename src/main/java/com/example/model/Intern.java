package com.example.model;

public class Intern {
	private String id;
	private String name;
	private String birthday;
	private String getInCompanyDay;
	
	public Intern() {
		
	}
	
	public Intern(String id, String name,  String birthday, String getInCompanyDay) {
		this.setId(id);
		this.setName(name);
		this.setBirthday(birthday);
		this.setGetInCompanyDay(getInCompanyDay);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGetInCompanyDay() {
		return getInCompanyDay;
	}

	public void setGetInCompanyDay(String getInCompanyDay) {
		this.getInCompanyDay = getInCompanyDay;
	}

	@Override
	public String toString() {
		return "Intern [id=" + id + ", name=" + name + ", birthday=" + birthday + ", getInCompanyDay=" + getInCompanyDay
				+ "]";
	}
}
