package com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponseKt;
import com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponseKt$userProfileFeatureAdapter$1;
import com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1;
import com.google.gson.b;

public final class UserProfileFeatureResponseKt	// class@001540
{
    public static final b userProfileFeatureAdapter;
    public static final b userProfileFeatureRetrofitAdapter;

    static {
       UserProfileFeatureResponseKt.userProfileFeatureAdapter = UserProfileFeatureResponseKt$userProfileFeatureAdapter$1.INSTANCE;
       UserProfileFeatureResponseKt.userProfileFeatureRetrofitAdapter = UserProfileFeatureResponseKt$userProfileFeatureRetrofitAdapter$1.INSTANCE;
    }
    public static final b getUserProfileFeatureAdapter(){
       return UserProfileFeatureResponseKt.userProfileFeatureAdapter;
    }
    public static final b getUserProfileFeatureRetrofitAdapter(){
       return UserProfileFeatureResponseKt.userProfileFeatureRetrofitAdapter;
    }
}
