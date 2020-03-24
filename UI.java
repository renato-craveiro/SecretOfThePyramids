/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secret.of.the.pyramids;

/**
 *
 * @author Renato
 */
public class UI {
    Game GameInterface;
    
    
    
    
    public void UIGame(){
        GameInterface = new Game();
        GameInterface.MainMenu();
    }
}
