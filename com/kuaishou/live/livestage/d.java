package com.kuaishou.live.livestage.d;
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

public final class d implements e	// class@000be3
{

    public void d(){
       super();
    }
    public LayoutConfig a(b p0,LayoutConfig p1,LayoutConfig p2){
       e d;
       StringBuilder str;
       StringBuilder obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "currentBiz");
       a.p(p1, "fromSignal");
       obj = null;
       p2 = (p2 != null)? c.a(p2, p0): obj;
       if (p2 != null) {
          return p2;
       }else {
          d = e.d;
          e.d(d, "LiveStage", "[LayoutConfig] "+"[LayoutConfigStrategy] "+this+" biz is different", null, 4, null);
          LayoutConfig layoutConfig = c.a(p1, p0);
          if (layoutConfig != null) {
             e.d(d, "LiveStage", "[LayoutConfig] "+"[LayoutConfigStrategy] "+this+", fallback to signal", null, 4, null);
             return layoutConfig;
          }else {
             e.d(d, "LiveStage", "[LayoutConfig] "+"[LayoutConfigStrategy] "+this+" NO layout", null, 4, null);
             return obj;
          }
       }
    }
    public String toString(){
       return "PREFER_STREAM_FALLBACK_TO_SIGNAL";
    }
}
