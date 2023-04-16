package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$UploadMode extends Enum	// class@000972
{
    public static final KSUploaderKitCommon$UploadMode[] $VALUES;
    public static final KSUploaderKitCommon$UploadMode Fragement;
    public static final KSUploaderKitCommon$UploadMode Whole;

    static {
       KSUploaderKitCommon$UploadMode uploadMode = new KSUploaderKitCommon$UploadMode("Whole", 0);
       KSUploaderKitCommon$UploadMode.Whole = uploadMode;
       KSUploaderKitCommon$UploadMode uploadMode1 = new KSUploaderKitCommon$UploadMode("Fragement", 1);
       KSUploaderKitCommon$UploadMode.Fragement = uploadMode1;
       KSUploaderKitCommon$UploadMode[] uploadModeAr = new KSUploaderKitCommon$UploadMode[]{uploadMode,uploadMode1};
       KSUploaderKitCommon$UploadMode.$VALUES = uploadModeAr;
    }
    public void KSUploaderKitCommon$UploadMode(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitCommon$UploadMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$UploadMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$UploadMode.class, p0);
    }
    public static KSUploaderKitCommon$UploadMode[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$UploadMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$UploadMode.$VALUES.clone();
    }
}
