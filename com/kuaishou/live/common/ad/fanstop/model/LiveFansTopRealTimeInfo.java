package com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealTimeInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFansTopRealTimeInfo implements Serializable	// class@000e6a
{
    public int mClickCount;
    public boolean mFlameSelected;
    public String mMessage;
    public int mRealCost;
    public int mReportStatus;
    public long mStartTimeMills;
    public int mStatus;
    public int mStrategy;
    public String mUrl;
    public static final long serialVersionUID = 0x84794f0029c56b6a;

    public void LiveFansTopRealTimeInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFansTopRealTimeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{ Status: "+this.mStatus+" clickCount: "+this.mClickCount+" realCost: "+this.mRealCost+" startTimeMillis:"+this.mStartTimeMills+" }";
    }
}
