package game.rpg;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Cell[][] cells = new Cell[5][5];
		Cell[][] cellsTwo = new Cell[5][5];

		int chestPos = 5;
		int hollywater = 7;
		int acide = 3;

		int counter = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (counter == chestPos) {
					cells[i][j] = new Cell(new Chest());
					cellsTwo[i][j] = new Cell(new Chest());
				} else if (counter == hollywater) {
					cells[i][j] = new Cell(new HolyWater());
					cellsTwo[i][j] = new Cell(new HolyWater());
				} else if (counter == acide) {
					cells[i][j] = new Cell(new Acid());
					cellsTwo[i][j] = new Cell(new Acid());
				} else {
					cells[i][j] = new Cell(new Ground());
					cellsTwo[i][j] = new Cell(new Ground());
				}
				counter++;
			}
		}


	}
	}



