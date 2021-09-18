package com.snake_ladder;

public class SnakeLadder {

	public static void main(String[] args) {
      
		System.out.println("After roll the die You got : "+roll());
    
		
	}
	
        public static int roll() {
            return (int) Math.floor(Math.random() * 6) + 1;
        }
        
        
	
	
}
