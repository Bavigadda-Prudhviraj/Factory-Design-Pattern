package com.prudhvi.factory.version2_FactoryMethod;

import com.prudhvi.factory.common.PostgresQuery;
import com.prudhvi.factory.common.Query;

public class Postgres extends DataBase{
	/*
	 Note : Query is the parent class of Postgres we can return the PostgresQuery() object
	 */
	@Override
	Query getQuery() {
		return new PostgresQuery();
	}

}
