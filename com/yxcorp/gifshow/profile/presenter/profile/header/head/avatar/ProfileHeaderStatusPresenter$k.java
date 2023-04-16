package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$k;
import gx5.h;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import java.lang.Object;
import gx5.g;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$k$a;
import java.lang.Runnable;
import ekd.k1;

public final class ProfileHeaderStatusPresenter$k implements h	// class@0014de
{
    public final ProfileHeaderStatusPresenter a;

    public void ProfileHeaderStatusPresenter$k(ProfileHeaderStatusPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return g.a(this);
    }
    public void b(){
       g.b(this);
    }
    public void c(){
       g.c(this);
    }
    public void d(){
       g.d(this);
    }
    public void e(Throwable p0){
       g.e(this, p0);
    }
    public final void f(){
       if (PatchProxy.applyVoidWithListener(null, this, ProfileHeaderStatusPresenter$k.class, "1")) {
          return;
       }
       k1.r(new ProfileHeaderStatusPresenter$k$a(this), 1000);
       PatchProxy.onMethodExit(ProfileHeaderStatusPresenter$k.class, "1");
       return;
    }
    public void g(){
       g.f(this);
    }
}
