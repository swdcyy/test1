package com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$h;
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
import java.util.Collection;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import qp7.b1;

public final class DispatchBaseElement$h implements Runnable	// class@0017b4
{
    public final v b;
    public final SparseLongArray c;
    public final String d;
    public final DispatchBaseElement e;

    public void DispatchBaseElement$h(v p0,SparseLongArray p1,String p2,DispatchBaseElement p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement$h.class, "1")) {
          return;
       }
       this.c.delete(this.b.getStage());
       int i = 1;
       if (this.e.g0() && !this.e.J()) {
          if (this.e.F().isEmpty() ^ i) {
             Log.b("DispatchBaseElement", this.e.getClass().getSimpleName()+" discard detached");
          }
       }else {
          this.e.U(false);
          Iterator iterator = this.e.F().iterator();
          while (iterator.hasNext()) {
             iterator.next().d(i);
          }
       }
       return;
    }
}
