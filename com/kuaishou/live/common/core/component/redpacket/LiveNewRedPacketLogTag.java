package com.kuaishou.live.common.core.component.redpacket.LiveNewRedPacketLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveNewRedPacketLogTag extends Enum implements c	// class@00174e
{
    public String mName;
    public static final LiveNewRedPacketLogTag[] $VALUES;
    public static final LiveNewRedPacketLogTag LIVE_NORMAL_RED_PACKET;

    static {
       LiveNewRedPacketLogTag liveNewRedPa = new LiveNewRedPacketLogTag("LIVE_NORMAL_RED_PACKET", 0, "LiveNewNormalRedPacket");
       LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET = liveNewRedPa;
       LiveNewRedPacketLogTag[] liveNewRedPa1 = new LiveNewRedPacketLogTag[]{liveNewRedPa};
       LiveNewRedPacketLogTag.$VALUES = liveNewRedPa1;
    }
    public void LiveNewRedPacketLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveNewRedPacketLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveNewRedPacketLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveNewRedPacketLogTag.class, p0);
    }
    public static LiveNewRedPacketLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveNewRedPacketLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveNewRedPacketLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
