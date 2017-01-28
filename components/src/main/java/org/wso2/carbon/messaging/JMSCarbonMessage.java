package org.wso2.carbon.messaging;

/**
 * Created by megala on 1/28/17.
 */
public abstract class JMSCarbonMessage extends CarbonMessage {
    private static final String JMS_MESSAGE_ID = "JMS_MESSAGE_ID";
    private static final String JMS_TIME_STAMP = "JMS_TIME_STAMP";
    private static final String JMS_CORRELATION_ID_AS_BYTES = "JMS_CORRELATION_ID_AS_BYTES";
    private static final String JMS_CORRELATION_ID = "JMS_CORRELATION_ID";
    private static final String JMS_DELIVERY_MODE = "JMS_DELIVERY_MODE";
    private static final String JMS_TYPE = "JMS_TYPE";

    public void setJMSMessageID(String messageID) {
        setProperty(JMS_MESSAGE_ID, messageID);
    }

    public void setJMSTimeStamp(long timeStamp) {
        setProperty(JMS_TIME_STAMP, timeStamp);
    }

    public void setJMSCorrelationIDAsBytes(byte[] correlationId) {
        setProperty(JMS_CORRELATION_ID_AS_BYTES, correlationId);
    }

    public void setJMSCorrelationID(String correlationID) {
        setProperty(JMS_CORRELATION_ID, correlationID);
    }

    public void setJMSDeliveryMode(int deliveryMode) {
        setProperty(JMS_DELIVERY_MODE, deliveryMode);
    }

    public void setJMSType(String jmsType) {
        setProperty(JMS_TYPE, jmsType);
    }
}
