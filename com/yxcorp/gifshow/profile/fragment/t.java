package com.yxcorp.gifshow.profile.fragment.t;
import lkd.b;
import com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$c;
import java.lang.Integer;
import k3c.x2;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class t implements b	// class@001331
{
    public final UserProfilePhotoFragment a;

    public void t(UserProfilePhotoFragment p0){
       this.a = p0;
    }
    public final Object get(){
       int i;
       t ta = this.a;
       Objects.requireNonNull(ta);
       UserStateExtBuilder obj = PatchProxy.apply(null, ta, UserProfilePhotoFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(Integer.valueOf(0x7f082309));
          uoc.a(new x2(ta));
          obj = new UserStateExtBuilder().b(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f0822a2))).e(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f0822a2))).a(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f0822a2))).c(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f0822b8))).h(uoc);
          BaseProfileFeedFragment g = ta.G;
          i = obj.d(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f082309))).g(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f082334))).f(g.b, g.d.mUserProfile).intValue();
       }
       return Integer.valueOf(i);
    }
}
