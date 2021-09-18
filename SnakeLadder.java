package com.snake_ladder;

public class SnakeLadder {

	public static void main(String[] args) {
      
		System.out.println("After roll the die You got : "+roll());
		position();
		repeatWin();
		
		
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
        
        
       public static int repeatWin()
       {
    	   
    	   int store = 0;
    	   while (store <= 100)
    	   {
    		   
    		   int roll=roll();
    		   System.out.println("PLayer1 got : " + roll);
    		   store += roll;
    		   System.out.println("Player1 is now at : "+ store);
    		   
    		   if (store < 89 && store > 11)
    		   {
    			   switch (position ())
    			   {
    			   case 1:
    				   store += roll;
    				   System.out.println("Player1 got a ladder is now at : " + store);
    				   
    			   case 2:
    				   store -= roll;
                       System.out.println("Player1 got a snake is now at : " + store);
    			   }
    		   }
    		 
    		    
    	   }
    	   System.out.println("Player 1 has won");
		    return store;
       }
        
}
