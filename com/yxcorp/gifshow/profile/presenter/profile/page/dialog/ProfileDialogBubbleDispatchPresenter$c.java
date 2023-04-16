package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.UserProfileResponse;

public final class ProfileDialogBubbleDispatchPresenter$c implements g	// class@00156f
{
    public final ProfileDialogBubbleDispatchPresenter b;

    public void ProfileDialogBubbleDispatchPresenter$c(ProfileDialogBubbleDispatchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileDialogBubbleDispatchPresenter$c.class, "1")) {
       }else {
          a.o(p0, "fullShow");
          this.b.u = p0.booleanValue();
          p0 = this.b;
          if (p0.u != null) {
             ProfileDialogBubbleDispatchPresenter y = p0.y;
             if (y != null) {
                p0.S8(y);
             }
          }
       }
       return;
    }
}
