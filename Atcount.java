import java.io.*;
import java.util.*;

class Student
{	
	int rollno;
	String name;
	int count;
	
	Student(int rno,String name,int n)
	{
		this.name=name;
		this.rollno=rno;
		this.count=n;
	}	

	void display()
	{
		System.out.println("name:" +name+ "  rollno: " +rollno+" numbers: " +count);	
	}

}
	

	

public class Atcount

{	public static int z;
	public static void main(String arfs[]) throws IOException
	{	
		
		int count=0,i;
		ArrayList<Student> arrayList = new ArrayList<Student>();
		FileReader file = new FileReader("Student.dat");
		BufferedReader br = new BufferedReader(file);
		String line = null;

	
	while((line = br.readLine())!=null)
		{
			String[] attributes = line.split(",");
			for(i=2;i!=attributes.length;i++)
				{
				if(attributes[i].charAt(0)=='P')				
				count++;
				}			
			z++;
			arrayList.add(new Student(Integer.parseInt(attributes[0]),attributes[1],count));		
			count=0;		
		}
	for(Student s : arrayList)		
		s.display();

	}
}
