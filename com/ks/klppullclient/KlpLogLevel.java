package com.ks.klppullclient.KlpLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KlpLogLevel extends Enum	// class@000741
{
    public static final KlpLogLevel[] $VALUES;
    public static final KlpLogLevel KlpLogLevel_Debug;
    public static final KlpLogLevel KlpLogLevel_Error;
    public static final KlpLogLevel KlpLogLevel_Info;
    public static final KlpLogLevel KlpLogLevel_Warn;

    static {
       KlpLogLevel klpLogLevel = new KlpLogLevel("KlpLogLevel_Debug", 0);
       KlpLogLevel.KlpLogLevel_Debug = klpLogLevel;
       KlpLogLevel klpLogLevel1 = new KlpLogLevel("KlpLogLevel_Info", 1);
       KlpLogLevel.KlpLogLevel_Info = klpLogLevel1;
       KlpLogLevel klpLogLevel2 = new KlpLogLevel("KlpLogLevel_Warn", 2);
       KlpLogLevel.KlpLogLevel_Warn = klpLogLevel2;
       KlpLogLevel klpLogLevel3 = new KlpLogLevel("KlpLogLevel_Error", 3);
       KlpLogLevel.KlpLogLevel_Error = klpLogLevel3;
       KlpLogLevel[] klpLogLevelA = new KlpLogLevel[]{klpLogLevel,klpLogLevel1,klpLogLevel2,klpLogLevel3};
       KlpLogLevel.$VALUES = klpLogLevelA;
    }
    public void KlpLogLevel(String p0,int p1){
       super(p0, p1);
    }
    public static KlpLogLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KlpLogLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KlpLogLevel.class, p0);
    }
    public static KlpLogLevel[] values(){
       Object obj = PatchProxy.apply(null, null, KlpLogLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KlpLogLevel.$VALUES.clone();
    }
}
