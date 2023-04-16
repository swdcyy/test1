package com.yxcorp.gifshow.autoplay.presenter.d$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.autoplay.presenter.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import u99.c;

public class d$a extends RecyclerView$r	// class@001c29
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d$a.class, "1")) {
          return;
       }
       if (!p1) {
          p0.J = 0;
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$a.class, "2")) {
          return;
       }
       d$a ta = this.a;
       ta.J = ta.J + p2;
       if (p2 || p0.getScrollState()) {
          d$a ta1 = this.a;
          d x = ta1.x;
          int i = (ta1.J > null)? 10: 11;
          x.b(i);
       }
       return;
    }
}
