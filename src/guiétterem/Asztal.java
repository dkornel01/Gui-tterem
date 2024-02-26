/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiétterem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobrocsi.kornel
 */
public class Asztal {
    private String Szin;
    private List<Etel> rendelesek;

    public Asztal(String Szin, ArrayList<Etel> rendelesek) {
        this.Szin = Szin;
        this.rendelesek = rendelesek;
    }

    public Asztal(String Szin) {
        this.Szin = Szin;
    }
    public void UjEtel(Etel etel){
        rendelesek.add(etel);
    }

    public Asztal(List<Etel> rendelesek) {
        this.rendelesek = rendelesek;
    }

    public int getOsszAr(){
        
    }
}
