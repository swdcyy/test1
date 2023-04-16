package com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRedPacketGrabButtonType extends Enum	// class@000aad
{
    public final String value;
    public static final LiveRedPacketGrabButtonType[] $VALUES;
    public static final LiveRedPacketGrabButtonType GRAB_BUTTON;
    public static final LiveRedPacketGrabButtonType JOIN_BUTTON;

    static {
       LiveRedPacketGrabButtonType liveRedPacke1;
       LiveRedPacketGrabButtonType[] liveRedPacke = new LiveRedPacketGrabButtonType[]{liveRedPacke1,liveRedPacke1};
       liveRedPacke1 = new LiveRedPacketGrabButtonType("GRAB_BUTTON", 0, "grab_btn");
       LiveRedPacketGrabButtonType.GRAB_BUTTON = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketGrabButtonType("JOIN_BUTTON", 1, "join_btn");
       LiveRedPacketGrabButtonType.JOIN_BUTTON = liveRedPacke1;
       LiveRedPacketGrabButtonType.$VALUES = liveRedPacke;
    }
    public void LiveRedPacketGrabButtonType(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveRedPacketGrabButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketGrabButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPacketGrabButtonType.class, p0);
    }
    public static LiveRedPacketGrabButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketGrabButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPacketGrabButtonType.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
