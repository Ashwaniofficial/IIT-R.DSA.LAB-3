package PairFinder.java;

import Internal.log;

public class BinarySearchTree_test {

	public static void main(String[] args) {
		
		constructTreeWithLog1();
//		constructTestWithoutLog2();
		
	}
	
	static void constructTreeWithLog1(){

		log.ENABLE = true;

		BinarySearchtree sampleTree1 = 
				TestData_utils.sampleBST1();		

		log.ENABLE = false;		
	}

	static void constructTestWithoutLog2(){

		log.ENABLE = false;

		BinarySearchtree sampleTree1 = 
				TestData_utils.sampleBST1();		
	}
	
}


