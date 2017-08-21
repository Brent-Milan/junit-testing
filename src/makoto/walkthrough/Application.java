package makoto.walkthrough;

public class Application implements Subtractor, Adder, Multiplier {

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

}
