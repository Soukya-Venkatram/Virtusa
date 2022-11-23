import java.util.*;
import java.lang.*;
import java.io.*;

class Employee{
	long id;
	String name;
	long salary;
	long mobno;
	String email;
	String add;
	String dob;
	String doj;
	Employee(long id,String name,long salary,long mobno,String email,String add,String dob,String doj){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.mobno=mobno;
		this.email=email;
		this.add=add;
		this.dob=dob;
		this.doj=doj;
	}
}
class Dotnet1
{
	public static void add(ArrayList<Employee> arr){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		long id=sc.nextLong();
		System.out.println("Enter name");
		String name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter salary");
		Long salary=sc.nextLong();
		System.out.println("Enter mobno");
		long mobno=sc.nextLong();
		System.out.println("Enter email");
		String email=sc.nextLine();
		email=sc.nextLine();
		System.out.println("Enter add");
		String add=sc.nextLine();
		System.out.println("Enter dob");
		String dob=sc.nextLine();
		System.out.println("Enter doj");
		String doj=sc.nextLine();
		Employee e=new Employee(id,name,salary,mobno,email,add,dob,doj);
		arr.add(e);
	}
	public static void print(ArrayList<Employee> arr){
		for(Employee e: arr){
			System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.mobno+" "+e.email+" "+e.add+" "+e.dob+" "+e.doj);
		}
	}
	public static void printSingle(ArrayList<Employee> arr,int id){
		for(Employee e: arr){
			if(e.id==id){
				System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.mobno+" "+e.email+" "+e.add+" "+e.dob+" "+e.doj);
			}
		}
	}
	public static void update(ArrayList<Employee> arr,int id){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the address to be updated");
		String add=sc.nextLine();
		for(Employee e: arr){
			if(e.id==id){
				e.add=add;
			}
		}
	}
	public static void delete(ArrayList<Employee> arr,int id){
		for(Employee e: arr){
			if(e.id==id){
				arr.remove(e);
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Employee> arr=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.Add employee details:");
			System.out.println("2.view single employee details");
			System.out.println("3.view all employee details");
			System.out.println("4.update employee details");
			System.out.println("5.delete employee details");
			System.out.println("6.exit");
			System.out.println("Enter your choice");
			int a=sc.nextInt();
			if(a==1){
				System.out.println("Enter new employee details");
				add(arr);
				System.out.println("Employee details added successfully");
			}
			else if(a==2){
				System.out.println("Enter employee id");
				int b=sc.nextInt();
				printSingle(arr,b);
			}
			else if(a==3){
				print(arr);
			}
			else if(a==4){
				System.out.println("Enter id of employee");
				int b=sc.nextInt();
				update(arr,b);
			}
			else if(a==5){
				System.out.println("Enter employee id to be deleted");
				int b=sc.nextInt();
				delete(arr,b);
			}
			else{
				break;
			}
		}
				
				
			
	}
}
