import java.util.*;
public class Main {
//數字加密
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str;
	int a,b,c,d;
	str=in.nextLine();

	a=(str.charAt(0)-'0'+7)%10; //因為是字元 所以-'0'('0'=48)
	b=(str.charAt(1)-'0'+7)%10;
	c=(str.charAt(2)-'0'+7)%10;
	d=(str.charAt(3)-'0'+7)%10;
	
	//System.out.println(Integer.toString(c)+Integer.toString(d)+Integer.toString(a)+Integer.toString(b)) 字串式寫法
	    
	System.out.printf("%d%d%d%d",c,d,a,b);
    }
}
