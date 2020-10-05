import java.io.*;
import java.util.*;

public class bitset
{
  public static void main(String args[])
  {
    // System.out.println("hi");
    Scanner sc= new Scanner(System.in);
    Vectorclass v=new Vectorclass();
    int choice=0;
    while(choice!=5)
    {
    System.out.println("Student DataBase\n1.Enter Student Details\n2.Display All Students Details\n3.Search Student\n4.Delete Student Details\n5.Exit");
    choice=sc.nextInt();
    switch(choice)
    {
      case 1:
      {
        v.add();
        break;
      }
      case 2:
      {
        v.display();
        break;
      }
      case 3:
      {
        v.search();
        break;
      }
      case 4:
      {
        v.delete();
        break;
      }
    }
  }
  }
}


class Student
{

  int Rollno;
  String Name;
  int Marks;
  public Student()
  {
    Rollno=0;
    Name="abc";
    Marks=0;

  }
  public Student(int rollno,String name,int marks)
  {
    Rollno=rollno;
    Name=name;
    Marks=marks;
  }
}
class Vectorclass
{
  Scanner sc= new Scanner(System.in);
  Vector<Student>v=new Vector<Student>(5,8);
  BitSet record = new BitSet(5);

  public void add()
  {

     System.out.println("Enter ROllNo");
     int Roll=sc.nextInt();
     // Skip the newline
     sc.nextLine();
     System.out.println("Enter Name");
     String Name1 = sc.nextLine();
     System.out.println("Enter Marks");
     int Mark=sc.nextInt();
     Student s=new Student(Roll,Name1,Mark);
     v.add(s);
     record.set(Roll);
  }
  public void display()
  {
    for(int i=0;i<v.size();i++)
    {
      System.out.println("\n******************************\n");
      System.out.println("Name: " + v.get(i).Name);
      System.out.println("Marks: " +v.get(i).Marks);
      System.out.println("RollNO: " +v.get(i).Rollno);
      System.out.println("\n******************************\n");
    }
  }
  public void search()
  {
    System.out.println("Enter ROllNo to be searched");
    int Roll=sc.nextInt();
    if(record.get(Roll))
    System.out.println("Student Found");
    else
    System.out.println("Student Not Found");
  }
  public void delete()
  {
    System.out.println("Enter ROllNo to be deleted");
    int Roll=sc.nextInt();
    if(record.get(Roll))
    {
        record.clear(Roll);
        for(int i=0;i<v.size();i++)
        {
          if(v.get(i).Rollno==Roll)
          {
            v.remove(i);
            System.out.println("Student Record Deleted");
            break;
          }
        }
    }
    else
    System.out.println("Student Not Found");

  }

}

//Output
// Student DataBase
// 1.Enter Student Details
// 2.Display All Students Details
// 3.Search Student
// 4.Delete Student Details
// 5.Exit
// 1
// Enter ROllNo
// 12
// Enter Name
// Tejas
// Enter Marks
// 98
// Student DataBase
// 1.Enter Student Details
// 2.Display All Students Details
// 3.Search Student
// 4.Delete Student Details
// 5.Exit
// 2
//
// ******************************
//
// Name: Tejas
// Marks: 98
// RollNO: 12
//
// ******************************
//
// Student DataBase
// 1.Enter Student Details
// 2.Display All Students Details
// 3.Search Student
// 4.Delete Student Details
// 5.Exit
// 3
// Enter ROllNo to be searched
// 12
// Student Found
// Student DataBase
// 1.Enter Student Details
// 2.Display All Students Details
// 3.Search Student
// 4.Delete Student Details
// 5.Exit
// 4
// Enter ROllNo to be deleted
// 1
// Student Not Found
// Student DataBase
// 1.Enter Student Details
// 2.Display All Students Details
// 3.Search Student
// 4.Delete Student Details
// 5.Exit
// 5
//
// C:\Users\Tejas Manoj Shah\Desktop\java>
