package com.kwai.component.realtime.tab.RealtimeTabRequester$c;
import jg5.d;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import kg5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g8c.a;
import jg5.b;
import java.lang.Long;
import java.util.concurrent.TimeoutException;
import java.lang.Boolean;

public final class RealtimeTabRequester$c extends d	// class@000b15
{
    public final RealtimeTabRequester b;
    public final a c;

    public void RealtimeTabRequester$c(RealtimeTabRequester p0,a p1,boolean p2){
       a.p(p0, "requester");
       a.p(p1, "listener");
       super(p2);
       this.b = p0;
       this.c = p1;
    }
    public void a(){
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$c.class, "3")) {
          return;
       }
       a.p(p0, "throwable");
       this.c.a(null);
       this.b.E(this);
       return;
    }
    public void c(){
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$c.class, "4")) {
          return;
       }
       a.p(p0, "response");
       this.c.a(this.b.x());
       this.b.E(this);
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$c.class, "2")) {
          return;
       }
       a.p(p0, "t");
       return;
    }
    public void f(long p0){
       if (PatchProxy.isSupport(RealtimeTabRequester$c.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, RealtimeTabRequester$c.class, "5")) {
          return;
       }
       this.b(new TimeoutException());
       return;
    }
    public void g(boolean p0){
       RealtimeTabRequester$c uoc = RealtimeTabRequester$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (!p0) {
          this.c.a(null);
          this.b.E(this);
       }
       return;
    }
    public void h(){
    }
}
