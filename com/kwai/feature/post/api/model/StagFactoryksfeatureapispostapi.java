package com.kwai.feature.post.api.model.StagFactoryksfeatureapispostapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig$TypeAdapter;
import com.kwai.feature.post.api.model.GrowthGuideConfig;
import com.kwai.feature.post.api.model.GrowthGuideConfig$TypeAdapter;

public final class StagFactoryksfeatureapispostapi implements j	// class@001410
{

    public void StagFactoryksfeatureapispostapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapispostapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == GrowthGuideItemConfig.class) {
          return new GrowthGuideItemConfig$TypeAdapter(p0);
       }
       if (rawType == GrowthGuideConfig.class) {
          return new GrowthGuideConfig$TypeAdapter(p0);
       }
       return null;
    }
}
