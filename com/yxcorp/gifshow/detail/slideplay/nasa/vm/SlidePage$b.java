package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$b;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

public final class SlidePage$b implements Runnable	// class@0017d3
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final SlidePage h;
    public final l i;

    public void SlidePage$b(v p0,SparseArray p1,int p2,String p3,int p4,String p5,SlidePage p6,l p7){
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
       if (PatchProxy.applyVoidWithListener(null, this, SlidePage$b.class, "1")) {
          return;
       }
       Object obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       this.h.c1();
       this.i.invoke(this.h);
       PatchProxy.onMethodExit(SlidePage$b.class, "1");
       return;
    }
}
