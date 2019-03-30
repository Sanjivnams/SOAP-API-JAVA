package com.death.stalker.service;

import com.death.stalker.beans.Person;

public interface PersonService_ {

	public boolean addPerson(Person p);

	public boolean deletePerson(int id);

	public Person getPerson(int id);

	public Person[] getAllPersons();
}
