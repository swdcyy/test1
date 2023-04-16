package com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;

public class MessageQueueThreadSpec	// class@00124f
{
    public final String mName;
    public final long mStackSize;
    public final MessageQueueThreadSpec$ThreadType mThreadType;
    public static final MessageQueueThreadSpec MAIN_UI_SPEC;

    static {
       MessageQueueThreadSpec.MAIN_UI_SPEC = new MessageQueueThreadSpec(MessageQueueThreadSpec$ThreadType.MAIN_UI, "main_ui");
    }
    public void MessageQueueThreadSpec(MessageQueueThreadSpec$ThreadType p0,String p1){
       super(p0, p1, 0);
    }
    public void MessageQueueThreadSpec(MessageQueueThreadSpec$ThreadType p0,String p1,long p2){
       super();
       this.mThreadType = p0;
       this.mName = p1;
       this.mStackSize = p2;
    }
    public static MessageQueueThreadSpec mainThreadSpec(){
       return MessageQueueThreadSpec.MAIN_UI_SPEC;
    }
    public static MessageQueueThreadSpec newBackgroundThreadSpec(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MessageQueueThreadSpec.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MessageQueueThreadSpec(MessageQueueThreadSpec$ThreadType.NEW_BACKGROUND, p0);
    }
    public static MessageQueueThreadSpec newBackgroundThreadSpec(String p0,long p1){
       MessageQueueThreadSpec messageQueue = MessageQueueThreadSpec.class;
       if (PatchProxy.isSupport(messageQueue)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, messageQueue, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new MessageQueueThreadSpec(MessageQueueThreadSpec$ThreadType.NEW_BACKGROUND, p0, p1);
    }
    public static MessageQueueThreadSpec newUIBackgroundTreadSpec(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MessageQueueThreadSpec.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MessageQueueThreadSpec(MessageQueueThreadSpec$ThreadType.NEW_BACKGROUND, p0);
    }
    public String getName(){
       return this.mName;
    }
    public long getStackSize(){
       return this.mStackSize;
    }
    public MessageQueueThreadSpec$ThreadType getThreadType(){
       return this.mThreadType;
    }
}
