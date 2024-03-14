package com.prudhvi.factory.version3_AbstractFactory;

import com.prudhvi.factory.common.Query;
public abstract class DataBase {
	private Factory factory= null;
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	public void executeQuery() {
		Query query = factory.getFactory();
		query.execute();
	}

}
