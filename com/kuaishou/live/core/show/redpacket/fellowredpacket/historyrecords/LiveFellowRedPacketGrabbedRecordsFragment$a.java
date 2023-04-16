package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketGrabbedRecordsFragment$a;
import qvb.f;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketGrabbedRecordsFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ug2.a;
import o02.e;
import qvb.n0;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketHistoryRecordsGrabbedRedPacksResponse;
import cjd.e;
import erd.o;

public class LiveFellowRedPacketGrabbedRecordsFragment$a extends f	// class@000e81
{
    public final LiveFellowRedPacketGrabbedRecordsFragment p;

    public void LiveFellowRedPacketGrabbedRecordsFragment$a(LiveFellowRedPacketGrabbedRecordsFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       a obj = PatchProxy.apply(null, this, LiveFellowRedPacketGrabbedRecordsFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.h();
       String cursor = (!this.K() && this.L0() != null)? this.L0().getCursor(): "";
       return obj.d(cursor, 20).map(new e());
    }
}
