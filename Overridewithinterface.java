package interface1;

public class Overridewithinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Founder f = new Founder();
		f.breathIn();
		f.breathOut();
		f.fear();
		f.reproduction();
		f.eat();
		f.sleep();
		f.giveBirth();
		f.think();
		f.active();
		f.study();
		f.work();
		f.execute();
		f.manage();
		f.direct();
		/*f.found();*/
		
		
	
		
	}

}

class LivingBeing
{
	void breathIn() { 
		System.out.println("Living Being is inhaling...");
	}
	void breathOut() { 
		System.out.println("Living Being is exhaling...");
	}
}
class Tree extends LivingBeing
{
	
}
class Animal extends LivingBeing
{
	void fear() {
		System.out.println("fear of death...");
	}
	void eat() {
		System.out.println("eating.......");
	}
	void sleep() {
		System.out.println("sleeping......");
	}
	void reproduction() {
		System.out.println("reproduction......");
	}
}
class Mammal extends Animal
{
	void giveBirth() {
		System.out.println("Mammal is giving birth....");
	}
}
class Reptile extends Animal
{
	void layEggs() {
		System.out.println("Reptile is laying eggs....");
	}
}

interface walking
{ 
	void walk();
	}

interface eating
{
	void eat();
	
}
class Human extends Mammal implements walking, eating
{
	void think() {
		System.out.println("Human is thinking.....");
	}
	public void walk()
	{
		
	}
	public void eat()
	{
		
	}
}
class Person extends Human
{
	void active() {
		System.out.println("Person is active......");	
	}
	
	
}
interface studying
{
	void study();
}

interface playing
{
	void play();

}

class Student extends Person implements studying, playing
{
	public void study()
	{
		System.out.println("Student is studying...");
	}
	public void play()
	{
		System.out.println("Student is playing...");
	}
}
class Employee extends Student
{
	void work() {
		System.out.println("Employee is working......");
	}
}
class Executive extends Employee
{
	void execute() {
		System.out.println("Executive is executing......");
	}
}
class Manager extends Executive
{
	void manage() {
		System.out.println("Manager is managing...");
	}
}
class Director extends Manager
{
	void direct() {
		System.out.println("Director is directing...");
	}
}



interface founding
{
	void found();
	}

interface funding
{
	void funds();
}

class Founder extends Director implements founding, funding
{
	public void found() 
	{
		System.out.println("Founded a company.....");
		
		
	}

	public void funds()
	{
		System.out.println("Arranged funds for the company.....");
		
	}
}
