package com.kuaishou.android.security.base.util.KSecurityTrack$LEVEL;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSecurityTrack$LEVEL extends Enum	// class@000f16
{
    public final int level;
    public final String levelString;
    public static final KSecurityTrack$LEVEL[] $VALUES;
    public static final KSecurityTrack$LEVEL ASSERT;
    public static final KSecurityTrack$LEVEL DEBUG;
    public static final KSecurityTrack$LEVEL ERROR;
    public static final KSecurityTrack$LEVEL INFO;
    public static final KSecurityTrack$LEVEL VERBOSE;
    public static final KSecurityTrack$LEVEL WARN;

    static {
       KSecurityTrack$LEVEL lEVEL = new KSecurityTrack$LEVEL("VERBOSE", 0, 2, "V");
       KSecurityTrack$LEVEL.VERBOSE = lEVEL;
       KSecurityTrack$LEVEL lEVEL1 = new KSecurityTrack$LEVEL("DEBUG", 1, 3, "D");
       KSecurityTrack$LEVEL.DEBUG = lEVEL1;
       KSecurityTrack$LEVEL lEVEL2 = new KSecurityTrack$LEVEL("INFO", 2, 4, "I");
       KSecurityTrack$LEVEL.INFO = lEVEL2;
       KSecurityTrack$LEVEL lEVEL3 = new KSecurityTrack$LEVEL("WARN", 3, 5, "W");
       KSecurityTrack$LEVEL.WARN = lEVEL3;
       KSecurityTrack$LEVEL lEVEL4 = new KSecurityTrack$LEVEL("ERROR", 4, 6, "E");
       KSecurityTrack$LEVEL.ERROR = lEVEL4;
       KSecurityTrack$LEVEL lEVEL5 = new KSecurityTrack$LEVEL("ASSERT", 5, 7, "A");
       KSecurityTrack$LEVEL.ASSERT = lEVEL5;
       KSecurityTrack$LEVEL[] lEVELArray = new KSecurityTrack$LEVEL[]{lEVEL,lEVEL1,lEVEL2,lEVEL3,lEVEL4,lEVEL5};
       KSecurityTrack$LEVEL.$VALUES = lEVELArray;
    }
    public void KSecurityTrack$LEVEL(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.level = p2;
       this.levelString = p3;
    }
    public static KSecurityTrack$LEVEL valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurityTrack$LEVEL.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSecurityTrack$LEVEL.class, p0);
    }
    public static KSecurityTrack$LEVEL[] values(){
       Object obj = PatchProxy.apply(null, null, KSecurityTrack$LEVEL.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSecurityTrack$LEVEL.$VALUES.clone();
    }
    public int getLevel(){
       return this.level;
    }
    public String getLevelString(){
       return this.levelString;
    }
}
