package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.g;
import z5c.l0;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.QCurrentUser;
import z5c.g;
import s1c.j1;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class h extends PresenterV2	// class@00157f
{
    public j1 p;
    public User q;
    public ProfileParam r;
    public boolean s;
    public g t;
    public c u;

    public void h(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.X7(this.u.e().subscribe(new g(this), l0.a));
       boolean b = (this.q.mFollowStatus != User$FollowStatus.FOLLOWING || !QCurrentUser.ME.isLogined())? true: false;
       this.s = b;
       this.t = new g(this.q.mId);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(j1.class);
       this.q = this.q8(User.class);
       this.r = this.q8(ProfileParam.class);
       this.u = this.r8("PROFILE_LOAD_STATE");
       return;
    }
}
