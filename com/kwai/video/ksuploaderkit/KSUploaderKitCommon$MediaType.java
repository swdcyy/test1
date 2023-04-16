package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$MediaType extends Enum	// class@00096d
{
    public static final KSUploaderKitCommon$MediaType[] $VALUES;
    public static final KSUploaderKitCommon$MediaType File;
    public static final KSUploaderKitCommon$MediaType Image;
    public static final KSUploaderKitCommon$MediaType Unknown;
    public static final KSUploaderKitCommon$MediaType Video;
    public static final KSUploaderKitCommon$MediaType VideoWithCover;

    static {
       KSUploaderKitCommon$MediaType mediaType = new KSUploaderKitCommon$MediaType("Unknown", 0);
       KSUploaderKitCommon$MediaType.Unknown = mediaType;
       KSUploaderKitCommon$MediaType mediaType1 = new KSUploaderKitCommon$MediaType("Image", 1);
       KSUploaderKitCommon$MediaType.Image = mediaType1;
       KSUploaderKitCommon$MediaType mediaType2 = new KSUploaderKitCommon$MediaType("Video", 2);
       KSUploaderKitCommon$MediaType.Video = mediaType2;
       KSUploaderKitCommon$MediaType mediaType3 = new KSUploaderKitCommon$MediaType("VideoWithCover", 3);
       KSUploaderKitCommon$MediaType.VideoWithCover = mediaType3;
       KSUploaderKitCommon$MediaType mediaType4 = new KSUploaderKitCommon$MediaType("File", 4);
       KSUploaderKitCommon$MediaType.File = mediaType4;
       KSUploaderKitCommon$MediaType[] mediaTypeArr = new KSUploaderKitCommon$MediaType[]{mediaType,mediaType1,mediaType2,mediaType3,mediaType4};
       KSUploaderKitCommon$MediaType.$VALUES = mediaTypeArr;
    }
    public void KSUploaderKitCommon$MediaType(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitCommon$MediaType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$MediaType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$MediaType.class, p0);
    }
    public static KSUploaderKitCommon$MediaType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$MediaType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$MediaType.$VALUES.clone();
    }
}
