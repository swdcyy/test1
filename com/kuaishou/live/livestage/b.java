package com.kuaishou.live.livestage.b;
import ee3.e;
import java.lang.Object;
import fe3.b;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ee3.c;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class b implements e	// class@000bdf
{

    public void b(){
       super();
    }
    public LayoutConfig a(b p0,LayoutConfig p1,LayoutConfig p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "currentBiz");
       a.p(p1, "fromSignal");
       LayoutConfig layoutConfig = c.a(p1, p0);
       if (layoutConfig != null) {
          return layoutConfig;
       }
       e.d(e.d, "LiveStage", "[LayoutConfig] "+"[LayoutConfigStrategy] "+this+" biz is different, NO LAYOUT", null, 4, null);
       return null;
    }
    public String toString(){
       return "PREFER_SIGNAL";
    }
}
