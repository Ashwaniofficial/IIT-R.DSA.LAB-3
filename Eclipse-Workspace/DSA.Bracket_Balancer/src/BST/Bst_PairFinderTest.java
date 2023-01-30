package BST;

import Internal.log;
import PairFinder.java.BinarySearchtree;
import PairFinder.java.TestData_utils;

public class Bst_PairFinderTest {
	public static void main(String[] args) {
		
		test(120);
//		test(60);
//		test(190);
//		test(500); //invalid data
	}

	private static void test(int sum) {
		
//		Log.ENABLE = true;
		
		
		BinarySearchtree tree = 
			TestData_utils.sampleBST1();

		log.ENABLE = true;

		BstPairFinder finder 
			= new BstPairFinder(tree);
		
		finder.findPair(sum);
		
		System.out.println("-----------------------");

		log.ENABLE = false;

	}
}
