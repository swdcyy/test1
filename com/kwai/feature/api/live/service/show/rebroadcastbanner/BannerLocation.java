package com.kwai.feature.api.live.service.show.rebroadcastbanner.BannerLocation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BannerLocation extends Enum	// class@001019
{
    public static final BannerLocation[] $VALUES;
    public static final BannerLocation LEFT_TOP_LOCATION;
    public static final BannerLocation NONE;
    public static final BannerLocation RIGHT_BOTTOM_LOCATION;
    public static final BannerLocation RIGHT_TOP_LOCATION;

    static {
       BannerLocation uBannerLocat = new BannerLocation("NONE", 0);
       BannerLocation.NONE = uBannerLocat;
       BannerLocation uBannerLocat1 = new BannerLocation("RIGHT_TOP_LOCATION", 1);
       BannerLocation.RIGHT_TOP_LOCATION = uBannerLocat1;
       BannerLocation uBannerLocat2 = new BannerLocation("RIGHT_BOTTOM_LOCATION", 2);
       BannerLocation.RIGHT_BOTTOM_LOCATION = uBannerLocat2;
       BannerLocation uBannerLocat3 = new BannerLocation("LEFT_TOP_LOCATION", 3);
       BannerLocation.LEFT_TOP_LOCATION = uBannerLocat3;
       BannerLocation[] uBannerLocat4 = new BannerLocation[]{uBannerLocat,uBannerLocat1,uBannerLocat2,uBannerLocat3};
       BannerLocation.$VALUES = uBannerLocat4;
    }
    public void BannerLocation(String p0,int p1){
       super(p0, p1);
    }
    public static BannerLocation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BannerLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BannerLocation.class, p0);
    }
    public static BannerLocation[] values(){
       Object obj = PatchProxy.apply(null, null, BannerLocation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BannerLocation.$VALUES.clone();
    }
}
