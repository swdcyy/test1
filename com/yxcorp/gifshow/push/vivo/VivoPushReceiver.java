package com.yxcorp.gifshow.push.vivo.VivoPushReceiver;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$Companion;
import nsd.u;
import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onNotificationMessageClicked$1;
import msd.a;
import com.kwai.android.common.ext.ContextExtKt;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onReceiveRegId$1;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.vivo.push.model.UnvarnishedMessage;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onTransmissionMessage$1;

public final class VivoPushReceiver extends OpenClientPushMessageReceiver	// class@0016a3
{
    public static final VivoPushReceiver$Companion Companion;

    static {
       VivoPushReceiver.Companion = new VivoPushReceiver$Companion(null);
    }
    public void VivoPushReceiver(){
       super();
    }
    public void onNotificationMessageClicked(Context p0,UPSNotificationMessage p1){
       a.p(p0, "context");
       a.p(p1, "message");
       ContextExtKt.runOnUiThread(new VivoPushReceiver$onNotificationMessageClicked$1(p1));
    }
    public void onReceiveRegId(Context p0,String p1){
       PushSDKInitUtilKt.requirePushInit(new VivoPushReceiver$onReceiveRegId$1(p1));
    }
    public void onTransmissionMessage(Context p0,UnvarnishedMessage p1){
       a.p(p1, "message");
       PushSDKInitUtilKt.requirePushInit(new VivoPushReceiver$onTransmissionMessage$1(p1));
    }
}
