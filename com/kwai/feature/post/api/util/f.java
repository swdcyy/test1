package com.kwai.feature.post.api.util.f;
import r26.e;
import q46.r;
import java.lang.Object;
import r26.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import q46.p;
import erd.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.postwork.PostStatus;
import q46.q;

public class f implements e	// class@001462
{
    public final r b;

    public void f(r p0){
       this.b = p0;
       super();
    }
    public void V4(float p0,a p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uof, "3")) {
          return;
       }
       this.a(new p(p0, p1));
       return;
    }
    public final void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.a).iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          try{
             p0.accept(uoe);
          }catch(java.lang.Exception e1){
             PostUtils.D("PostService", "forEach", e1);
             goto label_0018 ;
          }
       }
       return;
    }
    public void w9(PostStatus p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       this.a(new q(p0, p1));
       return;
    }
}
