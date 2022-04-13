package edu.bu.met.cs665;

import edu.bu.met.cs665.EmailMessages.*;

public class EmailFactory {

    private static EmailFactory singletonEmailFactory = new EmailFactory();


    public static DeliverMessage getMessageType(String messageType) {

        //Types: BUSINESS, FREQUENT, NEW, RETURNING, VIP

        if(messageType == "BUSINESS")
        {
            return new BusinessEmail();
        }
        if(messageType == "FREQUENT")
        {
            return new FrequentEmail();
        }

        if(messageType == "NEW")
        {
            return new NewCustomerEmail();
        }

        if(messageType == "RETURNING")
        {
            return new ReturningEmail();
        }

        if(messageType == "VIP")
        {
            return new VIPemail();
        }

        return null;
    }

}
