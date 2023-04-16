package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableLocalGiftType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneTurntablePrize$TurntableLocalGiftType extends Enum	// class@000e37
{
    public int value;
    public static final LiveGzoneTurntablePrize$TurntableLocalGiftType[] $VALUES;
    public static final LiveGzoneTurntablePrize$TurntableLocalGiftType DIVIDER;
    public static final LiveGzoneTurntablePrize$TurntableLocalGiftType NORMAL_GIFT;
    public static final LiveGzoneTurntablePrize$TurntableLocalGiftType WELFARE_GIFT;

    static {
       LiveGzoneTurntablePrize$TurntableLocalGiftType turntableLoc = new LiveGzoneTurntablePrize$TurntableLocalGiftType("NORMAL_GIFT", 0, 0);
       LiveGzoneTurntablePrize$TurntableLocalGiftType.NORMAL_GIFT = turntableLoc;
       LiveGzoneTurntablePrize$TurntableLocalGiftType turntableLoc1 = new LiveGzoneTurntablePrize$TurntableLocalGiftType("WELFARE_GIFT", 1, 1);
       LiveGzoneTurntablePrize$TurntableLocalGiftType.WELFARE_GIFT = turntableLoc1;
       LiveGzoneTurntablePrize$TurntableLocalGiftType turntableLoc2 = new LiveGzoneTurntablePrize$TurntableLocalGiftType("DIVIDER", 2, 2);
       LiveGzoneTurntablePrize$TurntableLocalGiftType.DIVIDER = turntableLoc2;
       LiveGzoneTurntablePrize$TurntableLocalGiftType[] turntableLoc3 = new LiveGzoneTurntablePrize$TurntableLocalGiftType[]{turntableLoc,turntableLoc1,turntableLoc2};
       LiveGzoneTurntablePrize$TurntableLocalGiftType.$VALUES = turntableLoc3;
    }
    public void LiveGzoneTurntablePrize$TurntableLocalGiftType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveGzoneTurntablePrize$TurntableLocalGiftType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneTurntablePrize$TurntableLocalGiftType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneTurntablePrize$TurntableLocalGiftType.class, p0);
    }
    public static LiveGzoneTurntablePrize$TurntableLocalGiftType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneTurntablePrize$TurntableLocalGiftType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneTurntablePrize$TurntableLocalGiftType.$VALUES.clone();
    }
}
