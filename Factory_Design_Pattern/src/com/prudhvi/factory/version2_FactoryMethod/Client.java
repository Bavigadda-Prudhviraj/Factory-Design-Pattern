package com.prudhvi.factory.version2_FactoryMethod;

public class Client {

	public static void main(String[] args) {
		/*
		1. Database is a abstract class( socket ) different types of DB are extending the dataBase class
		2. so we can use parent reference for child objects
		3. In DataBase there is getQuery Method is there that is called as "Factory Method"
		4. Go to the DataBase class to get better understanding.
		 */
		DataBase mongoDb = new MongoDB();
		mongoDb.executeQuery();
		System.out.println("---------------------------");
		DataBase mySQLDb = new MySQL();
		mySQLDb.executeQuery();
		System.out.println("---------------------------");
		DataBase postgreDb = new Postgres();
		postgreDb.executeQuery();
		System.out.println("---------------------------");

	}

}
