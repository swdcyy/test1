package com.kwai.framework.debuglog.DiagnosisClientLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DiagnosisClientLogLevel extends Enum	// class@000b24
{
    public int value;
    public static final DiagnosisClientLogLevel[] $VALUES;
    public static final DiagnosisClientLogLevel ALL;
    public static final DiagnosisClientLogLevel ERROR;
    public static final DiagnosisClientLogLevel NONE;
    public static final DiagnosisClientLogLevel UNKNOWN;

    static {
       DiagnosisClientLogLevel uDiagnosisCl = new DiagnosisClientLogLevel("UNKNOWN", 0, 0);
       DiagnosisClientLogLevel.UNKNOWN = uDiagnosisCl;
       DiagnosisClientLogLevel uDiagnosisCl1 = new DiagnosisClientLogLevel("NONE", 1, 1);
       DiagnosisClientLogLevel.NONE = uDiagnosisCl1;
       DiagnosisClientLogLevel uDiagnosisCl2 = new DiagnosisClientLogLevel("ERROR", 2, 2);
       DiagnosisClientLogLevel.ERROR = uDiagnosisCl2;
       DiagnosisClientLogLevel uDiagnosisCl3 = new DiagnosisClientLogLevel("ALL", 3, 3);
       DiagnosisClientLogLevel.ALL = uDiagnosisCl3;
       DiagnosisClientLogLevel[] uDiagnosisCl4 = new DiagnosisClientLogLevel[]{uDiagnosisCl,uDiagnosisCl1,uDiagnosisCl2,uDiagnosisCl3};
       DiagnosisClientLogLevel.$VALUES = uDiagnosisCl4;
    }
    public void DiagnosisClientLogLevel(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static DiagnosisClientLogLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DiagnosisClientLogLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DiagnosisClientLogLevel.class, p0);
    }
    public static DiagnosisClientLogLevel valueOfInt(int p0){
       if (p0 == 1) {
          return DiagnosisClientLogLevel.NONE;
       }
       if (p0 == 2) {
          return DiagnosisClientLogLevel.ERROR;
       }
       if (p0 != 3) {
          return DiagnosisClientLogLevel.UNKNOWN;
       }
       return DiagnosisClientLogLevel.ALL;
    }
    public static DiagnosisClientLogLevel[] values(){
       Object obj = PatchProxy.apply(null, null, DiagnosisClientLogLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DiagnosisClientLogLevel.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
