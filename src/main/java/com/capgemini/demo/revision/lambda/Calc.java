package com.capgemini.demo.revision.lambda;

@FunctionalInterface
public interface Calc {

	public abstract double calcGst
	(double amount, double pct);

}
