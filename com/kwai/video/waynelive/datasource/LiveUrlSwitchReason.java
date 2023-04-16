package com.kwai.video.waynelive.datasource.LiveUrlSwitchReason;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveUrlSwitchReason	// class@000ded
{
    public long mEmptyDataDurationMs;
    public int mReleaseReason;
    public int mRetryReason;

    public void LiveUrlSwitchReason(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveUrlSwitchReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveUrlSwitchReason{mReleaseReason="+this.mReleaseReason+", mRetryReason="+this.mRetryReason+", mEmptyDataDurationMs="+this.mEmptyDataDurationMs+'}';
    }
}
