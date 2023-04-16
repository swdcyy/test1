package com.kwai.statechart.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ut7.k;
import java.util.Objects;
import ut7.e;
import com.kwai.statechart.StateChart;
import java.lang.Boolean;
import ut7.h;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public class a	// class@0018f7
{
    public final String b;
    public k c;

    public void a(String p0){
       a.p(p0, "name");
       super();
       this.b = p0;
    }
    public final Object a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, k.class, "3");
       if (obj1 == patchProxyRe) {
          k.b(obj, null, 1, null);
          obj1 = obj.f().g();
       }
       return obj1;
    }
    public final String b(){
       return this.b;
    }
    public final k c(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj;
       }
       a.S("stateNode");
       throw null;
    }
    public boolean d(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       return false;
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       a.p(p0, "param");
       a.p(p1, "reason");
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.p(p0, "reason");
       return;
    }
    public final void g(e p0){
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       String str1 = "event";
       a.p(p0, str1);
       k ok = this.c();
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoidOneRefs(p0, ok, k.class, str)) {
          a.p(p0, str1);
          k.b(ok, null, 1, null);
          if (ok.d ^ 1) {
             ok.f().m(p0);
          }else {
             throw new IllegalStateException("can\'t postEvent when state:["+ok.e().b()+"] isExiting".toString());
          }
       }
       return;
    }
}
