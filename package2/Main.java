/**
 * 
 */
package package2;

/**
 * @author Nina Resch, Christian Heck, Milena Seeburger
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Flags, die bestimmen, welchen Welttypen Client bauen soll
		boolean dschungel = true;
		boolean tundra = false;
		boolean savanne = false;
		
		if (dschungel) {
			
			Dschungelgenerator dschungelgenerator = new Dschungelgenerator();
			Liane liane1 = dschungelgenerator.createLiane();
			Liane liane2 = dschungelgenerator.createLiane();
			Tiger tiger = dschungelgenerator.createTiger();
			Moos moos = dschungelgenerator.createMoos();
		
		} else if (tundra) {
			
			Tundragenerator tundragenerator = new Tundragenerator();
			Farn farn1 = tundragenerator.createFarn();
			Farn farn2 = tundragenerator.createFarn();
			Wolf wolf = tundragenerator.createWolf();
			Stein stein = tundragenerator.createStein();
			
		} else if (savanne) {
			
			Savannengenerator savannengenerator = new Savannengenerator();
			Kaktus kaktus1 = savannengenerator.createKaktus();
			Kaktus kaktus2 = savannengenerator.createKaktus();
			Loewe loewe = savannengenerator.createLoewe();
			Sand sand = savannengenerator.createSand();
			
		}
		
	}

}
