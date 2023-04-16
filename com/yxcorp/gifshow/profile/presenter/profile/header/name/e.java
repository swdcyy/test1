package com.yxcorp.gifshow.profile.presenter.profile.header.name.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import j5c.c;
import r4c.c0;
import erd.g;
import z5c.l0;
import crd.b;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import xl8.b;

public class e extends PresenterV2	// class@0014f7
{
    public User p;
    public c q;
    public b r;
    public TextView s;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.X7(this.q.e().subscribe(new c0(this), l0.a("UserProfileTeenageModePresenter")));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a4388);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("PROFILE_LOAD_STATE");
       this.r = this.r8("PROFILE_NAME_OBSERVABLE_DATA");
       return;
    }
}
