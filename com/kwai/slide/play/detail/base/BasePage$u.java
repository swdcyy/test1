package com.kwai.slide.play.detail.base.BasePage$u;
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
import sq7.a;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import qp7.t0;
import qp7.w0;
import qp7.b;

public final class BasePage$u implements Runnable	// class@00178d
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage h;

    public void BasePage$u(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage p6){
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
       if (PatchProxy.applyVoid(null, this, BasePage$u.class, "1")) {
          return;
       }
       BasePage$u obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       obj = this.h;
       RelativeLayout relativeLayo = obj.V();
       a.m(relativeLayo);
       obj.N0(new a(relativeLayo));
       a uoa = this.h.I();
       if (uoa != null) {
          uoa.k(this.h.U());
       }
       uoa = this.h.I();
       if (uoa != null) {
          uoa.i();
       }
       uoa = this.h.I();
       if (uoa != null) {
          uoa.c(this.h.J());
       }
       return;
    }
}
