package com.json;

/**
 * Created by Savi on 5/20/2016.
 */
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class JsonM {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Map<String, Person> parsedInputMap = mapper.readValue(new File("person.json"), new TypeReference<Map<String, Person>>(){});
            List<Person> persons = new ArrayList<>();
            for (Map.Entry<String, Person> eachPersonEntry : parsedInputMap.entrySet()) {
                Person eachPerson = eachPersonEntry.getValue();
                eachPerson.setId(eachPersonEntry.getKey());
                persons.add(eachPerson);
            }
            Collections.sort(persons, new PersonComparator());
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(persons));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String phoneNumber;

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}