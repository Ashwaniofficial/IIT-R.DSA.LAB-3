package BST;

import java.util.LinkedHashSet;
import java.util.Set;

import Internal.Argument;
import Internal.log;
import PairFinder.java.BinarySearchtree;
import PairFinder.java.TreeNode;

public class BstPairFinder {
	private BinarySearchtree tree;
	private boolean found =  false;
	
	public BstPairFinder(BinarySearchtree tree) {
		
		this.tree = tree;
	}
	
	public void findPair(int sum) {
		
		Set<Integer> nodes = new LinkedHashSet()<Integer>();
		
		findPairInternal("R", sum, tree.getRoot(), nodes);
	
		if (!found) {
			System.out.println("For the sum [" + sum + "], Matching nodes NOT found");
		}
	}
	
	private boolean findPairInternal(String indicator, 
			int sum, TreeNode aNode, 
		Set<Integer> nodes) {
		
		if (aNode == null) {
			return false;
		}

		log.log("findPairInternal", "OperationType [Recursion & Stack Push] %s %s", 
			new Argument[] {
				new Argument("Indicator", indicator),
				new Argument("Node", aNode)
		});
		
		found = findPairInternal(
			"L", sum, aNode.getLeftNode(), nodes);
		if (found) {
			return true;
		}

		int difference = sum -  aNode.getData();
		
		if (nodes.contains(difference)) {
			
			found = true;
			System.out.println("For the sum [" + sum + "], Matching nodes -> [" + aNode.getData() + ", " + difference + "]");
			return found;
		}else {

			nodes.add(aNode.getData());											
		}		
		
		log.log("findPairInternal", "OperationType (Recursion & Stack Pop) %s %s %s %s", 
				new Argument[] {
					new Argument("Indicator", indicator),
					new Argument("Node", aNode),
					new Argument("Node-Set", nodes),
					new Argument("Difference", difference)
		});
		
		if (!found) {
			return findPairInternal(
				"R", sum, aNode.getRightNode(), nodes);
		}else {
			return true;
		}
	}

}

