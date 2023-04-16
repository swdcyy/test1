package com.kwai.feature.api.danmaku.DanmakuSwitchUtil$enableDanmakuExp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import com.kwai.corona.startup.model.CoronaBarrageSetting;
import java.lang.reflect.Type;
import ni5.d;
import java.lang.Integer;

public final class DanmakuSwitchUtil$enableDanmakuExp$2 extends Lambda implements a	// class@000e6d
{
    public static final DanmakuSwitchUtil$enableDanmakuExp$2 INSTANCE;

    static {
       DanmakuSwitchUtil$enableDanmakuExp$2.INSTANCE = new DanmakuSwitchUtil$enableDanmakuExp$2();
    }
    public void DanmakuSwitchUtil$enableDanmakuExp$2(){
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DanmakuSwitchUtil obj = PatchProxy.apply(null, this, DanmakuSwitchUtil$enableDanmakuExp$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = DanmakuSwitchUtil.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, DanmakuSwitchUtil.class, "2");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): DanmakuExperimentUtils.U.K();
       int i = 0;
       if (b) {
          i = 2;
       }else if(!DanmakuUtil.g.g() && DanmakuExperimentUtils.U.q()){
          CoronaBarrageSetting uCoronaBarra = d.a(CoronaBarrageSetting.class);
          if (uCoronaBarra != null) {
             i = uCoronaBarra.mEnableDanmakuSwitch;
          }
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
