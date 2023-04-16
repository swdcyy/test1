package com.yxcorp.gifshow.profile.presenter.profile.page.MyProfilePhotoGuestDialogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.page.MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import t2c.b;
import java.util.List;
import com.kwai.framework.model.user.User;

public final class MyProfilePhotoGuestDialogPresenter extends PresenterV2	// class@001568
{
    public List p;
    public User q;
    public final p r;

    public void MyProfilePhotoGuestDialogPresenter(){
       super();
       this.r = s.c(new MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2(this));
    }
    public void E8(){
       MyProfilePhotoGuestDialogPresenter myProfilePho = MyProfilePhotoGuestDialogPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myProfilePho, "3")) {
          return;
       }
       MyProfilePhotoGuestDialogPresenter tp = this.p;
       if (tp == null) {
          a.S("mProfileDialogInterceptors");
       }
       b uob = PatchProxy.apply(objArray, this, myProfilePho, "1");
       if (uob == PatchProxyResult.class) {
          uob = this.r.getValue();
       }
       tp.add(uob);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoGuestDialogPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("PROFILE_DIALOG_INTERCEPTOR");
       a.o(obj, "inject\(ProfileCommonAcce¡­OFILE_DIALOG_INTERCEPTOR\)");
       this.p = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.q = obj;
       return;
    }
}
