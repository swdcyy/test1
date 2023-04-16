package com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil$enableDanmakuExp$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import tkd.b;
import tkd.d;
import nl9.u;
import mm5.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ul5.c;
import java.lang.Number;

public final class DanmakuSwitchUtil	// class@000e6e
{
    public static final p a;
    public static final DanmakuSwitchUtil b;

    static {
       DanmakuSwitchUtil.b = new DanmakuSwitchUtil();
       DanmakuSwitchUtil.a = s.c(DanmakuSwitchUtil$enableDanmakuExp$2.INSTANCE);
    }
    public void DanmakuSwitchUtil(){
       super();
    }
    public static final boolean b(QPhoto p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuSwitchUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          CommonMeta commonMeta = p0.getCommonMeta();
          if (commonMeta != null) {
             DanmakuInfo uDanmakuInfo = e.a(commonMeta);
             if (uDanmakuInfo != null && uDanmakuInfo.mDisablePost == null) {
                i = 1;
             label_002b :
                boolean b1 = d.a(-1694791652).Op(p0);
                a.i(a.a, "DanmakuSwitchUtil", "disablePost: "+(i ^ 0x01)+", enableAdDanmaku: "+b1, p0, null, "isSupportDanmaku", null, 40, null);
                if (i && (b1 && (!p0.isFusionVideo() && !c.m(p0)))) {
                   b = true;
                }
             }
          }
          i = 0;
          goto label_002b ;
       }
    label_0073 :
       return b;
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, DanmakuSwitchUtil.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuSwitchUtil.a.getValue();
       }
       return obj.intValue();
    }
}
