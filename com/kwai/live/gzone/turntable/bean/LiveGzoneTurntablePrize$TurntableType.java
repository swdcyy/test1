package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneTurntablePrize$TurntableType extends Enum	// class@000e38
{
    public int value;
    public static final LiveGzoneTurntablePrize$TurntableType[] $VALUES;
    public static final LiveGzoneTurntablePrize$TurntableType BACK_PACK;
    public static final LiveGzoneTurntablePrize$TurntableType CDK;
    public static final LiveGzoneTurntablePrize$TurntableType EMPTY;
    public static final LiveGzoneTurntablePrize$TurntableType GAME_GIFT;
    public static final LiveGzoneTurntablePrize$TurntableType KSHELL;
    public static final LiveGzoneTurntablePrize$TurntableType LUCKY_MEDAL;
    public static final LiveGzoneTurntablePrize$TurntableType NONSUPPORT;
    public static final LiveGzoneTurntablePrize$TurntableType PHYSICAL_GIFT;

    static {
       LiveGzoneTurntablePrize$TurntableType turntableTyp = new LiveGzoneTurntablePrize$TurntableType("PHYSICAL_GIFT", 0, 1);
       LiveGzoneTurntablePrize$TurntableType.PHYSICAL_GIFT = turntableTyp;
       LiveGzoneTurntablePrize$TurntableType turntableTyp1 = new LiveGzoneTurntablePrize$TurntableType("KSHELL", 1, 2);
       LiveGzoneTurntablePrize$TurntableType.KSHELL = turntableTyp1;
       LiveGzoneTurntablePrize$TurntableType turntableTyp2 = new LiveGzoneTurntablePrize$TurntableType("CDK", 2, 3);
       LiveGzoneTurntablePrize$TurntableType.CDK = turntableTyp2;
       LiveGzoneTurntablePrize$TurntableType turntableTyp3 = new LiveGzoneTurntablePrize$TurntableType("BACK_PACK", 3, 4);
       LiveGzoneTurntablePrize$TurntableType.BACK_PACK = turntableTyp3;
       LiveGzoneTurntablePrize$TurntableType turntableTyp4 = new LiveGzoneTurntablePrize$TurntableType("EMPTY", 4, 5);
       LiveGzoneTurntablePrize$TurntableType.EMPTY = turntableTyp4;
       LiveGzoneTurntablePrize$TurntableType turntableTyp5 = new LiveGzoneTurntablePrize$TurntableType("LUCKY_MEDAL", 5, 6);
       LiveGzoneTurntablePrize$TurntableType.LUCKY_MEDAL = turntableTyp5;
       LiveGzoneTurntablePrize$TurntableType turntableTyp6 = new LiveGzoneTurntablePrize$TurntableType("GAME_GIFT", 6, 7);
       LiveGzoneTurntablePrize$TurntableType.GAME_GIFT = turntableTyp6;
       LiveGzoneTurntablePrize$TurntableType turntableTyp7 = new LiveGzoneTurntablePrize$TurntableType("NONSUPPORT", 7, -1);
       LiveGzoneTurntablePrize$TurntableType.NONSUPPORT = turntableTyp7;
       LiveGzoneTurntablePrize$TurntableType[] turntableTyp8 = new LiveGzoneTurntablePrize$TurntableType[]{turntableTyp,turntableTyp1,turntableTyp2,turntableTyp3,turntableTyp4,turntableTyp5,turntableTyp6,turntableTyp7};
       LiveGzoneTurntablePrize$TurntableType.$VALUES = turntableTyp8;
    }
    public void LiveGzoneTurntablePrize$TurntableType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveGzoneTurntablePrize$TurntableType from(int p0){
       LiveGzoneTurntablePrize$TurntableType[] obj;
       object oobject;
       LiveGzoneTurntablePrize$TurntableType turntableTyp = LiveGzoneTurntablePrize$TurntableType.class;
       if (PatchProxy.isSupport(turntableTyp)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, turntableTyp, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = LiveGzoneTurntablePrize$TurntableType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return LiveGzoneTurntablePrize$TurntableType.NONSUPPORT;
          }
          oobject = obj[i];
          if (oobject.value == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static LiveGzoneTurntablePrize$TurntableType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneTurntablePrize$TurntableType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneTurntablePrize$TurntableType.class, p0);
    }
    public static LiveGzoneTurntablePrize$TurntableType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneTurntablePrize$TurntableType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneTurntablePrize$TurntableType.$VALUES.clone();
    }
}
