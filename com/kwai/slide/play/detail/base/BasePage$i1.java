package com.kwai.slide.play.detail.base.BasePage$i1;
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
import fq7.e;
import bs7.a;
import ys7.a;
import dq7.a;
import sp7.b;
import fq7.b;
import ds7.b;
import qrd.l1;
import sq7.a;
import jq7.m;
import tr7.a;
import pq7.a;
import lq7.b;
import zs7.b;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import bq7.c;

public final class BasePage$i1 implements Runnable	// class@001769
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage h;
    public final l i;
    public final l j;

    public void BasePage$i1(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage p6,l p7,l p8){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       super();
    }
    public final void run(){
       l1 ol1;
       if (PatchProxy.applyVoid(null, this, BasePage$i1.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.i.invoke(this.h.i0());
       this.i.invoke(this.h.P());
       this.i.invoke(this.h.k0());
       this.i.invoke(this.h.A());
       this.i.invoke(this.h.v());
       this.i.invoke(this.h.W());
       b uob = this.h.S();
       if (uob != null) {
          ol1 = this.j.invoke(uob);
       }
       a uoa = this.h.I();
       if (uoa != null) {
          ol1 = this.j.invoke(uoa);
       }
       m om = this.h.f0();
       if (om != null) {
          ol1 = this.j.invoke(om);
       }
       this.i.invoke(this.h.M());
       uoa = this.h.F();
       if (uoa != null) {
          ol1 = this.j.invoke(uoa);
       }
       uob = this.h.C();
       if (uob != null) {
          ol1 = this.i.invoke(uob);
       }
       uob = this.h.o0();
       if (uob != null) {
          ol1 = this.i.invoke(uob);
       }
       PlcStrongGroup plcStrongGro = this.h.Y();
       if (plcStrongGro != null) {
          ol1 = this.i.invoke(plcStrongGro);
       }
       c uoc = this.h.x();
       if (uoc != null) {
          this.i.invoke(uoc);
       }
       return;
    }
}
