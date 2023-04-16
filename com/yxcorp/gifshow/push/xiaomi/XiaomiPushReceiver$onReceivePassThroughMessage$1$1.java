package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceivePassThroughMessage$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceivePassThroughMessage$1;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.google.gson.JsonElement;
import com.kwai.android.common.ext.PushDataExtKt;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.Processor;
import java.lang.IllegalStateException;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import java.lang.Throwable;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;

public final class XiaomiPushReceiver$onReceivePassThroughMessage$1$1 extends Lambda implements a	// class@0016a7
{
    public final XiaomiPushReceiver$onReceivePassThroughMessage$1 this$0;

    public void XiaomiPushReceiver$onReceivePassThroughMessage$1$1(XiaomiPushReceiver$onReceivePassThroughMessage$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Channel xIAOMI;
       String content;
       String str = " json: ";
       String str1 = "KwaiPushSDK";
       try{
          JsonElement jsonElement = PushDataExtKt.toJson(this.this$0.$message.getContent());
          String str2 = "message.content";
          if (PushDataExtKt.isPushDataType(jsonElement)) {
             content = this.this$0.$message.getContent();
             a.o(content, str2);
             Processor.showNotification(content, Channel.XIAOMI);
          }else if(PushDataExtKt.isCommandDataType(jsonElement)){
             content = this.this$0.$message.getContent();
             a.o(content, str2);
             Processor.commandProcess(content, Channel.XIAOMI);
          }else if(PushDataExtKt.isOldDataProtocol(jsonElement)){
             content = this.this$0.$message.getContent();
             a.o(content, str2);
             Processor.showNotification(content, Channel.XIAOMI);
          }else {
             IllegalStateException illegalState = new IllegalStateException("deserialize protocol not recognized!");
             xIAOMI = Channel.XIAOMI;
             PushLogger.a().h(this.this$0.$message.getContent(), illegalState, xIAOMI);
             PushLogcat.INSTANCE.e(str1, "deserialize protocol not recognized! channel:"+xIAOMI+str+this.this$0.$message.getContent(), illegalState);
          }
       }catch(java.lang.Exception e2){
          xIAOMI = Channel.XIAOMI;
          PushLogger.a().h(this.this$0.$message.getContent(), e2, xIAOMI);
          PushLogcat.INSTANCE.e(str1, "deserialize protocol error! channel:"+xIAOMI+str+this.this$0.$message.getContent(), e2);
       }
       return;
    }
}
