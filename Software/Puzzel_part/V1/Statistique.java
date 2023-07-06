//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
public class Statistique{
	
	
	
//================================================= THIS IS ALL THE WAY TO BUILD A STATISTIQUE ============================	



public Statistique(){
  this.statis= new int[7];
  for (int k=0;k<7;k++){
	  this.ChangeCaracK(k,1);
	  }
}

public Statistique (int[] stat){
  this.statis= new int[7];
  for (int k=0;k<7;k++){
	  this.ChangeCaracK(k,stat[k]);
	}
	}
	


//================================================= THIS IS ALL THE FUNCTION ============================


public void ChangeCaracK(int k,int NewVal){
		this.statis[k]=NewVal;
	}
public int CaracK(int k){
	return(this.statis[k]);
	}

public boolean verifDEATH(){
	if(this.CaracK(0)<1){return(true);}
	else {return(false);}
	} 

//================================================== THIS IS ALL THE ARGUMENT =====================================


  //private int Life;
  //private int Atk;
  //private int Def;
  //private int Magic;
  //private int Speed;
  //private int Moral;
  //private int Trust;
  private int[] statis;
}
