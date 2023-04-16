package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$tryToShowDialog$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.PushData;
import kotlin.Pair;
import qrd.r0;

public final class KwaiPushTypeInterceptor$tryToShowDialog$1 extends Lambda implements l	// class@00165f
{
    public final NotificationChain $chain;
    public final KwaiPushTypeInterceptor this$0;

    public void KwaiPushTypeInterceptor$tryToShowDialog$1(KwaiPushTypeInterceptor p0,NotificationChain p1){
       this.this$0 = p0;
       this.$chain = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(KwaiPushTypeInterceptor$tryToShowDialog$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiPushTypeInterceptor$tryToShowDialog$1.class, "1")) {
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
