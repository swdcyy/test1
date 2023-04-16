package com.kwai.chat.kwailink.log.KLog$KLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KLog$KLogLevel extends Enum	// class@000a5d
{
    public static final KLog$KLogLevel[] $VALUES;
    public static final KLog$KLogLevel kDebug;
    public static final KLog$KLogLevel kError;
    public static final KLog$KLogLevel kInfo;
    public static final KLog$KLogLevel kVerbose;
    public static final KLog$KLogLevel kWarn;

    static {
       KLog$KLogLevel kLogLevel = new KLog$KLogLevel("kVerbose", 0);
       KLog$KLogLevel.kVerbose = kLogLevel;
       KLog$KLogLevel kLogLevel1 = new KLog$KLogLevel("kDebug", 1);
       KLog$KLogLevel.kDebug = kLogLevel1;
       KLog$KLogLevel kLogLevel2 = new KLog$KLogLevel("kInfo", 2);
       KLog$KLogLevel.kInfo = kLogLevel2;
       KLog$KLogLevel kLogLevel3 = new KLog$KLogLevel("kWarn", 3);
       KLog$KLogLevel.kWarn = kLogLevel3;
       KLog$KLogLevel kLogLevel4 = new KLog$KLogLevel("kError", 4);
       KLog$KLogLevel.kError = kLogLevel4;
       KLog$KLogLevel[] kLogLevelArr = new KLog$KLogLevel[]{kLogLevel,kLogLevel1,kLogLevel2,kLogLevel3,kLogLevel4};
       KLog$KLogLevel.$VALUES = kLogLevelArr;
    }
    public void KLog$KLogLevel(String p0,int p1){
       super(p0, p1);
    }
    public static KLog$KLogLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLog$KLogLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KLog$KLogLevel.class, p0);
    }
    public static KLog$KLogLevel[] values(){
       Object obj = PatchProxy.apply(null, null, KLog$KLogLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KLog$KLogLevel.$VALUES.clone();
    }
}
