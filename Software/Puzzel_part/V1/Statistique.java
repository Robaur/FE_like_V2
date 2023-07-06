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
	

public void PrintStat(){
	System.out.print(
	"Life :"+this.CaracK(0)+"\n"+
	"Atk :"+this.CaracK(1)+"\n"+
	"Def :"+this.CaracK(2)+"\n"+
	"Magic :"+this.CaracK(3)+"\n"+
	"Speed :"+this.CaracK(4)+"\n"+
	"Moral :"+this.CaracK(5)+"\n"
	);
	}	
	
public void PrintStat(int choice){ // choice how print it
	switch(choice){
		case 0:	
			System.out.print(
			"Life :"+this.CaracK(0)+"\n"+
			"Atk :"+this.CaracK(1)+"\n"+
			"Def :"+this.CaracK(2)+"\n"+
			"Magic :"+this.CaracK(3)+"\n"+
			"Speed :"+this.CaracK(4)+"\n"+
			"Moral :"+this.CaracK(5)+"\n"
			);
			break;
		case 1:
			System.out.print(
			"Life Atk Def Magic Speed Moral"+"\n"+"   "+
			+this.CaracK(0)+"   "
			+this.CaracK(1)+"   "
			+this.CaracK(2)+"   "
			+this.CaracK(3)+"   "
			+this.CaracK(4)+"   "
			+this.CaracK(5)+"   "
			+"\n"
			);
			break;
		default:
			break;
	}	
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
