package lab3task2scd;
class OtherCharachterException extends Exception{
public String a;
public OtherCharachterException(String ii) {
	a=ii;
	CheckString(a);
}
public void CheckString(String s) {
	for(int i = 0; i<s.length(); i++)
	{
	if((s.charAt(i) >= 65 && s.charAt(i) <= 90)
            || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
	{
		Systemi.out.println("correct on index " + i);
	}
	
else {
	try {
		throw this;
	}catch(OtherCharachterException e)
	{
		System.out.println("Error occured on index " + i);
		System.out.println(e);
	}
	
	break;
}
	}
}
@Override
public String toString() {
return "Some error occurred";
} }
public class Task2 {
public static void main(String[] args) {

System.out.println(" soo ");
OtherCharachterException e = new OtherCharachterException("M0124A");

}
}