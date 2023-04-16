package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$f;
import y8c.f$b;
import n17.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.d;
import java.util.Map;

public class LiveFellowRedPacketPanelFragment$f extends f$b	// class@000ea5
{
    public a h;
    public LiveFellowRedPacketPanelFragment$e i;

    public void LiveFellowRedPacketPanelFragment$f(f$b p0,a p1,LiveFellowRedPacketPanelFragment$e p2){
       super(p0);
       this.h = p1;
       this.i = p2;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketPanelFragment$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketPanelFragment$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveFellowRedPacketPanelFragment$f.class, new d());
       }else {
          obj.put(LiveFellowRedPacketPanelFragment$f.class, null);
       }
       return obj;
    }
}
