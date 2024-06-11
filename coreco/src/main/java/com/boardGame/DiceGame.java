package com.boardGame;

public class DiceGame {
	
	public static boolean possibility(int me, int friend)
	{
		if (me == friend) 
            return false; //already on the same tile
		
		int diff=Math.abs(me - friend);	//abs() returns positive value
			if(diff>0 && diff<=6)
				return true;
			else
				return false;
	}

	public static void main(String[] args) {
		
		System.out.println(possibility(3, 7));
		System.out.println(possibility(1, 9));
		System.out.println(possibility(5, 3));
	}
}
