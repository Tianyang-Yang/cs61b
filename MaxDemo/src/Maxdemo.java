
public class Maxdemo {
	/** a demo to find the maximum of a string  */
	public static int max(int[] m) {
		int temp=0;
		
		for(int i = 0; i < m.length; i+=1) {
			if(temp < m[i]) {
				temp = m[i];
			}
		}
		return(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));

	}

}

