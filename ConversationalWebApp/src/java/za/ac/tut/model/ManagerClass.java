/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author hacker2
 */
public class ManagerClass implements ManagerInterface{

    @Override
    public String title(String gender) {
        String t = "Mr";
        if(gender.equalsIgnoreCase("f")){
            t = "Miss";
        }
        return t;
    }

    @Override
    public String cm(String t) {
        String c = "Thats a powerful team.";
        if(t.equalsIgnoreCase("o")){
            c = "Shame, you will always be crying.";
        }
        return c;
    }
    
}
