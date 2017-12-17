package com;

public class TowerOfHanoi {
	public void move(int numberOfHanoi,char a,char c,char b){
		if(numberOfHanoi==1){
			System.out.println("Moving disc one from "+a+" to "+c);
		}else{
		move(numberOfHanoi-1,a,b,c);
		System.out.println("Moving disc "+numberOfHanoi+" from "+a+" to "+c);
		move(numberOfHanoi-1, b,c, a);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi hanoi=new TowerOfHanoi();
		hanoi.move(2,'A','C','B');
	}
}
