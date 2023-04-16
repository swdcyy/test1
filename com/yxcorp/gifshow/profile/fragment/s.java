package com.yxcorp.gifshow.profile.fragment.s;
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
import k3c.w2;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class s implements b	// class@001330
{
    public final UserProfilePhotoFragment a;

    public void s(UserProfilePhotoFragment p0){
       this.a = p0;
    }
    public final Object get(){
       s ta = this.a;
       Objects.requireNonNull(ta);
       UserStateExtBuilder obj = PatchProxy.apply(null, ta, UserProfilePhotoFragment.class, "19");
       if (obj != PatchProxyResult.class) {
       }else if(ta.isAdded()){
          UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(ta.getResources().getString(0x7f105267));
          uoc.a(new w2(ta));
          obj = new UserStateExtBuilder().b(new UserStateExtBuilder$c(ta.getResources().getString(R.string.arg_RES_7f104fc7))).e(new UserStateExtBuilder$c(ta.getResources().getString(R.string.arg_RES_7f100a5d))).c(new UserStateExtBuilder$c(ta.getResources().getString(R.string.arg_RES_7f103f29))).h(uoc);
          BaseProfileFeedFragment g = ta.G;
          obj = obj.d(new UserStateExtBuilder$c(ta.getResources().getString(0x7f103ef4))).g(new UserStateExtBuilder$c(ta.getResources().getString(0x7f100d28))).f(g.b, g.d.mUserProfile);
       }else {
          obj = "";
       }
       return obj;
    }
}
