package com.knight.ai.node;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
	
	public HashMap<Node, Action> actions;
	public HashMap<Node, Reaction> reactions;
	
	private ArrayList<Double> details;
	
	public Node() {
		actions = new HashMap<Node, Action>();
		reactions = new HashMap<Node, Reaction>();
		details = new ArrayList<Double>();
	}
	
	public ArrayList<Double> getDetails() {
		return details;
	}

	public void setDetails(ArrayList<Double> details) {
		this.details = details;
	}
	
	public void change(Node newNode) {
		reactions.get(newNode).perform();
	}
	
	public void attempt(Node targNode) {
		actions.get(targNode).perform();
	}

}
