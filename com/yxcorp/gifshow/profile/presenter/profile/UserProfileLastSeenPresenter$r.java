package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$r;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$r extends m	// class@001471
{
    public final UserProfileLastSeenPresenter c;

    public void UserProfileLastSeenPresenter$r(UserProfileLastSeenPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserProfileLastSeenPresenter$r.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.c.P8();
       PatchProxy.onMethodExit(UserProfileLastSeenPresenter$r.class, "1");
       return;
    }
}
