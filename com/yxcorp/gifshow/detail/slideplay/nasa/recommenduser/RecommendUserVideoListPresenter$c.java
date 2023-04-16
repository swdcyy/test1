package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public class RecommendUserVideoListPresenter$c extends RecyclerView$r	// class@001757
{
    public final RecommendUserVideoListPresenter a;

    public void RecommendUserVideoListPresenter$c(RecommendUserVideoListPresenter p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport2(RecommendUserVideoListPresenter$c.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, RecommendUserVideoListPresenter$c.class, "1")) {
          return;
       }
       RecommendUserVideoListPresenter$c ta = this.a;
       if (ta.J == null) {
          ta.J = p0.getLayoutManager();
          RecommendUserVideoListPresenter$c ta1 = this.a;
          ta1.I = ta1.J.getItemCount();
       }
       int i = this.a.J.E();
       if (p1 == 1) {
          RecommendUserVideoListPresenter$c ta2 = this.a;
          if (i == (ta2.I - 1)) {
             RecommendUserVideoListPresenter f = ta2.F;
          }
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$c.class, "1");
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport2(RecommendUserVideoListPresenter$c.class, "2") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RecommendUserVideoListPresenter$c.class, "2")) {
          return;
       }
       RecommendUserVideoListPresenter$c ta = this.a;
       boolean b = (p1 > 0)? true: false;
       ta.F = b;
       if (ta.J == null) {
          ta.J = p0.getLayoutManager();
       }
       RecommendUserVideoListPresenter$c ta1 = this.a;
       RecommendUserVideoListPresenter j = ta1.J;
       if (j != null) {
          if (ta1.I == null) {
             ta1.I = j.getItemCount();
          }
          this.a.R8();
          ta1 = this.a;
          ta1.P8(ta1.J.i0(), this.a.J.c());
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$c.class, "2");
       return;
    }
}
