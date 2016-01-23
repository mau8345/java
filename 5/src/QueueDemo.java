//creating a queue class
class Queue{
char q[];//this array hold the queue;
int putloc, getloc; //the put and get indices (index)

//The constructor that creates a queue of the given size
Queue (int size){
	q = new char[size]; //allocate the memory for queue
	putloc = getloc = 0;}
//put character into the queue;
//The put method, witch store elements;
void put(char ch){
	if (putloc == q.length) //This method equal to the last place in the array;
	{System.out.print("queue is full"); 
	return;}
q[putloc] = ch;} 
//Get the character from the queue (get method)
char get() {
if (getloc == putloc) {System.out.print ("queue is empty");
	return (char) 0;}
return q[getloc++];} //written in cube braces;
public class QueueDemo {

	public void main(String[] args) { // was problem with ;static
		// TODO Auto-generated method stub
//declarate values and create objects;
Queue BigQ = new Queue(100);
Queue SmallQ = new Queue(4);
char ch;
int i;

System.out.println ("using BigQ to store the alphabet");
//put some numbers into bigQ;
for (i = 0; i < 26; i++) BigQ.put((char) ('a' + i));
//retrieve and display elements from BigQ;

System.out.println("Contents of BigQ ");
for (i = 0; i < 26; i++) {ch = BigQ.get();
if (ch != (char) 0) System.out.println(ch);}

System.out.println("\n");
System.out.println("Using small Q for generating errors");
//now use smallQ for generating errors;
for (i=0; i < 5; i ++){
	System.out.println("Attempting to store " + (char) ('z' - i));
	SmallQ.put((char) ('z' - i));
	System.out.println();
	
}
System.out.println();
//more errors on SmallQ;
System.out.println("Contents of smallQ");
for (i = 0; i< 5; i ++){
	ch = SmallQ.get();
	if (ch != (char)0) System.out.println();}
}
}
	}

