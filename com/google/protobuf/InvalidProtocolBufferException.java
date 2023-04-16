package com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.MessageLite;

public class InvalidProtocolBufferException extends IOException	// class@000459
{
    public MessageLite unfinishedMessage;
    public static final long serialVersionUID = 0xe9924688c2f20054;

    public void InvalidProtocolBufferException(IOException p0){
       super(p0.getMessage(), p0);
       this.unfinishedMessage = null;
    }
    public void InvalidProtocolBufferException(String p0){
       super(p0);
       this.unfinishedMessage = null;
    }
    public void InvalidProtocolBufferException(String p0,IOException p1){
       super(p0, p1);
       this.unfinishedMessage = null;
    }
    public static InvalidProtocolBufferException invalidEndTag(){
       return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }
    public static InvalidProtocolBufferException invalidTag(){
       return new InvalidProtocolBufferException("Protocol message contained an invalid tag \(zero\).");
    }
    public static InvalidProtocolBufferException invalidUtf8(){
       return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
    public static InvalidProtocolBufferException$InvalidWireTypeException invalidWireType(){
       return new InvalidProtocolBufferException$InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }
    public static InvalidProtocolBufferException malformedVarint(){
       return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }
    public static InvalidProtocolBufferException negativeSize(){
       return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    public static InvalidProtocolBufferException parseFailure(){
       return new InvalidProtocolBufferException("Failed to parse the message.");
    }
    public static InvalidProtocolBufferException recursionLimitExceeded(){
       return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit\(\) to increase the depth limit.");
    }
    public static InvalidProtocolBufferException sizeLimitExceeded(){
       return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit\(\) to increase the size limit.");
    }
    public static InvalidProtocolBufferException truncatedMessage(){
       return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    public MessageLite getUnfinishedMessage(){
       return this.unfinishedMessage;
    }
    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite p0){
       this.unfinishedMessage = p0;
       return this;
    }
    public IOException unwrapIOException(){
       IOException cause = (this.getCause() instanceof IOException)? this.getCause(): this;
       return cause;
    }
}
