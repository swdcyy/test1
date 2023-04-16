package com.kwai.slide.play.detail.base.BasePage$d;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import qp7.b;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import pq7.a;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;
import qp7.t0;
import qp7.w0;

public final class BasePage$d implements Runnable	// class@001756
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final b h;
    public final BasePage i;

    public void BasePage$d(v p0,SparseArray p1,String p2,long p3,String p4,int p5,b p6,BasePage p7){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, BasePage$d.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       BasePage$d ti = this.i;
       RelativeLayout relativeLayo = ti.V();
       a.m(relativeLayo);
       ti.M0(new a(relativeLayo));
       a uoa = this.i.F();
       a.m(uoa);
       uoa.k(this.i.U());
       uoa = this.i.F();
       a.m(uoa);
       uoa.i();
       uoa = this.i.F();
       a.m(uoa);
       uoa.c(this.h);
       PatchProxy.onMethodExit(BasePage$d.class, "1");
       return;
    }
}
