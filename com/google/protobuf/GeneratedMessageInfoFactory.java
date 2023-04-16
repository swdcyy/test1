package com.google.protobuf.GeneratedMessageInfoFactory;
import com.google.protobuf.MessageInfoFactory;
import java.lang.Object;
import java.lang.Class;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageInfo;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;

public class GeneratedMessageInfoFactory implements MessageInfoFactory	// class@000430
{
    public static final GeneratedMessageInfoFactory instance;

    static {
       GeneratedMessageInfoFactory.instance = new GeneratedMessageInfoFactory();
    }
    public void GeneratedMessageInfoFactory(){
       super();
    }
    public static GeneratedMessageInfoFactory getInstance(){
       return GeneratedMessageInfoFactory.instance;
    }
    public boolean isSupported(Class p0){
       return GeneratedMessageLite.class.isAssignableFrom(p0);
    }
    public MessageInfo messageInfoFor(Class p0){
       GeneratedMessageLite generatedMes = GeneratedMessageLite.class;
       if (generatedMes.isAssignableFrom(p0)) {
          return GeneratedMessageLite.getDefaultInstance(p0.asSubclass(generatedMes)).buildMessageInfo();
       }
       throw new IllegalArgumentException("Unsupported message type: "+p0.getName());
    }
}
