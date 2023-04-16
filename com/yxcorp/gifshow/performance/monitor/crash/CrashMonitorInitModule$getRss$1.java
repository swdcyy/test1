package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$getRss$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import zsd.k;
import kotlin.text.Regex;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;

public final class CrashMonitorInitModule$getRss$1 extends Lambda implements l	// class@000e6a
{
    public final Ref$IntRef $rss;
    public final CrashMonitorInitModule this$0;

    public void CrashMonitorInitModule$getRss$1(CrashMonitorInitModule p0,Ref$IntRef p1){
       this.this$0 = p0;
       this.$rss = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CrashMonitorInitModule$getRss$1.class, "1")) {
          return;
       }
       a.p(p0, "line");
       boolean b = false;
       if (u.q2(p0, "VmRSS", b, 2, null)) {
          CrashMonitorInitModule$getRss$1 t$rss = this.$rss;
          k ok = this.this$0.u.matchEntire(StringsKt__StringsKt.o5(p0).toString());
          if (ok != null) {
             List list = ok.c();
             if (list != null) {
                list = CollectionsKt___CollectionsKt.F2(list, 1);
                if (list != null) {
                   b = Integer.parseInt(list);
                }
             }
          }
          t$rss.element = b;
       }
       return;
    }
}
