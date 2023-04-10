package str;

public class Buf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("testingone");
		
		System.out.println(sb);
		
System.out.println(sb.capacity());
sb.append(" selenium");
System.out.println(sb);

System.out.println(sb);
sb.insert(19,"is a automation tool");

System.out.println(sb);
sb.replace(22,26,"auto");
System.out.println(sb);	

System.out.println(sb.reverse());
System.out.println(sb.capacity());
}

}
