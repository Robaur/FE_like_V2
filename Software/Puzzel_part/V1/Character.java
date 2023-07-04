//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
public class Character{


//================================================= THIS IS ALL THE WAY TO BUILD A CHARACTER ============================


public Character(String Name){
  this.Name=Name;
}

public Character(){
	this.Name="";
	this.rep='O';
	}
	
public Character(char test){
	this.Name="Igore";
	this.rep=test;
	
	
	}
	
//================================================= THIS IS ALL THE FUNCTION ============================


public char ReturnREP(){
	return(this.rep);	
	}
	
public String ReturnName(){
	return(this.Name);
	}	
	
	
	

public void CopyCharacter(Character Copied){
	this.Name=Copied.ReturnName();
	this.rep=Copied.ReturnREP();
	}


//================================================== THIS IS ALL THE ARGUMENT =====================================

  private String Name;
  private char rep;
  //private School school;
  //private Statistique Stat;
  //private Case Position; SEMBLE ETRE PAS MAL DE LA MERDE >CETTE LIGNE
  //private SkillPool skills;
  //private Persona Perso;
  //private Stuff stuff; 
}
