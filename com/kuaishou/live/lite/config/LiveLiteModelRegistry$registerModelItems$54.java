package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$54;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.guidance.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import crd.b;
import java.util.List;
import java.util.Iterator;
import e93.f;
import java.util.PriorityQueue;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteModelRegistry$registerModelItems$54 extends Lambda implements l	// class@0008a8
{
    public static final LiveLiteModelRegistry$registerModelItems$54 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$54.INSTANCE = new LiveLiteModelRegistry$registerModelItems$54();
    }
    public void LiveLiteModelRegistry$registerModelItems$54(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$54.class, "1")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, c.class, "27")) {
          p0.c.dispose();
          if (!p0.i.isEmpty()) {
             Iterator iterator = p0.i.iterator();
             while (iterator.hasNext()) {
                f.g(iterator.next());
             }
          }
          p0.g.clear();
          p0.h.clear();
          p0.i.clear();
          b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag("LiveLiteGuidanceMessageQueueServiceImpl"), "release");
       }
       return;
    }
}
