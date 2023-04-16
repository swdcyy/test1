package com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onNotificationMessageClicked$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.vivo.push.model.UPSNotificationMessage;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onNotificationMessageClicked$1$1;
import com.kwai.android.common.utils.PushSDKInitUtilKt;

public final class VivoPushReceiver$onNotificationMessageClicked$1 extends Lambda implements a	// class@00169f
{
    public final UPSNotificationMessage $message;

    public void VivoPushReceiver$onNotificationMessageClicked$1(UPSNotificationMessage p0){
       this.$message = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PushSDKInitUtilKt.requirePushInit(new VivoPushReceiver$onNotificationMessageClicked$1$1(this));
    }
}
