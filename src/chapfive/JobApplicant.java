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
public class JobApplicant {

    private String name;
    private String phoneNum;
    private boolean wordProcess;
    private boolean spreadSheets;
    private boolean databases;
    private boolean graphics;

    public JobApplicant(String name, String phoneNum, boolean wordProcess, 
            boolean spreadSheets, boolean databases, boolean graphics) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.wordProcess = wordProcess;
        this.spreadSheets = spreadSheets;
        this.databases = databases;
        this.graphics = graphics;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public boolean hasWordProcess() {
        return wordProcess;
    }

    public boolean hasSpreadSheets() {
        return spreadSheets;
    }

    public boolean hasDatabases() {
        return databases;
    }

    public boolean hasGraphics() {
        return graphics;
    }

}
