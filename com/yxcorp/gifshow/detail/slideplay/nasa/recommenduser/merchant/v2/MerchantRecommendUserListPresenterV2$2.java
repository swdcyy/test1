package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2$2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.FixLinearLayoutManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2;
import android.content.Context;

public class MerchantRecommendUserListPresenterV2$2 extends FixLinearLayoutManager	// class@001796
{
    public final MerchantRecommendUserListPresenterV2 r;

    public void MerchantRecommendUserListPresenterV2$2(MerchantRecommendUserListPresenterV2 p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollVertically(){
       return false;
    }
}
