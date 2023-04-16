package com.kwai.locallife.live.bullet.LiveLocalLifeBuyingBulletData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.kuaishou.livestream.message.nano.LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal;

public final class LiveLocalLifeBuyingBulletData extends LiveFloatingScreenCommonData	// class@000eb1
{
    public LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal signal;

    public void LiveLocalLifeBuyingBulletData(){
       super();
    }
    public final LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal getSignal(){
       return this.signal;
    }
    public final void setSignal(LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal p0){
       this.signal = p0;
    }
}
