package com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter$a;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y8c.t;

public final class MyProfilePhotoEmptyUpdatePresenter$a implements g	// class@001424
{
    public final MyProfilePhotoEmptyUpdatePresenter b;

    public void MyProfilePhotoEmptyUpdatePresenter$a(MyProfilePhotoEmptyUpdatePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePhotoEmptyUpdatePresenter$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.t != null) {
             p0 = p0.q;
             if (p0 == null) {
                a.S("mTipsHelper");
             }
             p0.i();
             p0.t = false;
          }
       }
       return;
    }
}
