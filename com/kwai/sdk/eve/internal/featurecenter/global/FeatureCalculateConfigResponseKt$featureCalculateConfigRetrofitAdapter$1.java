package com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;

public final class FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1 implements b	// class@00150e
{
    public static final FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1 INSTANCE;

    static {
       FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1.INSTANCE = new FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1();
    }
    public void FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public final a deserialize(JsonElement p0,Type p1,a p2){
       a uoa1;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeatureCalculateConfigResponseKt$featureCalculateConfigRetrofitAdapter$1.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       try{
          a uoa = new a(p2.c(p0, FeatureCalculateConfigResponse.class), 0, null, null, 0, 0);
       }catch(com.google.gson.JsonParseException e0){
          uoa1 = null;
       }
       return uoa1;
    }
}
