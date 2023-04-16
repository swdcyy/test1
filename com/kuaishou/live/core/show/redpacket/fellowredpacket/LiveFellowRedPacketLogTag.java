package com.kuaishou.live.core.show.redpacket.fellowredpacket.LiveFellowRedPacketLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveFellowRedPacketLogTag extends Enum implements c	// class@000e80
{
    public final String mName;
    public static final LiveFellowRedPacketLogTag[] $VALUES;
    public static final LiveFellowRedPacketLogTag FELLOW_RED_PACKET;
    public static final LiveFellowRedPacketLogTag LIVE_FELLOW_RED_PACKET;
    public static final LiveFellowRedPacketLogTag MANAGER;
    public static final LiveFellowRedPacketLogTag SNATCH_RED_PACK;

    static {
       LiveFellowRedPacketLogTag liveFellowRe = new LiveFellowRedPacketLogTag("MANAGER", 0, "LiveFellowRedPacketManager");
       LiveFellowRedPacketLogTag.MANAGER = liveFellowRe;
       LiveFellowRedPacketLogTag liveFellowRe1 = new LiveFellowRedPacketLogTag("LIVE_FELLOW_RED_PACKET", 1, "LiveFellowRedPacket");
       LiveFellowRedPacketLogTag.LIVE_FELLOW_RED_PACKET = liveFellowRe1;
       LiveFellowRedPacketLogTag liveFellowRe2 = new LiveFellowRedPacketLogTag("SNATCH_RED_PACK", 2, "LiveFellowRedPacketSnatch");
       LiveFellowRedPacketLogTag.SNATCH_RED_PACK = liveFellowRe2;
       LiveFellowRedPacketLogTag liveFellowRe3 = new LiveFellowRedPacketLogTag("FELLOW_RED_PACKET", 3, "FellowRedPacket");
       LiveFellowRedPacketLogTag.FELLOW_RED_PACKET = liveFellowRe3;
       LiveFellowRedPacketLogTag[] liveFellowRe4 = new LiveFellowRedPacketLogTag[]{liveFellowRe,liveFellowRe1,liveFellowRe2,liveFellowRe3};
       LiveFellowRedPacketLogTag.$VALUES = liveFellowRe4;
    }
    public void LiveFellowRedPacketLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveFellowRedPacketLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFellowRedPacketLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFellowRedPacketLogTag.class, p0);
    }
    public static LiveFellowRedPacketLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFellowRedPacketLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFellowRedPacketLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
