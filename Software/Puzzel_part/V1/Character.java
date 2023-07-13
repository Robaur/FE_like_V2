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
  this.Stat= new Statistique();
  this.P=null;
}

public Character(){
	this.Name="";
	this.rep='0';
	this.Stat= new Statistique();
	this.P=null;
	}
	
public Character(char test){
	this.Name="Igore";
	this.rep=test;
	this.Stat= new Statistique();
	
	}

public Character(Player P1){
	this.Name="Alex";
	this.rep='A';
	this.Stat= new Statistique();
	this.P=P1;
	P1.SETwaiter(this);
	}
	
//================================================= THIS IS ALL THE FUNCTION ============================



public boolean Rustered (Player P){
	if (P.Testwaiter()==true){
		P.SETwaiter(this);
		this.P=P;
		return(true);
		}
	else{return(false);}
	}	

/*

public Character COPYCharacter(){
		System.out.print("MATMATTA");
		Character bob =new Character();
		bob.Name=this.Name;
		bob.rep=this.rep;
		bob.Stat=this.Stat;
		bob.P=this.P;
		return(bob);
		
	}
	*/	

public void CopyCharacter(Character Copied){
	this.Name=Copied.ReturnName();
	this.rep=Copied.ReturnREP();
	this.Stat=Copied.ReturnSTAT();
	this.P=Copied.ReturnPLAYER();
	}


public boolean Verif_Charac_ident_P(Character tested){
	if (this.P==tested.P){return(true);}
	else{return(false);}
	}
	


//============== PRINT ==========

public void PrintCharac(){
	System.out.print("\n"+this.ReturnName()+"\n");
	this.ReturnSTAT().PrintStat(1);
	}
	

public void PrintFightStat(Character DEF){
		//System.out.print(this.name + '\n');
		//System.out.print("" + this.f)
		
	}


//===== Fight Part ===============

public void fight(Character DEF){
	//this.Verif_Charac_ident_P(DEF);
	System.out.print(this.Name + ':' +this.CalDommage(DEF,false)+'\n');
	System.out.print(DEF.Name + ':' +DEF.CalDommage(this,false)+'\n');
	this.Dommage(DEF);
	}


public void Dommage(Character Defender){  // Apply the dommage \ change the life 
	this.Stat.ChangeCaracK(0,this.CalDommage(Defender,false));
	Defender.Stat.ChangeCaracK(0,Defender.CalDommage(this,false));
	}



public int CalDommage(Character DEF,boolean type_ATK){ // Cal the dommage make
	
	int S=this.Stat.CaracK(0);
	int mode;
	if(type_ATK==false){  //this boolean is false => physic atk
		
		 mode=this.Stat.CaracK(2)-DEF.Stat.CaracK(1);
		}
		
	else{
		 mode=this.Stat.CaracK(3)-DEF.Stat.CaracK(3);
		}	
	if(mode<0){return(S+mode);}
	else{return(S);}	
	}




//=====   RETURN ARGU

public char ReturnREP(){
	return(this.rep);	
	}
	
	
public String ReturnName(){
	return(this.Name);
	}	
	
public Statistique ReturnSTAT(){
	return(this.Stat);
	}	

public Player ReturnPLAYER(){
	return(this.P);}

//================================================== THIS IS ALL THE ARGUMENT =====================================

  private String Name;
  private char rep;
  //private School school;
  private Statistique Stat;
  private int[] Modificator;
  //private Case Position; SEMBLE ETRE PAS MAL DE LA MERDE >CETTE LIGNE
  //private SkillPool skills;
  //private Persona Perso;
  //private Stuff stuff; 
  private Player P;
}
