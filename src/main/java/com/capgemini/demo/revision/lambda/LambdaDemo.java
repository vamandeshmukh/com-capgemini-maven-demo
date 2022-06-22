package com.capgemini.demo.revision.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		Lamb obj = () -> {
			System.out.println("funMethod() implemented...");
		};

		obj.funMethod();

	}

}

//package com.capgemini.demo.revision.lambda;
//
//public class LambdaDemo implements Lamb {
//
//	public static void main(String[] args) {
//
//		LambdaDemo obj = new LambdaDemo();
//		obj.funMethod();
//
//	}
//
//	@Override
//	public void funMethod() {
//		System.out.println("funMethod() implemented...");
//	}
//
//}
