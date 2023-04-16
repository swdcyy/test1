package com.kwai.slide.play.detail.base.BasePage$createGroup$18$b;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$18;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import zs7.b;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;

public final class BasePage$createGroup$18$b implements Runnable	// class@001749
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage$createGroup$18 h;
    public final List i;

    public void BasePage$createGroup$18$b(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage$createGroup$18 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$18$b.class, "1")) {
          return;
       }
       b obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       this.h.this$0.V0(new b());
       obj = this.h.this$0.o0();
       a.m(obj);
       obj.v(this.h.this$0.U());
       obj = this.h.this$0.o0();
       a.m(obj);
       RelativeLayout relativeLayo = this.h.this$0.V();
       a.m(relativeLayo);
       obj.l(relativeLayo);
       obj = this.h.this$0.o0();
       a.m(obj);
       obj.a(this.i);
       return;
    }
}
