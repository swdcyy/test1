package com.kwai.slide.play.detail.base.BasePage$r;
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
import hs7.c;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.List;

public final class BasePage$r implements Runnable	// class@001785
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage h;

    public void BasePage$r(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage p6){
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
       if (PatchProxy.applyVoid(null, this, BasePage$r.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.h.c0().v(this.h.U());
       RelativeLayout relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.c0().l(relativeLayo);
       this.h.c0().a(this.h.d0());
       return;
    }
}
