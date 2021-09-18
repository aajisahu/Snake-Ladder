package com.snake_ladder;

public class SnakeLadder {
	private static int count = 0,count2 = 0;
	
	public static void main(String[] args) {
      
		position();
		position2();
		repeatWin();
		System.out.println("Player 1 has won with a total dice roll of : "+count);	 
		
	}
		
	//player 1 roll
	public static int roll() {
		count ++;
            return (int) Math.floor(Math.random() * 6) + 1;
        }
	//player 2  roll
	public static int roll2() {
		count2 ++;
            return (int) Math.floor(Math.random() * 6) + 1;
        }
	
	//player 1  roll
     public static int position () {
        
        	int getPosition= (int) Math.floor(Math.random() * 3);
          	return getPosition ;
                
        }
   //player 2  roll
     public static int position2 () {
         
     	int getPosition= (int) Math.floor(Math.random() * 3);
       	return getPosition ;
     }
     
       public static int repeatWin()
       {
    	   
    	   int store =0;
    	   int store1 =0;
    	   while (store <= 100 && store1 <= 100)
    	   {
    		      		      		   
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
    		 
    		   //for player 2
    		   int roll2 = roll2();
               System.out.println("Player2 got : " + roll2);
               
               store1 += roll2;
               System.out.println("Player2 is now at : " + store1);
               
               if (store1 > 100) {
                   store1 -= roll2;
                   System.out.println("Player 2 can not surpass 100 and is reverted back to : " + store1);
               }
               
               if (store1 < 89 && store1 > 11) {
                   switch (position2()) {
                       
                   case 1 :
                           store1 += roll2;
                           System.out.println("Player2 got a ladder is now at : " + store1);
                       
                       case 2 :
                           store1 -= 2 * roll2;
                           System.out.println("Player2 got a snake is now at : " + store1);
                          
                   }
                   
               }
               
  	   }
    	   System.out.println("Player 1 finished in : " + store);
           System.out.println("Player 2 finished in : " + store1);
           if (store > store1) {
        	   
               System.out.println("Player 1 has won the game. \nThe total number of time the dice was rolled per player is : " + count);
           } 
           else {
        	   
               		System.out.println("Player 2 has won the game. The total number of time the dice was rolled per player is : " + count);
           		}
    	   return store;
    	   
    	   
   }
}
