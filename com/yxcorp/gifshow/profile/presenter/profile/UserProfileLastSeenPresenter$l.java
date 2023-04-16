package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$l;
import erd.r;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$l implements r	// class@001463
{
    public final UserProfileLastSeenPresenter b;

    public void UserProfileLastSeenPresenter$l(UserProfileLastSeenPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, UserProfileLastSeenPresenter$l.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (this.b.h9() == 1)? true: false;
       }
       return b;
    }
}
