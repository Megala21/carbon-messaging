package org.wso2.carbon.messaging;

/**
 * JMS Byte Message representation of {@link CarbonMessage}
 */
public class BytesJMSCarbonMessage extends JMSCarbonMessage {
    private long bodyLength;
    private boolean booleanValue;
    private byte byteValue;
    private short shortValue;
    private char charValue;
    private long longValue;
    private float floatValue;
    private int intValue;
    private double doubleValue;
    private String utfValue;

    public long getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(long bodyLength) {
        this.bodyLength = bodyLength;
    }

    public boolean readBoolean() {
        return booleanValue;
    }

    public byte readByte() {
        return byteValue;
    }

    public short readShort() {
        return shortValue;
    }

    public char readChar() {
        return charValue;
    }

    public int readInt() {
        return intValue;
    }

    public long readLong() {
        return longValue;
    }

    public float readFloat() {
        return floatValue;
    }

    public double readDouble() {
        return doubleValue;
    }

    public String readUTF() {
        return utfValue;
    }

    public void writeBoolean(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public void writeByte(byte byteValue) {
        this.byteValue = byteValue;
    }

    public void writeShort(short shortValue) {
        this.shortValue = shortValue;
    }

    public void writeChar(char charValue) {
        this.charValue = charValue;
    }

    public void writeInt(int intValue) {
        this.intValue = intValue;
    }

    public void writeLong(long longValue) {
        this.longValue = longValue;
    }

    public void writeFloat(float floatValue) {
        this.floatValue = floatValue;
    }

    public void writeDouble(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void writeUTF(String utfValue) {
        this.utfValue = utfValue;
    }

}
