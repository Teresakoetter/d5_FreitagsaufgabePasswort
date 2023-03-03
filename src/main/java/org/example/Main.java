package org.example;

public class Main {

    public static void main(String[] args) {
        answer("12üE5");
        //System.out.println(upperCase("jhh"));


    }
    public static boolean pWLength(String password){
        return password.length() == 5;
    }
    public static boolean pWNumber(String password){
        return
                password.contains("1")
                || password.contains("2")
                || password.contains("3")
                || password.contains("4")
                || password.contains("5")
                || password.contains("6")
                || password.contains("7")
                || password.contains("8")
                || password.contains("9");
    }
    public static boolean upperCase(String password) {
        for(char d : password.toCharArray()){
            if(Character.isLetter(d) && Character.isUpperCase(d)){
                return true;
            }
        }return false;

    }


    public static boolean lowerCase(String password){
        for(char c : password.toCharArray()){
            if(Character.isLetter(c) && Character.isLowerCase(c)) {
                return true;
            }

        }return false;
        }

    public static boolean badPW(String password){
        return password.contains("abcde")
                || password.contains("12345")
                || password.contains("ABCDE");
    }


    public static void answer(String password){
        if(pWLength(password) == true
        && pWNumber(password) == true
        && badPW(password) == false
        && upperCase(password) == true
        && lowerCase(password) == true
        ){
            System.out.println("Your new password is: " + password);
        }else if(badPW(password) == true){
            System.out.println("Your PW is too easy to guess. Choose again.");

        }else{
            System.out.println("Your PW has to contain exact 5 characters in upper and lower case, and at least one number. Choose again.");
        }

    }
}