package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.SwipeLayout;
import uw9.o;
import q87.c;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m;
import java.lang.Exception;

public class RecommendUserVideoListPresenter$a extends a	// class@001755
{
    public final RecommendUserVideoListPresenter b;

    public void RecommendUserVideoListPresenter$a(RecommendUserVideoListPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserVideoListPresenter$a.class, "2")) {
          return;
       }
       boolean b = false;
       this.b.C = b;
       RecommendUserVideoListPresenter$a tb = this.b;
       RecommendUserVideoListPresenter p = tb.p;
       if (p != null) {
          p.l(tb.v);
       }
       Object[] objArray = new Object[b];
       o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserVideoListPresenter] becomesDetachedOnPageSelected", objArray);
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$a.class, "2");
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RecommendUserVideoListPresenter$a.class, "1")) {
          return;
       }
       boolean b = true;
       this.b.C = b;
       RecommendUserVideoListPresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       RecommendUserVideoListPresenter recommendUse = RecommendUserVideoListPresenter.class;
       if (!PatchProxy.applyVoidWithListener(objArray, tb, recommendUse, "13")) {
          try{
             tb.R8();
             RecommendUserVideoListPresenter p = tb.p;
             if (p != null) {
                p.a(tb.v);
             label_002e :
                p = tb.J;
                if (p != null) {
                   int i = p.i0();
                   int i1 = tb.J.c();
                   if (i <= i1) {
                      int i2 = -1;
                      if (i != i2 && i1 != i2) {
                         for (i2 = 0; i2 < tb.t.getItemCount(); i2 = i2 + 1) {
                            if (tb.H == null) {
                               tb.R8();
                            }
                            tb.H[i2] = 0;
                         }
                         if (i <= 0) {
                            i = 1;
                         }
                         if (i1 >= (tb.t.getItemCount() - b)) {
                            i1 = tb.t.getItemCount() - b;
                         }
                         if (i >= i1) {
                            PatchProxy.onMethodExit(recommendUse, "13");
                         }else {
                            tb.P8(i, i1);
                         }
                      }
                   }
                   PatchProxy.onMethodExit(recommendUse, "13");
                }
             }else {
                goto label_002e ;
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          PatchProxy.onMethodExit(recommendUse, "13");
       }
       Object[] objArray1 = new Object[0];
       o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserVideoListPresenter] becomesAttachedOnPageSelected", objArray1);
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$a.class, "1");
       return;
    }
}
