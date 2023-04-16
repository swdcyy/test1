package com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import u3c.h;
import com.kwai.framework.model.user.User;
import android.view.View;
import android.view.ViewStub;
import m4c.b;
import android.view.View$OnClickListener;
import qrd.l1;
import com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.util.a$a;
import z5c.y1;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;

public final class MyProfileBackgroundEditPresenter$c implements g	// class@001498
{
    public final MyProfileBackgroundEditPresenter b;

    public void MyProfileBackgroundEditPresenter$c(MyProfileBackgroundEditPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       View view;
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter$c.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, MyProfileBackgroundEditPresenter.class, "7")) {
             MyProfileBackgroundEditPresenter s = p0.s;
             String str = "mParam";
             if (s == null) {
                a.S(str);
             }
             if (h.n(s.mUserProfile)) {
                s = p0.r;
                String str1 = "mUser";
                if (s == null) {
                   a.S(str1);
                }
                if (!s.isBanned() && p0.w == 2) {
                   if (p0.x == null) {
                      s = p0.p;
                      if (s != null) {
                         view = s.inflate();
                         if (view != null) {
                            view.setOnClickListener(new b(p0));
                            a = l1.a;
                         label_005f :
                            p0.x = view;
                         }
                      }
                      view = objArray;
                      goto label_005f ;
                   }
                   s = p0.x;
                   if (s != null) {
                      s.setVisibility(0);
                   }
                   a$a e = a.e;
                   MyProfileBackgroundEditPresenter s1 = p0.s;
                   if (s1 == null) {
                      a.S(str);
                   }
                   if (!e.b(s1.mUserProfile)) {
                      s = p0.t;
                      if (s == null) {
                         a.S("mFragment");
                      }
                      p0 = p0.r;
                      if (p0 == null) {
                         a.S(str1);
                      }
                      if (!PatchProxy.applyVoidTwoRefs(s, p0, objArray, y1.class, "41")) {
                         f3 uof3 = f3.i(0x7784);
                         uof3.b(b0.f(p0.getId()));
                         uof3.h(s);
                      }
                   }
                }
             }
          label_00aa :
             p0 = p0.x;
             if (p0 != null) {
                p0.setVisibility(8);
             }
          }
       }
       return;
    }
}
