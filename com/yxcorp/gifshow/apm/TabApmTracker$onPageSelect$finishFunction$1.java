package com.yxcorp.gifshow.apm.TabApmTracker$onPageSelect$finishFunction$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.apm.TabApmTracker;
import java.lang.Object;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.util.LinkedHashMap;
import java.lang.Long;

public final class TabApmTracker$onPageSelect$finishFunction$1 extends Lambda implements q	// class@001b99
{
    public final TabApmTracker this$0;

    public void TabApmTracker$onPageSelect$finishFunction$1(TabApmTracker p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1.intValue(), p2);
       return l1.a;
    }
    public final void invoke(String p0,int p1,String p2){
       if (PatchProxy.isSupport2(TabApmTracker$onPageSelect$finishFunction$1.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), p2, this, TabApmTracker$onPageSelect$finishFunction$1.class, "1")) {
          return;
       }
       a.p(p0, "tab");
       a.p(p2, "event");
       TabApmTracker$onPageSelect$finishFunction$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidTwoRefsWithListener(p0, p2, tthis$0, TabApmTracker.class, "19")) {
          if (SystemUtil.L(a.B)) {
             LinkedHashMap linkedHashMa = tthis$0.b.get(p0);
             if (linkedHashMa != null) {
                Long longx = linkedHashMa.remove(p2);
             }
          }
          PatchProxy.onMethodExit(TabApmTracker.class, "19");
       }
       this.this$0.q0(p0, p2);
       this.this$0.R(p0, p2, p1);
       PatchProxy.onMethodExit(TabApmTracker$onPageSelect$finishFunction$1.class, "1");
       return;
    }
}
