package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$e;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.reduce.d;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;
import java.lang.Boolean;

public final class ProfileFollowElement$e implements g	// class@001436
{
    public final ProfileFollowElement b;

    public void ProfileFollowElement$e(ProfileFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFollowElement$e.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          ProfileFollowElement profileFollo = ProfileFollowElement.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, profileFollo, "6")) {
             ProfileFollowElement b = p0.B;
             if (b == null) {
                a.S("mPhotoFeedbackHelper");
             }
             ProfileFollowElement z = p0.z;
             if (z == null) {
                a.S("mDetailParams");
             }
             b.b(z.getSource(), objArray, objArray);
             if (!PatchProxy.applyVoid(objArray, p0, profileFollo, "14")) {
                p0 = p0.A;
                if (p0 == null) {
                   a.S("mLogListener");
                }
                a$a uoa = a$a.s(0, "Profile 关注引导的【不感兴趣】按钮点击");
                uoa.f("NOT_INTEREST_BUTTON");
                uoa.r(true);
                p0.a(uoa);
             }
          }
          p0 = ProfileFollowElement.n0(this.b);
          Objects.requireNonNull(p0);
          ProfileFollowManager profileFollo1 = ProfileFollowManager.class;
          if (!PatchProxy.isSupport(profileFollo1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, profileFollo1, "1")) {
             p0.b = true;
             p0.c();
          }
       }
       return;
    }
}
