package com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1 extends Lambda implements l	// class@000ff6
{
    public static final GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1 INSTANCE;

    static {
       GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1.INSTANCE = new GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1();
    }
    public void GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(JsonObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return true;
    }
}
