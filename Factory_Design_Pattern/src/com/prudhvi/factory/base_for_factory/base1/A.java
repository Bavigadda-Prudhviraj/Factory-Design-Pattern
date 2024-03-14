package com.prudhvi.factory.base_for_factory.base1;

abstract class  A {
	public abstract void work();
	public void fun() {
		System.out.println("pre work");
		work();
		System.out.println("post work");
	}

}
