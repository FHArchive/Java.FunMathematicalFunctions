/**
 * @date 04/10/2018
 * @author FredHappyface
 *
 */
public class Main {
	public static void main(String[] args) {
		// Create an instance of Math, this would have been better left static
		// with hind sight
		Math Test = new Math();
		// Calculate basic power of 2 to the power of 2
		final int[] POWER = new int[] { 2, 2 };
		System.out.println(POWER[0] + " raised to the power of " + POWER[1] + " is " + Test.Power(POWER[0], POWER[1]));
		// Estimate the square root of 100
		final int ESTIMATED_ROOT = 100;
		System.out.println("The Estimated Root of " + ESTIMATED_ROOT + " is " + Test.SquareRtEstimator(ESTIMATED_ROOT));
		// Calculate the babylonian root of 1
		final int BABYLONIAN_ROOT = 1;
		System.out.println("The Babylonian Root of " + BABYLONIAN_ROOT + " is " + Test.BabylonianRt(BABYLONIAN_ROOT));
		// Calculate the natural logarithm of 2
		final int NAT_LOG = 2;
		System.out.println("The Natural Log of " + NAT_LOG + " is " + Test.Ln(NAT_LOG));
	}

}
