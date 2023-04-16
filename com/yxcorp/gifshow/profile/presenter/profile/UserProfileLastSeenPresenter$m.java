package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$m;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$m implements g	// class@001464
{
    public final UserProfileLastSeenPresenter b;

    public void UserProfileLastSeenPresenter$m(UserProfileLastSeenPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$m.class, "1")) {
       }else {
          View view = this.b.m9();
          if (view != null) {
             a.o(p0, "select");
             int i = (p0.booleanValue())? 0: 8;
             view.setVisibility(i);
          }
          a.o(p0, "select");
          if (p0.booleanValue() && (!this.b.n9() || (this.b.R == null || (!this.b.n9() && this.b.S == null)))) {
             this.b.F9();
          }
       }
    label_0051 :
       return;
    }
}
