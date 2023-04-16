package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onNotificationMessageClicked$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onNotificationMessageClicked$1;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import com.xiaomi.mipush.sdk.MiPushMessage;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import com.kwai.android.register.Processor;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import java.lang.Throwable;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;

public final class XiaomiPushReceiver$onNotificationMessageClicked$1$1 extends Lambda implements a	// class@0016a5
{
    public final XiaomiPushReceiver$onNotificationMessageClicked$1 this$0;

    public void XiaomiPushReceiver$onNotificationMessageClicked$1$1(XiaomiPushReceiver$onNotificationMessageClicked$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       try{
          String content = this.this$0.$message.getContent();
          a.o(content, "message.content");
          Pair[] pairArray = new Pair[0];
          Processor.clickNotification(content, Channel.XIAOMI, pairArray);
       }catch(java.lang.Exception e0){
          Channel xIAOMI = Channel.XIAOMI;
          PushLogger.a().h(this.this$0.$message.getContent(), e0, xIAOMI);
          StringBuilder str = "click call error! channel:"+xIAOMI;
          PushLogcat.INSTANCE.e("KwaiPushSDK", str+" json: "+this.this$0.$message.getContent(), e0);
       }
       return;
    }
}
