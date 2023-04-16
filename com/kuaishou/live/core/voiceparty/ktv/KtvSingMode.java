package com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KtvSingMode extends Enum	// class@00151c
{
    public static final KtvSingMode[] $VALUES;
    public static final KtvSingMode MV;
    public static final KtvSingMode OFF;
    public static final KtvSingMode VIDEO;

    static {
       KtvSingMode ktvSingMode;
       KtvSingMode[] ktvSingModeA = new KtvSingMode[]{ktvSingMode,ktvSingMode,ktvSingMode};
       ktvSingMode = new KtvSingMode("OFF", 0);
       KtvSingMode.OFF = ktvSingMode;
       ktvSingMode = new KtvSingMode("MV", 1);
       KtvSingMode.MV = ktvSingMode;
       ktvSingMode = new KtvSingMode("VIDEO", 2);
       KtvSingMode.VIDEO = ktvSingMode;
       KtvSingMode.$VALUES = ktvSingModeA;
    }
    public void KtvSingMode(String p0,int p1){
       super(p0, p1);
    }
    public static KtvSingMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KtvSingMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KtvSingMode.class, p0);
    }
    public static KtvSingMode[] values(){
       Object obj = PatchProxy.apply(null, null, KtvSingMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KtvSingMode.$VALUES.clone();
    }
}
