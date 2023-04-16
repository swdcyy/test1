package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$a;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.util.a$a;
import wh5.a;

public final class ProfileDialogBubbleDispatchPresenter$a implements g	// class@00156d
{
    public final ProfileDialogBubbleDispatchPresenter b;

    public void ProfileDialogBubbleDispatchPresenter$a(ProfileDialogBubbleDispatchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileDialogBubbleDispatchPresenter$a.class, "1")) {
       }else {
          a.p(p0, "profileResponse");
          if (!this.b.R8() || (p0.mUserProfile != null && !a.e.c(p0))) {
             ProfileDialogBubbleDispatchPresenter$a tb = this.b;
             if (tb.u == null) {
                tb.y = p0;
             }else if(a.f()){
                this.b.S8(p0);
             }
          }
       }
       return;
    }
}
