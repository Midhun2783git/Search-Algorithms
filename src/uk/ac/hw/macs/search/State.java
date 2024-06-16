package uk.ac.hw.macs.search;


public interface State {
	public boolean isGoal();
	public int getHeuristic();
}
