package com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderLogLevel extends Enum	// class@000767
{
    public static final KSUploaderLogLevel[] $VALUES;
    public static final KSUploaderLogLevel KSUploaderLogLevel_Debug;
    public static final KSUploaderLogLevel KSUploaderLogLevel_Error;
    public static final KSUploaderLogLevel KSUploaderLogLevel_Info;
    public static final KSUploaderLogLevel KSUploaderLogLevel_Warn;

    static {
       KSUploaderLogLevel kSUploaderLo = new KSUploaderLogLevel("KSUploaderLogLevel_Debug", 0);
       KSUploaderLogLevel.KSUploaderLogLevel_Debug = kSUploaderLo;
       KSUploaderLogLevel kSUploaderLo1 = new KSUploaderLogLevel("KSUploaderLogLevel_Info", 1);
       KSUploaderLogLevel.KSUploaderLogLevel_Info = kSUploaderLo1;
       KSUploaderLogLevel kSUploaderLo2 = new KSUploaderLogLevel("KSUploaderLogLevel_Warn", 2);
       KSUploaderLogLevel.KSUploaderLogLevel_Warn = kSUploaderLo2;
       KSUploaderLogLevel kSUploaderLo3 = new KSUploaderLogLevel("KSUploaderLogLevel_Error", 3);
       KSUploaderLogLevel.KSUploaderLogLevel_Error = kSUploaderLo3;
       KSUploaderLogLevel[] kSUploaderLo4 = new KSUploaderLogLevel[]{kSUploaderLo,kSUploaderLo1,kSUploaderLo2,kSUploaderLo3};
       KSUploaderLogLevel.$VALUES = kSUploaderLo4;
    }
    public void KSUploaderLogLevel(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderLogLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderLogLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderLogLevel.class, p0);
    }
    public static KSUploaderLogLevel[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderLogLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderLogLevel.$VALUES.clone();
    }
}
