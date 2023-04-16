package com.yxcorp.gifshow.widget.ViewPagerRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import tyc.s5;
import t36.f$a;
import t36.f;

public class ViewPagerRecyclerView$a extends RecyclerView$r	// class@0018e6
{
    public int a;
    public final ViewPagerRecyclerView b;

    public void ViewPagerRecyclerView$a(ViewPagerRecyclerView p0){
       this.b = p0;
       super();
       this.a = -1;
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(ViewPagerRecyclerView$a.class)) {
          PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ViewPagerRecyclerView$a.class, "1");
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(ViewPagerRecyclerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ViewPagerRecyclerView$a.class, "2")) {
          return;
       }
       int currentPosit = this.b.getCurrentPosition();
       if (currentPosit >= 0 && currentPosit != this.a) {
          this.b.e.s0(new s5(currentPosit));
          this.a = currentPosit;
       }
       return;
    }
}
