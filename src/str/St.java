package str;

public class St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="testinstring";
		int len=s.length();
		System.out.println(len);
		char[] charArray01=s.toCharArray();
		for(int i=len-1;i>=0;i--) {
			System.out.println(charArray01[i]);
		}
		}

	}


