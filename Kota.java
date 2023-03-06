/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class Kota<E> {
    private E element ;
    public Kota(E kota){
        element = kota;
    }
    public E getElement(){
        return element;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kota<Integer> jumlahKota =new Kota<Integer>(9);
        Kota<String> namaKota =new Kota<String>("Malang");
        System.out.println("Jumlah kota di jawa timur : " + jumlahKota.getElement()+ " kota");
        System.out.println("Salah satu kota di jawa timur : Kota " + namaKota.getElement());    
        // TODO code application logic here
    }
    
}
