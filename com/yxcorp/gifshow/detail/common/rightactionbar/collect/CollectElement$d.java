package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$d;
import fr6.e;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import wq6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import js7.o;

public final class CollectElement$d implements e	// class@001497
{
    public final CollectElement a;

    public void CollectElement$d(CollectElement p0){
       this.a = p0;
       super();
    }
    public void a(h p0,float p1,int p2){
       if (PatchProxy.isSupport(CollectElement$d.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, CollectElement$d.class, "1")) {
          return;
       }
       a.p(p0, "interactiveTab");
       boolean b = true;
       p0 = p1 - 0x3f800000;
       if (p0) {
          this.a.E().j(b);
       }
       o oo = this.a.E();
       if (p0) {
          b = false;
       }
       oo.i(b);
       return;
    }
}
