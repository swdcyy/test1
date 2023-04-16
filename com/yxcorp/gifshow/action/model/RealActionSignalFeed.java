package com.yxcorp.gifshow.action.model.RealActionSignalFeed;
import com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.events.realaction.RealActionUserSignal;
import java.lang.StringBuilder;

public class RealActionSignalFeed extends RealActionBaseFeed	// class@001328
{
    public RealActionUserSignal mActionUserSignal;
    public static final long serialVersionUID = 0xdb379556ecd90105;

    public void RealActionSignalFeed(){
       super();
    }
    public String toString(){
       RealActionSignalFeed obj = PatchProxy.apply(null, this, RealActionSignalFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mActionUserSignal;
       String str = (obj != null)? obj.toString(): "";
       return "RealActionSignalFeed{mPage=\'"+this.mPage+'''+", mSource=\'"+this.mSource+'''+", mTimestamp="+this.mTimestamp+", mHasReported="+this.mHasReported+", mIsOverAllEventType="+this.mIsOverAllEventType+", mActionTypeStr=\'"+this.mActionTypeStr+'''+", mActionUserSignal="+str+'}';
    }
}
