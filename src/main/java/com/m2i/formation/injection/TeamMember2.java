package com.m2i.formation.injection;

public class TeamMember2 implements ITeamMember{

	private String firstName = "Nicolio";
	private String lastName = "JAOHOVA";
	private String role = "PO";
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String[] getMemberDatails() {
		
		return new String[]{firstName,lastName,role};
	}
	
	
}
