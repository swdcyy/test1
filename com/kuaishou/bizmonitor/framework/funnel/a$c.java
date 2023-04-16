package com.kuaishou.bizmonitor.framework.funnel.a$c;
import on.h;
import java.lang.Comparable;
import com.kuaishou.bizmonitor.framework.funnel.a;
import mu.b;
import com.kuaishou.bizmonitor.framework.funnel.a$e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.google.gson.JsonObject;
import on.i;
import mu.h;
import com.kuaishou.bizmonitor.framework.funnel.a$f;
import java.util.ArrayList;
import java.lang.Number;
import com.google.gson.JsonElement;

public class a$c implements h, Comparable	// class@001146
{
    public final b b;
    public final a$e c;
    public final a d;

    public void a$c(a p0,b p1,a$e p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public Object a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("_id").equals(p0)) {
          return this.c.d;
       }
       if (("_createTime").equals(p0)) {
          return Long.valueOf(this.c.f);
       }
       return i.a(this.b.toJson(), p0);
    }
    public boolean b(){
       return true;
    }
    public void c(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "3")) {
          return;
       }
       a$c tb = this.b;
       if (tb instanceof h) {
          i.c(tb.a, p0, p1);
       }else if(p0 != null && p0.length() > 0){
          a$f uof = new a$f();
          uof.a = p0;
          uof.b = p1;
          a$c tc = this.c;
          if (tc.i == null) {
             tc.i = new ArrayList();
          }
          this.c.i.add(uof);
       }
       return;
    }
    public int compareTo(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): Long.compare(p0.c.f, this.c.f);
       return i;
    }
    public String toString(){
       JsonObject obj = PatchProxy.apply(null, this, a$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.toJson();
       if (obj != null) {
          return obj.toString();
       }
       return this.b.toString();
    }
}
