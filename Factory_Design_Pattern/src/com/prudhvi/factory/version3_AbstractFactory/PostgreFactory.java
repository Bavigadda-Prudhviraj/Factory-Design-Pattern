package com.prudhvi.factory.version3_AbstractFactory;

import com.prudhvi.factory.common.PostgresQuery;
import com.prudhvi.factory.common.Query;

public class PostgreFactory implements Factory{

	@Override
	public Query getFactory() {
		return new PostgresQuery();
	}

}
