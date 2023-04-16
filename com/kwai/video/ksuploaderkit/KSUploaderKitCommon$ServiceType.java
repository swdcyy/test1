package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$ServiceType extends Enum	// class@00096f
{
    public static final KSUploaderKitCommon$ServiceType[] $VALUES;
    public static final KSUploaderKitCommon$ServiceType General;
    public static final KSUploaderKitCommon$ServiceType MediaCloud;

    static {
       KSUploaderKitCommon$ServiceType serviceType = new KSUploaderKitCommon$ServiceType("MediaCloud", 0);
       KSUploaderKitCommon$ServiceType.MediaCloud = serviceType;
       KSUploaderKitCommon$ServiceType serviceType1 = new KSUploaderKitCommon$ServiceType("General", 1);
       KSUploaderKitCommon$ServiceType.General = serviceType1;
       KSUploaderKitCommon$ServiceType[] serviceTypeA = new KSUploaderKitCommon$ServiceType[]{serviceType,serviceType1};
       KSUploaderKitCommon$ServiceType.$VALUES = serviceTypeA;
    }
    public void KSUploaderKitCommon$ServiceType(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitCommon$ServiceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$ServiceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$ServiceType.class, p0);
    }
    public static KSUploaderKitCommon$ServiceType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$ServiceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$ServiceType.$VALUES.clone();
    }
}
