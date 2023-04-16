package com.kwai.slide.play.detail.base.BasePage$createGroup$18$a;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$18;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import zs7.b;
import com.kwai.slide.play.detail.base.BasePage;
import kotlin.jvm.internal.a;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;

public final class BasePage$createGroup$18$a implements Runnable	// class@001748
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage$createGroup$18 h;
    public final List i;

    public void BasePage$createGroup$18$a(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage$createGroup$18 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$18$a.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.h.this$0.V0(new b());
       b uob = this.h.this$0.o0();
       a.m(uob);
       uob.v(this.h.this$0.U());
       uob = this.h.this$0.o0();
       a.m(uob);
       RelativeLayout relativeLayo = this.h.this$0.V();
       a.m(relativeLayo);
       uob.l(relativeLayo);
       uob = this.h.this$0.o0();
       a.m(uob);
       uob.a(this.i);
       return;
    }
}
