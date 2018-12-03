package com.people;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polar
 * 12/1/2018 16:26
 */
public class Congress {

  private List<Person> people; //Using an interface to make easier to change later

  public Congress() {
    people = new ArrayList<>();
  }

  public void add (Person person){
    people.add(person);
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    for (Person p: people){
      sb.append(p.toString()+ "\n");
    }
    return sb.toString();
  }
}
