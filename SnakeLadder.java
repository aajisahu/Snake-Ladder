package com.snake_ladder;

public class SnakeLadder {
	private static int count = 0;
	
	public static void main(String[] args) {
      
		position();
		repeatWin();
		System.out.println("Player 1 has won with a total dice roll of : "+count);	 
		
		
	}
		
	public static int roll() {
		count ++;
            return (int) Math.floor(Math.random() * 6) + 1;
        }
      
     public static int position () {
        
        	int getPosition= (int) Math.floor(Math.random() * 3);
          	return getPosition ;
                
        }

        
       public static int repeatWin()
       {
    	   
    	   int store = 1;
    	   int win;
    	   while (store <= 100 )
    	   {
    		   win=store;
    		      		   
    		   int roll=roll();
    		   System.out.println("PLayer1 got : " + roll);
    		   
    		   store += roll;
    		   if (store == 94 || store == 95 || store == 96 || store == 97 || store == 98 || store == 99 ) {
    			   store=100;
    			   System.out.println("Player1 is now at : "+ store);
    			   break;
    		   }
    		   
    		   else
    			   System.out.println("Player1 is now at : "+ store);
    		     		   
    		   if (store < 89 && store > 11)
    		   {
    			   switch (position ())
    			   {
    			   case 1:
    				   store += roll;
    				   System.out.println("Player 1 got a ladder is now at : " + store);
    				   
    			   case 2:
    				   store -= roll;
                       System.out.println("Player 1 got a snake is now at : " + store);
    			   }
    		   }
    		 
    		    
    	   }
    	   System.out.println("Player 1 has won");
		    return store;
       }
        
}
