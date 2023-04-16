package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import usd.q;

public final class UserProfileFollowGuidePresenter$d implements g	// class@00154d
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$d(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$d.class, "1")) {
       }else {
          UserProfileFollowGuidePresenter$d tb = this.b;
          a.o(p0, "position");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, UserProfileFollowGuidePresenter.class, "5")) {
             tb.C = q.n(p0.intValue(), tb.C);
             if (tb.E == null) {
                tb.P8();
             }
          }
       }
       return;
    }
}
