package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$b;

public final class LiveStageRenderViewFactory$a	// class@0014a0
{

    public void LiveStageRenderViewFactory$a(){
       super();
    }
    public void LiveStageRenderViewFactory$a(u p0){
       super();
    }
    public static LiveStageRenderViewFactory b(LiveStageRenderViewFactory$a p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       return p0.a(p1);
    }
    public final LiveStageRenderViewFactory a(boolean p0){
       LiveStageRenderViewFactory$a uoa = LiveStageRenderViewFactory$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveStageRenderViewFactory(p0);
    }
    public final LiveStageRenderViewFactory c(){
       Object obj = PatchProxy.apply(null, this, LiveStageRenderViewFactory$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveStageRenderViewFactory(false, 1, null);
    }
    public final LiveStageRenderViewFactory d(l p0,l p1){
       LiveStageRenderViewFactory obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveStageRenderViewFactory$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "playerViewLocator");
       a.p(p1, "playerViewVisibilityListener");
       obj = new LiveStageRenderViewFactory(false, 1, null);
       obj.a.b(p0);
       obj.b.b(p1);
       return obj;
    }
}
