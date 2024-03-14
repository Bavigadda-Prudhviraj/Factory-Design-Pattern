package com.prudhvi.factory.base_for_factory.base2;

public class Client {

	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		/*This below line we give error because we calling fun method()
		 *In the fun method it is called work method with the help of ref but it is null, null.work() will give compilation error
		 *so we have to create the object of child class and sent the ref 
		 */
		//adapter.fun();  
		
		
		/*
		here we are creating the B object and passing that object as I object as B is implementing we can pass B object at i place
		we are passing bRef as i object to set the I ref in adapter class
		Based on the iRef the work() method will implemented 
		 */
		B bRef = new B();
		adapter.sefRef(bRef);
		adapter.fun();
		System.out.println("-----------------------");
		C cRef = new C();
		adapter.sefRef(cRef);
		adapter.fun();

	}

}
