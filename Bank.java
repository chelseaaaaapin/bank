/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Chealsea
 */
public class Bank {
    
    int saldo;
    
    public Bank(int saldo){
        this.saldo = saldo;
    }
    
    void getSaldo(){
        System.out.println("WELCOME TO BANK USA");
        System.out.println("SALDO ANDA SEKARANG: " + saldo);
    }
    
    void simpanSaldo(int simpan){
        saldo += simpan;
        System.out.println("\nSIMPAN UANG ANDA SEBESAR: " + simpan);
        System.out.println("SALDO ANDA SEKARANG: " + saldo);
    }
    
    void ambilSaldo(int ambil){
        saldo -= ambil;
        System.out.println("\nAMBIL UANG ANDA SEBESAR: " + ambil);
        System.out.println("SALDO ANDA SEKARANG: " + saldo);
    }
    
}
