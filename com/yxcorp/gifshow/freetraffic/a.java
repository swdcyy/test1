package com.yxcorp.gifshow.freetraffic.a;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import s00.a;
import s00.b$a;
import s00.b;
import s00.c;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import wkd.b;
import ka0.d;
import cjd.e;
import erd.o;
import kka.e;
import erd.g;
import kka.d;
import kka.f;

public class a	// class@001189
{
    public String a;
    public t b;

    public void a(){
       super();
    }
    public static Map b(String p0,String p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       String str = a.c();
       obj.put("iv2", str);
       obj.put("e2", c.a(b.a().a(p0), str, p1));
       return obj;
    }
    public t a(String p0,RequestTiming p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return t.just(a.b(obj, p0));
       }
       t ot = PatchProxy.applyOneRefs(p1, this, uoa, "3");
       if (ot != patchProxyRe) {
       }else {
          a tb = this.b;
          if (tb != null) {
             ot = tb.share();
          }else {
             ot = b.a(0x3480fc5d).d(p1).map(new e()).doOnNext(new e(this)).doOnError(new d(this));
             this.b = ot;
          }
       }
       return ot.flatMap(new f(this, p0));
    }
}
