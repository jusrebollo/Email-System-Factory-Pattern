package edu.bu.met.cs665.EmailMessages;

public class Message{

    public String email_header;
    public String main_text;
    public String email_footer;

    public void setMessage(String email_header, String main_text, String email_footer ) {
        this.email_header = email_header;
        this.main_text = main_text;
        this.email_footer = email_footer;

    }

    public String getMessage() {

        return (email_header +  main_text + email_footer);

    }

}
