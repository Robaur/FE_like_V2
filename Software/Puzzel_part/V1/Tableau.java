//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//

public class Tableau{

//================================================= THIS IS ALL THE WAY TO BUILD A TABLEAU ============================

public Tableau(){
	this.Tab = new Case[20][20];
  for( int i=0;i<20;i++){
    for( int j=0;j<20;j++){
		this.Tab[j][i] = new Case(j,i);
    }
  }
  this.size = new int[2];
  this.changeIntSize(20,0);
  this.changeIntSize(20,1);
  this.Tab[0][0].selector=new Cursor();
  this.CursorPOS= new int[2];
  this.CursorPOS[0]=0;
  this.CursorPOS[1]=0;
}

public Tableau(int n){
  for( int i=0;i<n;i++){
    for( int j=0;j<n;j++){
      this.Tab[i][j]=new Case();
    
  }
  this.size = new int[2];
  this.changeIntSize(n,0);
  this.changeIntSize(n,1);
}
}

public Tableau(int n,int m){
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      this.Tab[i][j]=new Case();
      }
    }
    this.size = new int[2];
    this.changeIntSize(n,0);
    this.changeIntSize(m,1);
  }
  


//================================================= THIS IS ALL THE METHODE ============================



//============== PRINT ==========

public void PrintTab(){
  for(int i=0;i<this.size[0];i++){
	  System.out.print("\n");
    for(int j=0;j<this.size[1];j++){
		if (this.Tab[i][j].selector==null){System.out.print("["+this.Tab[i][j].type+"]");}
		else{
			System.out.print(""+this.Tab[i][j].selector.ReturnBRAND()   // la liste vide fixe le polymorphisme
			+this.Tab[i][j].type
			+this.Tab[i][j].selector.ReturnBRAND());}
    }
  }
  System.out.print("\n");
}



//============== DEPLA ==========


public void changeIntSize(int n,int sizeplace){
	this.size[sizeplace]=n;
	
	}
public void PoppingChar(int x,int y,Character BOY){
	this.Tab[x][y].AttribBOY(BOY);
	this.Tab[x][y].ChangOccupat(1);
	}

public void Depla_1_BOY(int x, int y,int order){ 
	switch (order){
		case 0: // go north 
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x][y+1]);
			break;
		case 1: // go left 
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x-1][y]);
			break;
		case 2: // go south 
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x][y-1]);
			break;
		default: // go right
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x+1][y]);
			break;
		}
	}

public void CursorPopping(int x,int y){ // est en tain de faire le deplacement du curseur
	this.Tab[CursorPOS[0]][CursorPOS[1]].selector=null;
	this.Tab[x][y].selector=new Cursor();
	this.CursorPOS[0]=x;
	this.CursorPOS[1]=y;
	}	
	
public void ChangeCursorPOS(int x,int y){
	this.CursorPOS[0]=x;
	this.CursorPOS[1]=y;
	}	



public void CursorDepla(int order){
	switch(order){
		case 0:
			this.CursorPopping(this.CursorPOS[0],this.CursorPOS[1]+1);
			this.ChangeCursorPOS(this.CursorPOS[0],this.CursorPOS[1]+1);
			break;
		case 1:
			this.CursorPopping(this.CursorPOS[0]-1,this.CursorPOS[1]);
			this.ChangeCursorPOS(this.CursorPOS[0]-1,this.CursorPOS[1]);
			break;
		case 2:
			this.CursorPopping(this.CursorPOS[0],this.CursorPOS[1]-1);
			this.ChangeCursorPOS(this.CursorPOS[0],this.CursorPOS[1]-1);
			break;
		case 3:
			this.CursorPopping(this.CursorPOS[0]+1,this.CursorPOS[1]);
			this.ChangeCursorPOS(this.CursorPOS[0]+1,this.CursorPOS[1]+1);
			break;
		
		}
	}

//================================================== THIS IS ALL THE ARGUMENT =====================================


public Case[][] Tab;
private int[] size;
private int[] CursorPOS;
}
