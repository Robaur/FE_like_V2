//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
import java.lang.Math;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


/*
 * 	ORDER TASK 
 * 
 * // Make the imput class good 
 * / Creat the right imput for moving rightly the cursor on the tab 
 *  Make the fight 
 * import weapon -----> build the object
 * import the heal
 * build Class
 * build Basic class, Assassin/Wizard/Warrior  
 * import the genaral power 
 * built Actif/Passif/Persona 
 * 
 */


public class main{
	
  public static void main(String []args){
  Game game=new Game();
  //this.Gaming.MomentGame.Tab.PrintTab();
  
  Tableau Tab = new Tableau();
  Tab.PrintTab();
  Character Igor = new Character('I');
  Tab.PoppingChar(1,1,Igor);
  Tab.PrintTab();
  Tab.Depla_1_BOY(1,1,1);
  Tab.PrintTab();
  Igor.PrintCharac();
  Player BOB = new Player("BOB");
  Character Alex =new Character(BOB);
  BOB.ADDwaiter_IN_Team();
  BOB.PrintTeam();
  Igor.fight(Alex);
  BOB.PrintTeam();
  Igor.PrintCharac();
  Tab.SetPanelTab(game);
  game.PrintWindows();
}

	


}

