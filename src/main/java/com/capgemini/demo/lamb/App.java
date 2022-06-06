package com.capgemini.demo.lamb;

// to use someMethod() from someInterface - 
// 3 options 

//// 1. class implements interface 
//public class App implements SomeInterface {
//
//	public static void main(String[] args) {
//		App obj = new App();
//		obj.someMethod();
//	}
//
//	@Override
//	public void someMethod() {
//		System.out.println("someMethod() implemented.");
//	}
//}

////2. use anonymous inner class 
//public class App {
//
//	public static void main(String[] args) {
//
////		SomeInterface obj = new SomeInterface();
//
//		SomeInterface obj = new SomeInterface() {
//			@Override
//			public void someMethod() {
//				System.out.println("someMethod() implemented.");
//			}
//		};
//
//		obj.someMethod();
//	}
//}

//3. use lambda expression / lambda method 
// applicable only with functional interface 

// functional interface - which has ONLY ONE abstract method 

public class App {

	public static void main(String[] args) {

//		SomeInterface obj = new SomeInterface();

		// lambda syntax -
		// InterfaceName objectName = () -> {method body};

		SomeInterface obj = () -> {
			System.out.println("someMethod() implemented.");
		};

		obj.someMethod();
	}
}















