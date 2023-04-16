package com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$b;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseLongArray;
import java.lang.String;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import qp7.b;
import java.util.List;
import java.util.Iterator;
import qp7.b1;

public final class DispatchBaseElement$b implements Runnable	// class@0017ad
{
    public final v b;
    public final SparseLongArray c;
    public final String d;
    public final DispatchBaseElement e;

    public void DispatchBaseElement$b(v p0,SparseLongArray p1,String p2,DispatchBaseElement p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement$b.class, "1")) {
          return;
       }
       this.c.delete(this.b.getStage());
       this.e.U(true);
       Iterator iterator = this.e.F().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(true);
       }
       return;
    }
}
