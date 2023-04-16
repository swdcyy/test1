package com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RealActionBaseFeed implements Serializable	// class@001325
{
    public String mActionTypeStr;
    public boolean mHasReported;
    public boolean mIsOverAllEventType;
    public String mPage;
    public String mSource;
    public long mTimestamp;
    public static final long serialVersionUID = 0x361651b63abfbd92;

    public void RealActionBaseFeed(){
       super();
       this.mIsOverAllEventType = false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RealActionBaseFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RealActionBaseFeed{mPage=\'"+this.mPage+'''+", mSource=\'"+this.mSource+'''+", mTimestamp="+this.mTimestamp+", mHasReported="+this.mHasReported+", mIsOverAllEventType="+this.mIsOverAllEventType+", mActionTypeStr=\'"+this.mActionTypeStr+'''+'}';
    }
}
