package com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onTransmissionMessage$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onTransmissionMessage$1;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import com.vivo.push.model.UnvarnishedMessage;
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

public final class VivoPushReceiver$onTransmissionMessage$1$1 extends Lambda implements a	// class@0016a1
{
    public final VivoPushReceiver$onTransmissionMessage$1 this$0;

    public void VivoPushReceiver$onTransmissionMessage$1$1(VivoPushReceiver$onTransmissionMessage$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Channel vIVO;
       String message;
       String str = " json: ";
       String str1 = "KwaiPushSDK";
       try{
          JsonElement jsonElement = PushDataExtKt.toJson(this.this$0.$message.getMessage());
          String str2 = "message.message";
          if (PushDataExtKt.isPushDataType(jsonElement)) {
             message = this.this$0.$message.getMessage();
             a.o(message, str2);
             Processor.showNotification(message, Channel.VIVO);
          }else if(PushDataExtKt.isCommandDataType(jsonElement)){
             message = this.this$0.$message.getMessage();
             a.o(message, str2);
             Processor.commandProcess(message, Channel.VIVO);
          }else if(PushDataExtKt.isOldDataProtocol(jsonElement)){
             message = this.this$0.$message.getMessage();
             a.o(message, str2);
             Processor.showNotification(message, Channel.VIVO);
          }else {
             IllegalStateException illegalState = new IllegalStateException("deserialize protocol not recognized!");
             vIVO = Channel.VIVO;
             PushLogger.a().h(this.this$0.$message.getMessage(), illegalState, vIVO);
             PushLogcat.INSTANCE.e(str1, "deserialize protocol not recognized! channel:"+vIVO+str+this.this$0.$message.getMessage(), illegalState);
          }
       }catch(java.lang.Exception e2){
          vIVO = Channel.VIVO;
          PushLogger.a().h(this.this$0.$message.getMessage(), e2, vIVO);
          PushLogcat.INSTANCE.e(str1, "deserialize protocol error! channel:"+vIVO+str+this.this$0.$message.getMessage(), e2);
       }
       return;
    }
}
