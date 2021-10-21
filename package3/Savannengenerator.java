/**
 * 
 */
package package3;

/**
 * @author Nina Resch, Christian Heck, Milena Seeburger
 *
 */
public class Savannengenerator implements AbstractGenerator {

	@Override
	public Tier createTier() {
		return new Loewe();
	}

	@Override
	public Pflanze createPflanze() {
		return new Kaktus();
	}

	@Override
	public Untergrund createUntergrund() {
		return new Sand();
	}

}
