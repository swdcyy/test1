package com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealtimeInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealTimeInfo;

public class LiveFansTopRealtimeInfoResponse implements Serializable	// class@000e6b
{
    public LiveFansTopRealTimeInfo mRealTimeInfo;
    public int mResult;
    public static final long serialVersionUID = 0x40c4b20a5daa3629;

    public void LiveFansTopRealtimeInfoResponse(){
       super();
    }
    public static LiveFansTopRealtimeInfoResponse createFakeErrorResponse(){
       LiveFansTopRealtimeInfoResponse obj = PatchProxy.apply(null, null, LiveFansTopRealtimeInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveFansTopRealtimeInfoResponse();
       LiveFansTopRealTimeInfo liveFansTopR = new LiveFansTopRealTimeInfo();
       obj.mRealTimeInfo = liveFansTopR;
       liveFansTopR.mStatus = 0;
       return obj;
    }
}
