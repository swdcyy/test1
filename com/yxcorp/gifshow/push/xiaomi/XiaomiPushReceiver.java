package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$a;
import nsd.u;
import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onNotificationMessageClicked$1;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceivePassThroughMessage$1;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceiveRegisterResult$1;

public final class XiaomiPushReceiver extends PushMessageReceiver	// class@0016aa
{
    public static final XiaomiPushReceiver$a Companion;

    static {
       XiaomiPushReceiver.Companion = new XiaomiPushReceiver$a(null);
    }
    public void XiaomiPushReceiver(){
       super();
    }
    public void onNotificationMessageArrived(Context p0,MiPushMessage p1){
       a.p(p0, "context");
       a.p(p1, "message");
    }
    public void onNotificationMessageClicked(Context p0,MiPushMessage p1){
       a.p(p0, "context");
       a.p(p1, "message");
       PushSDKInitUtilKt.requirePushInit(new XiaomiPushReceiver$onNotificationMessageClicked$1(p1));
    }
    public void onReceivePassThroughMessage(Context p0,MiPushMessage p1){
       a.p(p0, "context");
       a.p(p1, "message");
       PushSDKInitUtilKt.requirePushInit(new XiaomiPushReceiver$onReceivePassThroughMessage$1(p1));
    }
    public void onReceiveRegisterResult(Context p0,MiPushCommandMessage p1){
       a.p(p0, "context");
       a.p(p1, "message");
       PushSDKInitUtilKt.requirePushInit(new XiaomiPushReceiver$onReceiveRegisterResult$1(p1));
    }
}
