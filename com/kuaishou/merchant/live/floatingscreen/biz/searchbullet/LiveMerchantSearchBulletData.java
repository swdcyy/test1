package com.kuaishou.merchant.live.floatingscreen.biz.searchbullet.LiveMerchantSearchBulletData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.merchant.api.core.model.Commodity;

public final class LiveMerchantSearchBulletData extends LiveFloatingScreenBaseData	// class@001a1c
{
    public Commodity commodity;

    public void LiveMerchantSearchBulletData(){
       super();
    }
    public final Commodity getCommodity(){
       return this.commodity;
    }
    public final void setCommodity(Commodity p0){
       this.commodity = p0;
    }
}
