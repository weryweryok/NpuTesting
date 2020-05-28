package scenary;

public class User {

     private String email;
     private String passwd;
     private String guestTitle;
     private String authorizedTitle;
     private String authorizedUsername;
     private String phone;


    public User() {
        this.email = "weryweryok@gmail.com";
        this.passwd = "18fiBulhakova";
        this.guestTitle = "Login - My Store";
        this.authorizedTitle = "My account - My Store";
        this.authorizedUsername = "Svetlana Bulgakova";
        this.phone = "+380150250350";
    }

    public String getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getGuestTitle() {
        return guestTitle;
    }

    public String getAuthorizedTitle() {
        return authorizedTitle;
    }

    public String getAuthorizedUsername() {
        return authorizedUsername;
    }

    public String getPhone() {
        return phone;
    }
}
