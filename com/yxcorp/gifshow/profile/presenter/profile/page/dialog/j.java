package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.i;
import z5c.l0;
import erd.g;
import crd.b;
import e17.i;
import s1c.j1;
import java.util.Set;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class j extends PresenterV2	// class@001582
{
    public j1 p;
    public User q;
    public ProfileParam r;
    public b s;
    public boolean t;
    public c u;

    public void j(){
       super();
       this.s = new j$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       boolean b = (this.q.mFollowStatus != User$FollowStatus.FOLLOWING || !QCurrentUser.ME.isLogined())? true: false;
       this.t = b;
       if (b) {
          this.X7(this.u.e().subscribe(new i(this), l0.a));
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f101021);
       }
       this.p.b.add(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.p.b.remove(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.q8(j1.class);
       this.q = this.q8(User.class);
       this.r = this.q8(ProfileParam.class);
       this.u = this.r8("PROFILE_LOAD_STATE");
       return;
    }
}
