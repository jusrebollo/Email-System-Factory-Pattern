package edu.bu.met.cs665;

// import org.apache.log4j.PropertyConfigurator;

import edu.bu.met.cs665.EmailMessages.DeliverMessage;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

  public static void main(String[] args) throws NoSuchPaddingException, IllegalBlockSizeException, UnsupportedEncodingException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.

    Main m = new Main();

    // Singleton EmailFactory which is the EmailGeneration system
    EmailFactory SoleEmailFactory = new EmailFactory();

    // Business Customer Email
    DeliverMessage BusinessMessage = SoleEmailFactory.getMessageType("BUSINESS");
    //Send message
    System.out.println(BusinessMessage.sendMessage());
    // Spell check
    System.out.println(BusinessMessage.SpellCheck());
    // Encryption of message
    System.out.println("Encrypted message: ");
    System.out.println(BusinessMessage.EncryptMessage());

    // Frequent Customer Email
    DeliverMessage FrequentMessage = SoleEmailFactory.getMessageType("FREQUENT");
    //Send message
    System.out.println(FrequentMessage.sendMessage());
    // Spell check
    System.out.println(FrequentMessage.SpellCheck());

    // New Customer Email
    DeliverMessage NewCustomerMessage = SoleEmailFactory.getMessageType("NEW");
    //Send message
    System.out.println(NewCustomerMessage.sendMessage());
    // Spell check
    System.out.println(NewCustomerMessage.SpellCheck());

    // Returning Customer Email
    DeliverMessage ReturningMessage = SoleEmailFactory.getMessageType("RETURNING");
    //Send message
    System.out.println(ReturningMessage.sendMessage());

    //  VIP Customer Email
    DeliverMessage VIPmessage = SoleEmailFactory.getMessageType("VIP");
    //Send message
    System.out.println(VIPmessage.sendMessage());

  }
}
