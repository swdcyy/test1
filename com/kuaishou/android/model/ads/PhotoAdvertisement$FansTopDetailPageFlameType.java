package com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdvertisement$FansTopDetailPageFlameType extends Enum	// class@000935
{
    public static final PhotoAdvertisement$FansTopDetailPageFlameType[] $VALUES;
    public static final PhotoAdvertisement$FansTopDetailPageFlameType FLAME_ONLY;
    public static final PhotoAdvertisement$FansTopDetailPageFlameType FLAME_WITH_MESSAGE;
    public static final PhotoAdvertisement$FansTopDetailPageFlameType NONE;
    public static final PhotoAdvertisement$FansTopDetailPageFlameType ORIGINAL;

    static {
       PhotoAdvertisement$FansTopDetailPageFlameType uFansTopDeta = new PhotoAdvertisement$FansTopDetailPageFlameType("ORIGINAL", 0);
       PhotoAdvertisement$FansTopDetailPageFlameType.ORIGINAL = uFansTopDeta;
       PhotoAdvertisement$FansTopDetailPageFlameType uFansTopDeta1 = new PhotoAdvertisement$FansTopDetailPageFlameType("FLAME_ONLY", 1);
       PhotoAdvertisement$FansTopDetailPageFlameType.FLAME_ONLY = uFansTopDeta1;
       PhotoAdvertisement$FansTopDetailPageFlameType uFansTopDeta2 = new PhotoAdvertisement$FansTopDetailPageFlameType("FLAME_WITH_MESSAGE", 2);
       PhotoAdvertisement$FansTopDetailPageFlameType.FLAME_WITH_MESSAGE = uFansTopDeta2;
       PhotoAdvertisement$FansTopDetailPageFlameType uFansTopDeta3 = new PhotoAdvertisement$FansTopDetailPageFlameType("NONE", 3);
       PhotoAdvertisement$FansTopDetailPageFlameType.NONE = uFansTopDeta3;
       PhotoAdvertisement$FansTopDetailPageFlameType[] uFansTopDeta4 = new PhotoAdvertisement$FansTopDetailPageFlameType[]{uFansTopDeta,uFansTopDeta1,uFansTopDeta2,uFansTopDeta3};
       PhotoAdvertisement$FansTopDetailPageFlameType.$VALUES = uFansTopDeta4;
    }
    public void PhotoAdvertisement$FansTopDetailPageFlameType(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdvertisement$FansTopDetailPageFlameType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdvertisement$FansTopDetailPageFlameType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdvertisement$FansTopDetailPageFlameType.class, p0);
    }
    public static PhotoAdvertisement$FansTopDetailPageFlameType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdvertisement$FansTopDetailPageFlameType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdvertisement$FansTopDetailPageFlameType.$VALUES.clone();
    }
}
