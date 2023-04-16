package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onNotificationMessageClicked$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onNotificationMessageClicked$1$1;
import com.kwai.android.common.ext.ContextExtKt;

public final class XiaomiPushReceiver$onNotificationMessageClicked$1 extends Lambda implements a	// class@0016a6
{
    public final MiPushMessage $message;

    public void XiaomiPushReceiver$onNotificationMessageClicked$1(MiPushMessage p0){
       this.$message = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ContextExtKt.runOnUiThread(new XiaomiPushReceiver$onNotificationMessageClicked$1$1(this));
    }
}
