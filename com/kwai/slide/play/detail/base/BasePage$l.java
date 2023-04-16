package com.kwai.slide.play.detail.base.BasePage$l;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import ys7.a;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import java.util.List;

public final class BasePage$l implements Runnable	// class@001773
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage h;

    public void BasePage$l(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BasePage$l.class, "1")) {
          return;
       }
       Object obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       this.h.k0().v(this.h.U());
       RelativeLayout relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.k0().l(relativeLayo);
       BasePage$l th = this.h;
       this.h.k0().a(th.m0(th.U()));
       return;
    }
}
