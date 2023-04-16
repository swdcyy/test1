package com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MerchantHomeLogBiz extends Enum implements a	// class@0016bd
{
    public final String mBiz;
    public static final MerchantHomeLogBiz[] $VALUES;
    public static final MerchantHomeLogBiz AutoPlay;
    public static final MerchantHomeLogBiz Banner;
    public static final MerchantHomeLogBiz BottomTab;
    public static final MerchantHomeLogBiz Common;
    public static final MerchantHomeLogBiz Feed;
    public static final MerchantHomeLogBiz HOME;
    public static final MerchantHomeLogBiz Logger;
    public static final MerchantHomeLogBiz MerchantCache;
    public static final MerchantHomeLogBiz Misc;
    public static final MerchantHomeLogBiz NewComer;
    public static final MerchantHomeLogBiz Pendant;
    public static final MerchantHomeLogBiz Performance;
    public static final MerchantHomeLogBiz Popup;
    public static final MerchantHomeLogBiz Predict;
    public static final MerchantHomeLogBiz RecoTab;
    public static final MerchantHomeLogBiz Resource;
    public static final MerchantHomeLogBiz SeparateBanner;
    public static final MerchantHomeLogBiz Shelves;
    public static final MerchantHomeLogBiz Skin;
    public static final MerchantHomeLogBiz SnackBar;
    public static final MerchantHomeLogBiz Tiles;
    public static final MerchantHomeLogBiz TitleBar;
    public static final MerchantHomeLogBiz ToolBar;
    public static final MerchantHomeLogBiz TrustCard;

    static {
       MerchantHomeLogBiz merchantHome = new MerchantHomeLogBiz("HOME", 0, "Main");
       MerchantHomeLogBiz.HOME = merchantHome;
       MerchantHomeLogBiz merchantHome1 = new MerchantHomeLogBiz("Common", 1, "Common");
       MerchantHomeLogBiz.Common = merchantHome1;
       MerchantHomeLogBiz merchantHome2 = new MerchantHomeLogBiz("Misc", 2, "Misc");
       MerchantHomeLogBiz.Misc = merchantHome2;
       MerchantHomeLogBiz merchantHome3 = new MerchantHomeLogBiz("ToolBar", 3, "ToolBar");
       MerchantHomeLogBiz.ToolBar = merchantHome3;
       MerchantHomeLogBiz merchantHome4 = new MerchantHomeLogBiz("TitleBar", 4, "TitleBar");
       MerchantHomeLogBiz.TitleBar = merchantHome4;
       MerchantHomeLogBiz merchantHome5 = new MerchantHomeLogBiz("Banner", 5, "Banner");
       MerchantHomeLogBiz.Banner = merchantHome5;
       MerchantHomeLogBiz merchantHome6 = new MerchantHomeLogBiz("SeparateBanner", 6, "SeparateBanner");
       MerchantHomeLogBiz.SeparateBanner = merchantHome6;
       MerchantHomeLogBiz merchantHome7 = new MerchantHomeLogBiz("Tiles", 7, "Tiles");
       MerchantHomeLogBiz.Tiles = merchantHome7;
       MerchantHomeLogBiz merchantHome8 = new MerchantHomeLogBiz("TrustCard", 8, "TrustCard");
       MerchantHomeLogBiz.TrustCard = merchantHome8;
       MerchantHomeLogBiz merchantHome9 = new MerchantHomeLogBiz("NewComer", 9, "NewComer");
       MerchantHomeLogBiz.NewComer = merchantHome9;
       MerchantHomeLogBiz merchantHome10 = new MerchantHomeLogBiz("Shelves", 10, "Shelves");
       MerchantHomeLogBiz.Shelves = merchantHome10;
       MerchantHomeLogBiz merchantHome11 = new MerchantHomeLogBiz("SnackBar", 11, "SnackBar");
       MerchantHomeLogBiz.SnackBar = merchantHome11;
       MerchantHomeLogBiz merchantHome12 = new MerchantHomeLogBiz("Pendant", 12, "Pendant");
       MerchantHomeLogBiz.Pendant = merchantHome12;
       MerchantHomeLogBiz merchantHome13 = merchantHome12;
       MerchantHomeLogBiz merchantHome14 = new MerchantHomeLogBiz("Popup", 13, "Popup");
       MerchantHomeLogBiz.Popup = merchantHome14;
       MerchantHomeLogBiz merchantHome15 = merchantHome14;
       MerchantHomeLogBiz merchantHome16 = new MerchantHomeLogBiz("Resource", 14, "Resource");
       MerchantHomeLogBiz.Resource = merchantHome16;
       MerchantHomeLogBiz merchantHome17 = merchantHome16;
       merchantHome14 = new MerchantHomeLogBiz("RecoTab", 15, "RecoTab");
       MerchantHomeLogBiz.RecoTab = merchantHome14;
       MerchantHomeLogBiz merchantHome18 = merchantHome14;
       merchantHome16 = new MerchantHomeLogBiz("BottomTab", 16, "BottomTab");
       MerchantHomeLogBiz.BottomTab = merchantHome16;
       MerchantHomeLogBiz merchantHome19 = merchantHome16;
       merchantHome14 = new MerchantHomeLogBiz("Feed", 17, "Feed");
       MerchantHomeLogBiz.Feed = merchantHome14;
       MerchantHomeLogBiz merchantHome20 = merchantHome14;
       merchantHome16 = new MerchantHomeLogBiz("Skin", 18, "Skin");
       MerchantHomeLogBiz.Skin = merchantHome16;
       MerchantHomeLogBiz merchantHome21 = merchantHome16;
       merchantHome14 = new MerchantHomeLogBiz("Performance", 19, "Performance");
       MerchantHomeLogBiz.Performance = merchantHome14;
       MerchantHomeLogBiz merchantHome22 = merchantHome14;
       merchantHome16 = new MerchantHomeLogBiz("Predict", 20, "Predict");
       MerchantHomeLogBiz.Predict = merchantHome16;
       MerchantHomeLogBiz merchantHome23 = merchantHome16;
       merchantHome14 = new MerchantHomeLogBiz("AutoPlay", 21, "AutoPlay");
       MerchantHomeLogBiz.AutoPlay = merchantHome14;
       MerchantHomeLogBiz merchantHome24 = merchantHome14;
       merchantHome16 = new MerchantHomeLogBiz("Logger", 22, "Logger");
       MerchantHomeLogBiz.Logger = merchantHome16;
       MerchantHomeLogBiz merchantHome25 = merchantHome16;
       merchantHome14 = new MerchantHomeLogBiz("MerchantCache", 23, "MerchantCache");
       MerchantHomeLogBiz.MerchantCache = merchantHome14;
       MerchantHomeLogBiz[] merchantHome26 = new MerchantHomeLogBiz[24];
       merchantHome26[0] = merchantHome;
       merchantHome26[1] = merchantHome1;
       merchantHome26[2] = merchantHome2;
       merchantHome26[3] = merchantHome3;
       merchantHome26[4] = merchantHome4;
       merchantHome26[5] = merchantHome5;
       merchantHome26[6] = merchantHome6;
       merchantHome26[7] = merchantHome7;
       merchantHome26[8] = merchantHome8;
       merchantHome26[9] = merchantHome9;
       merchantHome26[10] = merchantHome10;
       merchantHome26[11] = merchantHome11;
       merchantHome26[12] = merchantHome13;
       merchantHome26[13] = merchantHome15;
       merchantHome26[14] = merchantHome17;
       merchantHome26[15] = merchantHome18;
       merchantHome26[16] = merchantHome19;
       merchantHome26[17] = merchantHome20;
       merchantHome26[18] = merchantHome21;
       merchantHome26[19] = merchantHome22;
       merchantHome26[20] = merchantHome23;
       merchantHome26[21] = merchantHome24;
       merchantHome26[22] = merchantHome25;
       merchantHome26[23] = merchantHome14;
       MerchantHomeLogBiz.$VALUES = merchantHome26;
    }
    public void MerchantHomeLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantHomeLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantHomeLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantHomeLogBiz.class, p0);
    }
    public static MerchantHomeLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantHomeLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantHomeLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       Object obj = PatchProxy.apply(null, this, MerchantHomeLogBiz.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Home"+this.mBiz;
    }
}
