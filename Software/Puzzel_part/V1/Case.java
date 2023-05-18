//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//


private class Case{


//================================================= THIS IS ALL THE WAY TO BUILD A CASE ============================

public Case(){
  this.cordonner=[0,0,0];
  this.type=0;
}
public Case(int x, int y){
  this.cordonner=[x,y,0];
  this.type=0;
}
public Case(int x, int y,int z){
  this.cordonner=[x,y,z];
  this.type=0;
}
public Case(int x, int y,int z,int class){
  this.cordonner=[x,y,z];
  this.type=class;
}

public Case(int[2] posit,int class){
  this.cordonner=posit;
  this.type=class;
}

//================================================= THIS IS ALL THE FUNCTION ============================

private chagType (int type){

  this.type=type;

}


public PrintCase(){
  System.out.print("["+this.type+"]");
}

//================================================== THIS IS ALL THE ARGUMENT =====================================

private int[2] cordonner;
private int type; // this is the tape of the ground
}
