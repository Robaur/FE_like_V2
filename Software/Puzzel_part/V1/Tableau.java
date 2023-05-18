//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//

private class Tableau{

//================================================= THIS IS ALL THE WAY TO BUILD A CASE ============================

private Tableau(){
  for( int i,i<20,i++){
    for( int j,j<20,j++){
      this.Tab[i][j]=Case();
    }
  }
}

private Tableau(int n){
  for( int i,i<n,i++){
    for( int j,j<n,j++){
      this.Tab[i][j]=Case();
    }
  }
}

private Tableau(int n,int m){
  for( int i,i<n,i++){
    for( int j,j<m,j++){
      this.Tab[i][j]=Case();
    }
  }
}

//================================================= THIS IS ALL THE FUNCTION ============================







private Case[][] Tab;

}
