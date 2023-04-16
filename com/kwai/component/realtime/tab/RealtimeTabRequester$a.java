package com.kwai.component.realtime.tab.RealtimeTabRequester$a;
import jg5.d;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import jg5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.Boolean;

public final class RealtimeTabRequester$a extends d	// class@000b13
{
    public final RealtimeTabRequester b;
    public final b c;

    public void RealtimeTabRequester$a(RealtimeTabRequester p0,b p1){
       a.p(p0, "requester");
       a.p(p1, "callback");
       super(false, 1, null);
       this.b = p0;
       this.c = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester$a.class, "5")) {
          return;
       }
       this.c.a();
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$a.class, "6")) {
          return;
       }
       a.p(p0, "throwable");
       this.c.b(p0);
       this.b.E(this);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester$a.class, "4")) {
          return;
       }
       this.c.c();
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$a.class, "7")) {
          return;
       }
       a.p(p0, "response");
       this.c.d(p0);
       this.b.E(this);
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$a.class, "3")) {
          return;
       }
       a.p(p0, "t");
       this.c.e(p0);
       return;
    }
    public void f(long p0){
       RealtimeTabRequester$a uoa = RealtimeTabRequester$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.c.f(p0);
       this.b.E(this);
       return;
    }
    public void g(boolean p0){
       RealtimeTabRequester$a uoa = RealtimeTabRequester$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.c.g(p0);
       if (!p0) {
          this.b.E(this);
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester$a.class, "1")) {
          return;
       }
       this.c.h();
       return;
    }
}
