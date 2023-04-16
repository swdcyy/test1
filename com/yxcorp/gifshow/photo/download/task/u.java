package com.yxcorp.gifshow.photo.download.task.u;
import com.yxcorp.gifshow.video.c$c;
import com.yxcorp.gifshow.photo.download.task.v;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.video.c$e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ixb.v0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Double;
import ixb.u0;
import exc.j;
import com.yxcorp.gifshow.video.c$f;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import qkd.a;
import ixb.s0;
import ixb.t0;

public class u implements c$c	// class@000f1a
{
    public final File a;
    public final v b;

    public void u(v p0,File p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(c$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "3")) {
          return;
       }
       k1.o(new v0(this, p0));
       return;
    }
    public void b(c$e p0,double p1){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, u.class, "2")) {
          return;
       }
       k1.o(new u0(this, p1));
       return;
    }
    public void d(c$e p0,double p1){
       j.a(this, p0, p1);
    }
    public void e(c$e p0,c$f[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u.class, "1")) {
          return;
       }
       u tb = this.b;
       a.d(tb.c, this.a, tb.b.getVideoDuration());
       k1.o(new s0(this));
       return;
    }
    public void f(c$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "4")) {
          return;
       }
       k1.o(new t0(this));
       return;
    }
}
