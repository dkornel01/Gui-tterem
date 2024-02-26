/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiétterem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobrocsi.kornel
 */
public class Etterem {
    public static final String HUF="FT";
    private ArrayList<Asztal> asztalok;
    private ArrayList<Etel> etlap;

    public Etterem(ArrayList<Asztal> asztalok, ArrayList<Etel> etlap) throws IOException {
        this.asztalok = asztalok;
        this.etlap = etlap;
        etlapotFajbolFeltolt();
    }
    

    public ArrayList<Asztal> getAsztalok() {
        return asztalok;
    }
    public void etlapotFajbolFeltolt() throws IOException{
        String txt="arak.txt";
        Path path=Paths.get(txt);
        List<String>tarto=Files.readAllLines(path);
    }
    public void rendeleseketFajbolFeltolt() throws IOException{
        String txt="asztalok.txt";
        Path path=Paths.get(txt);
        asztalok=Files.readAllLines(path);
    }
    private Etel eteltKivalaszt(String etelneve){
        
    };
    
}
