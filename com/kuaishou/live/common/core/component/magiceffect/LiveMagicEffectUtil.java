package com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil;
import com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.HashSet;
import com.kwai.feature.api.live.base.service.magiceffect.LiveMagicEffectForbidBiz;
import java.lang.Object;
import java.util.Set;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.effect.resource.download.common.e;
import cm1.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Boolean;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;

public class LiveMagicEffectUtil	// class@0014b5
{
    public static final Type a;
    public static final Set b;
    public static final Set c;

    static {
       LiveMagicEffectUtil.a = new LiveMagicEffectUtil$1().getType();
       HashSet hashSet = new HashSet();
       LiveMagicEffectUtil.b = hashSet;
       LiveMagicEffectForbidBiz gZONE_SHIELD = LiveMagicEffectForbidBiz.GZONE_SHIELD_GIFT;
       hashSet.add(gZONE_SHIELD);
       hashSet.add(LiveMagicEffectForbidBiz.LIVE_FORBIDDEN_MAGIC_EFFECT);
       LiveMagicEffectForbidBiz gZONE_BANNER = LiveMagicEffectForbidBiz.GZONE_BANNER_UNFOLD;
       hashSet.add(gZONE_BANNER);
       LiveMagicEffectForbidBiz sPECIAL_ACCO = LiveMagicEffectForbidBiz.SPECIAL_ACCOUNT;
       hashSet.add(sPECIAL_ACCO);
       LiveMagicEffectForbidBiz cLEAN_SCREEN = LiveMagicEffectForbidBiz.CLEAN_SCREEN;
       hashSet.add(cLEAN_SCREEN);
       LiveMagicEffectForbidBiz oRIENTATION_ = LiveMagicEffectForbidBiz.ORIENTATION_LANDSCAPE;
       hashSet.add(oRIENTATION_);
       LiveMagicEffectForbidBiz pLAYING_PK_G = LiveMagicEffectForbidBiz.PLAYING_PK_GAME;
       hashSet.add(pLAYING_PK_G);
       LiveMagicEffectForbidBiz lIVE_LINE = LiveMagicEffectForbidBiz.LIVE_LINE;
       hashSet.add(lIVE_LINE);
       hashSet.add(LiveMagicEffectForbidBiz.MANUEL_CLOSE);
       hashSet.add(LiveMagicEffectForbidBiz.SEVER_CLOSE);
       hashSet = new HashSet();
       LiveMagicEffectUtil.c = hashSet;
       hashSet.add(gZONE_SHIELD);
       hashSet.add(gZONE_BANNER);
       hashSet.add(sPECIAL_ACCO);
       hashSet.add(cLEAN_SCREEN);
       hashSet.add(oRIENTATION_);
       hashSet.add(pLAYING_PK_G);
       hashSet.add(lIVE_LINE);
    }
    public void LiveMagicEffectUtil(){
       super();
    }
    public static long a(String p0,int p1){
       LiveMagicEffectUtil liveMagicEff = LiveMagicEffectUtil.class;
       if (PatchProxy.isSupport(liveMagicEff)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, liveMagicEff, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = e.b().C1(p0);
       if (!l && p1 > 0) {
          l = a.d(p1);
       }
       return l;
    }
    public static boolean b(BeautifyConfig p0,BeautifyConfig p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMagicEffectUtil liveMagicEff = LiveMagicEffectUtil.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, liveMagicEff, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.mId == p1.mId) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, p1, null, liveMagicEff, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(BeautyFilterItem.isItemValueEquals(p0, p1, 1) || (BeautyFilterItem.isItemValueEquals(p0, p1, b) || (BeautyFilterItem.isItemValueEquals(p0, p1, 2) || (BeautyFilterItem.isItemValueEquals(p0, p1, 4) || BeautyFilterItem.isItemValueEquals(p0, p1, 3))))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1) {
          label_0056 :
             return b;
          }
       }
       b = true;
       goto label_0056 ;
    }
}
