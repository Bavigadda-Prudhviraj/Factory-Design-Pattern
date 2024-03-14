package com.prudhvi.factory.version3_AbstractFactory;


public class Client {

	public static void main(String[] args) {
		Factory factory = new MySQLFactory();
		DataBase dataBase = new MySQL();;
		dataBase.setFactory(factory);
		dataBase.executeQuery();
		

	}

}
