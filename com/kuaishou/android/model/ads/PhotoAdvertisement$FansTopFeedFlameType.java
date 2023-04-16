package com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdvertisement$FansTopFeedFlameType extends Enum	// class@000939
{
    public static final PhotoAdvertisement$FansTopFeedFlameType[] $VALUES;
    public static final PhotoAdvertisement$FansTopFeedFlameType FLAME_ONLY;
    public static final PhotoAdvertisement$FansTopFeedFlameType FLAME_ON_COVER_IMAGE;
    public static final PhotoAdvertisement$FansTopFeedFlameType FLAME_WITH_MESSAGE;
    public static final PhotoAdvertisement$FansTopFeedFlameType NONE;
    public static final PhotoAdvertisement$FansTopFeedFlameType ORIGINAL;

    static {
       PhotoAdvertisement$FansTopFeedFlameType uFansTopFeed = new PhotoAdvertisement$FansTopFeedFlameType("ORIGINAL", 0);
       PhotoAdvertisement$FansTopFeedFlameType.ORIGINAL = uFansTopFeed;
       PhotoAdvertisement$FansTopFeedFlameType uFansTopFeed1 = new PhotoAdvertisement$FansTopFeedFlameType("FLAME_ONLY", 1);
       PhotoAdvertisement$FansTopFeedFlameType.FLAME_ONLY = uFansTopFeed1;
       PhotoAdvertisement$FansTopFeedFlameType uFansTopFeed2 = new PhotoAdvertisement$FansTopFeedFlameType("FLAME_WITH_MESSAGE", 2);
       PhotoAdvertisement$FansTopFeedFlameType.FLAME_WITH_MESSAGE = uFansTopFeed2;
       PhotoAdvertisement$FansTopFeedFlameType uFansTopFeed3 = new PhotoAdvertisement$FansTopFeedFlameType("FLAME_ON_COVER_IMAGE", 3);
       PhotoAdvertisement$FansTopFeedFlameType.FLAME_ON_COVER_IMAGE = uFansTopFeed3;
       PhotoAdvertisement$FansTopFeedFlameType uFansTopFeed4 = new PhotoAdvertisement$FansTopFeedFlameType("NONE", 4);
       PhotoAdvertisement$FansTopFeedFlameType.NONE = uFansTopFeed4;
       PhotoAdvertisement$FansTopFeedFlameType[] uFansTopFeed5 = new PhotoAdvertisement$FansTopFeedFlameType[]{uFansTopFeed,uFansTopFeed1,uFansTopFeed2,uFansTopFeed3,uFansTopFeed4};
       PhotoAdvertisement$FansTopFeedFlameType.$VALUES = uFansTopFeed5;
    }
    public void PhotoAdvertisement$FansTopFeedFlameType(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdvertisement$FansTopFeedFlameType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdvertisement$FansTopFeedFlameType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdvertisement$FansTopFeedFlameType.class, p0);
    }
    public static PhotoAdvertisement$FansTopFeedFlameType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdvertisement$FansTopFeedFlameType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdvertisement$FansTopFeedFlameType.$VALUES.clone();
    }
}
