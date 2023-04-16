package com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onNotificationMessageClicked$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onNotificationMessageClicked$1;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import com.vivo.push.model.UPSNotificationMessage;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import com.kwai.android.register.Processor;
import java.lang.Throwable;
import p45.a;
import com.kwai.android.pushlog.PushLogger;

public final class VivoPushReceiver$onNotificationMessageClicked$1$1 extends Lambda implements a	// class@00169e
{
    public final VivoPushReceiver$onNotificationMessageClicked$1 this$0;

    public void VivoPushReceiver$onNotificationMessageClicked$1$1(VivoPushReceiver$onNotificationMessageClicked$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String skipContent = this.this$0.$message.getSkipContent();
       PushLogcat.INSTANCE.i("KwaiPushSDK", "onNotificationMessageClicked\("+this.this$0.$message.getSkipType()+"\): "+skipContent);
       if (this.this$0.$message.getSkipType() == 3) {
          try{
             a.o(skipContent, "json");
             Pair[] pairArray = new Pair[0];
             Processor.clickNotification(skipContent, Channel.VIVO, pairArray);
          }catch(java.lang.Exception e1){
             Channel vIVO = Channel.VIVO;
             PushLogcat.INSTANCE.e("KwaiPushSDK", "click call error! channel:"+vIVO+" json: "+this.this$0.$message.getContent(), e1);
             PushLogger.a().h(skipContent, e1, vIVO);
          }
       }
    }
}
