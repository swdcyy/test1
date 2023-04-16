package com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdvertisement$LandingPageType extends Enum	// class@00098e
{
    public static final PhotoAdvertisement$LandingPageType[] $VALUES;
    public static final PhotoAdvertisement$LandingPageType START_NEW_WEB;
    public static final PhotoAdvertisement$LandingPageType WEB_BELOW_PRODUCTS;
    public static final PhotoAdvertisement$LandingPageType WEB_INDICATOR;
    public static final PhotoAdvertisement$LandingPageType WEB_POP_UP_WINDOW;

    static {
       PhotoAdvertisement$LandingPageType landingPageT = new PhotoAdvertisement$LandingPageType("START_NEW_WEB", 0);
       PhotoAdvertisement$LandingPageType.START_NEW_WEB = landingPageT;
       PhotoAdvertisement$LandingPageType landingPageT1 = new PhotoAdvertisement$LandingPageType("WEB_BELOW_PRODUCTS", 1);
       PhotoAdvertisement$LandingPageType.WEB_BELOW_PRODUCTS = landingPageT1;
       PhotoAdvertisement$LandingPageType landingPageT2 = new PhotoAdvertisement$LandingPageType("WEB_INDICATOR", 2);
       PhotoAdvertisement$LandingPageType.WEB_INDICATOR = landingPageT2;
       PhotoAdvertisement$LandingPageType landingPageT3 = new PhotoAdvertisement$LandingPageType("WEB_POP_UP_WINDOW", 3);
       PhotoAdvertisement$LandingPageType.WEB_POP_UP_WINDOW = landingPageT3;
       PhotoAdvertisement$LandingPageType[] landingPageT4 = new PhotoAdvertisement$LandingPageType[]{landingPageT,landingPageT1,landingPageT2,landingPageT3};
       PhotoAdvertisement$LandingPageType.$VALUES = landingPageT4;
    }
    public void PhotoAdvertisement$LandingPageType(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdvertisement$LandingPageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdvertisement$LandingPageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdvertisement$LandingPageType.class, p0);
    }
    public static PhotoAdvertisement$LandingPageType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdvertisement$LandingPageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdvertisement$LandingPageType.$VALUES.clone();
    }
}
