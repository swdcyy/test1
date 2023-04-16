package com.yxcorp.gifshow.profile.fragment.p;
import lkd.b;
import com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$c;
import android.content.res.Resources;
import k3c.s2;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class p implements b	// class@00132d
{
    public final UserProfilePhotoFragment a;

    public void p(UserProfilePhotoFragment p0){
       this.a = p0;
    }
    public final Object get(){
       p ta = this.a;
       Objects.requireNonNull(ta);
       UserStateExtBuilder obj = PatchProxy.apply(null, ta, UserProfilePhotoFragment.class, "13");
       if (obj != PatchProxyResult.class) {
       }else if(ta.isAdded()){
          UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(ta.getResources().getString(0x7f103f29));
          uoc.a(new s2(ta));
          obj = new UserStateExtBuilder().b(new UserStateExtBuilder$c(ta.getResources().getString(R.string.arg_RES_7f104fc7))).e(new UserStateExtBuilder$c(ta.getResources().getString(R.string.arg_RES_7f104fc7))).c(new UserStateExtBuilder$c(ta.getResources().getString(R.string.arg_RES_7f103f29))).h(uoc);
          BaseProfileFeedFragment g = ta.G;
          obj = obj.d(new UserStateExtBuilder$c(ta.getResources().getString(0x7f103f29))).g(new UserStateExtBuilder$c(ta.getResources().getString(0x7f100d28))).f(g.b, g.d.mUserProfile);
       }else {
          obj = "";
       }
       return obj;
    }
}
