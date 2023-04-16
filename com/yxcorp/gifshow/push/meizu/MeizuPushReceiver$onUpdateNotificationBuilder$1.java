package com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onUpdateNotificationBuilder$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import java.lang.Object;
import qrd.l1;
import kotlin.Result;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.Throwable;
import qrd.j0;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import java.lang.String;
import kotlin.Pair;

public final class MeizuPushReceiver$onUpdateNotificationBuilder$1 extends Lambda implements a	// class@001680
{
    public final PushNotificationBuilder $pushNotificationBuilder;

    public void MeizuPushReceiver$onUpdateNotificationBuilder$1(PushNotificationBuilder p0){
       this.$pushNotificationBuilder = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       MeizuPushReceiver$onUpdateNotificationBuilder$1 t$pushNotifi = this.$pushNotificationBuilder;
       if (t$pushNotifi != null) {
          t$pushNotifi.setStatusBarIcon(PushConfigManager.INSTANCE.getNotificationSmallIcon());
       }
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          Pair[] pairArray = new Pair[0];
          PushLogger.c().f("tag_error_meizu_sdk", String.valueOf(obj.getMessage()), obj, pairArray);
       }
       return;
    }
}
