package testpress;
import java.util.Arrays;
import java.util.Scanner;
public class exam extends timer
{
	public static void main(String[] args) {
		String q1="1. choose the approriate data type for this value :5.5?\n"
				+"(a)int\n(b)double\n(c)boolean\n(d)String\n";
		String q2="2. an object could be?\n"
				+"(a)anything\n(b)an algorithm\n(c)a data converter\n(d)a program\n";
		String q3="3. which of the following is not a java keyword?\n"
				+"(a)static\n(b)try\n(c)integer\n(d)new\n";
		String q4="4. java runs on?\n"
				+"(a)windows\n(b)linux\n(c)mac\n(d)all the above\n";
		String q5="5. what is the size of char in java?\n"
				+"(a)4 bits\n(b)7 bits\n(c)6 bits\n(d)16 bits\n";
		String q6="6. what guarantees type saftly in a collection?\n"
				+"(a)generics\n(b)abstract class\n(c)interface\n(d)collection\n";
		String q7="7. hashset internally uses ?\n"
				+"(a)set\n(b)hashmap\n(c)list\n(d)collection\n";
		String q8="8. which of these is synchronized?\n"
				+"(a)arraylist\n(b)linkedlist\n(c)vector\n(d)none of the above\n";
		String q9="9. araylist implement that of the following ?\n"
				+"(a)list\n(b)random access\n(c)clonable\n(d)all of these\n";
		String q10="10. vector extends that of these?\n"
				+"(a)array list\n(b)linked list\n(c)abstract list\n(d)none\n";
		
		questions [] ques = {
				new questions(q1,"b"),
				new questions(q2,"a"),
				new questions(q3,"c"),
				new questions(q4,"d"),
				new questions(q5,"d"),
				new questions(q6,"a"),
				new questions(q7,"a"),
				new questions(q8,"c"),
				new questions(q9,"d"),
				new questions(q10,"c"),
		};
		taketest(ques);
	}
	public static void taketest(questions[] ques)
	{
		int score =0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ques.length;i++)
		{
			System.out.println(ques[i].Ques);
			String answer =sc.nextLine();
			if(answer.equals(ques[i].answer))
			{
				score++;
				timer t1=new timer();
				t1.start();
			}
			else
			{
				System.out.println("correct answer is: "+ques[i].answer);
				System.out.println("           ");
			}}
		System.out.println("you got  "+score +" / "+ques.length);
		System.out.println("TIME TAKEN::"+secondspassed+" ");
	}}
			
