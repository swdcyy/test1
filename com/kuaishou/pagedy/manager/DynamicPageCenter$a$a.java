package com.kuaishou.pagedy.manager.DynamicPageCenter$a$a;
import erd.g;
import com.kuaishou.pagedy.manager.DynamicPageCenter$a;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import su.g;
import com.kuaishou.pagedy.PageDy;
import java.lang.System;
import oo4.c;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import fv.c;
import nv.d;
import nv.c;
import co4.d;
import java.lang.StringBuilder;
import java.util.Map;
import qu4.f;
import java.lang.Throwable;

public class DynamicPageCenter$a$a implements g	// class@000a88
{
    public final DynamicPageCenter$a b;

    public void DynamicPageCenter$a$a(DynamicPageCenter$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       DynamicPageCenter$a c;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter$a$a.class, "1")) {
       }else if(this.b.a.t != null){
          PageDy.e().g.b(System.currentTimeMillis());
          c = this.b.c;
          c.f(StageName.pdy_request_end, c.p, c.o);
       }
       if (p0 == null) {
          c.b(d.a(this.b.c.p, "PageDy net error response is null"));
       }
       Map map = null;
       String str = "COMPONENT_DATA_MAIN_REQUEST_STEP_4";
       String str1 = "COMPONENT_DATA_OTHER_REQUEST_STEP_4";
       if (p0 != null && p0.result == 1) {
          DynamicPageCenter$a$a tb = this.b;
          tb.c.e(tb.a, p0, tb.b);
          tb = this.b;
          DynamicPageCenter$a c1 = tb.c;
          if (tb.a.t == null) {
             str = str1;
          }
          c1.c(str, "请求成功:"+this.b.a.q, map);
          f c2 = f.c;
          DynamicPageCenter$a$a tb1 = this.b;
          DynamicPageCenter l = tb1.c.l;
          str = (tb1.a.t != null)? "主接口": "其他接口";
          c2.f(l, str, "接口数据", p0);
       }else {
          c.b(d.a(this.b.c.p, "PageDy net error result"));
          p0 = this.b;
          p0.c.u(p0.b, p0.a, new Throwable("network error"));
          p0 = this.b;
          DynamicPageCenter$a c3 = p0.c;
          if (p0.a.t == null) {
             str = str1;
          }
          c3.b(str, "请求失败:"+this.b.a.q, new Throwable("network error"), map);
       }
       return;
    }
}
