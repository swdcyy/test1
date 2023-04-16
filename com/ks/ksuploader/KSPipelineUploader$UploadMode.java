package com.ks.ksuploader.KSPipelineUploader$UploadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSPipelineUploader$UploadMode extends Enum	// class@000757
{
    public static final KSPipelineUploader$UploadMode[] $VALUES;
    public static final KSPipelineUploader$UploadMode UploadMode_Fragment;
    public static final KSPipelineUploader$UploadMode UploadMode_Init;
    public static final KSPipelineUploader$UploadMode UploadMode_Streaming;
    public static final KSPipelineUploader$UploadMode UploadMode_Whole;

    static {
       KSPipelineUploader$UploadMode uploadMode = new KSPipelineUploader$UploadMode("UploadMode_Init", 0);
       KSPipelineUploader$UploadMode.UploadMode_Init = uploadMode;
       KSPipelineUploader$UploadMode uploadMode1 = new KSPipelineUploader$UploadMode("UploadMode_Whole", 1);
       KSPipelineUploader$UploadMode.UploadMode_Whole = uploadMode1;
       KSPipelineUploader$UploadMode uploadMode2 = new KSPipelineUploader$UploadMode("UploadMode_Fragment", 2);
       KSPipelineUploader$UploadMode.UploadMode_Fragment = uploadMode2;
       KSPipelineUploader$UploadMode uploadMode3 = new KSPipelineUploader$UploadMode("UploadMode_Streaming", 3);
       KSPipelineUploader$UploadMode.UploadMode_Streaming = uploadMode3;
       KSPipelineUploader$UploadMode[] uploadModeAr = new KSPipelineUploader$UploadMode[]{uploadMode,uploadMode1,uploadMode2,uploadMode3};
       KSPipelineUploader$UploadMode.$VALUES = uploadModeAr;
    }
    public void KSPipelineUploader$UploadMode(String p0,int p1){
       super(p0, p1);
    }
    public static KSPipelineUploader$UploadMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSPipelineUploader$UploadMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSPipelineUploader$UploadMode.class, p0);
    }
    public static KSPipelineUploader$UploadMode[] values(){
       Object obj = PatchProxy.apply(null, null, KSPipelineUploader$UploadMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSPipelineUploader$UploadMode.$VALUES.clone();
    }
}
