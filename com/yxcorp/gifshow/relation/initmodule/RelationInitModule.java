package com.yxcorp.gifshow.relation.initmodule.RelationInitModule;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.relation.initmodule.RelationInitModule$b;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.initmodule.RelationInitModule$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.relation.initmodule.RelationInitModule$c;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class RelationInitModule extends a	// class@0018dc
{
    public final RelationInitModule$b q;

    public void RelationInitModule(){
       super();
       this.q = new RelationInitModule$b(this);
    }
    public int f0(){
       return 13;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelationInitModule.class, "3")) {
          return;
       }
       ActivityContext.i(this.q);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, RelationInitModule.class, "1")) {
          return;
       }
       RxBus.f.f(l.class).observeOn(d.c).subscribe(new RelationInitModule$a(this));
       return;
    }
    public final void onLoginEvent(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelationInitModule.class, "2")) {
          return;
       }
       c.k(RelationInitModule$c.b);
       return;
    }
}
