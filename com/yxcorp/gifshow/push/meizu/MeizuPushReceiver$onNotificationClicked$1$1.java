package com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onNotificationClicked$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onNotificationClicked$1;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import com.kwai.android.register.Processor;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import java.lang.Throwable;

public final class MeizuPushReceiver$onNotificationClicked$1$1 extends Lambda implements a	// class@00167d
{
    public final MeizuPushReceiver$onNotificationClicked$1 this$0;

    public void MeizuPushReceiver$onNotificationClicked$1$1(MeizuPushReceiver$onNotificationClicked$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       try{
          String selfDefineCo = this.this$0.$mzPushMessage.getSelfDefineContentString();
          a.o(selfDefineCo, "mzPushMessage.selfDefineContentString");
          Pair[] pairArray = new Pair[0];
          Processor.clickNotification(selfDefineCo, Channel.MEIZU, pairArray);
       }catch(java.lang.Exception e0){
          PushLogger.a().h(this.this$0.$mzPushMessage.getSelfDefineContentString(), e0, Channel.MEIZU);
       }
       return;
    }
}
