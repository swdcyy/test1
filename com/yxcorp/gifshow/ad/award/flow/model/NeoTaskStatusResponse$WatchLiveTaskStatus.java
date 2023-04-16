package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$WatchLiveTaskStatus;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BaseTaskStatus;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$WatchLiveTaskStatus$a;
import nsd.u;
import java.lang.String;

public final class NeoTaskStatusResponse$WatchLiveTaskStatus extends NeoTaskStatusResponse$BaseTaskStatus	// class@001513
{
    public final String doubleSubTitle;
    public final long nextUnsealTimestampMs;
    public final String sealSubTitle;
    public static final NeoTaskStatusResponse$WatchLiveTaskStatus$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$WatchLiveTaskStatus.Companion = new NeoTaskStatusResponse$WatchLiveTaskStatus$a(null);
    }
    public void NeoTaskStatusResponse$WatchLiveTaskStatus(){
       super();
    }
    public final String getDoubleSubTitle(){
       return this.doubleSubTitle;
    }
    public final long getNextUnsealTimestampMs(){
       return this.nextUnsealTimestampMs;
    }
    public final String getSealSubTitle(){
       return this.sealSubTitle;
    }
}
