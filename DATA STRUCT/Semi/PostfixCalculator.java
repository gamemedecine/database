import java.util.*;

public class PostfixCalculator{
   
      protected int count; 
  


	public static String calculate(String postfix){
		String [] token = postfix.split(" ");
		Stack<String> stack = new Stack<String>();
		double result = 0;
		double var1, var2;
		for(int i = 0; i < token.length; i++){
			if(isNumber(token[i]))
			 stack.push(token[i]);
			else if(isOperator(token[i])){
				 var2 = Double.parseDouble(stack.pop());
				 var1 = Double.parseDouble(stack.pop());
			    switch(token[i]){

				 case "*":
				 		   result = var1 * var2;
				 		   stack.push(result+"");
				 		   System.out.println(var1+ " " +token[i]+ " " + var2+ " " + result);
				 		   break;
				 case "/":
						    result = var1/var2;
							stack.push(result+"");
							System.out.println(var1+ " " +token[i]+ " " + var2+ " " + result);
				 		   break;
				 case "+":
				 			result = var1 + var2;
				 			 //System.out.print(result);
							stack.push(result+"");
							System.out.println(var1+ " " +token[i]+ " " + var2+ " " + result);
				 			break;
				 case "-":
				 			result = var1 - var2;
				 			// System.out.print(result);
							stack.push(result+"");
							System.out.println(var1+ " " +token[i]+ " " + var2+ " " + result);
				 			break;
				 }
				// System.out.println(var1 + " " + var2+ " " + result);
		    }//end of else
	      }//end of for
	      return stack.peek();
		}//end of calculate
 
  //---------------------------------------------
	public static boolean isNumber(String token){
		boolean flag = true;
		try{
			Double.parseDouble(token);
			}
		 catch(Exception e){
			 flag = false;
			 }
		return flag;
		}

	public static boolean isOperator(String token){
		boolean flag  = false;
		switch(token){
			case "/":
			case "*":
			case "+":
			case "-":
			flag = true; break;
			}
		return flag;
		}
//---------------------------------------------------------
   public static int precedence(char a){
         switch (a){
            case '+':
            case '-':
               return 1;
            case '*':
            case '/':
               return 2;
         }
            return -1;
      }


  //------------------------------------ 
   
	public static String convert(String infix){
		
      String result = "";
      Stack<Character> stack = new Stack<Character>();
      
         for(int i = 0; i < infix.length(); i++){
            char a = infix.charAt(i);
            
               if(precedence(a) > 0){
                  while(stack.isEmpty() == false && precedence(stack.peek()) >= precedence(a)){
                     result = result + stack.pop();
                  }
                  stack.push(a);
               }
               else if(a == ')'){
                  char x = stack.pop();
                  while(x != '('){
                     result = result + x;
                     x = stack.pop();
                  }
               }
               else if(a == '('){
                  stack.push(a);
               }
               else {
                  result = result + a;
               }
         }         
                  for(int i = 0; i <= stack.size(); i++){
                     result = result + stack.pop();
                  }
      
       return result;
      }		            
           

           

    
            
          
            
                 		
                         
    

	public static void main(String [] args){
		PostfixCalculator post = new PostfixCalculator();
      Scanner console = new Scanner(System.in);
      
		System.out.print("Enter postfix expression:");
      
		String postfix = console.nextLine(); //6 4 + 3 * 16 4 / -
     String infix = postfix;
		//accept infix
		//convert to postfix
		//calculate the result
		//String result = calculate(postfix);
      String res1 = convert(infix);
	 System.out.println("converted: " + res1);

   String result = calculate(res1);

   System.out.println("Result = " + result);
     
  
		}
	}