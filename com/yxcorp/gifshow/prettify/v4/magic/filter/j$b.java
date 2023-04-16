package com.yxcorp.gifshow.prettify.v4.magic.filter.j$b;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import xyb.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import q87.c;
import java.util.Map;
import o1c.n;
import java.lang.Runnable;
import ekd.k1;
import o1c.o;

public class j$b implements b	// class@0011c1
{
    public final FilterConfig a;
    public final j$e b;
    public final j c;

    public void j$b(j p0,FilterConfig p1,j$e p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0,float p1){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0 != this.a.mFilterId) {
          Object[] objArray = new Object[0];
          a.D().w(j.s, "onProgress "+p0+" holder.id"+this.b.i, objArray);
          return;
       }else {
          this.c.h.put(Integer.valueOf(p0), Float.valueOf(p1));
          return;
       }
    }
    public void onComplete(int p0){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(j.s, "downloadFilterComplete: "+p0, objArray);
       k1.o(new n(this, p0, this.a, this.b));
       return;
    }
    public void onError(int p0){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(j.s, "downloadFilterError: "+p0, objArray);
       k1.o(new o(this, p0, this.a, this.b));
       return;
    }
}
