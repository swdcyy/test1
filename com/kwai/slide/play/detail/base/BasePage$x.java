package com.kwai.slide.play.detail.base.BasePage$x;
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
import xq7.a;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;
import hs7.c;

public final class BasePage$x implements Runnable	// class@001795
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage h;

    public void BasePage$x(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage p6){
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
       if (PatchProxy.applyVoid(null, this, BasePage$x.class, "1")) {
          return;
       }
       Object obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       this.h.N().v(this.h.U());
       RelativeLayout relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.N().l(relativeLayo);
       this.h.N().a(this.h.O());
       this.h.c0().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.c0().l(relativeLayo);
       this.h.c0().a(this.h.d0());
       return;
    }
}