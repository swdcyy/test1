package com.kuaishou.live.livestage.e;
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
import fe3.a;
import java.util.List;

public final class e implements e	// class@000be7
{

    public void e(){
       super();
    }
    public LayoutConfig a(b p0,LayoutConfig p1,LayoutConfig p2){
       LayoutConfig this;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       LayoutConfig layoutConfig = p2;
       StringBuilder obj3 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a.p(obj1, "currentBiz");
       a.p(obj2, "fromSignal");
       obj3 = null;
       String str = "[LayoutConfigStrategy] ";
       String str1 = "[LayoutConfig] ";
       if (layoutConfig) {
          this = c.a(layoutConfig, obj1);
          if (this != null) {
             return this;
          }
          e this1 = e.d;
          e.d(this1, "LiveStage", str1+str+obj+" biz is different", null, 4, null);
          if (a.g(obj1, p1.b()) && (a.g(p1.d(), p2.d()) && a.g(p1.e(), p2.e()))) {
             e.d(this1, "LiveStage", str1+str+obj+" layoutConfig match, use signal", null, 4, null);
             return obj2;
          }else {
             e.d(this1, "LiveStage", str1+str+obj+" NO layout", null, 4, null);
             return obj3;
          }
       }else {
          e.d(e.d, "LiveStage", str1+str+obj+" NO LiveStream LAYOUT", null, 4, null);
          return obj3;
       }
    }
    public String toString(){
       return "PREFER_STREAM_LAYOUT";
    }
}
