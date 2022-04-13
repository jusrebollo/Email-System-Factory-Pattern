package edu.bu.met.cs665.EmailMessages;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

// Interface for
public interface DeliverMessage {
    // to send message
    String sendMessage();
    // for spell check
    String SpellCheck();

    // email components
    String email_header = null;
    String main_text = null;
    String email_footer = null;

    //to encrypt the message

    String EncryptMessage() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException;
}
