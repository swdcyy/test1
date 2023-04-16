package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;

public final class ProfileHeaderBackgroundImagePresenterV3$d extends m	// class@0014a7
{
    public final ProfileHeaderBackgroundImagePresenterV3 c;

    public void ProfileHeaderBackgroundImagePresenterV3$d(ProfileHeaderBackgroundImagePresenterV3 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ProfileHeaderBackgroundImagePresenterV3.Y8(this.c).a("PROFILE_HEAD_BG_IMAGE_EDIT");
       return;
    }
}
