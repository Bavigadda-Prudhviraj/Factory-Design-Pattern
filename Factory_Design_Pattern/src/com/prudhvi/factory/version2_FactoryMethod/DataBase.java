package com.prudhvi.factory.version2_FactoryMethod;

import com.prudhvi.factory.common.Query;

public abstract class DataBase {
	/*
	this is Factory Method
	Allows us to create objects without specifying the exact class that will be instantiated. 
	Instead of creating objects directly, we use a factory method to create and return them.
	 */
	abstract Query getQuery();
	
	//this is the method we are calling from the client
	public void executeQuery() {
		/*here we will get the query of appropriate database object based on the child object used in the creation of the object
			1. Here Query is an Interface, which has getQuery method return type is Query.
			2. different dataBases are implementing the DataBase
			3. as there are implementing DataBase, Database became parent and implementing DataBases classes became child
			4. so that they can return can be that class object only because we are storing dbQuery object in the Query reference
		*/
		Query query = getQuery();
		//After storing appropriate DbQyery we will execute the Query();
		query.execute();
	}

}
