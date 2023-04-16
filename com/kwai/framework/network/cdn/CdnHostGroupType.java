package com.kwai.framework.network.cdn.CdnHostGroupType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CdnHostGroupType extends Enum	// class@00179f
{
    public final String typeName;
    public static final CdnHostGroupType[] $VALUES;
    public static final CdnHostGroupType API_APPM;
    public static final CdnHostGroupType BUSINESS;
    public static final CdnHostGroupType COMMERCIAL_ACTIVITY;
    public static final CdnHostGroupType DESIGN;
    public static final CdnHostGroupType ESHOP_APP;
    public static final CdnHostGroupType FEED;
    public static final CdnHostGroupType GAME;
    public static final CdnHostGroupType KwaiPaySdk;
    public static final CdnHostGroupType LIVE;
    public static final CdnHostGroupType LIVE_API;
    public static final CdnHostGroupType MERCHANT;
    public static final CdnHostGroupType MIDDLEWARE;
    public static final CdnHostGroupType PLATFORM;
    public static final CdnHostGroupType POST;
    public static final CdnHostGroupType SOCIAL;
    public static final CdnHostGroupType WEB_MERCHANT;
    public static final CdnHostGroupType ZT_PPG;

    static {
       CdnHostGroupType[] uCdnHostGrou = new CdnHostGroupType[17];
       CdnHostGroupType uCdnHostGrou1 = new CdnHostGroupType("BUSINESS", 0, "business");
       CdnHostGroupType.BUSINESS = uCdnHostGrou1;
       uCdnHostGrou[0] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("GAME", 1, "game");
       CdnHostGroupType.GAME = uCdnHostGrou1;
       uCdnHostGrou[1] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("FEED", 2, "feed");
       CdnHostGroupType.FEED = uCdnHostGrou1;
       uCdnHostGrou[2] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("MIDDLEWARE", 3, "middleware");
       CdnHostGroupType.MIDDLEWARE = uCdnHostGrou1;
       uCdnHostGrou[3] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("MERCHANT", 4, "merchant");
       CdnHostGroupType.MERCHANT = uCdnHostGrou1;
       uCdnHostGrou[4] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("LIVE", 5, "live");
       CdnHostGroupType.LIVE = uCdnHostGrou1;
       uCdnHostGrou[5] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("SOCIAL", 6, "social");
       CdnHostGroupType.SOCIAL = uCdnHostGrou1;
       uCdnHostGrou[6] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("POST", 7, "post");
       CdnHostGroupType.POST = uCdnHostGrou1;
       uCdnHostGrou[7] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("PLATFORM", 8, "platform");
       CdnHostGroupType.PLATFORM = uCdnHostGrou1;
       uCdnHostGrou[8] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("ESHOP_APP", 9, "idc_eshop_app");
       CdnHostGroupType.ESHOP_APP = uCdnHostGrou1;
       uCdnHostGrou[9] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("ZT_PPG", 10, "idc_zt_ppg");
       CdnHostGroupType.ZT_PPG = uCdnHostGrou1;
       uCdnHostGrou[10] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("API_APPM", 11, "idc_api_appm");
       CdnHostGroupType.API_APPM = uCdnHostGrou1;
       uCdnHostGrou[11] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("KwaiPaySdk", 12, "idc_eshoppay_www");
       CdnHostGroupType.KwaiPaySdk = uCdnHostGrou1;
       uCdnHostGrou[12] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("COMMERCIAL_ACTIVITY", 13, "idc_ad_activitye");
       CdnHostGroupType.COMMERCIAL_ACTIVITY = uCdnHostGrou1;
       uCdnHostGrou[13] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("LIVE_API", 14, "idc_api_live");
       CdnHostGroupType.LIVE_API = uCdnHostGrou1;
       uCdnHostGrou[14] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("DESIGN", 15, "cdn_platform_design");
       CdnHostGroupType.DESIGN = uCdnHostGrou1;
       uCdnHostGrou[15] = uCdnHostGrou1;
       uCdnHostGrou1 = new CdnHostGroupType("WEB_MERCHANT", 16, "cdn_web_merchant");
       CdnHostGroupType.WEB_MERCHANT = uCdnHostGrou1;
       uCdnHostGrou[16] = uCdnHostGrou1;
       CdnHostGroupType.$VALUES = uCdnHostGrou;
    }
    public void CdnHostGroupType(String p0,int p1,String p2){
       super(p0, p1);
       this.typeName = p2;
    }
    public static CdnHostGroupType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CdnHostGroupType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CdnHostGroupType.class, p0);
    }
    public static CdnHostGroupType[] values(){
       Object obj = PatchProxy.apply(null, null, CdnHostGroupType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CdnHostGroupType.$VALUES.clone();
    }
    public final String getTypeName(){
       return this.typeName;
    }
}
