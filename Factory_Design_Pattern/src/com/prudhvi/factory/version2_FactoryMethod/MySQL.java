package com.prudhvi.factory.version2_FactoryMethod;

import com.prudhvi.factory.common.MySqlQuery;
import com.prudhvi.factory.common.Query;

public class MySQL extends DataBase {
	/*
	Note : Query is the parent class of MySQL we can return the MySqlQuery() object
	 */
	@Override
	Query getQuery() {
		return new MySqlQuery();
	}

}
