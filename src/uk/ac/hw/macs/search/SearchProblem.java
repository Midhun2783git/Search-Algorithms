package uk.ac.hw.macs.search;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Search problem, defined by a search algorithm on grids.
 */
public class SearchProblem {
	
	private SearchOrder searchOrder;
	
	public SearchProblem(SearchOrder searchOrder) {
		this.searchOrder = searchOrder;
	}

	/**
	 * @param root node is the start node 
	 * @return true when reached goal node, else false. 
	 */
	public boolean doSearch(Node root) {
		List<FringeNode> fringe = new LinkedList();
		fringe.add(new FringeNode(root, null, 0));
		Set<Node> visitedStates = new HashSet();	
		FringeNode goalNode = null;
		
		while (true) {
			if (fringe.isEmpty()) {
				break;
			}
			
			// Removes first node from the list
			FringeNode searchNode = fringe.remove(0);
			System.out.println("Current node: " + searchNode);
			
			// If current node is a visited node continue
			if (visitedStates.contains(searchNode.node)) {
				continue;
			}
			
			// Terminate when goal node is current node
			if (searchNode.node.isGoal()) {
				goalNode = searchNode;
				break;
			}
			
			// If current node is not the required goal search until goal reached
			searchOrder.addToFringe(fringe, searchNode, searchNode.node.getChildren());
			visitedStates.add(searchNode.node);
		}
		
		if (goalNode == null) {
			System.out.println("No goal found");
			return false;
		} else {
			System.out.println("Goal node: " + goalNode.node);
			System.out.println("Cost: " + goalNode.gValue);
			System.out.println("Nodes expanded: " + visitedStates.size());
			System.out.println("Path to root:");
			FringeNode fnode = goalNode;
			while (fnode != null) {
				System.out.println("- node: " + fnode.node.getValue());
				fnode = fnode.parent;
			}
			return true;
		}

	}

}
