package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import zca.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashSet;

public final class UserProfileFollowGuidePresenter$f implements g	// class@00154f
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$f(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$f.class, "1")) {
       }else {
          UserProfileFollowGuidePresenter$f tb = this.b;
          a.o(p0, "event");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, UserProfileFollowGuidePresenter.class, "6")) {
             UserProfileFollowGuidePresenter r = tb.r;
             if (r == null) {
                a.S("mUser");
             }
             if (TextUtils.n(r.getId(), p0.b) && !tb.G.contains(p0.a)) {
                tb.G.add(p0.a);
                tb.P8();
             }
          }
       }
       return;
    }
}
