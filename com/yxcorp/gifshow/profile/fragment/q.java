package com.yxcorp.gifshow.profile.fragment.q;
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
import k3c.t2;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class q implements b	// class@00132e
{
    public final UserProfilePhotoFragment a;

    public void q(UserProfilePhotoFragment p0){
       this.a = p0;
    }
    public final Object get(){
       int i;
       q ta = this.a;
       Objects.requireNonNull(ta);
       UserStateExtBuilder obj = PatchProxy.apply(null, ta, UserProfilePhotoFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(Integer.valueOf(0x7f080605));
          uoc.a(new t2(ta));
          obj = new UserStateExtBuilder().b(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080606))).e(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080606))).a(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080606))).c(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f0805d4))).h(uoc);
          BaseProfileFeedFragment g = ta.G;
          i = obj.d(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080605))).g(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.common_emptystate_nocontent))).f(g.b, g.d.mUserProfile).intValue();
       }
       return Integer.valueOf(i);
    }
}
