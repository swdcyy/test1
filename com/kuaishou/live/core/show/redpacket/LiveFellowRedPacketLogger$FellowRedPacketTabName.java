package com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger$FellowRedPacketTabName;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveFellowRedPacketLogger$FellowRedPacketTabName extends Enum	// class@000e4c
{
    public final String mValue;
    public static final LiveFellowRedPacketLogger$FellowRedPacketTabName[] $VALUES;
    public static final LiveFellowRedPacketLogger$FellowRedPacketTabName INTELLIGENT;
    public static final LiveFellowRedPacketLogger$FellowRedPacketTabName NORMAL;
    public static final LiveFellowRedPacketLogger$FellowRedPacketTabName QUICKSEND;

    static {
       LiveFellowRedPacketLogger$FellowRedPacketTabName uFellowRedPa = new LiveFellowRedPacketLogger$FellowRedPacketTabName("NORMAL", 0, "GIFT");
       LiveFellowRedPacketLogger$FellowRedPacketTabName.NORMAL = uFellowRedPa;
       LiveFellowRedPacketLogger$FellowRedPacketTabName uFellowRedPa1 = new LiveFellowRedPacketLogger$FellowRedPacketTabName("QUICKSEND", 1, "MORE");
       LiveFellowRedPacketLogger$FellowRedPacketTabName.QUICKSEND = uFellowRedPa1;
       LiveFellowRedPacketLogger$FellowRedPacketTabName uFellowRedPa2 = new LiveFellowRedPacketLogger$FellowRedPacketTabName("INTELLIGENT", 2, "FANS");
       LiveFellowRedPacketLogger$FellowRedPacketTabName.INTELLIGENT = uFellowRedPa2;
       LiveFellowRedPacketLogger$FellowRedPacketTabName[] uFellowRedPa3 = new LiveFellowRedPacketLogger$FellowRedPacketTabName[]{uFellowRedPa,uFellowRedPa1,uFellowRedPa2};
       LiveFellowRedPacketLogger$FellowRedPacketTabName.$VALUES = uFellowRedPa3;
    }
    public void LiveFellowRedPacketLogger$FellowRedPacketTabName(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveFellowRedPacketLogger$FellowRedPacketTabName valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFellowRedPacketLogger$FellowRedPacketTabName.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFellowRedPacketLogger$FellowRedPacketTabName.class, p0);
    }
    public static LiveFellowRedPacketLogger$FellowRedPacketTabName[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFellowRedPacketLogger$FellowRedPacketTabName.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFellowRedPacketLogger$FellowRedPacketTabName.$VALUES.clone();
    }
    public String getValue(){
       return this.mValue;
    }
}
