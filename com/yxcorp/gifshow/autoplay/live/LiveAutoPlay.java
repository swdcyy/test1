package com.yxcorp.gifshow.autoplay.live.LiveAutoPlay;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashSet;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$d;
import java.util.Set;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$e;

public abstract class LiveAutoPlay	// class@001bfd
{
    public final List a;
    public final Set b;
    public final List c;
    public LiveAutoPlay$b d;
    public LiveAutoPlay$e e;
    public String f;
    public String g;

    public void LiveAutoPlay(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = new HashSet();
       this.c = new CopyOnWriteArrayList();
    }
    public void a(LiveAutoPlay$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlay.class, "1")) {
          return;
       }
       if (!this.a.contains(p0)) {
          this.a.add(p0);
       }
       return;
    }
    public void b(LiveAutoPlay$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlay.class, "3")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public abstract void c();
    public abstract String d();
    public abstract boolean e();
    public abstract boolean f();
    public abstract void g();
    public void h(LiveAutoPlay$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlay.class, "2")) {
          return;
       }
       if (this.a.contains(p0)) {
          this.a.remove(p0);
       }
       return;
    }
    public void i(LiveAutoPlay$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlay.class, "4")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public abstract void j(boolean p0);
    public abstract void k(boolean p0);
    public void l(String p0,String p1){
       this.g = p0;
       this.f = p1;
    }
    public void m(LiveAutoPlay$b p0){
       this.d = p0;
    }
    public void n(LiveAutoPlay$e p0){
       this.e = p0;
    }
    public abstract void o(String p0);
    public abstract void p(boolean p0);
    public abstract void q(int p0);
    public abstract void r();
}
