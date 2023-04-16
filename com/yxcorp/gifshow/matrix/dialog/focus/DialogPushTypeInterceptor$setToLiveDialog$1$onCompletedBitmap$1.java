package com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToLiveDialog$1;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.core.notification.NotificationChain;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.PushData;
import kotlin.Pair;
import qrd.r0;

public final class DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1 extends Lambda implements l	// class@001ce6
{
    public final DialogPushTypeInterceptor$setToLiveDialog$1 this$0;

    public void DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1(DialogPushTypeInterceptor$setToLiveDialog$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1 tthis$0;
       if (PatchProxy.isSupport(DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1.class, "1")) {
          return;
       }
       if (!p0) {
          tthis$0 = this.this$0;
          if (tthis$0.b.n(tthis$0.e.getChannel())) {
             tthis$0 = this.this$0;
             tthis$0.b.i(tthis$0.e);
          }
          tthis$0 = this.this$0;
          tthis$0.b.s(tthis$0.e.getChannel(), this.this$0.h);
       }else {
          Pair[] pairArray = new Pair[]{r0.a("push_style", String.valueOf(this.this$0.h))};
          PushLogger.a().l(this.this$0.e.getChannel(), this.this$0.e.getPushData(), pairArray);
          tthis$0 = this.this$0;
          tthis$0.b.t(tthis$0.e.getChannel(), this.this$0.h);
       }
       return;
    }
}
