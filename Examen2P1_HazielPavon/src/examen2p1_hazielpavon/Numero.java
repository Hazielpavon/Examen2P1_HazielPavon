/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p1_hazielpavon;

/**
 *
 * @author hapav
 */
public class Numero {

    private int base = 0;
    private int num = 0;
    private int resp = 0; 

    public Numero(int baseN, int numN, int respN) {
        this.base = baseN;
        this.num = numN;
        this.resp = respN; 

    }

    public Numero() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getResp() {
        return resp;
    }

    public void setResp(int respN) {
        this.resp = respN;
    }
    
  public String toString() {
      
        return  num + " base : " + base + " : " + resp;  
    }
}
