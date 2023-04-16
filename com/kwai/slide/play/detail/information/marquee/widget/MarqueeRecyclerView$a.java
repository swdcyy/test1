package com.kwai.slide.play.detail.information.marquee.widget.MarqueeRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.slide.play.detail.information.marquee.widget.MarqueeRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.slide.play.detail.information.marquee.widget.c;
import l17.a;
import jr7.b;
import java.lang.Math;

public class MarqueeRecyclerView$a extends RecyclerView$r	// class@0017f1
{
    public final MarqueeRecyclerView a;

    public void MarqueeRecyclerView$a(MarqueeRecyclerView p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       MarqueeRecyclerView d;
       if (PatchProxy.isSupport(MarqueeRecyclerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MarqueeRecyclerView$a.class, "1")) {
          return;
       }
       if (p2 > 0) {
          MarqueeRecyclerView$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, MarqueeRecyclerView.class, "5") && ta.getLayoutManager() instanceof LinearLayoutManager) {
             RecyclerView$Adapter adapter = ta.getAdapter();
             if (adapter instanceof c) {
                if (ta.c == null) {
                   ta.c = a.a(ta);
                }
                p2 = ta.c.e();
                if (p2 >= (adapter.getItemCount() - 8)) {
                   d = ta.d;
                   if (d != null) {
                      d.e();
                   }
                }
                if (p2 >= (adapter.getItemCount() - 1)) {
                   d = ta.d;
                   if (d != null) {
                      d.a();
                   }
                }
                if (!adapter.f0(p2)) {
                   p2 = 0;
                }else if(ta.e != null){
                   p2 = p2 - 2;
                }
                MarqueeRecyclerView d1 = ta.d;
                if (d1 != null) {
                   d1.c(Math.max(0, p2));
                }
             }
          }
       }
       return;
    }
}
