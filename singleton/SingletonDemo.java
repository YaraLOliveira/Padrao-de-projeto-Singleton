
package pattern.creational.singleton;


public class SingletonDemo {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		System.out.println("Instance count:"+SingletonClass.insCount);
		
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println("Instance count:"+SingletonClass.insCount);

	}

}
