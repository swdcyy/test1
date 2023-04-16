package com.kwai.sdk.kbar.qrdetection.KBarConfig$DetectType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KBarConfig$DetectType extends Enum	// class@001622
{
    public int val;
    public static final KBarConfig$DetectType[] $VALUES;
    public static final KBarConfig$DetectType DETECT_AR;
    public static final KBarConfig$DetectType DETECT_QRONED;

    static {
       KBarConfig$DetectType uDetectType = new KBarConfig$DetectType("DETECT_QRONED", 0, 0);
       KBarConfig$DetectType.DETECT_QRONED = uDetectType;
       KBarConfig$DetectType uDetectType1 = new KBarConfig$DetectType("DETECT_AR", 1, 1);
       KBarConfig$DetectType.DETECT_AR = uDetectType1;
       KBarConfig$DetectType[] uDetectTypeA = new KBarConfig$DetectType[]{uDetectType,uDetectType1};
       KBarConfig$DetectType.$VALUES = uDetectTypeA;
    }
    public void KBarConfig$DetectType(String p0,int p1,int p2){
       super(p0, p1);
       this.val = p2;
    }
    public static KBarConfig$DetectType valueOf(String p0){
       return Enum.valueOf(KBarConfig$DetectType.class, p0);
    }
    public static KBarConfig$DetectType[] values(){
       return KBarConfig$DetectType.$VALUES.clone();
    }
    public int val(){
       return this.val;
    }
}
