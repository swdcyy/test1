package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$b;
import qvb.f;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ug2.a;
import o02.e;
import p91.m;
import cjd.e;
import erd.o;

public class LiveQuickSendFellowRedPacketPanelFragment$b extends f	// class@000eb3
{
    public final LiveQuickSendFellowRedPacketPanelFragment p;

    public void LiveQuickSendFellowRedPacketPanelFragment$b(LiveQuickSendFellowRedPacketPanelFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveQuickSendFellowRedPacketPanelFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h().c(this.p.G.getLiveStreamId()).map(new e());
    }
}
