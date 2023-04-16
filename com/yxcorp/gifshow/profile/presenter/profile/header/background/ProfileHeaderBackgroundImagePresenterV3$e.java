package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$e;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import java.lang.Object;
import j5c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import android.view.View;

public final class ProfileHeaderBackgroundImagePresenterV3$e implements g	// class@0014a8
{
    public final ProfileHeaderBackgroundImagePresenterV3 b;

    public void ProfileHeaderBackgroundImagePresenterV3$e(ProfileHeaderBackgroundImagePresenterV3 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$e.class, "1")) {
       }else {
          a.p(p0, "scrollState");
          g.e(KsLogProfileTag.BG_IMMERSIVE.appendTag("ProfileHeaderBackgroundImagePresenterV3"), "mScrollY: "+p0.a);
          ProfileHeaderBackgroundImagePresenterV3.W8(this.b).setTranslationY((- (float)p0.a));
       }
       return;
    }
}
