//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
import javax.swing.JFrame;


public class Game{

public Game(){
  this.NameGame="FE_Like";
  //this.MomentGame=new Turn();
  
  this.Window =new JFrame();
  this.Window.setSize(1000,1000);
  this.Window.setVisible(true);
  this.Window.setTitle("Fire Emblem and the war of the twelve's Overlord");
  this.Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public void End_Game(){
	this.Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
public void Call_Menu(){}

private String NameGame;
//private Turn MomentGame;
private Player[] PlayerInGame;
private JFrame Window;

}
