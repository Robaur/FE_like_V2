//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
import java.lang.Math;

public class main{
	
  public static void main(String []args){
  //this.Gaming=new Game();
  //this.Gaming.MomentGame.Tab.PrintTab();
  
  Tableau Tab = new Tableau();
  Tab.PrintTab();
  Character Igor = new Character('I');
  Tab.PoppingChar(1,1,Igor);
  Tab.PrintTab();
  Tab.Depla_1_BOY(1,1,1);
  Tab.PrintTab();
  Igor.ReturnSTAT().PrintStat();
    Igor.ReturnSTAT().PrintStat(1);
}

//private Game Gaming;
}
