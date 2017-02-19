package by.epam.tr.mod4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
	public static void main(String[] args){
		List<Abiturient> abiturList = new ArrayList<Abiturient>();
		int l = 4; //Number of Students
		double bestMark;
		Abiturient bestAb = null;
		int[][] marks = {
				{9,9,9,9,10},
				{2,9,3,9,5},
				{9,9,5,5,6},
				{10,10,10,10,2},
				{9,8,9,7,10},
				};
		
		abiturList.add(new Abiturient("Ivanov","Ivan",marks[0]));
		abiturList.add(new Abiturient("Sidorov","Petya",marks[1]));
		abiturList.add(new Abiturient("Vasiliev","Petya",marks[2]));
		abiturList.add(new Abiturient("Watson","John",marks[3]));
		abiturList.add(new Abiturient("Holms","Sherlock",marks[4]));
		
		if (l < abiturList.size()) {
			for (int i = 0; i < l; i++){
				bestMark = 0;
				for(Abiturient ab : abiturList){
					if (bestMark < ab.getGPA()){
						bestMark = ab.getGPA();
						bestAb = ab;
					}
				}
				System.out.println((i + 1) + ". " + bestAb.getFirstName()
						+ " " + bestAb.getLastName());
				
				abiturList.remove(bestAb);
			}
		} else {
			System.out.println("All abiturients passed exams");
		}		
		
	}
}
