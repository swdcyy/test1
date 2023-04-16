package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$b;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$f;
import xg2.g;
import xg2.f;
import n17.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$e;
import y8c.f;
import java.util.List;
import java.lang.Integer;
import g9c.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import bk2.e;
import android.view.ViewGroup;
import vg2.b;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.e;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class LiveFellowRedPacketPanelFragment$b extends g	// class@000ea1
{
    public final LiveFellowRedPacketPanelFragment w;

    public void LiveFellowRedPacketPanelFragment$b(LiveFellowRedPacketPanelFragment p0){
       this.w = p0;
       super();
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketPanelFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketPanelFragment$f(p0, new g(this), new f(this));
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(LiveFellowRedPacketPanelFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveFellowRedPacketPanelFragment$b.class, "3")) {
          return;
       }
       super.g1(p0, p1, p2);
       this.w.U.b(p1, this.N0(p1));
       return;
    }
    public f h1(ViewGroup p0,int p1){
       LiveFellowRedPacketPanelFragment$b uob = LiveFellowRedPacketPanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(n.H(p0, this.w.V.b), new e(this.w.V.c));
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
