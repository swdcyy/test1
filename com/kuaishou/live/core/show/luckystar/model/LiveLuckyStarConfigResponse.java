package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarConfigResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LiveLuckyStarConfigResponse implements Serializable	// class@000cd1
{
    public String mDisplayWarnText;
    public int mDurationFactor;
    public List mFansGroupOptions;
    public int mMaxDurationMinute;
    public int mMaxLuckyUserCount;
    public int mMaxWatchDurationMinute;
    public int mMinDurationMinute;
    public int mMinWatchDurationMinute;
    public String mRuleUrl;
    public int[] mSupportedTypes;
    public static final long serialVersionUID = 0x26505edb4d15273b;

    public void LiveLuckyStarConfigResponse(){
       super();
       this.mMaxLuckyUserCount = 10;
       this.mMinDurationMinute = 5;
       this.mMaxDurationMinute = 60;
       this.mMinWatchDurationMinute = 1;
       this.mMaxWatchDurationMinute = 30;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarConfigResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLuckyStarConfigResponse{mMaxLuckyUserCount="+this.mMaxLuckyUserCount+", mSupportedTypes="+Arrays.toString(this.mSupportedTypes)+", mFansGroupOptions="+this.mFansGroupOptions+'}';
    }
}
