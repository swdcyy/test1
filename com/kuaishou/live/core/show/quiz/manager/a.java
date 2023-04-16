package com.kuaishou.live.core.show.quiz.manager.a;
import com.kuaishou.live.core.show.quiz.manager.a$a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.a$b;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import crd.b;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import dg2.a;
import erd.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a	// class@000e0e
{
    public boolean a;
    public boolean b;
    public Object c;
    public a$a d;
    public String e;
    public a$b f;
    public a$b g;
    public AtomicInteger h;
    public b i;

    public void a(a$a p0,boolean p1,String p2){
       super();
       this.b = false;
       this.f = new a$b(false, 1);
       this.g = new a$b(false, 1);
       this.h = new AtomicInteger(false);
       this.d = p0;
       this.a = p1;
       this.e = p2;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if (this.h.get() >= 2) {
          this.c("trigger signal : "+this.c+" atomicInteger.get\(\) = "+this.h.get());
          this.d.a(this.c);
          this.b = true;
          this.d();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.d();
       this.b = false;
       this.a = true;
       return;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceActionTrigger"), this.e+p0, "mCurrentWeights", Integer.valueOf(this.h.get()));
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       a ti = this.i;
       if (ti != null && !ti.isDisposed()) {
          this.i.dispose();
       }
       this.c = objArray;
       this.h.set(0);
       this.g.b(0);
       this.f.b(0);
       return;
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       if (this.f.a()) {
          return;
       }
       if (this.g()) {
          return;
       }
       this.c("send "+p1+" aac pulse : "+p0);
       this.f.b(true);
       this.h.incrementAndGet();
       this.a();
       return;
    }
    public void f(Object p0,long p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, a.class, "2")) {
          return;
       }
       if (this.g.a()) {
          this.c("has received signal pulse");
          return;
       }else if(this.g()){
          return;
       }else {
          this.c("sendSignalPulse  "+p2+" signal , timeout = "+p1);
          this.g.b(true);
          this.c = p0;
          this.h.incrementAndGet();
          this.i = t.timer(p1, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a(this));
          this.a();
          return;
       }
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a != null || this.b == null) {
          return false;
       }
       this.c("current trigger dont support multiple triggered, hasTriggered now, dont receive signal again");
       return true;
    }
}
