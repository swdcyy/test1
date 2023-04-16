package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$d;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkc.b;

public class LiveFellowRedPacketPanelFragment$d extends f	// class@000ea3
{
    public final LiveFellowRedPacketPanelFragment l;

    public void LiveFellowRedPacketPanelFragment$d(LiveFellowRedPacketPanelFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.h(R.string.arg_RES_7f1021d6);
       return obj;
    }
    public KwaiEmptyStateView$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketPanelFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.c(p0);
       uoa.b();
       return uoa;
    }
    public b r(){
       return b.e;
    }
}
