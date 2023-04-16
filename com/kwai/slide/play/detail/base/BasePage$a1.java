package com.kwai.slide.play.detail.base.BasePage$a1;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import lq7.b;
import qrd.l1;

public final class BasePage$a1 implements Runnable	// class@00172a
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage h;
    public final l i;

    public void BasePage$a1(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage p6,l p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$a1.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       b uob = this.h.C();
       if (uob != null) {
          this.i.invoke(uob);
       }
       return;
    }
}
