package makoto.walkthrough;

public class Application implements Subtractor, Adder, Multiplier, Divider, Modulizer {

		@Override
		public long add(long... operands) {
			long result = operands[0];
			for(int index = 1; index < operands.length; index++) {
				result += operands[index];
			}
			return result;
		}
		
		@Override
		public long subtract(long... operands) {
			long result = operands[0];
			for(int index =  1; index < operands.length; index++) {
				result -= operands[index];
			}
			return result;
		}

		@Override 
		public long multiply(long... operands) {
			long result = operands[0];
			for(int index = 1; index < operands.length; index++) {
				result *= operands[index];
			}
			return result;
		}

		@Override
		public long divide(long... operands) {
			long result = operands[0];
			for(int index = 1; index < operands.length; index++) {
				result /= operands[index];
			}
			return result;
		}
		
		@Override
		public long modulus(long... operands) {
			long result = operands[0];
			for(int index = 1; index < operands.length; index++ ) {
				result %= operands[index];
			}
			return result;
		}
}
