package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$20;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle;
import ds5.c;
import ds5.a;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import ac3.m;
import lnc.u1;
import crd.a;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import i51.o;
import ut7.h;
import com.kwai.statechart.StateChart;
import hf3.a;

public final class LiveLiteModelRegistry$registerModelItems$20 extends Lambda implements l	// class@000882
{
    public static final LiveLiteModelRegistry$registerModelItems$20 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$20.INSTANCE = new LiveLiteModelRegistry$registerModelItems$20();
    }
    public void LiveLiteModelRegistry$registerModelItems$20(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteLongConnectionManager p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$20.class, str)) {
          return;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LiveLiteLongConnectionManager.class, "2")) {
          p0.y.removeObserver(p0.v);
          p0.z.fo(p0.w);
          if (!PatchProxy.applyVoid(null, p0, LiveBaseLongConnectionManager.class, "3")) {
             LiveBaseLongConnectionManager i = p0.i;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoid(null, i, m.class, str)) {
                u1.b(i);
             }
             p0.h.dispose();
             p0.q.removeObserver(p0.d);
             p0.r.removeStateChangeListener(p0.e);
             i = p0.o;
             if (i != null) {
                i.a();
             }
             p0.l.t(h.b);
             if (!p0.t1().D0()) {
                p0.t1().a();
             }
          }
       }
       return;
    }
}
