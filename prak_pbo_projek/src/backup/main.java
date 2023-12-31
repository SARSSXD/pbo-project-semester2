/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_pbo_projek;

public class main {
    public static void main(String[] args) {
        try{
            Login form = new Login();
            form.setVisible(true);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}