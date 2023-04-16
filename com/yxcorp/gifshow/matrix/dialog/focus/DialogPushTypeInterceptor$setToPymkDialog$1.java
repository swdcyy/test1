package com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToPymkDialog$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.android.common.bean.Channel;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.PushData;
import kotlin.Pair;
import qrd.r0;

public final class DialogPushTypeInterceptor$setToPymkDialog$1 extends Lambda implements l	// class@001ce8
{
    public final NotificationChain $chain;
    public final int $pushStyle;
    public final DialogPushTypeInterceptor this$0;

    public void DialogPushTypeInterceptor$setToPymkDialog$1(DialogPushTypeInterceptor p0,NotificationChain p1,int p2){
       this.this$0 = p0;
       this.$chain = p1;
       this.$pushStyle = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(DialogPushTypeInterceptor$setToPymkDialog$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DialogPushTypeInterceptor$setToPymkDialog$1.class, "1")) {
          return;
       }
       if (!p0) {
          if (this.this$0.n(this.$chain.getChannel())) {
             this.this$0.i(this.$chain);
          }
          this.this$0.s(this.$chain.getChannel(), this.$pushStyle);
       }else {
          Pair[] pairArray = new Pair[]{r0.a("push_style", String.valueOf(this.$pushStyle))};
          PushLogger.a().l(this.$chain.getChannel(), this.$chain.getPushData(), pairArray);
          this.this$0.t(this.$chain.getChannel(), this.$pushStyle);
       }
       return;
    }
}
