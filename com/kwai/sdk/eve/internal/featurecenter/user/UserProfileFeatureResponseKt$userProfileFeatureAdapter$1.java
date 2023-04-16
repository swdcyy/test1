package com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponseKt$userProfileFeatureAdapter$1;
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
import com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponse;
import v97.b$a;

public final class UserProfileFeatureResponseKt$userProfileFeatureAdapter$1 implements b	// class@00153e
{
    public static final UserProfileFeatureResponseKt$userProfileFeatureAdapter$1 INSTANCE;

    static {
       UserProfileFeatureResponseKt$userProfileFeatureAdapter$1.INSTANCE = new UserProfileFeatureResponseKt$userProfileFeatureAdapter$1();
    }
    public void UserProfileFeatureResponseKt$userProfileFeatureAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public final b deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserProfileFeatureResponseKt$userProfileFeatureAdapter$1.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = null;
       try{
          b uob = b$a.a(b.b, p2.c(p0, UserProfileFeatureResponse.class), str, 2, str);
          return uob;
       }catch(com.google.gson.JsonParseException e0){
       }
    }
}
