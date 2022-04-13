package edu.bu.met.cs665.EmailMessages;

// Class for New Customers
public class NewCustomerEmail implements DeliverMessage {

    String email_header = "Welcome New Client! ";
    String main_text = "Thank you for becoming a new client of our company. We appreciate you " +
            "beginning a relationship with our company which will last for years to come. " ;
    String email_footer = "Sincerely, " +
            " Your new supplier!";
    public Message CurrentMessage;

    // implement send message
    @Override
    public String sendMessage() {
        CurrentMessage = new Message();
        CurrentMessage.setMessage(email_header,main_text, email_footer);
        return CurrentMessage.getMessage();

    }

    // implement spell check
    @Override
    public String SpellCheck() {

        String check = "Welcome New Client! Thank you for becoming a new client of our company. We appreciate you beginning a relationship with our company which will last for years to come. Sincerely,  Your new supplier!";

        if (!(email_header + main_text + email_footer).equals(check)) {

            return "Incorrect spelling!";

        }

        return "Correct Spelling!";
    }

    // if needed implement encryption for this class
    @Override
    public String EncryptMessage(){
        return null;
    }
}


