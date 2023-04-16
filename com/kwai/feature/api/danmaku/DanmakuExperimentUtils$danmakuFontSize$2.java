package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuFontSize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.framework.abtest.f;
import xf6.k$a;

public final class DanmakuExperimentUtils$danmakuFontSize$2 extends Lambda implements a	// class@000e42
{
    public static final DanmakuExperimentUtils$danmakuFontSize$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuFontSize$2.INSTANCE = new DanmakuExperimentUtils$danmakuFontSize$2();
    }
    public void DanmakuExperimentUtils$danmakuFontSize$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuFontSize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.r.e(Boolean.valueOf(f.a("danmuFontSize")));
    }
    public Object invoke(){
       return this.invoke();
    }
}
