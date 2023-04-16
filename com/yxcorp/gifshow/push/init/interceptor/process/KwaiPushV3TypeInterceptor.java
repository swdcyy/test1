package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushV3TypeInterceptor;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.android.common.bean.PushData;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushV3SpringActivity;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushV3TypeInterceptor$tryToShowDialog$1;
import com.kwai.lib.BaseSpringDialogFragment;
import msd.l;
import com.kwai.lib.Spring;

public class KwaiPushV3TypeInterceptor extends KwaiPushTypeInterceptor	// class@0012f6
{

    public void KwaiPushV3TypeInterceptor(){
       super();
    }
    public void k(NotificationChain p0,PushFragmentDialog p1,KwaiPushMsgData p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiPushV3TypeInterceptor.class, "1")) {
          return;
       }
       a.p(p0, "chain");
       a.p(p1, "fragment");
       a.p(p2, "data");
       this.l();
       PushData pushId = p2.pushId;
       a.o(pushId, "data.pushId");
       Spring.c(p0.getContext(), p1, pushId, PushV3SpringActivity.class, new KwaiPushV3TypeInterceptor$tryToShowDialog$1(this, p0));
       return;
    }
}
