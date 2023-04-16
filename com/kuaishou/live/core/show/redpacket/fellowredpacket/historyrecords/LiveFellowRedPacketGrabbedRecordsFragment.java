package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketGrabbedRecordsFragment;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketGrabbedRecordsFragment$b;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketGrabbedRecordsFragment$a;
import qvb.i;

public class LiveFellowRedPacketGrabbedRecordsFragment extends LiveFellowRedPacketRecordsBaseFragment	// class@000e83
{

    public void LiveFellowRedPacketGrabbedRecordsFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketGrabbedRecordsFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveFellowRedPacketGrabbedRecordsFragment.class, null);
       return objectsByTag;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketGrabbedRecordsFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketGrabbedRecordsFragment$b(null);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketGrabbedRecordsFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketGrabbedRecordsFragment$a(this);
    }
}
