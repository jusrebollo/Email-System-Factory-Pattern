package edu.bu.met.cs665.EmailMessages;

// Class for VIP Customers
public class VIPemail implements DeliverMessage {

    // Email components
    String email_header = "Welcome VIP Client! ";
    String main_text = "Thank you for using our company again and being one of out premier clients. " +
            "We value the large amount of business you provide our company! ";
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

        String check = "Welcome VIP Client! Thank you for using our company again and being one of out premier clients. We value the large amount of business you provide our company! Sincerely,  Your continued business needs supplier!";

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
