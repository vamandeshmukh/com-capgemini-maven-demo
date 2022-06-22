package com.capgemini.demo.revision.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		double billAmount = 1500;
		double gstPct = 18;

		Calc calc = (amount, gst) -> {
			return amount + (amount * gst * 0.01);
		};

//		Calc calc = (amount, gst) -> amount + (amount * gst * 0.01);

		double paymentAmount = calc.calcGst(billAmount, gstPct);

		System.out.println(billAmount);
		System.out.println(gstPct);
		System.out.println(paymentAmount);

	}

}

//public class LambdaDemo {
//
//	public static void main(String[] args) {
//
////		Lamb obj = () -> {
////			System.out.println("funMethod() implemented...");
////		};
//
//		Lamb obj = () -> System.out.println("funMethod() implemented...");
//
//		obj.funMethod();
//
//	}
//
//}

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
