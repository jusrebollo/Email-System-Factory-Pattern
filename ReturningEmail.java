package edu.bu.met.cs665.EmailMessages;

// Class for Returning Customers

public class ReturningEmail implements DeliverMessage{
    String email_header = "Welcome Returning Client! ";
    String main_text = "Thank you for using our company again. We appreciate your " +
            "continued patronage of our services. ";
    String email_footer = "Sincerely, " +
            " Your continued business needs supplier!";
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

        String check = "Welcome Returning Client! Thank you for using our company again. We appreciate your continued patronage of our services. Sincerely,  Your continued business needs supplier!";

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

