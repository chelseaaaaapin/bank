/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Chealsea
 */
public class bankBeraksi {
    public static void main(String[] args) {
        Bank bk = new Bank(900000000);
        bk.getSaldo();
        bk.simpanSaldo(300000);
        bk.ambilSaldo(200000);
    }
    
}
