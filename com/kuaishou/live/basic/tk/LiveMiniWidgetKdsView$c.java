package com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$c;
import z51.b;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$b;

public final class LiveMiniWidgetKdsView$c implements b	// class@000d0a
{
    public final LiveMiniWidgetKdsView a;

    public void LiveMiniWidgetKdsView$c(LiveMiniWidgetKdsView p0){
       this.a = p0;
       super();
    }
    public void a(String p0,long p1){
       LiveMiniWidgetKdsView$c uoc = LiveMiniWidgetKdsView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoc, "2")) {
          return;
       }
       a.p(p0, "bundleId");
       LiveMiniWidgetKdsView$b kdsViewLogge = this.a.getKdsViewLogger();
       if (kdsViewLogge != null) {
          kdsViewLogge.e(this.a.g, p0, p1);
       }
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniWidgetKdsView$c.class, "3")) {
          return;
       }
       a.p(p0, "bundleId");
       a.p(p1, "errMsg");
       LiveMiniWidgetKdsView$b kdsViewLogge = this.a.getKdsViewLogger();
       if (kdsViewLogge != null) {
          kdsViewLogge.c(this.a.g, p0, p1);
       }
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniWidgetKdsView$c.class, "1")) {
          return;
       }
       a.p(p0, "bundleId");
       LiveMiniWidgetKdsView$b kdsViewLogge = this.a.getKdsViewLogger();
       if (kdsViewLogge != null) {
          kdsViewLogge.a(this.a.g, p0);
       }
       return;
    }
}
