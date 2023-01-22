package model;

/**
 * Model class for user.
 */
public class User {
    private String username;
    private String password;

    /**
     * @return the username
     */
    public String getUsername(){
        return username;
    }

    /**
     * @param username to set
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword(){
        return password;
    }

    /**
     * @param password to set
     */
    public void setPassword(String password){
        this.password = password;
    }
}
