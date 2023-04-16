package com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper$loadGuideConfig$guideConfigs$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;

public final class GrowthGuideConfigCacheHelper$loadGuideConfig$guideConfigs$1 extends Lambda implements l	// class@000ff5
{
    public final String $scene;
    public final Integer $taskType;

    public void GrowthGuideConfigCacheHelper$loadGuideConfig$guideConfigs$1(Integer p0,String p1){
       this.$taskType = p0;
       this.$scene = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(JsonObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideConfigCacheHelper$loadGuideConfig$guideConfigs$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "config");
       return GrowthGuideConfigCacheHelper.e.b(p0, this.$taskType, this.$scene);
    }
}
