package package3;

/**
 * 
 */

/**
 * @author Nina Resch, Christian Heck, Milena Seeburger
 *
 */
public class Dschungelgenerator implements AbstractGenerator {

	@Override
	public Tier createTier() {
		return new Tiger();
	}

	@Override
	public Pflanze createPflanze() {
		return new Liane();
	}

	@Override
	public Untergrund createUntergrund() {
		return new Moos();
	}

}
