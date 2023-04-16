package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketHistoryRecordsGrabbedRedPacksInfo;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveFellowRedPacketHistoryRecordsGrabbedRedPacksInfo implements Serializable, CursorResponse	// class@000e93
{
    public String mGrabbedRedPackSource;
    public List mGrabbedRedPacksList;
    public String mGrabbedRedPacksTime;
    public static final long serialVersionUID = 0xa82250c90a930396;

    public void LiveFellowRedPacketHistoryRecordsGrabbedRedPacksInfo(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mGrabbedRedPacksList;
    }
    public boolean hasMore(){
       return false;
    }
}
