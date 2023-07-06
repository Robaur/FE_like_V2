//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
public class Player{

public Player(String Name){
  this.Name=Name;
  this.Type=1;
  this.Team=new Character[1];
  this.waiter=null;
}

public Player(){
  this.Name="I.A";
  this.Type=0;
  this.Team=new Character[1];
  this.waiter=null;
}


//================================================= THIS IS ALL THE FUNCTION ============================

public void SETwaiter(Character Boy){
	this.waiter=Boy;
	}

public boolean Testwaiter(){
	if (this.waiter==null){return(true);}
	else {return(false);};
	}

public void ADDwaiter_IN_Team(){
	if(this.Team.length==1){
		this.Team[0]=this.waiter;
		this.waiter=null;
		}
		
	else {
		groupe= new Character[this.Team.length+1];
			for (int k=0;k<this.Team.length;k++){
				groupe[k]=this.Team[k];
			}
		groupe[this.Team.length+1]=this.waiter;
		this.waiter=null;
		this.Team=groupe;
		}
	}	
	
public void ChangeTeam(Character[] groupe){
	for (int k=0;k<this.Team.length;k++){
		groupe[k]=this.Team[k];
		}
	}


//============== PRINT ==========

public void PrintTeam(){}	


//================================================== THIS IS ALL THE ARGUMENT =====================================	
private String Name;
private int Type; // 0 is IA and 1 is PJ
private Character[] Team;
private Character waiter;  // SET a character that a player controle
}
