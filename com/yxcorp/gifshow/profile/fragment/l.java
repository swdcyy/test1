package com.yxcorp.gifshow.profile.fragment.l;
import lkd.b;
import com.yxcorp.gifshow.profile.fragment.UserMentionedMeTabFragment;
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
import k3c.y1;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class l implements b	// class@001329
{
    public final UserMentionedMeTabFragment a;

    public void l(UserMentionedMeTabFragment p0){
       this.a = p0;
    }
    public final Object get(){
       int i;
       l ta = this.a;
       Objects.requireNonNull(ta);
       UserStateExtBuilder obj = PatchProxy.apply(null, ta, UserMentionedMeTabFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(Integer.valueOf(0x7f080605));
          uoc.a(new y1(ta));
          obj = new UserStateExtBuilder().b(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080606))).e(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080606))).a(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080606))).c(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f0805d4))).h(uoc);
          BaseProfileFeedFragment g = ta.G;
          i = obj.d(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080605))).g(new UserStateExtBuilder$c(Integer.valueOf(R.drawable.arg_RES_7f080603))).f(g.b, g.d.mUserProfile).intValue();
       }
       return Integer.valueOf(i);
    }
}
