package com.facebook.react.bridge.queue.ReactQueueConfigurationSpec$Builder;
import java.lang.Object;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import od.a;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec$1;

public class ReactQueueConfigurationSpec$Builder	// class@001255
{
    public MessageQueueThreadSpec mJSQueueSpec;
    public MessageQueueThreadSpec mNativeModulesQueueSpec;

    public void ReactQueueConfigurationSpec$Builder(){
       super();
    }
    public ReactQueueConfigurationSpec build(){
       Object obj = PatchProxy.apply(null, this, ReactQueueConfigurationSpec$Builder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ReactQueueConfigurationSpec$Builder tmNativeModu = this.mNativeModulesQueueSpec;
       a.c(tmNativeModu);
       ReactQueueConfigurationSpec$Builder tmJSQueueSpe = this.mJSQueueSpec;
       a.c(tmJSQueueSpe);
       return new ReactQueueConfigurationSpec(tmNativeModu, tmJSQueueSpe, null);
    }
    public ReactQueueConfigurationSpec$Builder setJSQueueThreadSpec(MessageQueueThreadSpec p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactQueueConfigurationSpec$Builder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (this.mJSQueueSpec == null)? true: false;
       a.b(b, "Setting JS queue multiple times!");
       this.mJSQueueSpec = p0;
       return this;
    }
    public ReactQueueConfigurationSpec$Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactQueueConfigurationSpec$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (this.mNativeModulesQueueSpec == null)? true: false;
       a.b(b, "Setting native modules queue spec multiple times!");
       this.mNativeModulesQueueSpec = p0;
       return this;
    }
}
