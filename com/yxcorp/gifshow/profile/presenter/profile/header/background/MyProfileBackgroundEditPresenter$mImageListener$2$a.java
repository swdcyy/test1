package com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$mImageListener$2$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$mImageListener$2;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserProfile;
import u3c.i;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia;
import xl8.b;
import m4c.a;
import m4c.a$a;
import android.view.View;
import java.io.File;

public final class MyProfileBackgroundEditPresenter$mImageListener$2$a implements ProfileBackgroundPublishManager$d	// class@00149b
{
    public final MyProfileBackgroundEditPresenter$mImageListener$2 a;

    public void MyProfileBackgroundEditPresenter$mImageListener$2$a(MyProfileBackgroundEditPresenter$mImageListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter$mImageListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "videoInfo");
       if (!MyProfileBackgroundEditPresenter.R8(this.a.this$0).isAdded()) {
          return;
       }
       ProfileParam mUserProfile = MyProfileBackgroundEditPresenter.S8(this.a.this$0).mUserProfile;
       if (mUserProfile != null) {
          i.e(mUserProfile, false);
       }
       mUserProfile = MyProfileBackgroundEditPresenter.S8(this.a.this$0).mUserProfile;
       if (mUserProfile != null) {
          i.d(mUserProfile, null);
       }
       MyProfileBackgroundEditPresenter.P8(this.a.this$0).d(a.h.a(p0));
       MyProfileBackgroundEditPresenter x = this.a.this$0.x;
       if (x != null) {
          x.setVisibility(8);
       }
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter$mImageListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "file");
       if (!MyProfileBackgroundEditPresenter.R8(this.a.this$0).isAdded()) {
          return;
       }
       ProfileParam mUserProfile = MyProfileBackgroundEditPresenter.S8(this.a.this$0).mUserProfile;
       if (mUserProfile != null) {
          i.e(mUserProfile, false);
       }
       mUserProfile = MyProfileBackgroundEditPresenter.S8(this.a.this$0).mUserProfile;
       if (mUserProfile != null) {
          i.d(mUserProfile, null);
       }
       MyProfileBackgroundEditPresenter.P8(this.a.this$0).d(a.h.b(p0));
       MyProfileBackgroundEditPresenter x = this.a.this$0.x;
       if (x != null) {
          x.setVisibility(8);
       }
       return;
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter$mImageListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "file");
       return;
    }
    public void onFail(){
    }
}
