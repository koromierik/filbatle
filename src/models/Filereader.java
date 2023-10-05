/*
* File: App.java
* Author: Körömi Erik Márk
* Copyright: 2023, Körömi Erik Márk
* Group: Szoft II/2/n
* Date: 2023-10-05
* Github: https://github.com/koromierik
* Licenc: GNU GPL
*/

package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    final String FILENAME = "filbt.txt";

    ArrayList<Employee> emplist = new ArrayList<>();

    public ArrayList<Employee> loadData() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba, a file nem található!");
            System.err.println(e.getMessage());
        }
        return emplist;
    }

    public ArrayList<Employee> tryReadFile() throws FileNotFoundException {

        File file = new File(FILENAME);
        Scanner sc = new Scanner(file, "utf-8");
        sc.nextLine();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(";");

            Employee emp = new Employee();
            emp.setNev(lineArray[0]);
            emp.setTelepules(lineArray[1]);
            emp.setCim(lineArray[2]);
            emp.setSzuletes(lineArray[3]);
            emp.setFizetes(Double.parseDouble(lineArray[4]));

            this.emplist.add(emp);

        }
        sc.close();
        return emplist;
    }
}
