package org.example;

public class Main {
    static String password = "d4u6ah";
    public static void main(String[] args) {
        //System.out.println(pW(password));
        answer(password);

    }
    public static boolean pWLength(String testPasswordLength){
        testPasswordLength = password;
        boolean pWCorrectLength;
        if (password.length() != 5){
            pWCorrectLength = false;
        } else{
            pWCorrectLength = true;
        }return pWCorrectLength;
    }
    public static boolean pWNumber(String testPasswordNumber){
        testPasswordNumber = password;
        boolean pWCorrectNumber;
        if((password.contains("1")
                || password.contains("2")
                || password.contains("3")
                || password.contains("4")
                || password.contains("5")
                || password.contains("6")
                || password.contains("7")
                || password.contains("8")
                || password.contains("9"))){
            pWCorrectNumber = true;}else{
                pWCorrectNumber = false;
            }return pWCorrectNumber;
    }
    public static void answer(String answerPassword){
        answerPassword = password;
        if(pWLength(answerPassword) == true
        && pWNumber(answerPassword) == true){
            System.out.println("Your new password is: " + answerPassword);
        }else{
            System.out.println("Your PW has to contain exact 5 characters and at least one number.");
        }

    }
}