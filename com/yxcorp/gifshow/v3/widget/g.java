package com.yxcorp.gifshow.v3.widget.g;
import y8c.g;
import com.yxcorp.gifshow.v3.widget.g$b;
import com.yxcorp.gifshow.v3.widget.g$a;
import lnc.a1;
import y8c.f;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.widget.f;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class g extends g	// class@001668
{
    public int w;
    public int x;
    public final g$b y;
    public final g$a z;

    public void g(g$b p0,g$a p1){
       super();
       this.w = a1.d(0x7f07017f);
       this.x = a1.d(0x7f07017e);
       this.y = p0;
       this.z = p1;
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, g.class, "2")) {
          return;
       }
       p0.b.l = p1;
       super.g1(p0, p1, p2);
       return;
    }
    public f h1(ViewGroup p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d1116), new f(this.w, this.x, this.y, this.z));
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
