package com.kwai.feature.api.danmaku.params.DanmakuKitType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DanmakuKitType extends Enum	// class@000e8a
{
    public static final DanmakuKitType[] $VALUES;
    public static final DanmakuKitType CORONA;
    public static final DanmakuKitType LANDSCAPE;
    public static final DanmakuKitType LIVE;
    public static final DanmakuKitType PORTRAIT;

    static {
       DanmakuKitType uDanmakuKitT1;
       DanmakuKitType[] uDanmakuKitT = new DanmakuKitType[]{uDanmakuKitT1,uDanmakuKitT1,uDanmakuKitT1,uDanmakuKitT1};
       uDanmakuKitT1 = new DanmakuKitType("PORTRAIT", 0);
       DanmakuKitType.PORTRAIT = uDanmakuKitT1;
       uDanmakuKitT1 = new DanmakuKitType("LANDSCAPE", 1);
       DanmakuKitType.LANDSCAPE = uDanmakuKitT1;
       uDanmakuKitT1 = new DanmakuKitType("CORONA", 2);
       DanmakuKitType.CORONA = uDanmakuKitT1;
       uDanmakuKitT1 = new DanmakuKitType("LIVE", 3);
       DanmakuKitType.LIVE = uDanmakuKitT1;
       DanmakuKitType.$VALUES = uDanmakuKitT;
    }
    public void DanmakuKitType(String p0,int p1){
       super(p0, p1);
    }
    public static DanmakuKitType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuKitType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DanmakuKitType.class, p0);
    }
    public static DanmakuKitType[] values(){
       Object obj = PatchProxy.apply(null, null, DanmakuKitType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuKitType.$VALUES.clone();
    }
}
