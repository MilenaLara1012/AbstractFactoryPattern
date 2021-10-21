/**
 * 
 */
package package3;

/**
 * @author Nina Resch, Christian Heck, Milena Seeburger
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Welttyp wird zentral 1x bestimmt --> kann schnell ersetzt werden, da allgemeingültig
		AbstractGenerator generator = new Savannengenerator();
		
		//Objekte erstellen
		Pflanze pflanze = generator.createPflanze();
		Tier tier = generator.createTier();
		Untergrund untergrund = generator.createUntergrund();
		
	}

}
