package com.kwai.slide.play.detail.base.BasePage$createGroup$19$a;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$19;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import bq7.c;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;

public final class BasePage$createGroup$19$a implements Runnable	// class@00174b
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage$createGroup$19 h;
    public final List i;

    public void BasePage$createGroup$19$a(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage$createGroup$19 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$19$a.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.h.this$0.K0(new c());
       c uoc = this.h.this$0.x();
       if (uoc != null) {
          uoc.v(this.h.this$0.U());
       }
       uoc = this.h.this$0.x();
       if (uoc != null) {
          RelativeLayout relativeLayo = this.h.this$0.V();
          a.m(relativeLayo);
          uoc.l(relativeLayo);
       }
       uoc = this.h.this$0.x();
       if (uoc != null) {
          uoc.a(this.i);
       }
       return;
    }
}
