import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
    private int[] testScores;
   Student(String firstName, String lastName, int identification,int[] scores){
       super(firstName,lastName,identification);
       testScores = new int[scores.length];
       testScores=scores;
   }
    public int average(){
        int sum=0;
        int l=testScores.length;
        for(int i=0;i<l;i++){
            sum+=testScores[i];
        }
        return sum/l;
    }
    public char calculate(){
        int a=average();
        char grade;
        if(a>=90)
            grade='O';
        else if(a>=80)
            grade='E';
        else if(a>=70)
            grade='A';
        else if(a>=55)
            grade='P';
        else if(a>=40)
            grade='D';
        else
            grade='T';
        return grade;
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}