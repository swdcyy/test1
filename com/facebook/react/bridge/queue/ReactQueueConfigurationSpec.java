package com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import java.lang.Object;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec$1;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec$Builder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ReactQueueConfigurationSpec	// class@001256
{
    public final MessageQueueThreadSpec mJSQueueThreadSpec;
    public final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public void ReactQueueConfigurationSpec(MessageQueueThreadSpec p0,MessageQueueThreadSpec p1){
       super();
       this.mNativeModulesQueueThreadSpec = p0;
       this.mJSQueueThreadSpec = p1;
    }
    public void ReactQueueConfigurationSpec(MessageQueueThreadSpec p0,MessageQueueThreadSpec p1,ReactQueueConfigurationSpec$1 p2){
       super(p0, p1);
    }
    public static ReactQueueConfigurationSpec$Builder builder(){
       Object obj = PatchProxy.apply(null, null, ReactQueueConfigurationSpec.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactQueueConfigurationSpec$Builder();
    }
    public static ReactQueueConfigurationSpec createDefault(){
       Object obj = PatchProxy.apply(null, null, ReactQueueConfigurationSpec.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactQueueConfigurationSpec.builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules")).build();
    }
    public MessageQueueThreadSpec getJSQueueThreadSpec(){
       return this.mJSQueueThreadSpec;
    }
    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec(){
       return this.mNativeModulesQueueThreadSpec;
    }
}
