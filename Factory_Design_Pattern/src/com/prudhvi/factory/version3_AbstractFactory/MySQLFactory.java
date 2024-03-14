package com.prudhvi.factory.version3_AbstractFactory;

import com.prudhvi.factory.common.MySqlQuery;
import com.prudhvi.factory.common.Query;

public class MySQLFactory implements Factory{

	@Override
	public Query getFactory() {
		return new MySqlQuery();
	}

}
