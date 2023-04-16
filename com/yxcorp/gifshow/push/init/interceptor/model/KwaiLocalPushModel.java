package com.yxcorp.gifshow.push.init.interceptor.model.KwaiLocalPushModel;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;

public final class KwaiLocalPushModel extends KwaiPushMsgData	// class@00165c
{
    public long showEndTime;
    public long showStartTime;

    public void KwaiLocalPushModel(){
       super();
    }
    public final long getShowEndTime(){
       return this.showEndTime;
    }
    public final long getShowStartTime(){
       return this.showStartTime;
    }
    public final void setShowEndTime(long p0){
       this.showEndTime = p0;
    }
    public final void setShowStartTime(long p0){
       this.showStartTime = p0;
    }
}
