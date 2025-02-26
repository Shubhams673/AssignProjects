package com.assignment.projects;

public class Assignment2 {

	
/**
 * Problem: Multi-Dimensional Array Practice
	1. Create a 3D array to represent the following data:
		o Semesters as the first dimension.
		o Subjects and Marks as the second dimension.
		o Actual values for Subject Names and Marks as the third dimension.
	2. From the array:
		o Print Semester 3 - Subject 4 and Subject 5 Names.
		o Print Semester 5 - Subject 3 and Subject 6 marks
			
	Semester 	Subject1 				Subject2 			Subject3 			Subject4 				Subject5 				Subject6
	Sem 1 		Mathematics-I 			Physics 			Chemistry 			Computer Programming	Engineering Drawing		Basic Electrical Eng.
	Marks 		78 						85 					91 					74 						88						79
	
	Semester 	Subject1 				Subject2 			Subject3 			Subject4 				Subject5 				Subject6
	Sem 2 		Mathematics-II 			Mechanics 			Environmental Sci. 	Basic Electronics Engg. Physics 				Engineering Graphics
	Marks 		82 						77 					93 					69 						84 						90
	
	Semester 	Subject1 				Subject2 			Subject3 			Subject4 				Subject5 				Subject6
	Sem 3 		DataStructuresDiscrete 	Mathematics			Digital				ElectronicsOptngSystems Signals and Systems 	Object-Oriented Prog.
	Marks 		88 						81 					76 					92 						85 						78
		
	Semester 	Subject1 				Subject2 			Subject3 			Subject4 				Subject5 				Subject6
	Sem 4 		Algorithms Computer		Networks			Database			SystemsMicroprocessors 	Communication Eng. 		Software Engineering
	Marks 		91 						73 					89 					80 						76 						87
		
	Semester 	Subject1 				Subject2 			Subject3 			Subject4 				Subject5 				Subject6
	Sem 5 		Probability & Stats. 	Machine Learning 	Compiler Design 	Theory of Computation 	Embedded Systems 		Computer Graphics
	Marks 		86 						88 					84 					95 						73 						90
		
	 * @param args
	 */
	public static void main(String[] args) {

		String [][][] gradStats = { 
									{ 
										{"Semester", "Sem1", "Marks"}, 
										{"Subject1", "Mathematics-I", "78"}, 
										{"Subject2", "Physics", "85"}, 
										{"Subject3", "Chemistry", "91"}, 
										{"Subject4", "Computer Programming", "74"}, 
										{"Subject5", "Engineering Drawing", "88"}, 
										{"Subject6", "Basic Electrical Eng.", "79"}
										
									},
									{ 
										{"Semester", "Sem2", "Marks"}, 
										{"Subject1", "Mathematics-II", "82"}, 
										{"Subject2", "Mechanics", "77"}, 
										{"Subject3", "Environmental Sci.", "93"}, 
										{"Subject4", "Basic Electronics Engg.", "69"}, 
										{"Subject5", "Physics", "84"}, 
										{"Subject6", "Engineering Graphics", "90"}
										
									},
									{ 
										{"Semester", "Sem2", "Marks"}, 
										{"Subject1", "DataStructuresDiscrete", "88"}, 
										{"Subject2", "Mathematics", "81"}, 
										{"Subject3", "Digital", "76"}, 
										{"Subject4", "Signals and Systems", "85"}, 
										{"Subject5", "Physics", "84"}, 
										{"Subject6", "Object-Oriented Prog.", "78"}
										
									},
									{ 
										{"Semester", "Sem2", "Marks"}, 
										{"Subject1", "Algorithms Computer", "91"}, 
										{"Subject2", "Networks", "73"}, 
										{"Subject3", "Database", "89"}, 
										{"Subject4", "SystemsMicroprocessors", "80"}, 
										{"Subject5", "Communication Eng.", "86"}, 
										{"Subject6", "Software Engineering", "87"}
										
									},
									{ 
										{"Semester", "Sem2", "Marks"}, 
										{"Subject1", "Probability & Stats.", "86"}, 
										{"Subject2", "Machine Learning", "88"}, 
										{"Subject3", "Compiler Design", "84"}, 
										{"Subject4", "Theory of Computation", "95"}, 
										{"Subject5", "Embedded Systems", "73"}, 
										{"Subject6", "Computer Graphics", "90"}
										
									}
									
								  };
		
		
		//o Print Semester 3 - Subject 4 and Subject 5 Names.
		System.out.println("Semester4 - Subject : " + gradStats[2][4][1] + " & Semester5 - Subject : " +gradStats[2][5][1]);
		
		//o Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println("Semester3 - Marks : " + gradStats[4][3][2] + " & Semester6 - Marks : " +gradStats[4][6][2]);		
	}

}
