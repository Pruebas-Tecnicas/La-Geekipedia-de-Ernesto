import Solution.Solution;

/**
 * 
 * @author antonio
 *
 */
public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String e1 = "()";	
		String e2 = "[()]";	
		String e3 = "{[()]}";
		String e4 = "{}()[]";
		String e5 = "[(])";	
		String e6 = "}()";	
		String e7 = "{]";	
		String e8 = "{[([{}])]{[]({})}([[]])}";
		String e9 = "()[{}]";
		String e10 = " (  {  [  ]  }  ) ";
		String e11 = "( )  { }  [ ]";

		System.out.println(s.isValid(e1));
		System.out.println(s.isValid(e2));
		System.out.println(s.isValid(e3));
		System.out.println(s.isValid(e4));
		System.out.println(s.isValid(e5));
		System.out.println(s.isValid(e6));
		System.out.println(s.isValid(e7));
		System.out.println(s.isValid(e8));
		System.out.println(s.isValid(e9));
		System.out.println(s.isValid(e10));
		System.out.println(s.isValid(e11));
	}
}
