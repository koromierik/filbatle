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

public class Employee {

    String nev;
    String telepules;
    String cim;
    String szuletes;
    double fizetes;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTelepules() {
        return telepules;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzuletes() {
        return szuletes;
    }

    public void setSzuletes(String szuletes) {
        this.szuletes = szuletes;
    }

    public double getFizetes() {
        return fizetes;
    }

    public void setFizetes(double fizetes) {
        this.fizetes = fizetes;
    }

}
