package SettingPriorityInThreads;
//setting the priority to the thread we can set minpriority,maxpriority,normalPriority,and even we can use numbers also to set the priority but it is not a guyarantee
public class A extends Thread {
	String name;
	
	public A(String name) {
		super();
		this.name = name;
	}
	public static void main(String[] args) {
		A a1= new A("krishna");
		A a2= new A("keshav");
		A a3= new A("Basavaraddi");
		a1.start();
		a2.start();
		a3.start();
		
//		a1.setPriority(MAX_PRIORITY);
//		a2.setPriority(MIN_PRIORITY);
//		a3.setPriority(NORM_PRIORITY);
		a1.setPriority(1);
		a2.setPriority(5);
		a3.setPriority(10);
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		System.out.println(a3.getPriority());
	}
	
	public void run() {
		
	}

	
}
