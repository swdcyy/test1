package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import yg2.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yg2.a;
import y8c.t;
import gka.b;
import yg2.j;
import java.util.Map;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$a;
import qvb.i;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$b;

public class LiveQuickSendFellowRedPacketPanelFragment extends RecyclerFragment	// class@000eb8
{
    public boolean F;
    public m G;
    public g H;
    public LiveBizParam I;
    public ProgressFragment J;
    public x K;

    public void LiveQuickSendFellowRedPacketPanelFragment(){
       super();
       this.F = true;
       this.K = new c(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveQuickSendFellowRedPacketPanelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a());
       PatchProxy.onMethodExit(LiveQuickSendFellowRedPacketPanelFragment.class, "3");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveQuickSendFellowRedPacketPanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this, 3);
    }
    public int getLayoutResId(){
       return 0x7f0d0d66;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveQuickSendFellowRedPacketPanelFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveQuickSendFellowRedPacketPanelFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveQuickSendFellowRedPacketPanelFragment.class, new j());
       }else {
          obj.put(LiveQuickSendFellowRedPacketPanelFragment.class, null);
       }
       return obj;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveQuickSendFellowRedPacketPanelFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveQuickSendFellowRedPacketPanelFragment$a(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveQuickSendFellowRedPacketPanelFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveQuickSendFellowRedPacketPanelFragment$b(this);
    }
}
