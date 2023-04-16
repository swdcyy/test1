package com.kuaishou.pagedy.manager.DynamicPageCenter$a$b;
import erd.g;
import com.kuaishou.pagedy.manager.DynamicPageCenter$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import su.g;
import java.lang.StringBuilder;
import java.util.Map;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import nv.c;
import com.kuaishou.pagedy.PageDy;
import java.lang.System;
import oo4.c;
import co4.d;

public class DynamicPageCenter$a$b implements g	// class@000a89
{
    public final DynamicPageCenter$a b;

    public void DynamicPageCenter$a$b(DynamicPageCenter$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter$a$b.class, "1")) {
       }else {
          DynamicPageCenter$a$b tb = this.b;
          DynamicPageCenter$a c = tb.c;
          String str = (tb.a.t != null)? "COMPONENT_DATA_MAIN_REQUEST_STEP_4": "COMPONENT_DATA_OTHER_REQUEST_STEP_4";
          c.b(str, "«Î«Û ß∞‹:"+this.b.a.q, p0, null);
          c.f("PageDy net error"+p0.getMessage());
          if (this.b.a.t != null) {
             PageDy.e().g.b(System.currentTimeMillis());
          }
          tb = this.b;
          tb.c.u(tb.b, tb.a, p0);
       }
       return;
    }
}
