package com.prudhvi.factory.version3_AbstractFactory;

import com.prudhvi.factory.common.MongoDbQuery;
import com.prudhvi.factory.common.Query;

public class MongoDbFactory implements Factory{

	@Override
	public Query getFactory() {
		return new MongoDbQuery();
	}

}
