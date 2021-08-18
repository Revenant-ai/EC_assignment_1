# EC_assignment_1

So this is the EC assignment 1, I have done this in seprate files and I will be describing what each file does,
also I didn't take any static values I stored the data in the phone's memopry using shared prefrences where the
data is sotred in key-value pairs in the form of objects, so evreything is dynamic without using any database.

FILES:-
All the presentation_layer files are here, these are called activitiy files in Androud.

Presentation Layer Files(Src/main/java/lab/assignment_1):-

->MainActivity.java
		This file contains the front end for the voting screen
		
->Poll_result.java
		This file contains the front end for the poll result
		
->add_candidate.java(NO functionality just a front end file )
		This file contains the front end for the addition of candidate
		
->dashboard.java
		This file contains the front end for the dashboard
		
->poll_report.java
		This file contains the front end for the poll rreport
		
		Application Layer Files(Src/main/java/lab/assignment_1)/controllers:-
		
		->result_controller.java
		
				This file is the controller for the business logic for the screens of poll result and poll report.
				It contains two functions process report and process result which are responsible for rhe busniness logic for the coroesponding files respectively.
				
		->voting_controller.java
		
				This file is controller for the busniess logic for the screen Main activity which registers a vote and proceess if you have voted previously or not
				It contains one function whcih processes the data and throws desired outcome to the front screen to display
				
				so the function reutrns string which is the messege to the user which i am genrating through the presentation layer via TOAST on the screen.
				
				
				
DataAccess Layer Files(Src/main/java/lab/assignment_1/):-
