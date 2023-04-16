package com.yxcorp.gifshow.homepage.menu.HomeMenuNativeItem;
import java.lang.Enum;
import java.lang.String;
import com.kwai.feature.api.feed.home.menu.SidebarMenuItem;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class HomeMenuNativeItem extends Enum	// class@00176e
{
    public String mIconUrl;
    public String mId;
    public String mSfIconUrl;
    public int mStringResId;
    public int mViewType;
    public static final HomeMenuNativeItem[] $VALUES;
    public static final HomeMenuNativeItem GAME;
    public static final HomeMenuNativeItem INCENTIVE_ACTIVITY;
    public static final HomeMenuNativeItem KS_ACTIVITY;
    public static final HomeMenuNativeItem KWAI_SHOP;
    public static final HomeMenuNativeItem LIVE_SQUARE;
    public static final HomeMenuNativeItem LIVE_SQUARE_V2;
    public static final HomeMenuNativeItem MESSAGE;
    public static final HomeMenuNativeItem MINI_APP;
    public static final HomeMenuNativeItem MOMENTS;
    public static final HomeMenuNativeItem MY_COURSE;
    public static final HomeMenuNativeItem NEBULA_RED_PACKET;
    public static final HomeMenuNativeItem NOTICE;
    public static final HomeMenuNativeItem OFFLINE_CACHE;
    public static final HomeMenuNativeItem PORTFOLIO;
    public static final HomeMenuNativeItem QR_CODE;
    public static final HomeMenuNativeItem SEARCH;
    public static final HomeMenuNativeItem WALLET;
    public static final HomeMenuNativeItem WATCH_LATER;
    public static final HomeMenuNativeItem WHITE_HAT;

    static {
       HomeMenuNativeItem homeMenuNati = new HomeMenuNativeItem("SEARCH", 0, "7", 1, 0x7f104806, "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_search_1.png", "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_search_sf_3.png");
       HomeMenuNativeItem.SEARCH = v8;
       HomeMenuNativeItem homeMenuNati1 = new HomeMenuNativeItem("GAME", 1, "8", 2, 0x7f10115d, "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_game_1.png", "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_game_sf_3.png");
       HomeMenuNativeItem.GAME = homeMenuNati;
       HomeMenuNativeItem homeMenuNati2 = new HomeMenuNativeItem("LIVE_SQUARE", 2, "9", 10, 0x7f1031ff, "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_live_1.png", "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_live_sf_3.png");
       HomeMenuNativeItem.LIVE_SQUARE = v1;
       homeMenuNati1 = new HomeMenuNativeItem("PORTFOLIO", 3, "10", 4, 0x7f103d35, "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_portfolio_1.png", "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_portfolio_sf_4.png");
       HomeMenuNativeItem.PORTFOLIO = v2;
       homeMenuNati2 = new HomeMenuNativeItem("QR_CODE", 4, "11", 3, 0x7f104b8e, "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_scan_1.png", "http://js2.a.yximgs.com/bs2/fes/app_sidebar_icon_scan_sf_3.png");
       HomeMenuNativeItem.QR_CODE = v3;
       homeMenuNati1 = new HomeMenuNativeItem("KS_ACTIVITY", 5, "12", 5, -1);
       HomeMenuNativeItem.KS_ACTIVITY = v4;
       HomeMenuNativeItem homeMenuNati3 = new HomeMenuNativeItem("INCENTIVE_ACTIVITY", 6, "13", 6, -1);
       HomeMenuNativeItem.INCENTIVE_ACTIVITY = v5;
       homeMenuNati1 = new HomeMenuNativeItem("WALLET", 7, "14", 7, 0x7f1037f7);
       HomeMenuNativeItem.WALLET = v6;
       homeMenuNati3 = new HomeMenuNativeItem("KWAI_SHOP", 8, "15", 8, -1);
       HomeMenuNativeItem.KWAI_SHOP = v7;
       homeMenuNati1 = new HomeMenuNativeItem("MY_COURSE", 9, "19", 9, -1);
       HomeMenuNativeItem.MY_COURSE = homeMenuNati3;
       HomeMenuNativeItem homeMenuNati4 = new HomeMenuNativeItem("NEBULA_RED_PACKET", 10, "666", 11, -1, "res://drawable/2131239010", "res://drawable/2131239002");
       HomeMenuNativeItem.NEBULA_RED_PACKET = homeMenuNati1;
       HomeMenuNativeItem homeMenuNati5 = new HomeMenuNativeItem("WHITE_HAT", 11, "24", 12, -1);
       HomeMenuNativeItem.WHITE_HAT = v10;
       homeMenuNati4 = new HomeMenuNativeItem("LIVE_SQUARE_V2", 12, "30", 15, -1);
       HomeMenuNativeItem.LIVE_SQUARE_V2 = v11;
       HomeMenuNativeItem homeMenuNati6 = new HomeMenuNativeItem("MINI_APP", 13, "34", 13, -1);
       HomeMenuNativeItem.MINI_APP = v12;
       homeMenuNati4 = new HomeMenuNativeItem("OFFLINE_CACHE", 14, "112", 16, -1);
       HomeMenuNativeItem.OFFLINE_CACHE = v13;
       homeMenuNati6 = new HomeMenuNativeItem("WATCH_LATER", 15, "1001", 14, -1);
       HomeMenuNativeItem.WATCH_LATER = v14;
       homeMenuNati4 = new HomeMenuNativeItem("MOMENTS", 16, "10001", 0x2711, -1);
       HomeMenuNativeItem.MOMENTS = homeMenuNati6;
       HomeMenuNativeItem homeMenuNati7 = new HomeMenuNativeItem("NOTICE", 17, "10002", 0x2712, -1);
       HomeMenuNativeItem.NOTICE = homeMenuNati4;
       HomeMenuNativeItem homeMenuNati8 = new HomeMenuNativeItem("MESSAGE", 18, "10003", 0x2713, -1);
       HomeMenuNativeItem.MESSAGE = homeMenuNati2;
       HomeMenuNativeItem homeMenuNati9 = v14;
       HomeMenuNativeItem[] homeMenuNati10 = new HomeMenuNativeItem[19];
       homeMenuNati10[0] = v8;
       homeMenuNati10[1] = homeMenuNati;
       homeMenuNati10[2] = v1;
       homeMenuNati10[3] = v2;
       homeMenuNati10[4] = v3;
       homeMenuNati10[5] = v4;
       homeMenuNati10[6] = v5;
       homeMenuNati10[7] = v6;
       homeMenuNati10[8] = v7;
       homeMenuNati10[9] = homeMenuNati3;
       homeMenuNati10[10] = homeMenuNati1;
       homeMenuNati10[11] = v10;
       homeMenuNati10[12] = v11;
       homeMenuNati10[13] = v12;
       homeMenuNati10[14] = v13;
       homeMenuNati10[15] = homeMenuNati9;
       homeMenuNati10[16] = homeMenuNati6;
       homeMenuNati10[17] = homeMenuNati4;
       homeMenuNati10[18] = homeMenuNati2;
       HomeMenuNativeItem.$VALUES = homeMenuNati10;
    }
    public void HomeMenuNativeItem(String p0,int p1,String p2,int p3,int p4){
       super(p0, p1);
       this.mId = p2;
       this.mViewType = p3;
       this.mStringResId = p4;
    }
    public void HomeMenuNativeItem(String p0,int p1,String p2,int p3,int p4,String p5,String p6){
       super(p0, p1, p2, p3, p4);
       this.mIconUrl = p5;
       this.mSfIconUrl = p6;
    }
    public static int getStringResId(SidebarMenuItem p0){
       HomeMenuNativeItem[] obj = PatchProxy.applyOneRefs(p0, null, HomeMenuNativeItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = HomeMenuNativeItem.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return -1;
          }
          object oobject = obj[i];
          if (TextUtils.n(oobject.mId, p0.mId)) {
             if (!(HomeMenuNativeItem.PORTFOLIO.mId).equals(oobject.mId)) {
                return oobject.mStringResId;
             }
             break ;
          }else {
             i = i + 1;
          }
       }
       return 0x7f1046e2;
    }
    public static HomeMenuNativeItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeMenuNativeItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HomeMenuNativeItem.class, p0);
    }
    public static HomeMenuNativeItem[] values(){
       Object obj = PatchProxy.apply(null, null, HomeMenuNativeItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomeMenuNativeItem.$VALUES.clone();
    }
}
