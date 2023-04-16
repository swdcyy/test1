package com.kwai.framework.exceptionhandler.constant.CrashProtectorConstants$CrashType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CrashProtectorConstants$CrashType extends Enum	// class@00153d
{
    public int mFlag;
    public static final CrashProtectorConstants$CrashType[] $VALUES;
    public static final CrashProtectorConstants$CrashType BAIDU_MAP;
    public static final CrashProtectorConstants$CrashType BUGLY;
    public static final CrashProtectorConstants$CrashType BUSY_TIME;
    public static final CrashProtectorConstants$CrashType LAUNCH;
    public static final CrashProtectorConstants$CrashType MMA;
    public static final CrashProtectorConstants$CrashType PUSH;
    public static final CrashProtectorConstants$CrashType QM;
    public static final CrashProtectorConstants$CrashType TENCENT_MAP;

    static {
       CrashProtectorConstants$CrashType uCrashType = new CrashProtectorConstants$CrashType("PUSH", 0, 1);
       CrashProtectorConstants$CrashType.PUSH = uCrashType;
       CrashProtectorConstants$CrashType uCrashType1 = new CrashProtectorConstants$CrashType("BUGLY", 1, 2);
       CrashProtectorConstants$CrashType.BUGLY = uCrashType1;
       CrashProtectorConstants$CrashType uCrashType2 = new CrashProtectorConstants$CrashType("BAIDU_MAP", 2, 4);
       CrashProtectorConstants$CrashType.BAIDU_MAP = uCrashType2;
       CrashProtectorConstants$CrashType uCrashType3 = new CrashProtectorConstants$CrashType("TENCENT_MAP", 3, 8);
       CrashProtectorConstants$CrashType.TENCENT_MAP = uCrashType3;
       CrashProtectorConstants$CrashType uCrashType4 = new CrashProtectorConstants$CrashType("QM", 4, 32);
       CrashProtectorConstants$CrashType.QM = uCrashType4;
       CrashProtectorConstants$CrashType uCrashType5 = new CrashProtectorConstants$CrashType("MMA", 5, 64);
       CrashProtectorConstants$CrashType.MMA = uCrashType5;
       CrashProtectorConstants$CrashType uCrashType6 = new CrashProtectorConstants$CrashType("LAUNCH", 6, 128);
       CrashProtectorConstants$CrashType.LAUNCH = uCrashType6;
       CrashProtectorConstants$CrashType uCrashType7 = new CrashProtectorConstants$CrashType("BUSY_TIME", 7, 256);
       CrashProtectorConstants$CrashType.BUSY_TIME = uCrashType7;
       CrashProtectorConstants$CrashType[] uCrashTypeAr = new CrashProtectorConstants$CrashType[]{uCrashType,uCrashType1,uCrashType2,uCrashType3,uCrashType4,uCrashType5,uCrashType6,uCrashType7};
       CrashProtectorConstants$CrashType.$VALUES = uCrashTypeAr;
    }
    public void CrashProtectorConstants$CrashType(String p0,int p1,int p2){
       super(p0, p1);
       this.mFlag = p2;
    }
    public static CrashProtectorConstants$CrashType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CrashProtectorConstants$CrashType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CrashProtectorConstants$CrashType.class, p0);
    }
    public static CrashProtectorConstants$CrashType[] values(){
       Object obj = PatchProxy.apply(null, null, CrashProtectorConstants$CrashType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CrashProtectorConstants$CrashType.$VALUES.clone();
    }
    public int getFlag(){
       return this.mFlag;
    }
}
