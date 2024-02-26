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
import javax.swing.DefaultListModel;

/**
 *
 * @author dobrocsi.kornel
 */
public class Model {

    private ArrayList<String>rendelesek;
    private ArrayList<String>arak;
    private int szamlalo=0;
    public Model() {
        
    }
    
    public String AsztalValasztasNyugta(DefaultListModel def,List<String> asztal) {
        String nyugta="====================\n";
        int osszeg=0;
        for (int i=0;i<asztal.size();i++){
            String[]penz=asztal.get(i).split("\\|");
            nyugta+=penz[0]+": "+penz[1]+" Ft\n";
            osszeg+=Integer.parseInt(penz[1]);
        }
        nyugta+="--------------------\n";
        nyugta+="Összesen:              "+osszeg;
        return nyugta;
    }
    public String asztal_konzolos() throws IOException{
        String txt="asztalok.txt";
        String teljes_nyugta="";
        Path path=Paths.get(txt);
        rendelesek=(ArrayList<String>) Files.readAllLines(path);
        for (int i=0;i<rendelesek.size();i++){
            String termék=rendelesek.get(i);
            teljes_nyugta+=termék+asztalfigyelo(termék)+arfigyelo(termék)+enterfigyelo(termék);
        }
        return teljes_nyugta;
    }
    
    public String arfigyelo(String termék) throws IOException{
        String osszetett="";
        String txt2="arak.txt";
        Path ut=Paths.get(txt2);
        arak=(ArrayList<String>) Files.readAllLines(ut);
        for (int x=0;x<arak.size();x++){
            String[] tarto=arak.get(x).split("\\|");
            if (termék.matches(tarto[0])){
                szamlalo+=Integer.parseInt(tarto[1]);
                return " "+tarto[1]+"FT"+"\n";
            }
        }
        return osszetett;
    }
    private String asztalfigyelo(String termék){
        String telyes=" asztal";
        telyes+="\n";
        telyes+="========================\n";
        if (termék.matches("piros")){
            return telyes;
        }
        else if (termék.matches("Zöld")){
        return telyes;
        }
        else if (termék.matches("Kék")){
        return telyes;
        }
        else if (termék.matches("Fehér")){
        return telyes;
        }
        else{
            return "";
        }
    }
    private String enterfigyelo(String termék){
        String valaszto="";
        if (termék.equals("")){
            valaszto="------------------------\n";
            valaszto+="Összesen: "+szamlalo+"FT\n\n";
            szamlalo=0;
        }
        return  valaszto;
    }
}
