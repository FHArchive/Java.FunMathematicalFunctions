/**
 * @date 04/10/2018
 * @author FredHappyface
 *
 */
public class Math {
	/**
	 * This function approximates the result to a floating point number to the
	 * power of any positive integer. Note that this will not return a correct
	 * value for negative powers
	 * 
	 * Source: My own intuition
	 * 
	 * @param double x
	 * @param integer y
	 * @return integer ans
	 */
	public int Power(double x, int y) {
		double ans = x;
		for (int i = 1; i < y; i++) {
			ans *= x;
		}
		if (y == 0) {
			ans = 1;
		}
		return (int) (ans + 0.5);
	}

	/**
	 * This function provides the precise result to a floating point number to
	 * the power of any positive integer. Note that this will not return a
	 * correct value for negative powers
	 * 
	 * @param double x
	 * @param integer y
	 * @return double ans
	 */
	public double PrecisePower(double x, int y) {
		double ans = x;
		for (int i = 1; i < y; i++) {
			ans *= x;
		}
		if (y == 0) {
			ans = 1;
		}
		return ans;
	}

	/**
	 * This function estimates the square root of an integer s and returns a
	 * result as an integer.
	 * 
	 * Source: https://en.m.wikipedia.org/wiki/Methods_of_computing_square_roots
	 * 
	 * @param integer s
	 * @return integer ans
	 */
	public int SquareRtEstimator(int s) {
		int ans = 0;
		int n = 0;
		while ((s / Power(10, 2 * n)) > 99) {
			n += 1;
		}
		int a = 2 / Power(10, 2 * n);
		if (a < 10) {
			ans = 2 * Power(10, n);
		} else {
			ans = 6 * Power(10, n);
		}
		return ans;
	}

	/**
	 * This function calculates the Babylonian Root of an integer and returns a
	 * floating point value.
	 * 
	 * Source:
	 * https://en.m.wikipedia.org/wiki/Methods_of_computing_square_roots; Heath,
	 * Thomas (1921). A History of Greek Mathematics, Vol. 2. Oxford: Clarendon
	 * Press. pp. 323-324. (via wikipedia)
	 * 
	 * @param integer s
	 * @return double ans
	 */
	public double BabylonianRt(int s) {
		double ans = (double) SquareRtEstimator(s);
		while (Power(ans, 2) != s) {
			ans = 0.5 * (ans + (s / ans));
		}
		return ans;
	}

	/**
	 * This function calculates the result of a logarithm of a double between
	 * the value of 1 and 2
	 * 
	 * Source: https://en.m.wikipedia.org/wiki/Logarithm; Abramowitz & Stengun,
	 * eds. 1972, p. 68 (via wikipedia)
	 * 
	 * @param double s
	 * @return double ans
	 */
	public double Ln(double s) {
		double z = s - 1;
		double ans = 0.;
		if (s >= 1 && s <= 2) {

			for (int i = 1; i < 15; i += 2) {
				ans += (PrecisePower(z, i)) / (double) (i) - (PrecisePower(z, i + 1)) / (double) (i + 1);
			}
		} else {
			ans = -1.;
		}
		return ans;
	}

}
