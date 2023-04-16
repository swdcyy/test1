package com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow$imagePipeDataMap$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import oe3.h;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import ie3.f0;
import fe3.c$b;

public final class ImageRenderDataFlow$imagePipeDataMap$1 extends Lambda implements p	// class@000c06
{
    public static final ImageRenderDataFlow$imagePipeDataMap$1 INSTANCE;

    static {
       ImageRenderDataFlow$imagePipeDataMap$1.INSTANCE = new ImageRenderDataFlow$imagePipeDataMap$1();
    }
    public void ImageRenderDataFlow$imagePipeDataMap$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Map invoke(LayoutConfig p0,h p1){
       Pair obj = PatchProxy.applyTwoRefs(p0, p1, this, ImageRenderDataFlow$imagePipeDataMap$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "layoutConfig");
       a.p(p1, "maybe");
       obj = p1.a();
       LinkedHashMap linkedHashMa = null;
       LayoutConfig first = (obj != null)? obj.getFirst(): linkedHashMa;
       if (a.g(p0, first)) {
          Iterable second = p1.a().getSecond();
          linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(second, 10)), 16));
          Iterator iterator = second.iterator();
          while (iterator.hasNext()) {
             p1 = iterator.next();
             linkedHashMa.put(p1.a(), p1);
          }
       }
       return linkedHashMa;
    }
}
