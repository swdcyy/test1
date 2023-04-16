package com.yxcorp.gifshow.profile.presenter.profile.header.operation.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import brd.t;
import j5c.c;
import s4c.u;
import z5c.l0;
import erd.g;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class f extends PresenterV2	// class@001504
{
    public BaseFragment p;
    public ProfileParam q;
    public c r;
    public ViewStub s;
    public TextView t;
    public View u;

    public void f(){
       super();
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          this.u.setVisibility(0);
          if (this.t == null) {
             this.s.setLayoutResource(R.layout.arg_RES_7f0d15b7);
             this.t = this.s.inflate();
          }
       }
       this.X7(this.r.e().subscribe(new u(this), l0.a));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3d6d);
       this.u = m1.f(p0, 0x7f0a1272);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("PROFILE_FRAGMENT");
       this.q = this.q8(ProfileParam.class);
       this.r = this.r8("PROFILE_LOAD_STATE");
       return;
    }
}
