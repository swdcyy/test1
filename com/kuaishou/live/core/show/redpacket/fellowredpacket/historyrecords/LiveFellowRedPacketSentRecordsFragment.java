package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketSentRecordsFragment;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketSentRecordsFragment$b;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketSentRecordsFragment$a;
import qvb.i;

public class LiveFellowRedPacketSentRecordsFragment extends LiveFellowRedPacketRecordsBaseFragment	// class@000e8f
{

    public void LiveFellowRedPacketSentRecordsFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketSentRecordsFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveFellowRedPacketSentRecordsFragment.class, null);
       return objectsByTag;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketSentRecordsFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketSentRecordsFragment$b(null);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketSentRecordsFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketSentRecordsFragment$a(this);
    }
}
