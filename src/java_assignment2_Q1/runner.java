package java_assignment2_Q1;

public class runner extends Shape {
 public static void main(String[] args) {
   Calculate c = new Calculate();
   c.add();
   c.sub();
}

@Override
void draw() {
	// TODO Auto-generated method stub
    System.out.println("Drawing Rectangle");
}
}
