package com.kuaishou.live.livestage.c;
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

public final class c implements e	// class@000be2
{

    public void c(){
       super();
    }
    public LayoutConfig a(b p0,LayoutConfig p1,LayoutConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "currentBiz");
       a.p(p1, "fromSignal");
       LayoutConfig layoutConfig = (p2 != null)? c.a(p2, p0): null;
       if (layoutConfig != null) {
          return layoutConfig;
       }else {
          e.d(e.d, "LiveStage", "[LayoutConfig] "+"[LayoutConfigStrategy] "+this+" biz is different, NO LAYOUT", null, 4, null);
          return null;
       }
    }
    public String toString(){
       return "PREFER_STREAM";
    }
}
