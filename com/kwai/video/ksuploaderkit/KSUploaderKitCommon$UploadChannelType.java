package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$UploadChannelType extends Enum	// class@000971
{
    public String mValue;
    public static final KSUploaderKitCommon$UploadChannelType[] $VALUES;
    public static final KSUploaderKitCommon$UploadChannelType MultiConcurrent;
    public static final KSUploaderKitCommon$UploadChannelType MultiSerial;
    public static final KSUploaderKitCommon$UploadChannelType Single;

    static {
       KSUploaderKitCommon$UploadChannelType uploadChanne = new KSUploaderKitCommon$UploadChannelType("Single", 0, "single");
       KSUploaderKitCommon$UploadChannelType.Single = uploadChanne;
       KSUploaderKitCommon$UploadChannelType uploadChanne1 = new KSUploaderKitCommon$UploadChannelType("MultiSerial", 1, "multi_serial");
       KSUploaderKitCommon$UploadChannelType.MultiSerial = uploadChanne1;
       KSUploaderKitCommon$UploadChannelType uploadChanne2 = new KSUploaderKitCommon$UploadChannelType("MultiConcurrent", 2, "multi_concurrent");
       KSUploaderKitCommon$UploadChannelType.MultiConcurrent = uploadChanne2;
       KSUploaderKitCommon$UploadChannelType[] uploadChanne3 = new KSUploaderKitCommon$UploadChannelType[]{uploadChanne,uploadChanne1,uploadChanne2};
       KSUploaderKitCommon$UploadChannelType.$VALUES = uploadChanne3;
    }
    public void KSUploaderKitCommon$UploadChannelType(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static KSUploaderKitCommon$UploadChannelType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$UploadChannelType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$UploadChannelType.class, p0);
    }
    public static KSUploaderKitCommon$UploadChannelType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$UploadChannelType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$UploadChannelType.$VALUES.clone();
    }
    public String value(){
       return this.mValue;
    }
}
