
package pattern.creational.singleton;


public class SingletonClass {

	private static SingletonClass instance;
	public static int insCount = 0;

	private SingletonClass (){insCount++;}

	public static SingletonClass getInstance(){
		if(instance==null){
			instance = new SingletonClass();
		}
		return instance;
	}
}
