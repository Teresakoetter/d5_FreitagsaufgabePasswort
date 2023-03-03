package org.example;

public class Main {
    static String password = "d4u6ah";
    public static void main(String[] args) {
        //System.out.println(pW(password));
        answer(password);

    }
    public static boolean pW(String testPassword){
        testPassword = password;
        boolean pWCorrect;
        if (password.length() != 5){
            pWCorrect = false;
        } else if(password.contains("1")
                || password.contains("2")
                || password.contains("3")
                || password.contains("4")
                || password.contains("5")
                || password.contains("6")
                || password.contains("7")
                || password.contains("8")
                || password.contains("9")){
            pWCorrect = true;
        }else{

            pWCorrect = true;
        }return pWCorrect;
    }
    public static void answer(String answerPassword){
        answerPassword = password;
        if(pW(answerPassword) == true){
            System.out.println("Your new password is: " + answerPassword);
        }else{
            System.out.println("Your PW has to contain exact 5 characters and at least one number.");
        }

    }
}