package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$k;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import java.lang.Object;
import j5c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class UserProfileLastSeenPresenter$k implements g	// class@001462
{
    public final UserProfileLastSeenPresenter b;

    public void UserProfileLastSeenPresenter$k(UserProfileLastSeenPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$k.class, "1")) {
       }else {
          UserProfileLastSeenPresenter$k tb = this.b;
          p0 = p0.a;
          Objects.requireNonNull(tb);
          UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
          if (!PatchProxy.isSupport(userProfileL) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tb, userProfileL, "30")) {
             userProfileL = tb.r;
             if (userProfileL == null) {
                a.S("mFragment");
             }
             if (userProfileL.Vg().c()) {
                tb.H = p0;
                if (tb.G9(p0)) {
                   tb.X8();
                }else {
                   tb.W8();
                }
             }
          }
       }
       return;
    }
}
