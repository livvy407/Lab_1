public class LinkedListTest{
	public static void main(String[] args){
		LinkedList obj1 = new LinkedList(); // to create object of the class.

		obj1.addFirst(1);//method calling
		obj1.addLast(2);
		obj1.addLast(3);

		//assert is to check wether out code is right or not.
		assert(obj1.isEmpty() == false);
		assert(obj1.size() == 3);
		assert(obj1.first() == 1);
		assert(obj1.last() == 3);
		assert(obj1.removeFirst() == 1);
		assert(obj1.size() == 2);
		assert(obj1.first() == 2);

		System.out.println("All Test Cases Has Been Passed");
	}
}