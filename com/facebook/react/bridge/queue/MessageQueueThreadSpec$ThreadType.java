package com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MessageQueueThreadSpec$ThreadType extends Enum	// class@00124e
{
    public static final MessageQueueThreadSpec$ThreadType[] $VALUES;
    public static final MessageQueueThreadSpec$ThreadType MAIN_UI;
    public static final MessageQueueThreadSpec$ThreadType NEW_BACKGROUND;

    static {
       MessageQueueThreadSpec$ThreadType threadType = new MessageQueueThreadSpec$ThreadType("MAIN_UI", 0);
       MessageQueueThreadSpec$ThreadType.MAIN_UI = threadType;
       MessageQueueThreadSpec$ThreadType threadType1 = new MessageQueueThreadSpec$ThreadType("NEW_BACKGROUND", 1);
       MessageQueueThreadSpec$ThreadType.NEW_BACKGROUND = threadType1;
       MessageQueueThreadSpec$ThreadType[] threadTypeAr = new MessageQueueThreadSpec$ThreadType[]{threadType,threadType1};
       MessageQueueThreadSpec$ThreadType.$VALUES = threadTypeAr;
    }
    public void MessageQueueThreadSpec$ThreadType(String p0,int p1){
       super(p0, p1);
    }
    public static MessageQueueThreadSpec$ThreadType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MessageQueueThreadSpec$ThreadType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MessageQueueThreadSpec$ThreadType.class, p0);
    }
    public static MessageQueueThreadSpec$ThreadType[] values(){
       Object obj = PatchProxy.apply(null, null, MessageQueueThreadSpec$ThreadType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MessageQueueThreadSpec$ThreadType.$VALUES.clone();
    }
}
