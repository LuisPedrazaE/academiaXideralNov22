package com.loop;

public class FindInMatrix3 {
	
	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 2, 5 }, { 2, 2 } }; 

		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		 
		ETIQUETA :for (int i = 0; i < list.length; i++) {
			 for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("i: "+i);
					System.out.println("j: "+j);
					continue ETIQUETA;
				}
			}
		}
		System.out.println("************");
		for (int i = 0; i < list.length; i++) {
			 for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("i: "+i);
					System.out.println("j: "+j);
					break;
				}
			}
		}

	}
}