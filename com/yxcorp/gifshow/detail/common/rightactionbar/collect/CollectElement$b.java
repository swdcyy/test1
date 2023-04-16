package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$b;
import w4.j;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import js7.o;

public final class CollectElement$b implements j	// class@001495
{
    public final CollectElement a;

    public void CollectElement$b(CollectElement p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectElement$b.class, "1")) {
       }else {
          this.a.E().k(false, p0);
       }
       return;
    }
}
