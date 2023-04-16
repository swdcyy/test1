package com.kwai.slide.play.detail.base.BasePage$k;
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
import ys7.a;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;
import java.util.List;

public final class BasePage$k implements Runnable	// class@001770
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage h;

    public void BasePage$k(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage p6){
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
       if (PatchProxy.applyVoid(null, this, BasePage$k.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.h.k0().v(this.h.U());
       RelativeLayout relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.k0().l(relativeLayo);
       BasePage$k th = this.h;
       this.h.k0().a(th.m0(th.U()));
       return;
    }
}
