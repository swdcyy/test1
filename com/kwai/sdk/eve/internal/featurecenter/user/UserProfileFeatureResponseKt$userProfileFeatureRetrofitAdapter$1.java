package com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1;
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
import com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponse;

public final class UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1 implements b	// class@00153f
{
    public static final UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1 INSTANCE;

    static {
       UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1.INSTANCE = new UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1();
    }
    public void UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public final a deserialize(JsonElement p0,Type p1,a p2){
       a uoa1;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       try{
          a uoa = new a(p2.c(p0, UserProfileFeatureResponse.class), 0, null, null, 0, 0);
       }catch(com.google.gson.JsonParseException e0){
          uoa1 = null;
       }
       return uoa1;
    }
}
