package com.kuaishou.bowl.core.live.b$e$a;
import tu.h;
import com.kuaishou.bowl.core.live.b$e;
import java.util.List;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nv.c;
import su.g;
import com.kuaishou.bowl.core.live.BusinessDataSource;
import com.kuaishou.bowl.core.live.b;
import cv.m;
import java.lang.Long;
import vu.a;
import java.lang.StringBuilder;
import java.lang.Exception;

public class b$e$a implements h	// class@0011ac
{
    public final List a;
    public final b$e b;

    public void b$e$a(b$e p0,List p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e$a.class, "1")) {
          return;
       }
       if (p0 == null || !p0.size()) {
          c.f("LiveApi-onBackToPage match finish, failed size 0");
          return;
       }else {
          c.f("LiveApi-onBackToPage tryDispatchBusinessCallback");
          b$e$a tb = this.b;
          g d = tb.b.d;
          tb.e.x(d, "onBackToPage", "购后返回", p0, BusinessDataSource.BACK_PAGE);
          if (this.b.d != null) {
             int i = 0;
             if (this.a.get(i) != null) {
                Map map = null;
                try{
                   if (p0.containsKey(Long.valueOf(Long.parseLong(this.a.get(i).m)))) {
                      this.b.e.q(d, "购后返回", "resource success", map);
                      this.b.d.a();
                   }else {
                      this.b.e.q(d, "购后返回", "resource no data", map);
                      this.b.d.b();
                   }
                }catch(java.lang.Exception e10){
                   this.b.e.q(d, "购后返回", "parse material error: "+e10.getMessage(), map);
                   this.b.d.b();
                }
             }
          }
       }
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e$a.class, "2")) {
          return;
       }
       c.f("LiveApi-onBackToPage match failed: "+p0);
       b$e d = this.b.d;
       if (d != null) {
          d.b();
       }
       return;
    }
}
