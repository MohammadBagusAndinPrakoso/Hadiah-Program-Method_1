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
import java.util.Scanner;
public class Segitiga {
    int a;
    int t;
    int hasil;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Alas Segitiga   = ");
        a = input.nextInt();
        System.out.print("Tinggi Segitiga = ");
        t = input.nextInt();
    }
    
    void hitung(){
        System.out.println("Rumus Luas Seitiga = 1/2 x alas x tinggi");
    }
    
    int hasil(){
        System.out.print("Luas Segitiga = ");
        return a * t / 2;
    }
}
