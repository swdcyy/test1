package com.kwai.video.wayne.player.main.MultiSourceRetryListener$RetryInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MultiSourceRetryListener$RetryInfo	// class@000d6f
{
    public int extra;
    public int mFinishReason;
    public int mSwitchStrategy;
    public int mTotalRetryCount;
    public int what;

    public void MultiSourceRetryListener$RetryInfo(){
       super();
       this.mFinishReason = 0;
       this.mTotalRetryCount = 0;
    }
    public final String getFinishReasonDesc(){
       MultiSourceRetryListener$RetryInfo tmFinishReas = this.mFinishReason;
       if (tmFinishReas == null) {
          return "Unknown";
       }
       if (tmFinishReas == 1) {
          return "ListenerNotSet";
       }
       if (tmFinishReas == 2) {
          return "FreeTrafficMaxRetryCountReached";
       }
       if (tmFinishReas == 3) {
          return "DefaultSwitchStrategyFinish";
       }
       if (tmFinishReas != 4) {
          return "Unknown Enum";
       }
       return "InnerError";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MultiSourceRetryListener$RetryInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{mSwitchStrategy="+this.mSwitchStrategy+", mFinishReason="+this.getFinishReasonDesc()+", mTotalRetryCount="+this.mTotalRetryCount+'}';
    }
}
