package com.yxcorp.gifshow.nearby.common.helper.recorder.NearbyTimeRecordEvent;
import java.lang.Enum;
import java.lang.String;
import prb.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NearbyTimeRecordEvent extends Enum	// class@002113
{
    public String mKey;
    public a mModel;
    public static final NearbyTimeRecordEvent[] $VALUES;
    public static final NearbyTimeRecordEvent LOCAL_CACHE_DURATION;
    public static final NearbyTimeRecordEvent LOCAL_DETAIL_FEED_REQUEST_INTERVAL;
    public static final NearbyTimeRecordEvent LOCAL_FEED_API_DURATION;
    public static final NearbyTimeRecordEvent LOCAL_FEED_CONSUME_DURATION;
    public static final NearbyTimeRecordEvent LOCAL_FEED_REQUEST_INTERVAL;
    public static final NearbyTimeRecordEvent LOCAL_NATIVE_STATE_RECORD;

    static {
       NearbyTimeRecordEvent nearbyTimeRe = new NearbyTimeRecordEvent("LOCAL_NATIVE_STATE_RECORD", 0, "LOCAL_APM_INVALID_EVENT");
       NearbyTimeRecordEvent.LOCAL_NATIVE_STATE_RECORD = nearbyTimeRe;
       NearbyTimeRecordEvent nearbyTimeRe1 = new NearbyTimeRecordEvent("LOCAL_FEED_REQUEST_INTERVAL", 1, "local_feed_request_interval");
       NearbyTimeRecordEvent.LOCAL_FEED_REQUEST_INTERVAL = nearbyTimeRe1;
       NearbyTimeRecordEvent nearbyTimeRe2 = new NearbyTimeRecordEvent("LOCAL_DETAIL_FEED_REQUEST_INTERVAL", 2, "local_detail_feed_request_interval");
       NearbyTimeRecordEvent.LOCAL_DETAIL_FEED_REQUEST_INTERVAL = nearbyTimeRe2;
       NearbyTimeRecordEvent nearbyTimeRe3 = new NearbyTimeRecordEvent("LOCAL_FEED_API_DURATION", 3, "local_feed_api_duration");
       NearbyTimeRecordEvent.LOCAL_FEED_API_DURATION = nearbyTimeRe3;
       NearbyTimeRecordEvent nearbyTimeRe4 = new NearbyTimeRecordEvent("LOCAL_FEED_CONSUME_DURATION", 4, "local_feed_consume_duration");
       NearbyTimeRecordEvent.LOCAL_FEED_CONSUME_DURATION = nearbyTimeRe4;
       NearbyTimeRecordEvent nearbyTimeRe5 = new NearbyTimeRecordEvent("LOCAL_CACHE_DURATION", 5, "local_cache_feed_stage_interval");
       NearbyTimeRecordEvent.LOCAL_CACHE_DURATION = nearbyTimeRe5;
       NearbyTimeRecordEvent[] nearbyTimeRe6 = new NearbyTimeRecordEvent[]{nearbyTimeRe,nearbyTimeRe1,nearbyTimeRe2,nearbyTimeRe3,nearbyTimeRe4,nearbyTimeRe5};
       NearbyTimeRecordEvent.$VALUES = nearbyTimeRe6;
    }
    public void NearbyTimeRecordEvent(String p0,int p1,String p2){
       super(p0, p1);
       this.mModel = new a();
       this.mKey = p2;
    }
    public static NearbyTimeRecordEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NearbyTimeRecordEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NearbyTimeRecordEvent.class, p0);
    }
    public static NearbyTimeRecordEvent[] values(){
       Object obj = PatchProxy.apply(null, null, NearbyTimeRecordEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NearbyTimeRecordEvent.$VALUES.clone();
    }
    public String getKey(){
       return this.mKey;
    }
    public a getRecordModel(){
       return this.mModel;
    }
}
