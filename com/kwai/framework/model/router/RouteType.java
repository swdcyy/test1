package com.kwai.framework.model.router.RouteType;
import jjd.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RouteType extends Enum implements b	// class@000bc1
{
    public final boolean mDefaultIsHttps;
    public boolean mIsHttps;
    public final String mName;
    public final boolean mNeedRest;
    public static final RouteType[] $VALUES;
    public static final RouteType ACG;
    public static final RouteType AD;
    public static final RouteType AD_IM;
    public static final RouteType AD_PARTNER;
    public static final RouteType API;
    public static final RouteType BIOLOGY_SERVER;
    public static final RouteType COURSE;
    public static final RouteType CREATOR_APP;
    public static final RouteType EFFECT_PLATFORM;
    public static final RouteType GAMECENTER;
    public static final RouteType GAMEINTERACTION;
    public static final RouteType GZONE;
    public static final RouteType HEALTHY_SERVER;
    public static final RouteType HTTPS;
    public static final RouteType KEYCONFIG;
    public static final RouteType KINSIGHT;
    public static final RouteType KMOVIE;
    public static final RouteType KWAIPAY_SDK;
    public static final RouteType LBS;
    public static final RouteType LIVE;
    public static final RouteType LIVE_HTTPS;
    public static final RouteType LIVE_P2P;
    public static final RouteType LIVE_RED_PACKET_GRAB;
    public static final RouteType LOCAL_LIFE;
    public static final RouteType MEDIA_CLOUD;
    public static final RouteType MERCHANT;
    public static final RouteType MESSAGE_ZT;
    public static final RouteType NATIVE_MERCHANT;
    public static final RouteType NEBULA_MESSAGE_ZT;
    public static final RouteType NEW_WEB;
    public static final RouteType OPENSDK;
    public static final RouteType PAY;
    public static final RouteType PAY_CHECK;
    public static final RouteType PUSH;
    public static final RouteType RED_PACK_RAIN;
    public static final RouteType SF2023;
    public static final RouteType SOGAME;
    public static final RouteType SOGAME_OPEN_GROUND;
    public static final RouteType SOGAME_PAY;
    public static final RouteType SPORTS;
    public static final RouteType ULOG;
    public static final RouteType UPLOAD;
    public static final RouteType USER_INNER;
    public static final RouteType WEB_MERCHANT;
    public static final RouteType ZT;
    public static final RouteType ZtGameChannel;

    static {
       RouteType routeType = new RouteType("API", 0, "api", false, true);
       RouteType.API = v6;
       RouteType routeType1 = new RouteType("USER_INNER", 1, "user-inner.test.gifshow", false, true);
       RouteType.USER_INNER = routeType;
       RouteType routeType2 = new RouteType("UPLOAD", 2, "upload", false, true);
       RouteType.UPLOAD = v1;
       routeType1 = new RouteType("ULOG", 3, "ulog", false, true);
       RouteType.ULOG = v2;
       RouteType routeType3 = new RouteType("HTTPS", 4, "https", true);
       RouteType.HTTPS = routeType3;
       RouteType routeType4 = new RouteType("PAY", 5, "pay", true);
       RouteType.PAY = routeType4;
       routeType1 = new RouteType("PAY_CHECK", 6, "pay_check", true);
       RouteType.PAY_CHECK = routeType1;
       RouteType routeType5 = new RouteType("PUSH", 7, "push", true);
       RouteType.PUSH = routeType5;
       RouteType routeType6 = new RouteType("LIVE", 8, "live", false, true);
       RouteType.LIVE = v12;
       RouteType routeType7 = new RouteType("LIVE_HTTPS", 9, "live_https", true);
       RouteType.LIVE_HTTPS = routeType7;
       RouteType routeType8 = new RouteType("COURSE", 10, "coures", false, true);
       RouteType.COURSE = v11;
       routeType6 = new RouteType("AD", 11, "apie", true);
       RouteType.AD = routeType6;
       RouteType routeType9 = routeType6;
       RouteType routeType10 = new RouteType("AD_PARTNER", 12, "ad.partner.gifshow", false);
       RouteType.AD_PARTNER = routeType10;
       RouteType routeType11 = routeType10;
       RouteType routeType12 = new RouteType("AD_IM", 13, "adim", true);
       RouteType.AD_IM = routeType12;
       RouteType routeType13 = routeType12;
       routeType2 = new RouteType("MERCHANT", 14, "merchant", true);
       RouteType.MERCHANT = routeType2;
       RouteType routeType14 = routeType2;
       routeType10 = new RouteType("NATIVE_MERCHANT", 15, "native_merchant", false);
       RouteType.NATIVE_MERCHANT = routeType10;
       RouteType routeType15 = routeType10;
       routeType12 = new RouteType("WEB_MERCHANT", 16, "web_merchant", false);
       RouteType.WEB_MERCHANT = routeType12;
       RouteType routeType16 = new RouteType("LIVE_RED_PACKET_GRAB", 17, "live_red_packet_grab", false, true);
       RouteType.LIVE_RED_PACKET_GRAB = routeType10;
       RouteType routeType17 = new RouteType("RED_PACK_RAIN", 18, "red_pack_rain", false, true);
       RouteType.RED_PACK_RAIN = v9;
       RouteType routeType18 = v9;
       RouteType routeType19 = routeType10;
       RouteType routeType20 = routeType12;
       routeType2 = new RouteType("GZONE", 19, "gzone", false);
       RouteType.GZONE = routeType2;
       RouteType routeType21 = routeType2;
       routeType10 = new RouteType("GAMECENTER", 20, "game_center", false);
       RouteType.GAMECENTER = routeType10;
       RouteType routeType22 = routeType10;
       routeType2 = new RouteType("ZT", 21, "zhongtai", false);
       RouteType.ZT = routeType2;
       RouteType routeType23 = routeType2;
       routeType10 = new RouteType("SOGAME", 22, "ztgame", true);
       RouteType.SOGAME = routeType10;
       RouteType routeType24 = routeType10;
       routeType12 = new RouteType("OPENSDK", 23, "opensdk", true);
       RouteType.OPENSDK = routeType12;
       RouteType routeType25 = new RouteType("LIVE_P2P", 24, "livep2p", false, true);
       RouteType.LIVE_P2P = routeType10;
       RouteType routeType26 = routeType10;
       RouteType routeType27 = routeType12;
       RouteType routeType28 = new RouteType("EFFECT_PLATFORM", 25, "effect_platform", true);
       RouteType.EFFECT_PLATFORM = routeType28;
       RouteType routeType29 = new RouteType("MESSAGE_ZT", 26, "k.ksurl", false, true);
       RouteType.MESSAGE_ZT = routeType10;
       RouteType routeType30 = new RouteType("NEBULA_MESSAGE_ZT", 27, "n.ksurl", false, true);
       RouteType.NEBULA_MESSAGE_ZT = routeType12;
       RouteType routeType31 = routeType12;
       RouteType routeType32 = routeType10;
       RouteType routeType33 = routeType28;
       routeType2 = new RouteType("ACG", 28, "acg", true);
       RouteType.ACG = routeType2;
       RouteType routeType34 = routeType2;
       routeType10 = new RouteType("LOCAL_LIFE", 29, "local_life", false);
       RouteType.LOCAL_LIFE = routeType10;
       RouteType routeType35 = routeType10;
       routeType12 = new RouteType("GAMEINTERACTION", 30, "game_interaction", false);
       RouteType.GAMEINTERACTION = routeType12;
       RouteType routeType36 = routeType12;
       routeType10 = new RouteType("SOGAME_OPEN_GROUND", 31, "ztgameopen", false);
       RouteType.SOGAME_OPEN_GROUND = routeType10;
       RouteType routeType37 = routeType10;
       routeType12 = new RouteType("SOGAME_PAY", 32, "ztgamepay", false);
       RouteType.SOGAME_PAY = routeType12;
       RouteType.NEW_WEB = routeType10;
       RouteType routeType38 = routeType12;
       routeType28 = new RouteType("KWAIPAY_SDK", 34, "kwaipay_sdk", false);
       RouteType.KWAIPAY_SDK = routeType28;
       RouteType routeType39 = routeType28;
       routeType10 = new RouteType("SF2023", 35, "sf2023-api", false);
       RouteType.SF2023 = routeType10;
       RouteType routeType40 = routeType10;
       routeType28 = new RouteType("ZtGameChannel", 36, "ztgamechannel", false);
       RouteType.ZtGameChannel = routeType28;
       RouteType routeType41 = routeType28;
       routeType10 = new RouteType("BIOLOGY_SERVER", 37, "biology-server", false);
       RouteType.BIOLOGY_SERVER = routeType10;
       RouteType routeType42 = routeType10;
       routeType28 = new RouteType("HEALTHY_SERVER", 38, "healthy-server", false);
       RouteType.HEALTHY_SERVER = routeType28;
       RouteType routeType43 = routeType28;
       routeType10 = new RouteType("CREATOR_APP", 39, "creator-app", false);
       RouteType.CREATOR_APP = routeType10;
       RouteType routeType44 = routeType10;
       routeType12 = new RouteType("KMOVIE", 40, "kmovie", true);
       RouteType.KMOVIE = routeType12;
       RouteType routeType45 = routeType12;
       routeType28 = new RouteType("LBS", 41, "lbs", true);
       RouteType.LBS = routeType28;
       RouteType routeType46 = routeType28;
       routeType12 = new RouteType("SPORTS", 42, "sports", true);
       RouteType.SPORTS = routeType12;
       RouteType routeType47 = routeType12;
       routeType28 = new RouteType("KINSIGHT", 43, "kinsight", true);
       RouteType.KINSIGHT = routeType28;
       RouteType.KEYCONFIG = routeType10;
       RouteType routeType48 = routeType28;
       routeType12 = new RouteType("MEDIA_CLOUD", 45, "mediacloud.kuaishou", false);
       RouteType.MEDIA_CLOUD = routeType12;
       RouteType[] routeTypeArr = new RouteType[46];
       routeTypeArr[0] = v6;
       routeTypeArr[1] = routeType;
       routeTypeArr[2] = v1;
       routeTypeArr[3] = v2;
       routeTypeArr[4] = routeType3;
       routeTypeArr[5] = routeType4;
       routeTypeArr[6] = routeType1;
       routeTypeArr[7] = routeType5;
       routeTypeArr[8] = v12;
       routeTypeArr[9] = routeType7;
       routeTypeArr[10] = v11;
       routeTypeArr[11] = routeType9;
       routeTypeArr[12] = routeType11;
       routeTypeArr[13] = routeType13;
       routeTypeArr[14] = routeType14;
       routeTypeArr[15] = routeType15;
       routeTypeArr[16] = routeType20;
       routeTypeArr[17] = routeType19;
       routeTypeArr[18] = routeType18;
       routeTypeArr[19] = routeType21;
       routeTypeArr[20] = routeType22;
       routeTypeArr[21] = routeType23;
       routeTypeArr[22] = routeType24;
       routeTypeArr[23] = routeType27;
       routeTypeArr[24] = routeType26;
       routeTypeArr[25] = routeType33;
       routeTypeArr[26] = routeType32;
       routeTypeArr[27] = routeType31;
       routeTypeArr[28] = routeType34;
       routeTypeArr[29] = routeType35;
       routeTypeArr[30] = routeType36;
       routeTypeArr[31] = routeType37;
       routeTypeArr[32] = routeType38;
       routeTypeArr[33] = new RouteType("NEW_WEB", 33, "new_web", false, false);
       routeTypeArr[34] = routeType39;
       routeTypeArr[35] = routeType40;
       routeTypeArr[36] = routeType41;
       routeTypeArr[37] = routeType42;
       routeTypeArr[38] = routeType43;
       routeTypeArr[39] = routeType44;
       routeTypeArr[40] = routeType45;
       routeTypeArr[41] = routeType46;
       routeTypeArr[42] = routeType47;
       routeTypeArr[43] = routeType48;
       routeTypeArr[44] = new RouteType("KEYCONFIG", 44, "keyconfig", false, true);
       routeTypeArr[45] = routeType12;
       RouteType.$VALUES = routeTypeArr;
    }
    public void RouteType(String p0,int p1,String p2,boolean p3){
       super(p0, p1, p2, true, p3);
    }
    public void RouteType(String p0,int p1,String p2,boolean p3,boolean p4){
       super(p0, p1);
       this.mName = p2;
       this.mIsHttps = p3;
       this.mDefaultIsHttps = p3;
       this.mNeedRest = p4;
    }
    public static RouteType nameOf(String p0){
       object oobject;
       RouteType[] obj = PatchProxy.applyOneRefs(p0, null, RouteType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RouteType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if ((oobject.mName).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static RouteType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RouteType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RouteType.class, p0);
    }
    public static RouteType[] values(){
       Object obj = PatchProxy.apply(null, null, RouteType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RouteType.$VALUES.clone();
    }
    public String getName(){
       return this.mName;
    }
    public boolean isDefaultHttps(){
       return this.mDefaultIsHttps;
    }
    public boolean isHttps(){
       return this.mIsHttps;
    }
    public boolean isRest(){
       return this.mNeedRest;
    }
    public void setHttps(boolean p0){
       this.mIsHttps = p0;
    }
}
