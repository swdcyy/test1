package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$l;
import m0d.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.framework.model.user.User;
import v2c.g;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import xl8.b;
import kotlin.jvm.internal.a;
import m4c.a;
import com.facebook.imagepipeline.request.ImageRequest;
import m4c.d;
import java.util.Objects;
import m4c.f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class ProfileHeaderBackgroundImagePresenterV3$l extends a	// class@0014af
{
    public final ProfileHeaderBackgroundImagePresenterV3 b;

    public void ProfileHeaderBackgroundImagePresenterV3$l(ProfileHeaderBackgroundImagePresenterV3 p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       KsLogProfileTag bG_IMMERSIVE;
       KsLogProfileTag ksLogProfile;
       ProfileHeaderBackgroundImagePresenterV3$l tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$l.class, "1")) {
          return;
       }
       String str = " uid: ";
       String str1 = "ProfileHeaderBackgroundImagePresenterV3";
       if (p0 != null) {
          bG_IMMERSIVE = KsLogProfileTag.BG_IMMERSIVE;
          bG_IMMERSIVE.appendTag(str1);
          ksLogProfile = bG_IMMERSIVE;
          g.e(ksLogProfile, "updateUserBackground got: "+System.currentTimeMillis()+str+ProfileHeaderBackgroundImagePresenterV3.a9(this.b).getId());
          tb = this.b;
          tb.n9(p0, ProfileHeaderBackgroundImagePresenterV3.S8(tb));
       }else {
          p0 = ProfileHeaderBackgroundImagePresenterV3.P8(this.b).a();
          a.o(p0, "mBackgroundStatus.value");
          ImageRequest imageRequest = d.c(p0);
          if (imageRequest != null) {
             bG_IMMERSIVE = KsLogProfileTag.BG_IMMERSIVE;
             bG_IMMERSIVE.appendTag(str1);
             ksLogProfile = bG_IMMERSIVE;
             g.e(ksLogProfile, "updateUserBackground startLoad: "+System.currentTimeMillis()+str+ProfileHeaderBackgroundImagePresenterV3.a9(this.b).getId());
             tb = this.b;
             KwaiImageView kwaiImageVie = ProfileHeaderBackgroundImagePresenterV3.S8(tb);
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidTwoRefs(imageRequest, kwaiImageVie, tb, ProfileHeaderBackgroundImagePresenterV3.class, "13")) {
                a.d(imageRequest, new f(tb, kwaiImageVie));
             }
          }
       }
       return;
    }
}
