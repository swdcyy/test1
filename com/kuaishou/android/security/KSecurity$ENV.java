package com.kuaishou.android.security.KSecurity$ENV;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSecurity$ENV extends Enum	// class@000ed0
{
    public final int value;
    public static final KSecurity$ENV[] $VALUES;
    public static final KSecurity$ENV ANTIDEBUG;
    public static final KSecurity$ENV EMULATOR;
    public static final KSecurity$ENV HOOK;
    public static final KSecurity$ENV MALWARE;
    public static final KSecurity$ENV REPACK;
    public static final KSecurity$ENV ROOT;

    static {
       KSecurity$ENV uENV = new KSecurity$ENV("ROOT", 0, 0);
       KSecurity$ENV.ROOT = uENV;
       KSecurity$ENV uENV1 = new KSecurity$ENV("MALWARE", 1, 1);
       KSecurity$ENV.MALWARE = uENV1;
       KSecurity$ENV uENV2 = new KSecurity$ENV("HOOK", 2, 2);
       KSecurity$ENV.HOOK = uENV2;
       KSecurity$ENV uENV3 = new KSecurity$ENV("EMULATOR", 3, 3);
       KSecurity$ENV.EMULATOR = uENV3;
       KSecurity$ENV uENV4 = new KSecurity$ENV("ANTIDEBUG", 4, 4);
       KSecurity$ENV.ANTIDEBUG = uENV4;
       KSecurity$ENV uENV5 = new KSecurity$ENV("REPACK", 5, 5);
       KSecurity$ENV.REPACK = uENV5;
       KSecurity$ENV[] uENVArray = new KSecurity$ENV[]{uENV,uENV1,uENV2,uENV3,uENV4,uENV5};
       KSecurity$ENV.$VALUES = uENVArray;
    }
    public void KSecurity$ENV(String p0,int p1,int p2){
       this.value = p2;
    }
    public static KSecurity$ENV valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity$ENV.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSecurity$ENV.class, p0);
    }
    public static KSecurity$ENV[] values(){
       Object obj = PatchProxy.apply(null, null, KSecurity$ENV.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSecurity$ENV.$VALUES.clone();
    }
    public int getIntValue(){
       return this.value;
    }
}
