package com.yxcorp.gifshow.profile.ProfileStyle$TEENAGE;
import com.yxcorp.gifshow.profile.ProfileStyle;
import java.lang.String;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k4c.r1;
import k4c.z1;
import k4c.f0;
import k4c.l;
import k4c.r;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.b;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter;
import d5c.g0;
import m4c.l;
import d5c.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a;
import q4c.e;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import k4c.a;
import l4c.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.f;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import d5c.w0;
import y4c.e;
import l4c.b;
import b5c.r;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.e;
import q4c.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.r;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;

public final class ProfileStyle$TEENAGE extends ProfileStyle	// class@0011e6
{

    public void ProfileStyle$TEENAGE(String p0,int p1){
       super(p0, p1, 2, null);
    }
    public void addCommonPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$TEENAGE.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new r1());
       p0.U7(new z1());
       p0.U7(new f0());
       p0.U7(new l());
       p0.U7(new r());
       p0.U7(new b());
       p0.U7(new ProfileAppBarScrollPresenter());
       p0.U7(new g0());
       p0.U7(new l(2));
       PatchProxy.onMethodExit(ProfileStyle$TEENAGE.class, "3");
       return;
    }
    public void addMyPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$TEENAGE.class, "2")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new a());
       p0.U7(new a());
       p0.U7(new a());
       p0.U7(new e());
       p0.U7(new MyProfileBackgroundEditPresenter());
       p0.U7(new a());
       p0.U7(new a());
       p0.U7(new f());
       p0.U7(new b());
       PatchProxy.onMethodExit(ProfileStyle$TEENAGE.class, "2");
       return;
    }
    public void addUserPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$TEENAGE.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new w0());
       p0.U7(new e());
       p0.U7(new b());
       p0.U7(new r());
       p0.U7(new e());
       p0.U7(new m());
       p0.U7(new r());
       p0.U7(new b());
       p0.U7(new UserProfileFollowGuidePresenter());
       PatchProxy.onMethodExit(ProfileStyle$TEENAGE.class, "1");
       return;
    }
}
