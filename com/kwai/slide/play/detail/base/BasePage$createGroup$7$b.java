package com.kwai.slide.play.detail.base.BasePage$createGroup$7$b;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$7;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import lq7.b;
import qp7.t0;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.e;
import android.widget.RelativeLayout;
import qrd.l1;

public final class BasePage$createGroup$7$b implements Runnable	// class@001752
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage$createGroup$7 h;
    public final List i;

    public void BasePage$createGroup$7$b(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage$createGroup$7 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$7$b.class, "1")) {
          return;
       }
       Object obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       b uob = new b();
       uob.v(this.h.this$0.U());
       RelativeLayout relativeLayo = this.h.this$0.V();
       a.m(relativeLayo);
       uob.l(relativeLayo);
       uob.a(this.i);
       this.h.this$0.L0(uob);
       return;
    }
}
