public class NumNegativo {
	public static void main (String [] args){
		int pos= 0;
		int neg=0;
		for (int i=-20;i<=20;i++){
			if (i>0){
				pos+=i;
			}else {
				neg+=i;
			}
		}
		System.out.println(pos + " " + neg);
	}
}