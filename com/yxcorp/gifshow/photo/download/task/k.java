package com.yxcorp.gifshow.photo.download.task.k;
import com.yxcorp.gifshow.video.c$c;
import com.yxcorp.gifshow.photo.download.task.f;
import com.yxcorp.gifshow.video.d$b;
import brd.v;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import com.yxcorp.gifshow.video.c$e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.task.b;
import nxc.d;
import fxb.d;
import hxc.a;
import com.yxcorp.gifshow.video.c$g;
import java.lang.Throwable;
import jxb.i;
import brd.g;
import java.lang.Double;
import ixb.m;
import java.lang.Runnable;
import ekd.k1;
import exc.j;
import com.yxcorp.gifshow.video.c$f;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import z1.e;
import ixb.l;

public class k implements c$c	// class@000f05
{
    public final d$b a;
    public final v b;
    public final VideoContext c;
    public final float d;
    public final f e;

    public void k(f p0,d$b p1,v p2,VideoContext p3,float p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(c$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       b.h.g(this.a.a());
       b.h.e(this.a.b());
       this.b.onError(i.g(p0.getError().message(), p0.getError().a()));
       return;
    }
    public void b(c$e p0,double p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, ok, "2")) {
          return;
       }
       k1.o(new m(this, this.d, p1));
       return;
    }
    public void d(c$e p0,double p1){
       j.a(this, p0, p1);
    }
    public void e(c$e p0,c$f[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       b.h.g(this.a.a());
       b.h.e(this.a.b());
       k te = this.e;
       te.e.mLocalFile = te.j;
       this.b.onNext(new e(p0.getFilePath(), this.c));
       return;
    }
    public void f(c$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       b.h.g(this.a.a());
       b.h.e(this.a.b());
       k1.o(new l(this));
       return;
    }
}
