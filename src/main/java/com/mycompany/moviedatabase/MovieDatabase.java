/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moviedatabase;
import javax.swing.JOptionPane;
/**
 *
 * @author colin
 */
public class MovieDatabase {

    public static void main(String[] args) {
        String movieTitle = JOptionPane.showInputDialog("Please enter the title of the movie (No more than 20 Characters):");
        if (movieTitle.length() > 20) {
            JOptionPane.showMessageDialog(null, "No more than 20 Characters!");
            System.exit(0);
        }
        
        String movieCode = JOptionPane.showInputDialog("Please Enter the Movie Code (at least 4 characters starting with a capital letter and containing a number):");
        if (isValidMovieCode(movieCode)) {
            JOptionPane.showMessageDialog(null, "Incorrect Formatting!");
            System.exit(0);
        }
        
        if (movieTitle.length() == 20) {
            JOptionPane.showMessageDialog(null, "Movie entered into Database:)");
        }
        
        JOptionPane.showMessageDialog(null, "Movie Code Saved :)");
    }
    
    public static boolean isValidMovieCode(String movieCode) {
        if (movieCode.length() < 4) {
            return false;
        }
        if (Character.isUpperCase(movieCode.charAt(0))) {
            return false;
        }
        if (movieCode.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }

}