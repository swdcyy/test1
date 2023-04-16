package com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$b;
import java.lang.Runnable;
import java.lang.String;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.android.common.bean.PushData;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import com.kwai.android.common.ext.PushDataExtKt;
import q6c.e;
import java.util.Objects;
import q6c.e$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.processor.manager.CurrentProcessorManager;
import java.lang.NullPointerException;

public final class DialogPushTypeInterceptor$b implements Runnable	// class@001ce3
{
    public final String b;
    public final DialogPushTypeInterceptor c;
    public final NotificationChain d;

    public void DialogPushTypeInterceptor$b(String p0,DialogPushTypeInterceptor p1,NotificationChain p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       boolean b;
       if (PatchProxy.applyVoidWithListener(null, this, DialogPushTypeInterceptor$b.class, "1")) {
          return;
       }
       PushData pushData = this.d.getPushData();
       if (pushData != null) {
          String str = PushDataExtKt.toJson(pushData);
          if (str != null) {
             e$a a = e.a;
             DialogPushTypeInterceptor$b tb = this.b;
             Objects.requireNonNull(a);
             Object obj = PatchProxy.applyOneRefs(tb, a, e$a.class, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a.p(tb, "pushId");
                b = a.g(b.c(a.b(), "lastClickPushId", 0).getString("lastClickPushId", ""), tb);
             }
             if (!b) {
                CurrentProcessorManager.showNotification(str, this.d.getChannel());
             }
          }
          PatchProxy.onMethodExit(DialogPushTypeInterceptor$b.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(DialogPushTypeInterceptor$b.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
       }
    }
}
