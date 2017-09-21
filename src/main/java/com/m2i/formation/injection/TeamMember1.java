package com.m2i.formation.injection;

public class TeamMember1 implements ITeamMember {

	private String firstName = "Nina";
	private String lastName = "DOMO";
	private String role = "Développeuse";

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

		return new String[] { firstName,lastName, role };
	}

}
