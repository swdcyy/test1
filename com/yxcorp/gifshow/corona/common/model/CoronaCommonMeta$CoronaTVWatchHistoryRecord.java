package com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord;
import java.io.Serializable;
import java.lang.Object;

public class CoronaCommonMeta$CoronaTVWatchHistoryRecord implements Serializable	// class@001207
{
    public String mClusterId;
    public boolean mIsHistory;
    public long mPlayProgress;
    public long mTimeStap;
    public static final long serialVersionUID = 0xaa951620f45da55d;

    public void CoronaCommonMeta$CoronaTVWatchHistoryRecord(){
       super();
       this.mTimeStap = 0;
       this.mPlayProgress = -1;
       this.mIsHistory = true;
    }
}
