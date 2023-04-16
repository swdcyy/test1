package com.kuaishou.house.live.lottery.HouseLotteryPendantData;
import java.io.Serializable;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class HouseLotteryPendantData implements Serializable	// class@00078a
{
    public String mActionUrl;
    public String mBackgroundUrl;
    public boolean mEnableShow;
    public long mEndTimeMs;
    public long mServerTime;
    public String mTitle;
    public static final HouseLotteryPendantData$a Companion;
    public static final long serialVersionUID;

    static {
       HouseLotteryPendantData.Companion = new HouseLotteryPendantData$a(null);
    }
    public void HouseLotteryPendantData(){
       super();
    }
    public final String getMActionUrl(){
       return this.mActionUrl;
    }
    public final String getMBackgroundUrl(){
       return this.mBackgroundUrl;
    }
    public final boolean getMEnableShow(){
       return this.mEnableShow;
    }
    public final long getMEndTimeMs(){
       return this.mEndTimeMs;
    }
    public final long getMServerTime(){
       return this.mServerTime;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final void setMActionUrl(String p0){
       this.mActionUrl = p0;
    }
    public final void setMBackgroundUrl(String p0){
       this.mBackgroundUrl = p0;
    }
    public final void setMEnableShow(boolean p0){
       this.mEnableShow = p0;
    }
    public final void setMEndTimeMs(long p0){
       this.mEndTimeMs = p0;
    }
    public final void setMServerTime(long p0){
       this.mServerTime = p0;
    }
    public final void setMTitle(String p0){
       this.mTitle = p0;
    }
}
