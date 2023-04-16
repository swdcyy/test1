package com.yxcorp.gifshow.push.kuaishou.KuaishouListener$onReceive$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.kuaishou.KuaishouListener;
import java.util.List;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.push.kuaishou.KuaishouListener$onReceive$1$1;
import com.kwai.android.common.ext.ContextExtKt;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.String;
import java.lang.Throwable;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import java.lang.NullPointerException;
import com.kwai.android.common.bean.Channel;

public final class KuaishouListener$onReceive$1 extends Lambda implements a	// class@00167a
{
    public final List $list;
    public final KuaishouListener this$0;

    public void KuaishouListener$onReceive$1(KuaishouListener p0,List p1){
       this.this$0 = p0;
       this.$list = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       KuaishouListener$onReceive$1 t$list = this.$list;
       if (t$list == null || t$list.isEmpty()) {
          PushLogcat.e$default(PushLogcat.INSTANCE, "KwaiPushSDK", "klink package receive list is empty!! error!!! error!!!", null, 4, null);
          PushLogger.a().h("", new NullPointerException("klink package receive list is empty!! error!!! error!!!"), Channel.KS);
          return;
       }else {
          ContextExtKt.runOnUiThread(new KuaishouListener$onReceive$1$1(this));
          return;
       }
    }
}
