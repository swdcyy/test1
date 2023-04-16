package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketHistoryRecordsSentRedPacksResponse;
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

public class LiveFellowRedPacketHistoryRecordsSentRedPacksResponse implements Serializable, CursorResponse	// class@000e96
{
    public List mFellowRedPackRedPacksList;
    public String mPcursor;
    public static final long serialVersionUID = 0xe2c1d36ba65727a2;

    public void LiveFellowRedPacketHistoryRecordsSentRedPacksResponse(){
       super();
    }
    public String getCursor(){
       return this.mPcursor;
    }
    public List getItems(){
       return this.mFellowRedPackRedPacksList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketHistoryRecordsSentRedPacksResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
}
