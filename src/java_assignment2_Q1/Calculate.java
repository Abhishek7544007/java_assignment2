package java_assignment2_Q1;


public class Calculate implements MyInterface
{ 
  int a = x; 
  int b = y;
 
@Override
public void add() {
	// TODO Auto-generated method stub
	int sum = a+b;
	
	System.out.println("Addition : " + sum ); 
	
  }

@Override
public void sub() {
	// TODO Auto-generated method stub
	int diff = a-b;
	System.out.println("substraction: " + diff); 

	
} 

}