package chandriki2;

public class simpleinstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Ankit A=new Ankit();
      A.input();
      A.disp();
	}

}
class Student11
{
	int roll,marks;
	String name;
	void input()
	{
		System.out.println("enter roll no. and name");
	}
}
class Ankit extends Student11
{
	void disp()
	{
		roll=1;
		name="Ankit";
		marks=48;
		System.out.println(roll+"  " +name+"  "+marks);
	}
}
