package uk.ac.hw.macs.search;

public class GridState implements State {
	private int x, y; 
	private int goalX, goalY;
	
	// Constructor for coordinates of the current node and the goal node 
	public GridState(int x, int y, int goalX, int goalY) { 
		this.x = x; 
		this.y = y; 
		this.goalX = goalX; 
		this.goalY = goalY; 
	} 
	
	// Compare the current coordinates with the goal coordinates and return true, else false
	public boolean isGoal() { 
			return this.x == this.goalX && this.y == this.goalY;
		}
		
	// The Manhattan distance formula is used to calculate the cost of current and goal nodes, it is returned as heuristic value. 
	public int getHeuristic() {  
		int X = Math.abs(this.x - this.goalX); 
		int Y = Math.abs(this.y - this.goalY); 
		return X + Y; 
	} 
	
	public int getHeuristic(int x, int y, int goalX, int goalY) { 
		int X = Math.abs(x - goalX); 
		int Y = Math.abs(y - goalY); 
		return X + Y; 
	} 
}