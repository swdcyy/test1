package com.yxcorp.gifshow.growth.mobileid.model.MobileIdRequestRecord;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MobileIdRequestRecord implements Serializable	// class@001428
{
    public long mCycleBasicConditionFirstFailedTime;
    public int mCycleBasicConditionTryFailedCount;
    public int mCycleRequestFailedCount;
    public long mCycleRequestFirstFailedTime;
    public long mDailyBasicConditionFirstFailedTime;
    public int mDailyBasicConditionTryFailedCount;
    public int mDailyRequestFailedCount;
    public long mDailyRequestFirstFailedTime;
    public long mRequestSuccessTime;
    public static final long serialVersionUID = 0xe8d1d2fdfa2a2b45;

    public void MobileIdRequestRecord(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MobileIdRequestRecord.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MobileIdRequestRecord{mDailyBasicConditionTryFailedCount="+this.mDailyBasicConditionTryFailedCount+", mCycleBasicConditionTryFailedCount="+this.mCycleBasicConditionTryFailedCount+", mDailyBasicConditionFirstFailedTime="+this.mDailyBasicConditionFirstFailedTime+", mCycleBasicConditionFirstFailedTime="+this.mCycleBasicConditionFirstFailedTime+", mDailyRequestFailedCount="+this.mDailyRequestFailedCount+", mCycleRequestFailedCount="+this.mCycleRequestFailedCount+", mDailyRequestFirstFailedTime="+this.mDailyRequestFirstFailedTime+", mCycleRequestFirstFailedTime="+this.mCycleRequestFirstFailedTime+", mRequestSuccessTime="+this.mRequestSuccessTime+'}';
    }
}
