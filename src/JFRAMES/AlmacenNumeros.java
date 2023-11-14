/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFRAMES;

/**
 *
 * @author cesar
 */
public class AlmacenNumeros {
    
    //Variables usadas en el JFrame Calculadora
    private String n0 = "0";
    private String n1 = "1";
    private String n2 = "2";
    private String n3 = "3";
    private String n4 = "4";
    private String n5 = "5";
    private String n6 = "6";
    private String n7 = "7";
    private String n8 = "8";
    private String n9 = "9";
    private String suma = "+";
    private String resta = "-";
    private String division ="/";
    private String multiplicacion = "x";
    private int num1;
    private int num2;
    private float num1decimal;
    private float num2decimal;
    
    
    
    //Constructor vacio
    public AlmacenNumeros() {
    }
    
    //Cosntructor completo
    
    public AlmacenNumeros(String n0, String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String n9, String suma, String resta,
            String multiplicacion, String division, int num1, int num2, float num1decimal, float num2decimal){
        this.n0=n0;
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.n4=n4;
        this.n5=n5;
        this.n6=n6;
        this.n7=n7;
        this.n8=n8;
        this.n9=n9;
        this.suma=suma;
        this.resta=resta;
        this.multiplicacion=multiplicacion;
        this.division=division;
        this.num1=num1;
        this.num2=num2;
        this.num1decimal=num1decimal;
        this.num2decimal=num2decimal;
        
    }
   

    //Getters and Setters
    public String getN0() {
        return n0;
    }

    public void setN0(String n0) {
        this.n0 = n0;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }

    public String getN6() {
        return n6;
    }

    public void setN6(String n6) {
        this.n6 = n6;
    }

    public String getN7() {
        return n7;
    }

    public void setN7(String n7) {
        this.n7 = n7;
    }

    public String getN8() {
        return n8;
    }

    public void setN8(String n8) {
        this.n8 = n8;
    }

    public String getN9() {
        return n9;
    }

    public void setN9(String n9) {
        this.n9 = n9;
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public String getResta() {
        return resta;
    }

    public void setResta(String resta) {
        this.resta = resta;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(String multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public float getNum1decimal() {
        return num1decimal;
    }

    public void setNum1decimal(float num1decimal) {
        this.num1decimal = num1decimal;
    }

    public float getNum2decimal() {
        return num2decimal;
    }

    public void setNum2decimal(float num2decimal) {
        this.num2decimal = num2decimal;
    }
    
    
    
    
}
