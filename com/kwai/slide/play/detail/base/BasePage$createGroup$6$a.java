package com.kwai.slide.play.detail.base.BasePage$createGroup$6$a;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$6;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;

public final class BasePage$createGroup$6$a implements Runnable	// class@00174e
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage$createGroup$6 h;
    public final List i;

    public void BasePage$createGroup$6$a(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage$createGroup$6 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$6$a.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.h.this$0.R0(new PlcStrongGroup());
       PlcStrongGroup plcStrongGro = this.h.this$0.Y();
       if (plcStrongGro != null) {
          plcStrongGro.v(this.h.this$0.U());
       }
       plcStrongGro = this.h.this$0.Y();
       if (plcStrongGro != null) {
          RelativeLayout relativeLayo = this.h.this$0.V();
          a.m(relativeLayo);
          plcStrongGro.l(relativeLayo);
       }
       plcStrongGro = this.h.this$0.Y();
       if (plcStrongGro != null) {
          plcStrongGro.a(this.i);
       }
       return;
    }
}
