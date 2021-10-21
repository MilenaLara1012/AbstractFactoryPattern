/**
 * 
 */
package package3;

/**
 * @author Nina Resch, Christian Heck, Milena Seeburger
 *
 */
public class Tundragenerator implements AbstractGenerator {

	@Override
	public Tier createTier() {
		return new Wolf();
	}

	@Override
	public Pflanze createPflanze() {
		return new Farn();
	}

	@Override
	public Untergrund createUntergrund() {
		return new Stein();
	}

}
