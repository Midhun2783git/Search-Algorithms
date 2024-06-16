package uk.ac.hw.macs.search.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import uk.ac.hw.macs.search.ChildWithCost;
import uk.ac.hw.macs.search.FringeNode;
import uk.ac.hw.macs.search.SearchOrder;

public class AStarSearchOrder implements SearchOrder {

    public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) {
       for(ChildWithCost x : children) {
    	   frontier.add(new FringeNode(x.node, parent, x.cost));
       }
       frontier.sort(new FringeComparator());
    }
    private class FringeComparator implements Comparator{
    
		@Override
		public int compare(Object fo, Object so) {
			
			return ((FringeNode)fo).getFValue() - ((FringeNode)so).getFValue();
		}

	
    	
    }
}