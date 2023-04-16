package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceivePassThroughMessage$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceivePassThroughMessage$1$1;
import com.kwai.android.common.ext.ContextExtKt;

public final class XiaomiPushReceiver$onReceivePassThroughMessage$1 extends Lambda implements a	// class@0016a8
{
    public final MiPushMessage $message;

    public void XiaomiPushReceiver$onReceivePassThroughMessage$1(MiPushMessage p0){
       this.$message = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ContextExtKt.runOnUiThread(new XiaomiPushReceiver$onReceivePassThroughMessage$1$1(this));
    }
}
