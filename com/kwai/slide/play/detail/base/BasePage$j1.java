package com.kwai.slide.play.detail.base.BasePage$j1;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
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

public final class BasePage$j1 implements Runnable	// class@00176c
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage h;
    public final l i;
    public final l j;

    public void BasePage$j1(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage p6,l p7,l p8){
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
       if (PatchProxy.applyVoid(null, this, BasePage$j1.class, "1")) {
          return;
       }
       b obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       this.i.invoke(this.h.i0());
       this.i.invoke(this.h.P());
       this.i.invoke(this.h.k0());
       this.i.invoke(this.h.A());
       this.i.invoke(this.h.v());
       this.i.invoke(this.h.W());
       obj = this.h.S();
       if (obj != null) {
          ol1 = this.j.invoke(obj);
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
       obj = this.h.C();
       if (obj != null) {
          ol1 = this.i.invoke(obj);
       }
       obj = this.h.o0();
       if (obj != null) {
          ol1 = this.i.invoke(obj);
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
