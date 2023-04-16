package com.yxcorp.gifshow.model.FeatureModelStagGsonRegistration$b;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.Class;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.model.response.UsersResponse;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.model.response.UserProfileResponse;

public class FeatureModelStagGsonRegistration$b implements GsonLifeCycleEnabler$a	// class@00122c
{
    public static final GsonLifeCycleEnabler$a a;

    static {
       FeatureModelStagGsonRegistration$b.a = new FeatureModelStagGsonRegistration$b();
    }
    public void FeatureModelStagGsonRegistration$b(){
       super();
    }
    public boolean a(Type p0){
       boolean b = false;
       if (!p0 instanceof Class) {
          return b;
       }
       if (p0 != QPhoto.class && (p0 != User.class && (p0 != CommonMeta.class && (p0 != PhotoMeta.class && (p0 != QComment.class && (p0 != UsersResponse.class && (p0 == UserProfile.class || p0 == UserProfileResponse.class))))))) {
          b = true;
       }
       return b;
    }
}
