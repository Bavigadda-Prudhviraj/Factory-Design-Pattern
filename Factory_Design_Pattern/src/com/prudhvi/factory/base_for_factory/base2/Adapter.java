package com.prudhvi.factory.base_for_factory.base2;

public class Adapter {
	private I ref = null;
	public void sefRef(I ref) {
		this.ref = ref;
	}
	void fun() {
		System.out.println("Pre - work");
		ref.work();
		System.out.println("Post - work");
	}

}
