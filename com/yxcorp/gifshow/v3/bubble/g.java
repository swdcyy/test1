package com.yxcorp.gifshow.v3.bubble.g;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.bubble.d;
import com.yxcorp.gifshow.bubble.b;
import brd.g;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import poc.u;
import java.lang.Runnable;
import ekd.k1;

public class g extends RecyclerView$r	// class@000d36
{
    public final int a;
    public final b b;
    public final g c;
    public final d d;

    public void g(d p0,int p1,b p2,g p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(RecyclerView p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       k1.o(new u(p0, this.a, this.b, this.c));
       p0.removeOnScrollListener(this);
       return;
    }
}
