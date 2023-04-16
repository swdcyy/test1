package com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow$b;
import erd.c;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import kotlin.jvm.internal.a;
import oe3.e;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Throwable;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import trd.u;
import fe3.f;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;

public final class VideoRenderDataFlow$b implements c	// class@000c09
{
    public static final VideoRenderDataFlow$b a;

    static {
       VideoRenderDataFlow$b.a = new VideoRenderDataFlow$b();
    }
    public void VideoRenderDataFlow$b(){
       super();
    }
    public Object a(Object p0,Object p1){
       Set set = PatchProxy.applyTwoRefs(p0, p1, this, VideoRenderDataFlow$b.class, "1");
       if (set != PatchProxyResult.class) {
       }else {
          a.p(p0, "tspt");
          a.p(p1, "config");
          e.d(e.d, "LiveStage", "[Render] "+"Receive TSPT windows "+p0.e(), null, 4, null);
          ArrayList uArrayList = new ArrayList();
          p0 = p0.e().iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             if (obj.c()) {
                uArrayList.add(obj);
             }
          }
          int i = 10;
          p0 = new ArrayList(u.Y(uArrayList, i));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             p0.add(iterator.next().d());
          }
          set = CollectionsKt___CollectionsKt.K5(p0);
          p1 = new ArrayList();
          p0 = p1.e().iterator();
          while (p0.hasNext()) {
             Object obj1 = p0.next();
             if (obj1.c()) {
                p1.add(obj1);
             }
          }
          p0 = new ArrayList(u.Y(p1, i));
          p1 = p1.iterator();
          while (p1.hasNext()) {
             p0.add(p1.next().d());
          }
          set.retainAll(CollectionsKt___CollectionsKt.L5(p0));
       }
       return set;
    }
}
