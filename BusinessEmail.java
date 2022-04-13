package edu.bu.met.cs665.EmailMessages;

// packages for encryption
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


// Class for Business Customers
public class BusinessEmail implements DeliverMessage {

    // email contents
    String email_header = "Welcome Business Client! ";
    String main_text = "Thank you for being a business client of our company. We appreciate your " +
            "patronage of our services. ";
    String email_footer = "Sincerely, " +
            " Your business needs supplier!";

    String whole_message = email_header + main_text + email_footer;
    public Message CurrentMessage;


    // implement send message
    @Override
    public String sendMessage() {
        CurrentMessage = new Message();
        CurrentMessage.setMessage(email_header, main_text, email_footer);
        return CurrentMessage.getMessage();
    }

    // implement spell check
    @Override
    public String SpellCheck() {

        String check = "Welcome Business Client! Thank you for being a business client of our company. We appreciate your patronage of our services. Sincerely,  Your business needs supplier!";

        if (!(email_header + main_text + email_footer).equals(check)) {

            return "Incorrect spelling!";

        }

        return "Correct Spelling!";
    }

    // encrypt the message
    public String EncryptMessage() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        Signature BusinessEncrypt = Signature.getInstance("SHA256withRSA");

        KeyPairGenerator BusinessKeyPair = KeyPairGenerator.getInstance("RSA");

        BusinessKeyPair.initialize(2048);

        KeyPair BusinessPair = BusinessKeyPair.generateKeyPair();

        Cipher BusinessCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        BusinessCipher.init(Cipher.ENCRYPT_MODE, BusinessPair.getPublic());

        byte[] BusinessMessageInput = whole_message.getBytes(StandardCharsets.UTF_8);
        BusinessCipher.update(BusinessMessageInput);
        byte [] BusinessCipherText = BusinessCipher.doFinal();
        return (new String(BusinessCipherText, "UTF8"));

    }
}
