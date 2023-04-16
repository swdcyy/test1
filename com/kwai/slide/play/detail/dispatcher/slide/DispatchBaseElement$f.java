package com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$f;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseLongArray;
import java.lang.String;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import qp7.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import qp7.b;

public final class DispatchBaseElement$f implements Runnable	// class@0017b2
{
    public final v b;
    public final SparseLongArray c;
    public final String d;
    public final DispatchBaseElement e;
    public final a f;

    public void DispatchBaseElement$f(v p0,SparseLongArray p1,String p2,DispatchBaseElement p3,a p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement$f.class, "1")) {
          return;
       }
       this.c.delete(this.b.getStage());
       this.e.P(this.f);
       return;
    }
}
