package com.loop;

public class FindInMatrix {
	
	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } }; 
		//2,1*
		//2,0*
		//1,1*

		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;

		LABEL1:for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break LABEL1;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");

		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");

		}

	}
}