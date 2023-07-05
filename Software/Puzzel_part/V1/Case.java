//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//


public class Case{

//================================================= THIS IS ALL THE WAY TO BUILD A CASE ============================

public Case(){
  //this.cordonner={0,0,0};   ne semble pas marcher
  this.cordonner= new int[3];
  this.cordonner[0]=0;
  this.cordonner[1]=0;
  this.cordonner[2]=0;
  this.type='O';
  this.Boy =null;
  this.selector =null;
}

public Case(int x, int y){
  this.cordonner= new int[3];
   //this.cordonner= {x,y,0};
  this.cordonner[0]=x;
  this.cordonner[1]=y;
  this.cordonner[2]=0;
  this.type='O';
  this.Boy =null;
  this.selector =null;
}

public Case(int x, int y,int z){
  this.cordonner= new int[3];
  this.cordonner[0]=x;
  this.cordonner[1]=y;
  this.cordonner[2]=z;
  this.Boy =null;
  this.selector =null;
}
public Case(int x, int y,int z,char type){
  this.cordonner= new int[3];
  this.cordonner[0]=x;
  this.cordonner[1]=y;
  this.cordonner[2]=z;
  this.type=type;
  this.Boy =null;
  this.selector =null;
}

//public Case(int[2] posit,int class){
 // this.cordonner=posit;
//}

//================================================= THIS IS ALL THE FUNCTION ============================
public void AttribBOY(Character BOY){
	this.Boy=new Character();
	this.Boy=BOY;
	this.type=BOY.ReturnREP();
	}




// this function change the last value of coordonne, if it is 1: the case is Occuped else not
public void ChangOccupat(int occup){  
	if (this.cordonner[2]==occup){}
	else {this.cordonner[2]=occup;}
	}


public void ChangeCaseCharact(Case Out){  // assez proche de AttribBOY !!!!!!!
	Out.Boy =new Character();
	Out.Boy.CopyCharacter(this.Boy);
	Out.ChangOccupat(1);
	this.ChangOccupat(0);
	this.Boy=null;
	this.RenamingCase();
	Out.RenamingCase();
	
	}

public void RenamingCase(){
	if (this.Boy==null){this.type='O';}
	else {this.type=this.Boy.ReturnREP();}
	}	

//================================================== THIS IS ALL THE ARGUMENT =====================================

public int[] cordonner;
public char type; // this is the tape of the ground   change in private 
public Character Boy;
public Cursor selector;
}
