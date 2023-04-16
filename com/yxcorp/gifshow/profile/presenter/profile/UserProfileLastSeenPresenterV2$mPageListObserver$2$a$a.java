package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2$a$a;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2$a;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.response.ProfileLastSeenPhotoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kwai.social.startup.follow.model.ProfileLastSeenConfig;
import java.lang.reflect.Type;
import mw4.a;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.profile.f0;
import java.lang.Runnable;
import android.view.ViewGroup;
import qvb.n0;
import qvb.a;

public final class UserProfileLastSeenPresenterV2$mPageListObserver$2$a$a implements g	// class@001477
{
    public final UserProfileLastSeenPresenterV2$mPageListObserver$2$a b;

    public void UserProfileLastSeenPresenterV2$mPageListObserver$2$a$a(UserProfileLastSeenPresenterV2$mPageListObserver$2$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenterV2$mPageListObserver$2$a$a.class, "1")) {
       }else {
          UserProfileLastSeenPresenterV2$mPageListObserver$2 this$0 = this.b.b.this$0;
          this$0.V0 = p0.mPhotoPosition;
          p0 = p0.mShowLaseSeenBtn;
          a.o(p0, "response.mShowLaseSeenBtn");
          this$0.W0 = p0.booleanValue();
          p0 = a.p(ProfileLastSeenConfig.class);
          boolean b = false;
          int i = this.b.b.this$0.T9(b, p0);
          int i1 = this.b.b.this$0.T9(true, p0);
          UserProfileLastSeenPresenterV2$mPageListObserver$2 this$01 = this.b.b.this$0;
          if (this$01.Y9()) {
             int i2 = this.b.b.this$0.V9();
             if ((i + true) <= i2 && i1 >= i2) {
                b = true;
             }
          }
          this$01.M9(b);
          if (!this.b.b.this$0.Y9() && this.b.b.this$0.V9() == -1) {
             this.b.b.this$0.J9(3);
             i1 = this.b.b.this$0.m9();
             if (i1 != null) {
                i1.setVisibility(8);
             }
          }else {
             i1 = this.b.b.this$0.m9();
             if (i1 == null || i1.getVisibility()) {
                this.b.b.this$0.x9().post(new f0(this));
             }
          }
          if (this.b.b.this$0.q9() && !this.b.b.this$0.X9()) {
             this.b.b.this$0.ba(true);
             i1 = this.b.b.this$0;
             i1.K9(i1.s9().getCount());
             this.b.b.this$0.X8();
          }
       }
       return;
    }
}
