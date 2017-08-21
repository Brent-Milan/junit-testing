package makoto.walkthrough;

public class Application implements Subtractor, Adder {

		@Override
		public long add(long... operands) {
			long result = operands[0];
			for(int index = 0; index < operands.length; index++) {
				result += operands[index];
			}
			return result;
		}
		
		@Override
		public long subtract(long...operands) {
			long result = operands[0];
			for(int index =  0; index < operands.length; index++) {
				result -= operands[index];
			}
			return result;
		}

	

}
