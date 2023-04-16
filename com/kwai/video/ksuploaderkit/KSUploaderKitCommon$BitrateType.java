package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BitrateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$BitrateType extends Enum	// class@00096a
{
    public static final KSUploaderKitCommon$BitrateType[] $VALUES;
    public static final KSUploaderKitCommon$BitrateType Average;
    public static final KSUploaderKitCommon$BitrateType Instant;

    static {
       KSUploaderKitCommon$BitrateType uBitrateType = new KSUploaderKitCommon$BitrateType("Instant", 0);
       KSUploaderKitCommon$BitrateType.Instant = uBitrateType;
       KSUploaderKitCommon$BitrateType uBitrateType1 = new KSUploaderKitCommon$BitrateType("Average", 1);
       KSUploaderKitCommon$BitrateType.Average = uBitrateType1;
       KSUploaderKitCommon$BitrateType[] uBitrateType2 = new KSUploaderKitCommon$BitrateType[]{uBitrateType,uBitrateType1};
       KSUploaderKitCommon$BitrateType.$VALUES = uBitrateType2;
    }
    public void KSUploaderKitCommon$BitrateType(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitCommon$BitrateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$BitrateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$BitrateType.class, p0);
    }
    public static KSUploaderKitCommon$BitrateType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$BitrateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$BitrateType.$VALUES.clone();
    }
}
