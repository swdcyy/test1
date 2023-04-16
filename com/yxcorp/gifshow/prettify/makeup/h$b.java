package com.yxcorp.gifshow.prettify.makeup.h$b;
import h1c.b;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import f1c.o;
import java.lang.Runnable;
import ekd.k1;

public class h$b implements b	// class@00117d
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void a(a p0,int p1){
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, h$b.class, "1")) {
          return;
       }
       k1.o(new o(this));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       this.a.p2();
       return;
    }
}
