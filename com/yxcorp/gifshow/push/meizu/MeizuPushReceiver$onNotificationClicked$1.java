package com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onNotificationClicked$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onNotificationClicked$1$1;
import com.kwai.android.common.ext.ContextExtKt;

public final class MeizuPushReceiver$onNotificationClicked$1 extends Lambda implements a	// class@00167e
{
    public final MzPushMessage $mzPushMessage;

    public void MeizuPushReceiver$onNotificationClicked$1(MzPushMessage p0){
       this.$mzPushMessage = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ContextExtKt.runOnUiThread(new MeizuPushReceiver$onNotificationClicked$1$1(this));
    }
}
