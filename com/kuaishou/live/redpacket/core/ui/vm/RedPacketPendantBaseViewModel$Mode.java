package com.kuaishou.live.redpacket.core.ui.vm.RedPacketPendantBaseViewModel$Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketPendantBaseViewModel$Mode extends Enum	// class@000f3d
{
    public static final RedPacketPendantBaseViewModel$Mode[] $VALUES;
    public static final RedPacketPendantBaseViewModel$Mode CountDown;
    public static final RedPacketPendantBaseViewModel$Mode Opened;
    public static final RedPacketPendantBaseViewModel$Mode Opening;

    static {
       RedPacketPendantBaseViewModel$Mode mode = new RedPacketPendantBaseViewModel$Mode("CountDown", 0);
       RedPacketPendantBaseViewModel$Mode.CountDown = mode;
       RedPacketPendantBaseViewModel$Mode mode1 = new RedPacketPendantBaseViewModel$Mode("Opening", 1);
       RedPacketPendantBaseViewModel$Mode.Opening = mode1;
       RedPacketPendantBaseViewModel$Mode mode2 = new RedPacketPendantBaseViewModel$Mode("Opened", 2);
       RedPacketPendantBaseViewModel$Mode.Opened = mode2;
       RedPacketPendantBaseViewModel$Mode[] modeArray = new RedPacketPendantBaseViewModel$Mode[]{mode,mode1,mode2};
       RedPacketPendantBaseViewModel$Mode.$VALUES = modeArray;
    }
    public void RedPacketPendantBaseViewModel$Mode(String p0,int p1){
       super(p0, p1);
    }
    public static RedPacketPendantBaseViewModel$Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketPendantBaseViewModel$Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketPendantBaseViewModel$Mode.class, p0);
    }
    public static RedPacketPendantBaseViewModel$Mode[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketPendantBaseViewModel$Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketPendantBaseViewModel$Mode.$VALUES.clone();
    }
}
