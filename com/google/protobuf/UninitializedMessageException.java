package com.google.protobuf.UninitializedMessageException;
import java.lang.RuntimeException;
import com.google.protobuf.MessageLite;
import java.lang.String;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Object;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Collections;

public class UninitializedMessageException extends RuntimeException	// class@0004dd
{
    public final List missingFields;
    public static final long serialVersionUID = 0x986022c4d65db14d;

    public void UninitializedMessageException(MessageLite p0){
       super("Message was missing required fields.  \(Lite runtime could not determine which fields were missing\).");
       this.missingFields = null;
    }
    public void UninitializedMessageException(List p0){
       super(UninitializedMessageException.buildDescription(p0));
       this.missingFields = p0;
    }
    public static String buildDescription(List p0){
       String str = "Message missing required fields: ";
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (i) {
             i = 0;
          }else {
             str = str+", ";
          }
          str = str+str1;
       }
       return str;
    }
    public InvalidProtocolBufferException asInvalidProtocolBufferException(){
       return new InvalidProtocolBufferException(this.getMessage());
    }
    public List getMissingFields(){
       return Collections.unmodifiableList(this.missingFields);
    }
}
