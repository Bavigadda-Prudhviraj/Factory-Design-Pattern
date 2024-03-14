package com.prudhvi.factory.base_for_factory.base1;

public class Client {

	public static void main(String[] args) {
		A aRefHaveB = new B(); // we are plugging B child object and using A references (Plug)
		A aRefHaveC = new C(); // we are plugging C child object and using A references (Plug)
		/*
		 Note:
		 	1. Here both classes B and C are not implementing fun() method
		 	2, But the parent abstract class A have fun method
		 	3. In A class work is abstract method 
		 	4. As A is abstract class we can't create objects for abstract or interfaces in java
		 	5. we can use as references(socket) to store the child objects( plug )
		 	Dry run
		 	1. First it will search first in the object class 
		 	2. If object call is not implemented that method it will search in parent method
		 	3. if parent we are implementing fun() method in that we are calling the work method
		 	4. The work() method will be implemented based on the object created 
		 */
		aRefHaveB.fun();
		System.out.println("-------");
		aRefHaveC.fun();

	}

}
