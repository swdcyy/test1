package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import java.util.Objects;
import java.util.List;
import qvb.a;
import com.kwai.framework.model.user.User;
import k6a.u;
import java.lang.Exception;

public class RecommendUserCardListPresenter$a extends a	// class@001751
{
    public final RecommendUserCardListPresenter b;

    public void RecommendUserCardListPresenter$a(RecommendUserCardListPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserCardListPresenter$a.class, "2")) {
          return;
       }
       this.b.y = false;
       Object[] objArray = new Object[false];
       o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserCardListPresenter] becomesDetachedOnPageSelected", objArray);
       PatchProxy.onMethodExit(RecommendUserCardListPresenter$a.class, "2");
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RecommendUserCardListPresenter$a.class, "1")) {
          return;
       }
       this.b.y = true;
       RecommendUserCardListPresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       RecommendUserCardListPresenter recommendUse = RecommendUserCardListPresenter.class;
       String str = "9";
       if (!PatchProxy.applyVoidWithListener(objArray, tb, recommendUse, str)) {
          RecommendUserCardListPresenter u = tb.u;
          if (u == null || u.getItems() == null) {
             PatchProxy.onMethodExit(recommendUse, str);
          }else {
             int i = 0;
             while (i < tb.u.getItems().size()) {
                try{
                   u.e(tb.u.getItems().get(i), i, 0);
                }catch(java.lang.Exception e7){
                   e7.printStackTrace();
                }
                i = i + 1;
             }
             PatchProxy.onMethodExit(recommendUse, str);
          }
       }
       Object[] objArray1 = new Object[0];
       o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserCardListPresenter] becomesAttachedOnPageSelected", objArray1);
       PatchProxy.onMethodExit(RecommendUserCardListPresenter$a.class, "1");
       return;
    }
}
