package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$a;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import ml8.c;

public class LiveQuickSendFellowRedPacketPanelFragment$a extends g	// class@000eb2
{
    public final LiveQuickSendFellowRedPacketPanelFragment w;

    public void LiveQuickSendFellowRedPacketPanelFragment$a(LiveQuickSendFellowRedPacketPanelFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveQuickSendFellowRedPacketPanelFragment$a uoa = LiveQuickSendFellowRedPacketPanelFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.k(p0, 0x7f0d0d67, false), new LiveQuickSendFellowRedPacketPanelFragment$c(this.w));
    }
}
