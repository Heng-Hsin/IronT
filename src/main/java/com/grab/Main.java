package com.grab;

import com.people.Congress;

import java.io.IOException;


/**
 * Created by polar
 * 11/30/2018 23:12
 */
public class Main {


  public static void main(String[] args) throws IOException {


    String fileName="C:\\Users\\polar\\Desktop\\legislators-historic.csv";
    Congress congress = CSVCongress.createCongressFromCSV2(fileName);
    System.out.println(congress);
  }
}
