package com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import v97.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import v97.b$a;

public final class FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1 implements b	// class@00150d
{
    public static final FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1 INSTANCE;

    static {
       FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1.INSTANCE = new FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1();
    }
    public void FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public final b deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeatureCalculateConfigResponseKt$featureCalculateConfigAdapter$1.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = null;
       try{
          b uob = b$a.a(b.b, p2.c(p0, FeatureCalculateConfigResponse.class), str, 2, str);
          return uob;
       }catch(com.google.gson.JsonParseException e0){
       }
    }
}
