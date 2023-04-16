package com.yxcorp.gifshow.events.realaction.RealActionUserSignal;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RealActionUserSignal implements Serializable	// class@000e8a
{
    public String mActionType;
    public long mAuthorId;
    public String mContentId;
    public int mContentType;
    public String mExtParams;
    public boolean mIsOverAllEventType;
    public String mLlsid;
    public String mSessionId;
    public String mSignalSubType;
    public String mSignalSubValue;
    public String mSignalType;
    public String mSignalValue;
    public long mTimestamp;
    public static final long serialVersionUID = 0x3da01944b805efd;

    public void RealActionUserSignal(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RealActionUserSignal.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RealActionUserSignal{mSignalType=\'"+this.mSignalType+'''+", mSignalValue=\'"+this.mSignalValue+'''+'}';
    }
}
