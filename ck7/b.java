package ck7.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import r97.p$a;
import r97.p;
import r97.o$a;
import r97.o;
import c97.d;
import r97.a0;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;

public final class b	// class@000569
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "3")) {
          return;
       }
       a.p(p0, "key");
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       uod.g().H(p.builder().d(o.builder().i("POI_SDK").h(0x3f800000).b()).b(String.valueOf(15)).e(p0).f(p1).c());
       return;
    }
    public static final void b(String p0,String p1,String p2,String p3,boolean p4,int p5,long p6,long p7){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Integer.valueOf(p5),Long.valueOf(p6),Long.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, uob, "2")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       if (p0 != null) {
          oi3.d("biz", p0);
       }
       if (p1 != null) {
          oi3.d("subBiz", p1);
       }
       oi3.d("type", p2);
       if (p3 != null) {
          oi3.d("feature", p3);
       }
       p0 = (p4)? "TRUE": "FALSE";
       oi3.d("result", p0);
       oi3.c("errCode", Integer.valueOf(p5));
       oi3.c("duration", Long.valueOf(p6));
       oi3.c("gdServerDuration", Long.valueOf(p7));
       b.a("KS_POI_REQUEST_RESULT", oi3.e());
       return;
    }
    public static final void c(String p0,String p1,String p2,String p3,int p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uob, "1")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       if (p0 != null) {
          oi3.d("biz", p0);
       }
       if (p1 != null) {
          oi3.d("subBiz", p1);
       }
       if (p2 != null) {
          oi3.d("type", p2);
       }
       if (p3 != null) {
          oi3.d("feature", p3);
       }
       oi3.c("errCode", Integer.valueOf(p4));
       b.a("KS_POI_REQUEST_START", oi3.e());
       return;
    }
}
