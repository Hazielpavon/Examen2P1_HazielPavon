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

    private int base;
    private int num;
    private int resp;

    public Numero(int base, int num, int resp) {
        this.base = base;
        this.num = num;
        this.resp = resp;
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

    public void setResp(int resp) {
        this.resp = resp;
    }

    public static String decToBase(int decimal, int base) {
        String result = "";
        while (decimal > 0) {
            int remainder = decimal % base;
            char digit = numToChar(remainder);
            result = digit + result;
            decimal /= base;
        }
        return result;
    }

    public static int baseToDec(String numb, int base) {
        int result = 0;
        int power = 0;
        for (int i = numb.length() - 1; i >= 0; i--) {
            char digit = numb.charAt(i);
            int value = charToNum(digit);
            result += value * Math.pow(base, power);
            power++;
        }
        return result;
    }

    private static char numToChar(int num) {
        if (num >= 0 && num <= 9) {
            return (char) ('0' + num);
        } else {
            return (char) ('A' + (num - 10));
        }
    }

    private static int charToNum(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            return c - 'A' + 10;
        }
    }


    public String toString() {

        return num + " base " + base + " : " + resp;
    }
}
