package com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import y8c.t;
import z5c.k0;
import com.yxcorp.gifshow.profile.fragment.r;
import com.yxcorp.gifshow.profile.fragment.t;
import fx5.h;
import s1c.r0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.fragment.u;
import lkd.b;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import l3c.a0;
import s1c.a;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$c;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.profile.fragment.s;
import k3c.n2;
import k3c.m2;
import com.yxcorp.gifshow.profile.fragment.p;
import com.yxcorp.gifshow.profile.fragment.q;
import a7c.h;
import a7c.h$a;
import k3c.r2;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import f7c.a;
import mkc.b;
import k3c.k2;
import com.yxcorp.gifshow.profile.fragment.x;
import k3c.l2;
import g7c.a;
import k3c.y2;
import f7c.d;
import a7c.b$a;
import com.yxcorp.gifshow.pymk.f;
import tkd.b;
import tkd.d;
import hx5.a;
import hx5.b;
import com.kwai.social.startup.follow.model.ProfileLastSeenConfig;
import java.lang.reflect.Type;
import mw4.a;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import i4c.e1;
import k3c.c3;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.profile.fragment.o;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.profile.fragment.v;

public class UserProfilePhotoFragment extends ProfilePhotoFragment	// class@00131d
{
    public a0 W0;
    public b X0;
    public b Y0;
    public f Z0;
    public h a1;
    public View b1;
    public View c1;
    public static final int d1;

    public void UserProfilePhotoFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, UserProfilePhotoFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       this.Q.addUserPresenter(obj);
       PatchProxy.onMethodExit(UserProfilePhotoFragment.class, "4");
       return obj;
    }
    public t Bh(){
       h oh;
       r0 b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       UserProfilePhotoFragment obj = PatchProxy.apply(objArray, this, UserProfilePhotoFragment.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0x7f103f73;
       if (k0.c()) {
          obj = PatchProxy.apply(objArray, this, UserProfilePhotoFragment.class, "8");
          if (obj != patchProxyRe) {
          }else {
             oh = new h(this, this.G.d);
             oh.d(new u(this));
             oh.f(new r(this));
             oh.c(new t(this));
             oh.h(this.getString(i));
             a0 uoa0 = new a0(oh);
             this.W0 = uoa0;
             BaseProfileFeedFragment obj1 = PatchProxy.apply(objArray, this, UserProfilePhotoFragment.class, "23");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = this.G;
                obj1 = new UserStateExtBuilder().c(new UserStateExtBuilder$c(this.G.e)).g(new UserStateExtBuilder$c(this.G.e)).f(obj1.b, obj1.d.mUserProfile);
             }
             uoa0.J(obj1);
             this.W0.B(new s(this));
             this.W0.z(new n2(this));
             this.W0.y(new m2(this));
             obj = this.W0;
          }
          return obj;
       }else {
          b uob = PatchProxy.apply(objArray, this, UserProfilePhotoFragment.class, "7");
          if (uob != patchProxyRe) {
          }else {
             p op = new p(this);
             q oq = new q(this);
             oh = new h(this, this.G.d);
             oh.f(op);
             oh.c(oq);
             oh.h(this.getString(i));
             this.W0 = new a0(oh);
             h oh1 = PatchProxy.applyTwoRefs(op, oq, this, UserProfilePhotoFragment.class, "9");
             if (oh1 != patchProxyRe) {
             }else {
                h$a uoa = new h$a(new r2(this), 54, this.m());
                uoa.i(20);
                uoa.k(R.layout.arg_RES_7f0d1260, objArray);
                uoa.v = true;
                uoa.j(b.i.a, new k2(op, oq), x.b);
                uoa.f(new l2(this));
                uoa.m(new y2(this));
                b$a uoa1 = new b$a().g(true);
                uoa1.k = 0x7f08028f;
                uoa.g(uoa1);
                oh1 = uoa.b();
             }
             this.a1 = oh1;
             f uof = oh1.s();
             this.Z0 = uof;
             BaseProfileFeedFragment tG = this.G;
             if (tG != null) {
                b = tG.b;
                if (b != null) {
                   uof.x = b.getId();
                }
             }
             uob = d.a(0x5a2b5479).SM(this, this.W0, this.a1);
          }
          return uob;
       }
    }
    public PresenterV2 Kh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, UserProfilePhotoFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.Kh();
       if (this.K == 1) {
          ProfileLastSeenConfig profileLastS = a.p(ProfileLastSeenConfig.class);
          if (profileLastS != null && profileLastS.mEnableLoadingOptimize != null) {
             obj.U7(new UserProfileLastSeenPresenterV2());
          }else {
             obj.U7(new UserProfileLastSeenPresenter());
          }
          obj.U7(new e1(this.a1));
       }
       PatchProxy.onMethodExit(UserProfilePhotoFragment.class, "3");
       return obj;
    }
    public int f(){
       return -1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserProfilePhotoFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c3();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, UserProfilePhotoFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(UserProfilePhotoFragment.class, new c3());
       }else {
          obj.put(UserProfilePhotoFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePhotoFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.X0 = b9.c(this.X0, new o(this));
       this.Y0 = b9.c(this.Y0, new v(this));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, UserProfilePhotoFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.X0);
       b9.a(this.Y0);
       this.Z0 = null;
       return;
    }
}
