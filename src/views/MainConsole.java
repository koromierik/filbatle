/*
* File: App.java
* Author: Körömi Erik Márk
* Copyright: 2023, Körömi Erik Márk
* Group: Szoft II/2/n
* Date: 2023-10-05
* Github: https://github.com/koromierik
* Licenc: GNU GPL
*/

package views;
import java.util.ArrayList;
import models.Employee;

public class MainConsole {
    public void showData(ArrayList<Employee> emplist) {
    for (int i = 0; i < emplist.size(); i++) {
        String line = (emplist.get(i).getNev() + ", " + emplist.get(i).getTelepules() + ", " + emplist.get(i).getCim() + ", " + emplist.get(i).getSzuletes() + ", " + emplist.get(i).getFizetes());

        System.out.println(line);
}
}
}