package com.yxcorp.gifshow.growth.mobileid.model.OperatorMobileIdConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class OperatorMobileIdConfig implements Serializable	// class@001429
{
    public int mDailyMaxCount;
    public int mIncompatibleCycle;
    public int mIncompatibleDailyMaxCount;
    public int mIncompatibleMaxCount;
    public int mRefreshCycle;
    public int mRetryCycle;
    public int mRetryMaxCount;
    public static final long serialVersionUID = 0x18f75fa71392ba95;

    public void OperatorMobileIdConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, OperatorMobileIdConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OperatorMobileIdConfig{mIncompatibleCycle="+this.mIncompatibleCycle+", mIncompatibleMaxCount="+this.mIncompatibleMaxCount+", mIncompatibleDailyMaxCount="+this.mIncompatibleDailyMaxCount+", mDailyMaxCount="+this.mDailyMaxCount+", mRetryCycle="+this.mRetryCycle+", mRetryMaxCount="+this.mRetryMaxCount+", mRefreshCycle="+this.mRefreshCycle+'}';
    }
}
