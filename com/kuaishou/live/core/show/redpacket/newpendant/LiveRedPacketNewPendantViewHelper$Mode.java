package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.Enum;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode$1;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode$2;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode$3;
import com.kuaishou.live.core.show.redpacket.newpendant.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;

public class LiveRedPacketNewPendantViewHelper$Mode extends Enum	// class@000ee3
{
    public static final LiveRedPacketNewPendantViewHelper$Mode[] $VALUES;
    public static final LiveRedPacketNewPendantViewHelper$Mode CountDown;
    public static final LiveRedPacketNewPendantViewHelper$Mode Opened;
    public static final LiveRedPacketNewPendantViewHelper$Mode Opening;

    static {
       LiveRedPacketNewPendantViewHelper$Mode$1 mode$1 = new LiveRedPacketNewPendantViewHelper$Mode$1("CountDown", 0);
       LiveRedPacketNewPendantViewHelper$Mode.CountDown = mode$1;
       LiveRedPacketNewPendantViewHelper$Mode$2 mode$2 = new LiveRedPacketNewPendantViewHelper$Mode$2("Opening", 1);
       LiveRedPacketNewPendantViewHelper$Mode.Opening = mode$2;
       LiveRedPacketNewPendantViewHelper$Mode$3 mode$3 = new LiveRedPacketNewPendantViewHelper$Mode$3("Opened", 2);
       LiveRedPacketNewPendantViewHelper$Mode.Opened = mode$3;
       LiveRedPacketNewPendantViewHelper$Mode[] modeArray = new LiveRedPacketNewPendantViewHelper$Mode[]{mode$1,mode$2,mode$3};
       LiveRedPacketNewPendantViewHelper$Mode.$VALUES = modeArray;
    }
    public void LiveRedPacketNewPendantViewHelper$Mode(String p0,int p1){
       super(p0, p1);
    }
    public void LiveRedPacketNewPendantViewHelper$Mode(String p0,int p1,b p2){
       super(p0, p1);
    }
    public static LiveRedPacketNewPendantViewHelper$Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketNewPendantViewHelper$Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPacketNewPendantViewHelper$Mode.class, p0);
    }
    public static LiveRedPacketNewPendantViewHelper$Mode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketNewPendantViewHelper$Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPacketNewPendantViewHelper$Mode.$VALUES.clone();
    }
    public void bind(LiveRedPacketNewPendantViewHelper p0,LiveRedPacketNewPendantViewHelper$c p1){
    }
}
