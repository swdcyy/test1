package com.kwai.feature.api.live.base.service.magiceffect.LiveMagicEffectForbidBiz;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMagicEffectForbidBiz extends Enum	// class@000f99
{
    public static final LiveMagicEffectForbidBiz[] $VALUES;
    public static final LiveMagicEffectForbidBiz CLEAN_SCREEN;
    public static final LiveMagicEffectForbidBiz GZONE_BANNER_UNFOLD;
    public static final LiveMagicEffectForbidBiz GZONE_NOT_IN_COMMENT_TAB;
    public static final LiveMagicEffectForbidBiz GZONE_SHIELD_GIFT;
    public static final LiveMagicEffectForbidBiz LIVE_FORBIDDEN_MAGIC_EFFECT;
    public static final LiveMagicEffectForbidBiz LIVE_LINE;
    public static final LiveMagicEffectForbidBiz MANUEL_CLOSE;
    public static final LiveMagicEffectForbidBiz ORIENTATION_LANDSCAPE;
    public static final LiveMagicEffectForbidBiz PLAYING_PK_GAME;
    public static final LiveMagicEffectForbidBiz SEVER_CLOSE;
    public static final LiveMagicEffectForbidBiz SPECIAL_ACCOUNT;

    static {
       LiveMagicEffectForbidBiz liveMagicEff = new LiveMagicEffectForbidBiz("GZONE_SHIELD_GIFT", 0);
       LiveMagicEffectForbidBiz.GZONE_SHIELD_GIFT = liveMagicEff;
       LiveMagicEffectForbidBiz liveMagicEff1 = new LiveMagicEffectForbidBiz("LIVE_FORBIDDEN_MAGIC_EFFECT", 1);
       LiveMagicEffectForbidBiz.LIVE_FORBIDDEN_MAGIC_EFFECT = liveMagicEff1;
       LiveMagicEffectForbidBiz liveMagicEff2 = new LiveMagicEffectForbidBiz("GZONE_BANNER_UNFOLD", 2);
       LiveMagicEffectForbidBiz.GZONE_BANNER_UNFOLD = liveMagicEff2;
       LiveMagicEffectForbidBiz liveMagicEff3 = new LiveMagicEffectForbidBiz("GZONE_NOT_IN_COMMENT_TAB", 3);
       LiveMagicEffectForbidBiz.GZONE_NOT_IN_COMMENT_TAB = liveMagicEff3;
       LiveMagicEffectForbidBiz liveMagicEff4 = new LiveMagicEffectForbidBiz("SPECIAL_ACCOUNT", 4);
       LiveMagicEffectForbidBiz.SPECIAL_ACCOUNT = liveMagicEff4;
       LiveMagicEffectForbidBiz liveMagicEff5 = new LiveMagicEffectForbidBiz("CLEAN_SCREEN", 5);
       LiveMagicEffectForbidBiz.CLEAN_SCREEN = liveMagicEff5;
       LiveMagicEffectForbidBiz liveMagicEff6 = new LiveMagicEffectForbidBiz("ORIENTATION_LANDSCAPE", 6);
       LiveMagicEffectForbidBiz.ORIENTATION_LANDSCAPE = liveMagicEff6;
       LiveMagicEffectForbidBiz liveMagicEff7 = new LiveMagicEffectForbidBiz("PLAYING_PK_GAME", 7);
       LiveMagicEffectForbidBiz.PLAYING_PK_GAME = liveMagicEff7;
       LiveMagicEffectForbidBiz liveMagicEff8 = new LiveMagicEffectForbidBiz("LIVE_LINE", 8);
       LiveMagicEffectForbidBiz.LIVE_LINE = liveMagicEff8;
       LiveMagicEffectForbidBiz liveMagicEff9 = new LiveMagicEffectForbidBiz("MANUEL_CLOSE", 9);
       LiveMagicEffectForbidBiz.MANUEL_CLOSE = liveMagicEff9;
       LiveMagicEffectForbidBiz liveMagicEff10 = new LiveMagicEffectForbidBiz("SEVER_CLOSE", 10);
       LiveMagicEffectForbidBiz.SEVER_CLOSE = liveMagicEff10;
       LiveMagicEffectForbidBiz[] liveMagicEff11 = new LiveMagicEffectForbidBiz[11];
       liveMagicEff11[0] = liveMagicEff;
       liveMagicEff11[1] = liveMagicEff1;
       liveMagicEff11[2] = liveMagicEff2;
       liveMagicEff11[3] = liveMagicEff3;
       liveMagicEff11[4] = liveMagicEff4;
       liveMagicEff11[5] = liveMagicEff5;
       liveMagicEff11[6] = liveMagicEff6;
       liveMagicEff11[7] = liveMagicEff7;
       liveMagicEff11[8] = liveMagicEff8;
       liveMagicEff11[9] = liveMagicEff9;
       liveMagicEff11[10] = liveMagicEff10;
       LiveMagicEffectForbidBiz.$VALUES = liveMagicEff11;
    }
    public void LiveMagicEffectForbidBiz(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMagicEffectForbidBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMagicEffectForbidBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMagicEffectForbidBiz.class, p0);
    }
    public static LiveMagicEffectForbidBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMagicEffectForbidBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMagicEffectForbidBiz.$VALUES.clone();
    }
}
