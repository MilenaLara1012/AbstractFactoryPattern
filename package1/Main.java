package package1;

/**
 * 
 */

/**
 * @author Nina Resch, Christian Heck, Milena Seeburger
 *
 */
public class Main {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dschungelgenerator dschungelgenerator = new Dschungelgenerator();
		Liane liane1 = dschungelgenerator.createLiane();
		Liane liane2 = dschungelgenerator.createLiane();
		Tiger tiger = dschungelgenerator.createTiger();
		Moos moos = dschungelgenerator.createMoos();
	
	}

}
