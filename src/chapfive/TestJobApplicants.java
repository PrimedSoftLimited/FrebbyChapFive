/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

/**
 *
 * @author Frebby
 */
public class TestJobApplicants {
    public static void main(String[] args){
        
        JobApplicant applicant = new JobApplicant("Michael", "+2348102545821", 
                false, true, true, false);
        
        boolean conditionOne = applicant.hasDatabases() &&
                applicant.hasGraphics() && applicant.hasSpreadSheets() &&
                applicant.hasWordProcess();
        
        boolean conditionTwo = applicant.hasDatabases() &&
                applicant.hasGraphics() && applicant.hasSpreadSheets();
        
        
        boolean conditionThree = applicant.hasDatabases() &&
                applicant.hasSpreadSheets() && applicant.hasWordProcess();
        
        boolean conditionFour = applicant.hasDatabases() &&
                applicant.hasGraphics() && applicant.hasWordProcess();
        
        
            boolean conditionFive = applicant.hasGraphics() &&
                    applicant.hasSpreadSheets() && applicant.hasWordProcess();
        
            if(conditionOne ){
                System.out.println("You are perfect for the Job. interview is "
                        + "9:00 am on monday. Dont be late.");
            }
            else if(conditionTwo || conditionThree ||
                    conditionFour || conditionFive){
                System.out.println("Not bad!! interview is "
                        + "9:00 am on monday. Dont be late.");
            }
            else
                System.out.println("Gerrarahere mehn");
    }
}
