package com.kwai.slide.play.detail.base.BasePage$f1;
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
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import qrd.l1;

public final class BasePage$f1 implements Runnable	// class@001760
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage h;
    public final l i;

    public void BasePage$f1(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage p6,l p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$f1.class, "1")) {
          return;
       }
       PlcStrongGroup obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       obj = this.h.Y();
       if (obj != null) {
          this.i.invoke(obj);
       }
       return;
    }
}
