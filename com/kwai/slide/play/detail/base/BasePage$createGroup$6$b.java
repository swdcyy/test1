package com.kwai.slide.play.detail.base.BasePage$createGroup$6$b;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage$createGroup$6;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;

public final class BasePage$createGroup$6$b implements Runnable	// class@00174f
{
    public final v b;
    public final SparseArray c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final BasePage$createGroup$6 h;
    public final List i;

    public void BasePage$createGroup$6$b(v p0,SparseArray p1,int p2,String p3,int p4,String p5,BasePage$createGroup$6 p6,List p7){
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
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$6$b.class, "1")) {
          return;
       }
       PlcStrongGroup obj = this.c.get(this.d);
       a.m(obj);
       obj.remove(this.e);
       this.h.this$0.R0(new PlcStrongGroup());
       obj = this.h.this$0.Y();
       if (obj != null) {
          obj.v(this.h.this$0.U());
       }
       obj = this.h.this$0.Y();
       if (obj != null) {
          RelativeLayout relativeLayo = this.h.this$0.V();
          a.m(relativeLayo);
          obj.l(relativeLayo);
       }
       obj = this.h.this$0.Y();
       if (obj != null) {
          obj.a(this.i);
       }
       return;
    }
}
