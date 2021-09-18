package com.snake_ladder;

public class SnakeLadder {

	public static void main(String[] args) {
      
		System.out.println("After roll the die You got : "+roll());
		position();
	}
	
        public static int roll() {
            return (int) Math.floor(Math.random() * 6) + 1;
        }
      
        
        public static int position () {
        
        	int getPosition= (int) Math.floor(Math.random() * 3);
        	
        	switch ( getPosition ) {
        	
        	case 0:
        		System.out.print("Your Position is NoPlay ");
        		break;
        	case 1:
        		System.out.print("Your Position is Ladder ");
        		break;
        	default:
        		System.out.print("Your Position is Snake  ");
        		break;
        	}
        	return getPosition ;
                
        }
        
}
