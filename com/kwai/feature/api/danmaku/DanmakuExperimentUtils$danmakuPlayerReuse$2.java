package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuPlayerReuse$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.l;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$danmakuPlayerReuse$2 extends Lambda implements a	// class@000e47
{
    public static final DanmakuExperimentUtils$danmakuPlayerReuse$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuPlayerReuse$2.INSTANCE = new DanmakuExperimentUtils$danmakuPlayerReuse$2();
    }
    public void DanmakuExperimentUtils$danmakuPlayerReuse$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuPlayerReuse$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       int i1 = l.e("ENABLE_DANMAKU_PLAYER_REUSE", i);
       String str = 1;
       if (!i1) {
          i = a.t().d("danmakuPlayerReuse", i);
       }else if(i1 == str){
          i = true;
       }
       return i;
    }
}
