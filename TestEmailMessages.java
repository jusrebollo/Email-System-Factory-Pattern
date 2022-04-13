package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import edu.bu.met.cs665.EmailMessages.DeliverMessage;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

// Write some Unit tests for your program like the following.

public class TestEmailMessages {

  public TestEmailMessages() {}

  @Before
  public void initialize()
  {
    EmailFactory TestFactory = new EmailFactory();
  }

  @Test
  public void testBusinessMessage() {
    DeliverMessage BusinessMessage = EmailFactory.getMessageType("BUSINESS");

    assertEquals("Welcome Business Client! Thank you for being a business client of " +
            "our company. We appreciate your patronage of our services. Sincerely,  Your business needs supplier!",
            BusinessMessage.sendMessage());

  }

  @Test
  public void testFrequentMessage() {
    DeliverMessage FrequentMessage = EmailFactory.getMessageType("FREQUENT");

    assertEquals("Welcome Frequent Client! Thank you for being a frequent client of our company. We appreciate " +
            "your many years of patronage with our company. Sincerely,  Your long time  supplier!",
            FrequentMessage.sendMessage() );
  }

  @Test
  public void testNewCustomerMessage() {
    DeliverMessage NewCustomer = EmailFactory.getMessageType("NEW");

    assertEquals("Welcome New Client! Thank you for becoming a new client of our company. We appreciate you " +
            "beginning a relationship with our company which will last for years to come. " +
            "Sincerely,  Your new supplier!", NewCustomer.sendMessage());

  }

  @Test
  public void testReturningMessage() {
    DeliverMessage Returning = EmailFactory.getMessageType("RETURNING");

    assertEquals("Welcome Returning Client! Thank you for using our company again. We appreciate your continued" +
            " patronage of our services. Sincerely,  Your continued business needs supplier!", Returning.sendMessage());
  }

  @Test
  public void testVIPMessage() {
    DeliverMessage VIP = EmailFactory.getMessageType("VIP");

    assertEquals("Welcome VIP Client! Thank you for using our company again and being one of out premier " +
            "clients. We value the large amount of business you provide our company! " +
            "Sincerely,  Your continued business needs supplier!", VIP.sendMessage());
  }


  @Test
  public void testSpellCheck() {
    DeliverMessage BusinessMessage = EmailFactory.getMessageType("BUSINESS");

    assertEquals(BusinessMessage.SpellCheck(), "Correct Spelling!");

  }

  @Test
  public void testEncryption() throws NoSuchPaddingException, IllegalBlockSizeException, UnsupportedEncodingException,
          NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
    DeliverMessage BusinessMessage = EmailFactory.getMessageType("BUSINESS");

    assertNotSame(BusinessMessage.EncryptMessage(), "Welcome Business Client! Thank you for being a business " +
            "client of our company. We appreciate your patronage of our services. Sincerely,  Your business needs supplier!\n" +
            "Correct Spelling!");

  }


}
