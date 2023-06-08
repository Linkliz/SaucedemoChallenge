package co.com.SaucedemoChallenge.models;

public class UserData {
    private String username;
    private String password;
    private String name;
    private String lastName;
    private String codePostal;
    private String messageFinal;
    private String messageError;
    private String messageErrorForm;

    public UserData(String username, String password, String name, String lastName, String codePostal, String messageFinal, String messageError, String messageErrorForm) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.codePostal = codePostal;
        this.messageFinal = messageFinal;
        this.messageError = messageError;
        this.messageErrorForm = messageErrorForm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getMessageFinal() {
        return messageFinal;
    }

    public void setMessageFinal(String messageFinal) {
        this.messageFinal = messageFinal;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public String getMessageErrorForm() {
        return messageErrorForm;
    }

    public void setMessageErrorForm(String messageErrorForm) {
        this.messageErrorForm = messageErrorForm;
    }
}
