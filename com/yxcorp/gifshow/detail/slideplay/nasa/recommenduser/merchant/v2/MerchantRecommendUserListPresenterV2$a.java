package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import java.util.Objects;

public class MerchantRecommendUserListPresenterV2$a extends a	// class@001797
{
    public final MerchantRecommendUserListPresenterV2 b;

    public void MerchantRecommendUserListPresenterV2$a(MerchantRecommendUserListPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenterV2$a.class, "2")) {
          return;
       }
       this.b.x = false;
       Object[] objArray = new Object[false];
       o.C().w("MERCHANT_RECOMMEND_USER", "[RecommendUserCardListPresenter] becomesDetachedOnPageSelected", objArray);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2$a.class, "2");
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenterV2$a.class, "1")) {
          return;
       }
       this.b.x = true;
       Objects.requireNonNull(this.b);
       Object[] objArray = new Object[0];
       o.C().w("MERCHANT_RECOMMEND_USER", "[RecommendUserCardListPresenter] becomesAttachedOnPageSelected", objArray);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2$a.class, "1");
       return;
    }
}
