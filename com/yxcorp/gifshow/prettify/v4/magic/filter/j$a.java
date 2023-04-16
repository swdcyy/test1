package com.yxcorp.gifshow.prettify.v4.magic.filter.j$a;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import o1c.k;
import erd.o;
import o1c.m;
import java.lang.Runnable;
import ekd.k1;
import o1c.l;

public class j$a implements b	// class@0011c0
{
    public final j$c a;
    public final j b;

    public void j$a(j p0,j$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,float p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 != this.a.i) {
          Object[] objArray = new Object[0];
          a.D().w(j.s, "onProgress "+p0+" holder.id"+this.a.i, objArray);
          return;
       }else {
          this.b.h.put(Integer.valueOf(p0), Float.valueOf(p1));
          this.b.X0(p0, new k(p1));
          return;
       }
    }
    public void onComplete(int p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       k1.o(new m(this, p0, this.a));
       return;
    }
    public void onError(int p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       k1.o(new l(this, p0, this.a));
       return;
    }
}
