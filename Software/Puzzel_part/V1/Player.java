//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
private class Player{

public Player(String Name){
  this.Name=Name;
  this.Type=1;
}

public Player(){
  this.Name="I.A";
  this.Type=0;
}


private String Name;
private int Type; // 0 is IA and 1 is PJ
private Character[] Team;
}
