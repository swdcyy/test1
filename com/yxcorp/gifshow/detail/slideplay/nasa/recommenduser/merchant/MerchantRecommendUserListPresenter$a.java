package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import java.util.Objects;

public class MerchantRecommendUserListPresenter$a extends a	// class@001787
{
    public final MerchantRecommendUserListPresenter b;

    public void MerchantRecommendUserListPresenter$a(MerchantRecommendUserListPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenter$a.class, "2")) {
          return;
       }
       this.b.w = false;
       Object[] objArray = new Object[false];
       o.C().w("MERCHANT_RECOMMEND_USER", "[RecommendUserCardListPresenter] becomesDetachedOnPageSelected", objArray);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenter$a.class, "2");
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenter$a.class, "1")) {
          return;
       }
       this.b.w = true;
       Objects.requireNonNull(this.b);
       Object[] objArray = new Object[0];
       o.C().w("MERCHANT_RECOMMEND_USER", "[RecommendUserCardListPresenter] becomesAttachedOnPageSelected", objArray);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenter$a.class, "1");
       return;
    }
}
