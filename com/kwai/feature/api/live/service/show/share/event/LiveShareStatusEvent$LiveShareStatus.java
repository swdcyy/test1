package com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent$LiveShareStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveShareStatusEvent$LiveShareStatus extends Enum	// class@00101f
{
    public static final LiveShareStatusEvent$LiveShareStatus[] $VALUES;
    public static final LiveShareStatusEvent$LiveShareStatus CANCEL;
    public static final LiveShareStatusEvent$LiveShareStatus FAIL;
    public static final LiveShareStatusEvent$LiveShareStatus SUCCESS;

    static {
       LiveShareStatusEvent$LiveShareStatus liveShareSta = new LiveShareStatusEvent$LiveShareStatus("SUCCESS", 0);
       LiveShareStatusEvent$LiveShareStatus.SUCCESS = liveShareSta;
       LiveShareStatusEvent$LiveShareStatus liveShareSta1 = new LiveShareStatusEvent$LiveShareStatus("FAIL", 1);
       LiveShareStatusEvent$LiveShareStatus.FAIL = liveShareSta1;
       LiveShareStatusEvent$LiveShareStatus liveShareSta2 = new LiveShareStatusEvent$LiveShareStatus("CANCEL", 2);
       LiveShareStatusEvent$LiveShareStatus.CANCEL = liveShareSta2;
       LiveShareStatusEvent$LiveShareStatus[] liveShareSta3 = new LiveShareStatusEvent$LiveShareStatus[]{liveShareSta,liveShareSta1,liveShareSta2};
       LiveShareStatusEvent$LiveShareStatus.$VALUES = liveShareSta3;
    }
    public void LiveShareStatusEvent$LiveShareStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveShareStatusEvent$LiveShareStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveShareStatusEvent$LiveShareStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveShareStatusEvent$LiveShareStatus.class, p0);
    }
    public static LiveShareStatusEvent$LiveShareStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveShareStatusEvent$LiveShareStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveShareStatusEvent$LiveShareStatus.$VALUES.clone();
    }
}
