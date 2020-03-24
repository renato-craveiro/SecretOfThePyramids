/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secret.of.the.pyramids;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class Game {
    Scanner sc;
    
    public void delay(String text){
        for(int i=0; i<text.length();i++){
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(253); 
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
    
    public void clear(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public void MainMenu(){
        sc= new Scanner(System.in);
        
        String t ="This game will show you many possibilities you can choose along the way.\n"+
                "Think carefully for each of them.\n"+
                "You are responsible because you choose what happens next.";
        delay(t);
        sc.nextLine();
        clear();
        t="Secret of The Pyramids - by Richard Brightfield\n(Choose your own Adventure)";
        delay(t);
        System.out.println("\n");
        System.out.println("                                        _L/L");
        System.out.println("                                      _LT/l_L_");
        System.out.println("                                    _LLl/L_T_lL_");
        System.out.println("                _T/L              _LT|L/_|__L_|_L_");
        System.out.println("              _Ll/l_L_          _TL|_T/_L_|__T__|_l_");
        System.out.println("            _TLl/T_l|_L_      _LL|_Tl/_|__l___L__L_|L_");
        System.out.println("          _LT_L/L_|_L_l_L_  _'|_|_|T/_L_l__T _ l__|__|L_");
        System.out.println("        _Tl_L|/_|__|_|__T _LlT_|_Ll/_l_ _|__[ ]__|__|_l_L_");
        System.out.println(" _ __ _LT_l_l/|__|__l_T _T_L|_|_|l/___|__ | _l__|_ |__|_T_L_L __");

        
    }
    
    public void NewGame(){
    
    }
    
    
    
    
}



