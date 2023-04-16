package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuDrawingCache$2;
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

public final class DanmakuExperimentUtils$enableDanmakuDrawingCache$2 extends Lambda implements a	// class@000e4f
{
    public static final DanmakuExperimentUtils$enableDanmakuDrawingCache$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuDrawingCache$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuDrawingCache$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuDrawingCache$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuDrawingCache$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       int i1 = l.e("DANMAKU_ENABLE_DRAWING_CACHE", i);
       String str = 1;
       if (!i1) {
          i = a.t().d("enableDanmakuDrawingCache", i);
       }else if(i1 == str){
          i = true;
       }
       return i;
    }
}
