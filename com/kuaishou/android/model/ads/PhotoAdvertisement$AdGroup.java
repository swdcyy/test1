package com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdvertisement$AdGroup extends Enum	// class@0008a8
{
    public static final PhotoAdvertisement$AdGroup[] $VALUES;
    public static final PhotoAdvertisement$AdGroup AD_DSP_SOFT;
    public static final PhotoAdvertisement$AdGroup AD_MERCHANT;
    public static final PhotoAdvertisement$AdGroup AD_SOCIAL;
    public static final PhotoAdvertisement$AdGroup AD_SOCIAL_CPS_MERCHANT;
    public static final PhotoAdvertisement$AdGroup AD_SOCIAL_MERCHANT;
    public static final PhotoAdvertisement$AdGroup ALI_DONG_FENG;
    public static final PhotoAdvertisement$AdGroup DSP;
    public static final PhotoAdvertisement$AdGroup DSP_NATURE;
    public static final PhotoAdvertisement$AdGroup FANS_TOP;
    public static final PhotoAdvertisement$AdGroup FANS_TOP_MERCHANT;
    public static final PhotoAdvertisement$AdGroup GR;
    public static final PhotoAdvertisement$AdGroup THIRD_PLATFORM;
    public static final PhotoAdvertisement$AdGroup UNKNOWN;

    static {
       PhotoAdvertisement$AdGroup uAdGroup = new PhotoAdvertisement$AdGroup("UNKNOWN", 0);
       PhotoAdvertisement$AdGroup.UNKNOWN = uAdGroup;
       PhotoAdvertisement$AdGroup uAdGroup1 = new PhotoAdvertisement$AdGroup("DSP", 1);
       PhotoAdvertisement$AdGroup.DSP = uAdGroup1;
       PhotoAdvertisement$AdGroup uAdGroup2 = new PhotoAdvertisement$AdGroup("THIRD_PLATFORM", 2);
       PhotoAdvertisement$AdGroup.THIRD_PLATFORM = uAdGroup2;
       PhotoAdvertisement$AdGroup uAdGroup3 = new PhotoAdvertisement$AdGroup("FANS_TOP", 3);
       PhotoAdvertisement$AdGroup.FANS_TOP = uAdGroup3;
       PhotoAdvertisement$AdGroup uAdGroup4 = new PhotoAdvertisement$AdGroup("AD_SOCIAL", 4);
       PhotoAdvertisement$AdGroup.AD_SOCIAL = uAdGroup4;
       PhotoAdvertisement$AdGroup uAdGroup5 = new PhotoAdvertisement$AdGroup("ALI_DONG_FENG", 5);
       PhotoAdvertisement$AdGroup.ALI_DONG_FENG = uAdGroup5;
       PhotoAdvertisement$AdGroup uAdGroup6 = new PhotoAdvertisement$AdGroup("GR", 6);
       PhotoAdvertisement$AdGroup.GR = uAdGroup6;
       PhotoAdvertisement$AdGroup uAdGroup7 = new PhotoAdvertisement$AdGroup("AD_MERCHANT", 7);
       PhotoAdvertisement$AdGroup.AD_MERCHANT = uAdGroup7;
       PhotoAdvertisement$AdGroup uAdGroup8 = new PhotoAdvertisement$AdGroup("FANS_TOP_MERCHANT", 8);
       PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT = uAdGroup8;
       PhotoAdvertisement$AdGroup uAdGroup9 = new PhotoAdvertisement$AdGroup("AD_SOCIAL_MERCHANT", 9);
       PhotoAdvertisement$AdGroup.AD_SOCIAL_MERCHANT = uAdGroup9;
       PhotoAdvertisement$AdGroup uAdGroup10 = new PhotoAdvertisement$AdGroup("AD_SOCIAL_CPS_MERCHANT", 10);
       PhotoAdvertisement$AdGroup.AD_SOCIAL_CPS_MERCHANT = uAdGroup10;
       PhotoAdvertisement$AdGroup uAdGroup11 = new PhotoAdvertisement$AdGroup("AD_DSP_SOFT", 11);
       PhotoAdvertisement$AdGroup.AD_DSP_SOFT = uAdGroup11;
       PhotoAdvertisement$AdGroup uAdGroup12 = new PhotoAdvertisement$AdGroup("DSP_NATURE", 12);
       PhotoAdvertisement$AdGroup.DSP_NATURE = uAdGroup12;
       PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[13];
       uAdGroupArra[0] = uAdGroup;
       uAdGroupArra[1] = uAdGroup1;
       uAdGroupArra[2] = uAdGroup2;
       uAdGroupArra[3] = uAdGroup3;
       uAdGroupArra[4] = uAdGroup4;
       uAdGroupArra[5] = uAdGroup5;
       uAdGroupArra[6] = uAdGroup6;
       uAdGroupArra[7] = uAdGroup7;
       uAdGroupArra[8] = uAdGroup8;
       uAdGroupArra[9] = uAdGroup9;
       uAdGroupArra[10] = uAdGroup10;
       uAdGroupArra[11] = uAdGroup11;
       uAdGroupArra[12] = uAdGroup12;
       PhotoAdvertisement$AdGroup.$VALUES = uAdGroupArra;
    }
    public void PhotoAdvertisement$AdGroup(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdvertisement$AdGroup valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdvertisement$AdGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdvertisement$AdGroup.class, p0);
    }
    public static PhotoAdvertisement$AdGroup[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdvertisement$AdGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdvertisement$AdGroup.$VALUES.clone();
    }
}
