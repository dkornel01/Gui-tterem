/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiétterem;

import java.io.IOException;

/**
 *
 * @author dobrocsi.kornel
 */
public class Nezet {

    private Model model=new Model();

    public Nezet() {
        
    }
    public void kiiras() throws IOException{
        System.out.println(model.asztal_konzolos());
    }
    
    
}
