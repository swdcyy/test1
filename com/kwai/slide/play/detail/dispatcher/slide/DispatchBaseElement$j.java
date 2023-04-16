package com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$j;
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
import crd.a;

public final class DispatchBaseElement$j implements Runnable	// class@0017b6
{
    public final v b;
    public final SparseLongArray c;
    public final String d;
    public final DispatchBaseElement e;

    public void DispatchBaseElement$j(v p0,SparseLongArray p1,String p2,DispatchBaseElement p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement$j.class, "1")) {
          return;
       }
       this.c.delete(this.b.getStage());
       boolean b = true;
       if (!this.e.g0() || this.e.L()) {
          this.e.X(false);
          this.e.m0(b);
          this.e.F().clear();
          this.e.w().dispose();
          this.e.V(new a());
       }
       return;
    }
}
