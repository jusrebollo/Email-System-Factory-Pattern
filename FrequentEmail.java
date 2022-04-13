package edu.bu.met.cs665.EmailMessages;

// Class for Frequent Customers
public class FrequentEmail implements DeliverMessage {

    // Email components
    String email_header = "Welcome Frequent Client! ";
    String main_text = "Thank you for being a frequent client of our company. We appreciate your " +
            "many years of patronage with our company. ";
    String email_footer = "Sincerely, " +
            " Your long time  supplier!";
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

        String check = "Welcome Frequent Client! Thank you for being a frequent client of our company. We appreciate your many years of patronage with our company. Sincerely,  Your long time  supplier!";

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
