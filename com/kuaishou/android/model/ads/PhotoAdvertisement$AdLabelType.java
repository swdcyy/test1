package com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdvertisement$AdLabelType extends Enum	// class@0008ac
{
    public static final PhotoAdvertisement$AdLabelType[] $VALUES;
    public static final PhotoAdvertisement$AdLabelType SOLID_BACKGROUND;
    public static final PhotoAdvertisement$AdLabelType TRANSPARENT_BACKGROUND;

    static {
       PhotoAdvertisement$AdLabelType uAdLabelType = new PhotoAdvertisement$AdLabelType("TRANSPARENT_BACKGROUND", 0);
       PhotoAdvertisement$AdLabelType.TRANSPARENT_BACKGROUND = uAdLabelType;
       PhotoAdvertisement$AdLabelType uAdLabelType1 = new PhotoAdvertisement$AdLabelType("SOLID_BACKGROUND", 1);
       PhotoAdvertisement$AdLabelType.SOLID_BACKGROUND = uAdLabelType1;
       PhotoAdvertisement$AdLabelType[] uAdLabelType2 = new PhotoAdvertisement$AdLabelType[]{uAdLabelType,uAdLabelType1};
       PhotoAdvertisement$AdLabelType.$VALUES = uAdLabelType2;
    }
    public void PhotoAdvertisement$AdLabelType(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdvertisement$AdLabelType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdvertisement$AdLabelType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdvertisement$AdLabelType.class, p0);
    }
    public static PhotoAdvertisement$AdLabelType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdvertisement$AdLabelType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdvertisement$AdLabelType.$VALUES.clone();
    }
}
