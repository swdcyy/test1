package com.kwai.slide.play.detail.base.BasePage$e;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import qp7.b;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import pq7.a;
import android.widget.RelativeLayout;
import qp7.t0;
import qp7.w0;

public final class BasePage$e implements Runnable	// class@00175e
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final b h;
    public final BasePage i;

    public void BasePage$e(v p0,SparseArray p1,int p2,String p3,int p4,String p5,b p6,BasePage p7){
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
       if (PatchProxy.applyVoidWithListener(null, this, BasePage$e.class, "1")) {
          return;
       }
       BasePage$e obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       obj = this.i;
       RelativeLayout relativeLayo = obj.V();
       a.m(relativeLayo);
       obj.M0(new a(relativeLayo));
       a uoa = this.i.F();
       a.m(uoa);
       uoa.k(this.i.U());
       uoa = this.i.F();
       a.m(uoa);
       uoa.i();
       uoa = this.i.F();
       a.m(uoa);
       uoa.c(this.h);
       PatchProxy.onMethodExit(BasePage$e.class, "1");
       return;
    }
}
