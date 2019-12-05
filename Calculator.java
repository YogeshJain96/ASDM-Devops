import java.util.*;
class Calculator{
	public static void main(){
		System.out.println("Hello from PRN-0227");
		System.out.println("Simple Java Calculator");
		boolean exit=false;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Two Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		while(!exit){
			System.out.println("Menu");
			System.out.println("1.Add");
			System.out.println("2.Substract");
			System.out.println("3.Divide");
			System.out.println("4.Multiply");
			System.out.println("0.exit");
			System.out.println("Enter Choice:");
		switch(sc.nextInt()){
			case 0:exit=true;
				break;
			case 1:System.out.println("Addition of"+n1+" & "+n2+" is "+(n1+n2));
				break;
			case 2:System.out.println("Diffrence of"+n1+" & "+n2+" is "+(n1-n2));
				break;
			case 3:System.out.println("Division of"+n1+" & "+n2+" is "+(n1/n2));
				break;
			case 4:System.out.println("Multiplcation of"+n1+" & "+n2+" is "+(n1*n2));
				break;
			default:System.out.println("Invalid Choice");
			}
		}
	}
}
