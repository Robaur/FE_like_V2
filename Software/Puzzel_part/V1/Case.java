private class Case{


//================================================= THIS IS ALL THE WAY TO BUILD A CASE ============================

private Case(){
  this.cordonner=[0,0,0];
  this.type=0;
}
private Case(int x, int y){
  this.cordonner=[x,y,0];
  this.type=0;
}
private Case(int x, int y,int z){
  this.cordonner=[x,y,z];
  this.type=0;
}
private Case(int x, int y,int z,int class){
  this.cordonner=[x,y,z];
  this.type=class;
}

private Case(int[2] posit,int class){
  this.cordonner=posit;
  this.type=class;
}

//================================================= THIS IS ALL THE FUNCTION ============================




private int[2] cordonner;
private int type; // this is the tape of the ground
}
