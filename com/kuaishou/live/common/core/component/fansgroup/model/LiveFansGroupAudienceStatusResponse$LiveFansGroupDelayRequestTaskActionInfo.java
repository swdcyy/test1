package com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse$LiveFansGroupDelayRequestTaskActionInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFansGroupAudienceStatusResponse$LiveFansGroupDelayRequestTaskActionInfo implements Serializable	// class@0010fa
{
    public int mDelaySec;
    public int mId;
    public static final long serialVersionUID = 0x6f990a779a100c58;

    public void LiveFansGroupAudienceStatusResponse$LiveFansGroupDelayRequestTaskActionInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFansGroupAudienceStatusResponse$LiveFansGroupDelayRequestTaskActionInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFansGroupDelayRequestInfo{mTaskId="+this.mId+", mDelaySec="+this.mDelaySec+'}';
    }
}
