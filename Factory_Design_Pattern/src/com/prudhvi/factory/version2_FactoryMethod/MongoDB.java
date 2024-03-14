package com.prudhvi.factory.version2_FactoryMethod;

import com.prudhvi.factory.common.MongoDbQuery;
import com.prudhvi.factory.common.Query;

public class MongoDB extends DataBase{
	/*
		Note : Query is the parent class of MangoDbQuery we can return the MongoDbQuery() object
	 */
	@Override
	Query getQuery() {
		return new MongoDbQuery();
	}

}
