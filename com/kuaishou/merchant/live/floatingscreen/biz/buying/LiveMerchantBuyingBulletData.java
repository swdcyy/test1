package com.kuaishou.merchant.live.floatingscreen.biz.buying.LiveMerchantBuyingBulletData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCLiveBuyingNoticeSignal;

public final class LiveMerchantBuyingBulletData extends LiveFloatingScreenCommonData	// class@001a1b
{
    public LiveRoomSignalMessage$SCLiveBuyingNoticeSignal signal;

    public void LiveMerchantBuyingBulletData(){
       super();
    }
    public final LiveRoomSignalMessage$SCLiveBuyingNoticeSignal getSignal(){
       return this.signal;
    }
    public final void setSignal(LiveRoomSignalMessage$SCLiveBuyingNoticeSignal p0){
       this.signal = p0;
    }
}
