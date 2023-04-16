package com.kwai.slide.play.detail.information.reco.b;
import rq7.a;
import jh5.a;
import pp7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp7.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kwai.slide.play.detail.information.reco.b$a;
import com.kwai.slide.play.detail.information.reco.b$c;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.slide.play.detail.information.reco.b$d;

public class b extends a	// class@001805
{
    public a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final a k;
    public final a l;
    public final a m;
    public final a n;
    public final a o;
    public final a p;
    public final a q;
    public final a r;

    public void b(a p0){
       super();
       this.e = new a(this.d);
       this.f = new a(this.d);
       this.g = new a(this.d);
       this.h = new a(this.d);
       this.i = new a(this.d);
       this.j = new a(this.d);
       this.k = new a(this.d);
       this.l = new a(this.d);
       this.m = new a(this.d);
       this.n = new a(this.d);
       this.o = new a(this.d);
       this.p = new a(this.d);
       this.q = new a(this.d);
       this.r = new a(this.d);
       this.d = p0;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "33")) {
          return;
       }
       this.o.f(null);
       return;
    }
    public void h(ImageRequest[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "20")) {
          return;
       }
       this.i.f(p0);
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "14")) {
          return;
       }
       b$a uoa = new b$a();
       uoa.a = p0;
       uoa.b = p1;
       this.g.f(uoa);
       return;
    }
    public void j(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "26")) {
          return;
       }
       b$c uoc = new b$c();
       uoc.a = p0;
       uoc.b = p1;
       this.l.f(uoc);
       return;
    }
    public void k(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "30")) {
          return;
       }
       this.p.f(Integer.valueOf(p0));
       return;
    }
    public void l(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "7")) {
          return;
       }
       this.r.f(Boolean.valueOf(p0));
       return;
    }
    public void m(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.f.f(Boolean.valueOf(p0));
       return;
    }
    public void n(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "24")) {
          return;
       }
       this.k.f(Boolean.valueOf(p0));
       return;
    }
    public void o(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "22")) {
          return;
       }
       this.j.f(Boolean.valueOf(p0));
       return;
    }
    public void p(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "18")) {
          return;
       }
       b$d uod = new b$d();
       uod.a = p0;
       uod.b = p1;
       this.h.f(uod);
       return;
    }
}
