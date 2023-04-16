package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushV3TypeInterceptor$tryToShowDialog$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushV3TypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.PushData;
import kotlin.Pair;
import qrd.r0;

public final class KwaiPushV3TypeInterceptor$tryToShowDialog$1 extends Lambda implements l	// class@001662
{
    public final NotificationChain $chain;
    public final KwaiPushV3TypeInterceptor this$0;

    public void KwaiPushV3TypeInterceptor$tryToShowDialog$1(KwaiPushV3TypeInterceptor p0,NotificationChain p1){
       this.this$0 = p0;
       this.$chain = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(KwaiPushV3TypeInterceptor$tryToShowDialog$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiPushV3TypeInterceptor$tryToShowDialog$1.class, "1")) {
          return;
       }
       if (!p0) {
          this.this$0.h(this.$chain);
       }else {
          Pair[] pairArray = new Pair[]{r0.a("push_style", String.valueOf(7))};
          PushLogger.a().l(this.$chain.getChannel(), this.$chain.getPushData(), pairArray);
       }
       return;
    }
}
