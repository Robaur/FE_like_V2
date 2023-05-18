//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//

private class Tableau{

//================================================= THIS IS ALL THE WAY TO BUILD A CASE ============================

public Tableau(){
  for( int i;i<20;i++){
    for( int j;j<20;j++){
      this.Tab[i][j]=Case();
    }
  }
  this.size[0]=20;
  this.size[1]=20;
}

public Tableau(int n){
  for( int i;i<n;i++){
    for( int j;j<n;j++){
      this.Tab[i][j]=Case();
    }
  }
  this.size[0]=n;
  this.size[1]=n;
}
}

public Tableau(int n,int m){
  for(int i;i<n;i++){
    for(int j;j<m;j++){
      this.Tab[i][j]=Case.Case();
      }
    }
    this.size[0]=n;
    this.size[1]=m;
  }
  }


//================================================= THIS IS ALL THE FUNCTION ============================
public PrintTab(){
  for(int i;i<this.size[0];i++){
    for(int j;j<this.size[1];j++){
        System.out.Print("[]"+this.Case[i][j].type+"]");
    }
  }
}


private Case[][] Tab;
private int[1] size;
}
