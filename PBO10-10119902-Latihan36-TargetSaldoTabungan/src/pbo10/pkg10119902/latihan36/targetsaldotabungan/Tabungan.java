/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan36.targetsaldotabungan;

/**
 *
 * @author korik
 */
public class Tabungan {
    public float saldo = 3500000;
    public float bunga = 8/100f;
    public float saldoTarget = 6000000;
        
    public void hitungPerbulan (){
        saldo += saldo * bunga;
    }
                
}
