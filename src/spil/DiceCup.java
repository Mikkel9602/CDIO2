package spil;

public class DiceCup {

	private Dice[] dices = new Dice[2];
	private int sum;


	/**
	 * Default constructor
	 */
	public DiceCup() {
		this(2);
	}


	/**
	 * Secondary constructor
	 * @param diceCount
	 */
	public DiceCup(int diceCount) {
		for(int i = 0; i < diceCount; i++) {
			this.dices[i] = new Dice();
		}
	}


	/**
	 * Gets the array of dices
	 * @return
	 */
	public Dice[] getDices() {	
		return this.dices;
	}

	/**
	 * Rolls all of the dices, which sets them to a random number inbetween 1 and the number of sides it has
	 */
	public void rollDices() {
		for(int i = 0; i < dices.length; i++) {
			dices[i].roll();
		}
	}


	/**
	 * Gets the sum of the dices
	 * @return sum
	 */
	public int getSum() {
		this.sum = 0;
		for(int i = 0; i < dices.length; i++) {
			this.sum += dices[i].getFaceValue();
		}
		return this.sum;
	}


	/**
	 * Sets the sides of the first dice to 'a' and the sides of the second dice to 'b', if the sum of 'a' and 'b' is 12, which returns true if true
	 * @param a
	 * @param b
	 * @return 
	 */
	public boolean setDiceSides(int a, int b) {

		if (a+b == 12) {

			// dices[0].setSides(a);
			// dices[1].setSides(b);

			return true;
		} else
			return false;

	}


}
