package com.kwai.framework.httpdns.DnsResolverInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.httpdns.a;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.kwai.framework.httpdns.b;
import com.google.gson.JsonObject;
import v66.c;
import wkd.b;
import c0d.a;
import pb6.o;
import v66.b;
import java.util.Objects;
import pb6.o$a;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DnsResolverInitModule extends a	// class@00155c
{
    public static final int q;

    public void DnsResolverInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 18;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, DnsResolverInitModule.class, "4")) {
          return;
       }
       c.c(a.b);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, DnsResolverInitModule.class, "5")) {
          return;
       }
       c.c(b.b);
       return;
    }
    public final void l0(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DnsResolverInitModule.class, "3")) {
          return;
       }
       if (p0 != null) {
          c.c(new c(p0));
       }
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DnsResolverInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, DnsResolverInitModule.class, "2")) {
          b.a(0x1a7467ca).initialize();
          this.l0(b.a(0x3d855db5).e());
          b uob = new b(this);
          o$a a = o.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(uob, a, o$a.class, "1")) {
             a.p(uob, "listener");
             o$a.a.add(uob);
          }
       }
       return;
    }
}
