package org.wso2.carbon.messaging;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * JMS text based representation for {@link CarbonMessage}
 */
public class TextJMSCarbonMessage extends JMSCarbonMessage {
    private String text;

    public TextJMSCarbonMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public InputStream getInputStream() {
        InputStream stream = null;
        if (text != null) {
            stream = new ByteArrayInputStream(text.getBytes(Charset.forName("UTF-8")));
        }
        return stream;
    }
}
