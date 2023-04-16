package com.kwai.slide.play.detail.base.BasePage$v;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import jq7.m;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import qp7.t0;
import qp7.w0;
import qp7.b;

public final class BasePage$v implements Runnable	// class@001791
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage h;

    public void BasePage$v(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BasePage$v.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       BasePage$v th = this.h;
       RelativeLayout relativeLayo = th.V();
       a.m(relativeLayo);
       th.U0(new m(relativeLayo));
       m om = this.h.f0();
       if (om != null) {
          om.k(this.h.U());
       }
       om = this.h.f0();
       if (om != null) {
          om.i();
       }
       om = this.h.f0();
       if (om != null) {
          om.c(this.h.g0());
       }
       return;
    }
}
