package Bracket_Balancer;

public class BalancedBracketCheckerTest {
	public static void main(String[] args) {
		
		test("{[()]}");
		test("{}");
		test("[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("[]");
		test("[}");
		test("[<>");
		
	}
	

	private static void test(String brackets) {
			
		BalanceBraketChecker checker = new BalanceBraketChecker(brackets);
		Result result = checker.check();
		System.out.println(result);
	}
}




