/**
 * @author Xi Lin
 */

package hw2.model;

public class Student {
	private int sID;
	private int[] scores = new int[5];
	
	public int getSID() {
		return sID;
	}
	
	public void setSID(int sID) {
		this.sID = sID;
	}
	
	public int[] getScores() {
		return scores;
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public void printSID() {
		System.out.printf("%d", sID);
	}
	
	public void printScores() {
		for (int i = 0; i < 5; ++i)
			System.out.printf("%d\t", scores[i]);
		System.out.println();
	}
}
