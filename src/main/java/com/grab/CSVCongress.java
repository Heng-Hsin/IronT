package com.grab;

import com.opencsv.CSVReader;
import com.people.Congress;
import com.people.Person;

import java.io.*;



/**
 * Created by polar
 * 12/1/2018 16:43
 */
public class CSVCongress {
// for file legislators-historic.csv
  public static final int LAST_NAME_COL =0; //csv columns start with 0 dumbass....
  public static final int FIRST_NAME_COL =1;
  public static final int BIRTHDAY_COL =2;
  public static final int GENDER_COL =3;
  public static final int TITLE_COL =4;

  public static Person createPersonFromRow(String[] row){

    Person p = new Person(row[LAST_NAME_COL],row[FIRST_NAME_COL]);
    p.setBirthday(row[BIRTHDAY_COL]);
    p.setTitle(row[TITLE_COL]);
    p.setGender(row[GENDER_COL]);
    return p;
  }

  public static Congress createCongressFromCSV(String csvFileName) throws IOException{
    CSVReader reader= new CSVReader(new FileReader(csvFileName));

    String [] nextLine;

    Congress congress = new Congress();
    reader.readNext(); // skip the header row
    while ( (nextLine= reader.readNext()) != null){

    }
    return congress;
  }


  public static Congress createCongressFromCSV2(String csvFileName){   //this method doesn't require adding csv library

    Congress congress = new Congress();
    BufferedReader br = null;
    String line = "";

    try {
      br = new BufferedReader(new FileReader(csvFileName));
      br.readLine(); //skip header

      while ((line = br.readLine()) != null) {
        Person person = createPersonFromRow(line.split(","));
        congress.add(person);
      }

    }catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return congress;
  }

}
