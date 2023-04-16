package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import im8.f;
import xl8.b;
import m4c.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity$a;

public final class ProfileHeaderBackgroundImagePresenter$c extends m	// class@0014a0
{
    public final ProfileHeaderBackgroundImagePresenter c;

    public void ProfileHeaderBackgroundImagePresenter$c(ProfileHeaderBackgroundImagePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ProfileBackgroundPreviewSelectActivity$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ProfileHeaderBackgroundImagePresenter u = this.c.u;
       if (u == null) {
          a.S("mUserProfileRef");
       }
       if (u.get() == null) {
          return;
       }else {
          ProfileBgVideoInfo profileBgVid = ProfileHeaderBackgroundImagePresenter.P8(this.c).a().e();
          List list = 2;
          String str = "this";
          if (profileBgVid != null) {
             Activity activity = this.c.getActivity();
             if (activity != null && profileBgVid.getCoverUrls() != null) {
                if (this.c.x != list) {
                   a = ProfileBackgroundPreviewSelectActivity.A;
                   a.o(activity, str);
                   ArrayList uArrayList = new ArrayList(profileBgVid.getCoverUrls());
                   boolean b = ProfileHeaderBackgroundImagePresenter.P8(this.c).a().a();
                   ProfileHeaderBackgroundImagePresenter t = this.c.t;
                   if (t == null) {
                      a.S("mUser");
                   }
                   a.e(activity, uArrayList, b, false, t.getId(), profileBgVid.getFeed(), profileBgVid.getUser());
                }else {
                   a.o(activity, str);
                   ProfileBackgroundPreviewActivity.z.d(activity, new ArrayList(profileBgVid.getCoverUrls()));
                }
             }
             return;
          }else {
             ArrayList uArrayList1 = ProfileHeaderBackgroundImagePresenter.P8(this.c).a().b();
             if (uArrayList1 != null) {
                Activity activity1 = this.c.getActivity();
                if (activity1 != null) {
                   if (this.c.x != list) {
                      a.o(activity1, str);
                      ProfileBackgroundPreviewSelectActivity$a.f(ProfileBackgroundPreviewSelectActivity.A, activity1, uArrayList1, false, false, null, null, null, 120, null);
                   }else {
                      a.o(activity1, str);
                      ProfileBackgroundPreviewActivity.z.d(activity1, uArrayList1);
                   }
                }
             }
             return;
          }
       }
    }
}
