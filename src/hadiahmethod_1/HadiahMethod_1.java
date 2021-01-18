/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahmethod_1;

/**
 *
 * @author MOKLET1
 */
public class HadiahMethod_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Selamat berhitung");
        System.out.println("-----------------");
        
        Segitiga tiga = new Segitiga();
        tiga.input();
        System.out.println("=================");
        tiga.hitung();
        
        System.out.println(tiga.hasil());
    }
    
}
