 class StaticDemo {
	static int var;
	public static void main(String[]args) {

		StaticDemo.dosomething();
		StaticDemo.var=742;
	}
	static void dosomething(){
		System.out.println("inside do something()......");
		StaticDemo.func();
	}
	static void func() {
		System.out.println("inside do something()......");
	}
}
