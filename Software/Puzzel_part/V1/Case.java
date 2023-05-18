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
  this.cordonner[0]=0;
  this.cordonner[1]=0;
  this.cordonner[2]=0;
  this.type=0;
}
public Case(int x, int y){
  this.cordonner[0]=x;
  this.cordonner[1]=y;
  this.cordonner[2]=0;
  this.type=0;
}
public Case(int x, int y,int z){
  this.cordonner[0]=x;
  this.cordonner[1]=y;
  this.cordonner[2]=z;
  this.type=0;
}
public Case(int x, int y,int z,int type){
  this.cordonner[0]=x;
  this.cordonner[1]=y;
  this.cordonner[2]=z;
  this.type=type;
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

public int[] cordonner;
private int type; // this is the tape of the ground

}
