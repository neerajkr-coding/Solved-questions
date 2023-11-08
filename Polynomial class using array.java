public class polynomialClassProb {

	static public class Polynomial{
		int[] expression = new int[100];
		
		public void setCoefficient(int degree, int coeff){
			
			this.expression[degree]=coeff;
		
		}
		
		public void print(){
			
			for(int i=0;i<this.expression.length;i++) {
				if(this.expression[i]!=0) {
					System.out.print(this.expression[i]+"x"+i+" ");
				}
			}
			System.out.println();
		}

		// Adds two polynomials and returns a new polynomial which has result
		public Polynomial add(Polynomial p){
			
			Polynomial result = new Polynomial();
			
			for(int i =0;i<this.expression.length;i++) {
				result.expression[i]=this.expression[i]+p.expression[i];
			}
			
			return result;	
		}
		
		// Subtracts two polynomials and returns a new polynomial which has result
		public Polynomial subtract(Polynomial p){
			
			Polynomial result = new Polynomial();
			
			for(int i =0;i<this.expression.length;i++) {
				result.expression[i]=this.expression[i]-p.expression[i];
			}
			
			return result;	
				
		}
		
		// Multiply two polynomials and returns a new polynomial which has result
		public Polynomial multiply(Polynomial p){
			
			Polynomial result = new Polynomial();
			
			for(int i = 0;i<this.expression.length;i++) {
				
				if(this.expression[i]!=0) {
				for(int j = 0;j<p.expression.length;j++) {
					
					if(p.expression[j]!=0) {
					result.expression[i+j] =result.expression[i+j] +( p.expression[j]*this.expression[i]);
						}
					
					}
				}
			}
			
			result.print();
			return result;
			
		}
	}
	
	public static void main(String args[]) {
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		
		p1.setCoefficient(1, 10);
		p1.setCoefficient(4, -12);
		p1.setCoefficient(0, 9);
		
		p2.setCoefficient(1, 10);
		p2.setCoefficient(4, -12);
		p2.setCoefficient(0, 3);
		
		
		p1.print();
		p2.print();
		
		p1.multiply(p2);
	}
}
