package org.example;

public class Logowanie {

    private String currentUsername;
    private String currentPassword;
    private String msg;
    private boolean isLoggedIn;

    public void setUserInDatabase(String userName, String password){
        this.currentUsername = userName;
        this.currentPassword = password;
    }

    public boolean logIn(String userName, String password){
        if((userName.equals(currentUsername)) && (password.equals(currentPassword))){
            this.msg = "Udało Ci się zalogować";
            this.isLoggedIn = true;
        }
        this.msg = "Nie udało Ci się zalogować";
        this.isLoggedIn = false;
        return isLoggedIn;
    }

    public String getMsg(){
        return msg;
    }
    public boolean isLoggedIn(){
        return isLoggedIn;
    }

    public String getCurrentUsername(){
        return currentUsername;
    }

    public String getCurrentpassword(){
        return currentPassword;
    }
}
