package com.kwai.slide.play.detail.base.BasePage$createGroup$7$a;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$7;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import lq7.b;
import qp7.t0;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.e;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class BasePage$createGroup$7$a implements Runnable	// class@001751
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage$createGroup$7 h;
    public final List i;

    public void BasePage$createGroup$7$a(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage$createGroup$7 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$7$a.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       b uob = new b();
       uob.v(this.h.this$0.U());
       RelativeLayout relativeLayo = this.h.this$0.V();
       a.m(relativeLayo);
       uob.l(relativeLayo);
       uob.a(this.i);
       this.h.this$0.L0(uob);
       return;
    }
}
