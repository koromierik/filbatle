/*
* File: App.java
* Author: Körömi Erik Márk
* Copyright: 2023, Körömi Erik Márk
* Group: Szoft II/2/n
* Date: 2023-10-05
* Github: https://github.com/koromierik
* Licenc: GNU GPL
*/

package controllers;
import models.Filereader;
public class MainController {
    
    
    public MainController() {

        new Filereader().loadData();
    }
}