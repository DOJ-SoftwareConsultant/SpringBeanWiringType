package com.doj.spring;

public class Car {
	
	Engine engine;
	
	Tyre tyre;
	
	Body body;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Car(Engine engine, Tyre tyre, Body body) {
		super();
		this.engine = engine;
		this.tyre = tyre;
		this.body = body;
	}

	public Car() {
		super();
	}
	
	public void driveCar(){
		System.out.println("You are driving a car which has a engine "+this.engine.engineName
				+" has a tyre "+this.tyre.getTyreName()+" has a body "+this.body.getBodyType());
	}
}
