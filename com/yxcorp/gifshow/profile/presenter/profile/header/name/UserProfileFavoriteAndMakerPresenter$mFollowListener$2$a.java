package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$mFollowListener$2$a;
import s3c.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$mFollowListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import android.view.View;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import xl8.b;
import java.lang.CharSequence;
import java.lang.Throwable;
import s3c.a;

public final class UserProfileFavoriteAndMakerPresenter$mFollowListener$2$a implements b	// class@0014ed
{
    public final UserProfileFavoriteAndMakerPresenter$mFollowListener$2 a;

    public void UserProfileFavoriteAndMakerPresenter$mFollowListener$2$a(UserProfileFavoriteAndMakerPresenter$mFollowListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, UserProfileFavoriteAndMakerPresenter$mFollowListener$2$a.class, "2")) {
          return;
       }
       UserProfileFavoriteAndMakerPresenter$mFollowListener$2 this$0 = this.a.this$0;
       this$0.F = false;
       UserProfileFavoriteAndMakerPresenter u = this$0.u;
       if (u != null) {
          u.setVisibility(8);
       }
       u = this.a.this$0.q;
       if (u != null) {
          u.setVisibility(8);
       }
       u = this.a.this$0.s;
       if (u != null) {
          u.setVisibility(8);
       }
       return;
    }
    public void b(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFavoriteAndMakerPresenter$mFollowListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "user");
       UserProfileFavoriteAndMakerPresenter$mFollowListener$2 this$0 = this.a.this$0;
       this$0.F = true;
       this$0.Z8(this$0.S8().a());
       return;
    }
    public void c(Throwable p0){
       a.a(this, p0);
    }
}
