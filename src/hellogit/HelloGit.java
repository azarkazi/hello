/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellogit;

/**
 *
 * @author NIC
 */
public class HelloGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int add = add(2,6);
        System.out.println("Reuslt: "+add);
        int sub = sub(9,5);
        System.out.println("Reuslt: "+sub);
    }
    
    public static int add(int num1,int num2){
        return num1+num2;
    }
    
    public static int sub(int num1,int num2){
        return num1-num2;
    }
}