package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter$2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.FixLinearLayoutManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter;
import android.content.Context;

public class MerchantRecommendUserListPresenter$2 extends FixLinearLayoutManager	// class@001786
{
    public final MerchantRecommendUserListPresenter r;

    public void MerchantRecommendUserListPresenter$2(MerchantRecommendUserListPresenter p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollVertically(){
       return false;
    }
}
