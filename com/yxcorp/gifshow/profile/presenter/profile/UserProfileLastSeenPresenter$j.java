package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$j;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$j extends m	// class@001461
{
    public final UserProfileLastSeenPresenter c;

    public void UserProfileLastSeenPresenter$j(UserProfileLastSeenPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserProfileLastSeenPresenter$j.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.c.P8();
       PatchProxy.onMethodExit(UserProfileLastSeenPresenter$j.class, "1");
       return;
    }
}
