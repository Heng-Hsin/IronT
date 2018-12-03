package com.people;

/**
 * Created by polar
 * 12/1/2018 16:18
 */
public class Person {
  private String title;
  private String lastName;
  private String firstName;
  private String birthday;
  private String gender;

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public Person(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String toString(){
    return firstName+" "+lastName+" "+title+" "+birthday+" "+gender;
    //return firstName+" "+lastName;
  }
}
