package com.skilldistillery.film.entities;

import java.util.Objects;

public class Actor {
	private int actorId;
	private String firstName;
	private String lastName;

	public Actor(int actorId, String firstName, String lastName) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

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

	public void simpleString() {
		System.out.println("\t ActorId: " + actorId + "\n\t Name: " + lastName + ", " + firstName);
		System.out.println();
	}

	@Override
	public String toString() {
		return "\t ActorId: " + actorId + ", " + lastName + ", " + firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actorId, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return actorId == other.actorId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

}
