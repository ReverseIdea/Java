public class NumPrim {
	public static void main (String [] args) {
		int num=13;
		boolean primo=false;
			for (int i=2; i<=-1; i++){
				if (num%i==0){
					primo=false;
					break;
				}else{
					primo=true;
				}
				
			}
			if (primo){
				System.out.println ( " il numero " + num + " e' primo ");
			} else {
				System.out.println ( " il numero " + num + " non e' primo ");
			}
	}
}