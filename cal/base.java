/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class base {
    
    private String resultat;
    public String calculatrice(float nbre1, float nbre2, String op){
        switch(op){
            case "+": 
                resultat= "nbre1+nbre2="+(nbre1+nbre2);
                break;
            case "/": if(nbre2!=0){
                resultat="nbre1/nbre2="+(nbre1/nbre2);
                break;
            }else{
                resultat="Division impossible";
            }
            default: break;
        }
        return resultat;
    }
   
            
            
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
