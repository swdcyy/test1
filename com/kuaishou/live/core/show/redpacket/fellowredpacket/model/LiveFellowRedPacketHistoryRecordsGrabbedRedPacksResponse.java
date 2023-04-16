package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketHistoryRecordsGrabbedRedPacksResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveFellowRedPacketHistoryRecordsGrabbedRedPacksResponse implements Serializable, CursorResponse	// class@000e94
{
    public List mGrabRedPacksRecordsList;
    public String mPcursor;
    public static final long serialVersionUID = 0x1d3131b38aea9ff7;

    public void LiveFellowRedPacketHistoryRecordsGrabbedRedPacksResponse(){
       super();
    }
    public String getCursor(){
       return this.mPcursor;
    }
    public List getItems(){
       return this.mGrabRedPacksRecordsList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketHistoryRecordsGrabbedRedPacksResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
}
