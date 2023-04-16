package com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.String;

public class InvalidProtocolBufferNanoException extends IOException	// class@0005c8
{
    public static final long serialVersionUID = 0xe9924688c2f20054;

    public void InvalidProtocolBufferNanoException(String p0){
       super(p0);
    }
    public static InvalidProtocolBufferNanoException invalidEndTag(){
       return new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
    }
    public static InvalidProtocolBufferNanoException invalidTag(){
       return new InvalidProtocolBufferNanoException("Protocol message contained an invalid tag \(zero\).");
    }
    public static InvalidProtocolBufferNanoException invalidWireType(){
       return new InvalidProtocolBufferNanoException("Protocol message tag had invalid wire type.");
    }
    public static InvalidProtocolBufferNanoException malformedVarint(){
       return new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
    }
    public static InvalidProtocolBufferNanoException negativeSize(){
       return new InvalidProtocolBufferNanoException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    public static InvalidProtocolBufferNanoException recursionLimitExceeded(){
       return new InvalidProtocolBufferNanoException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit\(\) to increase the depth limit.");
    }
    public static InvalidProtocolBufferNanoException sizeLimitExceeded(){
       return new InvalidProtocolBufferNanoException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit\(\) to increase the size limit.");
    }
    public static InvalidProtocolBufferNanoException truncatedMessage(){
       return new InvalidProtocolBufferNanoException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
