package com.facebook.react.bridge.queue.MessageQueueThreadImpl$5;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType;
import java.lang.Enum;

public class MessageQueueThreadImpl$5	// class@00124b
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType;

    static {
       int[] ointArray = new int[MessageQueueThreadSpec$ThreadType.values().length];
       try{
          MessageQueueThreadImpl$5.$SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType = ointArray;
          ointArray[MessageQueueThreadSpec$ThreadType.MAIN_UI.ordinal()] = 1;
          try{
             MessageQueueThreadImpl$5.$SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType[MessageQueueThreadSpec$ThreadType.NEW_BACKGROUND.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
