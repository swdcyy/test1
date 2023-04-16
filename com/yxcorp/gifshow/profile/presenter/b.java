package com.yxcorp.gifshow.profile.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.common.model.ProfilePendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileEditTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import i4c.b;
import erd.g;
import crd.b;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import i4c.d;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import k2b.e0;
import t3c.g;
import com.kwai.framework.model.user.ProfileDynamicPendant;
import i4c.c;
import java.lang.Runnable;
import android.widget.ImageView;
import com.yxcorp.gifshow.profile.presenter.a;
import com.yxcorp.gifshow.model.CDNUrl;
import ok.o;
import uc5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import t45.d;
import brd.z;
import i4c.a;
import com.yxcorp.utility.TextUtils;
import ekd.m1;

public class b extends PresenterV2	// class@001441
{
    public User A;
    public g B;
    public BaseFragment C;
    public ViewStub p;
    public View q;
    public View r;
    public KwaiImageView s;
    public KwaiImageView t;
    public LottieAnimationView u;
    public TextView v;
    public TextView w;
    public SelectShapeTextView x;
    public String y;
    public ProfilePendant z;

    public void b(ProfilePendant p0){
       super();
       this.z = p0;
    }
    public void E8(){
       int b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.z == null) {
          g.e(KsLogProfileEditTag.EDIT_PROFILE_PENDANT.appendTag("AvatarPendantBannerPresenter"), "pendantInfo is null");
          return;
       }else {
          this.X7(this.C.Vg().f().subscribe(new b(this)));
          if (!PatchProxy.applyVoid(objArray, this, uob, "6") && this.r == null) {
             View[] viewArray1 = new View[]{this.q};
             n.Z(0, viewArray1);
             View view = this.p.inflate();
             this.r = view;
             this.s = view.findViewById(0x7f0a0333);
             this.t = this.r.findViewById(0x7f0a0360);
             this.u = this.r.findViewById(0x7f0a0346);
             this.v = this.r.findViewById(0x7f0a3f2c);
             this.w = this.r.findViewById(0x7f0a3bd1);
             SelectShapeTextView selectShapeT = this.r.findViewById(R.id.pendant_set_btn);
             this.x = selectShapeT;
             selectShapeT.setOnClickListener(new d(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
             String obj = PatchProxy.apply(objArray, this, uob, "10");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.b(this.A);
             if (b) {
                this.v.setText(R.string.arg_RES_7f103fed);
                this.w.setText(R.string.arg_RES_7f1037f2);
                this.x.setText(R.string.arg_RES_7f103f76);
                obj = (this.A.mPendants == null)? "NOTWEAR": "WEAR";
                this.y = obj;
             }else {
                uob = this.A;
                if (uob.mPendants == null) {
                   View[] viewArray = new View[]{this.q};
                   n.Z(8, viewArray);
                }else {
                   b tv = this.v;
                   b = (uob.isFemale())? 0x7f103ef1: 0x7f103f2e;
                   tv.setText(a1.p(b));
                   this.w.setText(R.string.arg_RES_7f103f00);
                   this.x.setText(R.string.arg_RES_7f103fdb);
                   this.y = "GUEST";
                }
             }
             g.b(this.s, this.A, HeadImageSize.SMALL);
             this.B.f(this.y, this.C);
             if (this.P8()) {
                this.R8(this.z.mDynamicPendant.getLottieUrl());
                this.s.post(new c(this));
                g.e(KsLogProfileEditTag.EDIT_PROFILE_PENDANT.appendTag("AvatarPendantBannerPresenter"), "dynamicPendant show");
             }else {
                g.e(KsLogProfileEditTag.EDIT_PROFILE_PENDANT.appendTag("AvatarPendantBannerPresenter"), "staticPendant show");
                a.d(this.t, this.A.mPendants, a.b);
             }
          }
          this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new a(this)));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.S8();
       return;
    }
    public final boolean P8(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       if (obj != null) {
          ProfilePendant mDynamicPend = obj.mDynamicPendant;
          if (mDynamicPend != null && !TextUtils.x(mDynamicPend.getLottieUrl())) {
             b = true;
          label_0029 :
             return b;
          }
       }
       b = false;
       goto label_0029 ;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       b tu = this.u;
       if (tu != null && !tu.p()) {
          this.u.setVisibility(0);
          this.u.setAnimationFromUrl(p0);
          this.u.s();
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       b tu = this.u;
       if (tu != null && tu.p()) {
          this.u.f();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a32a6);
       this.q = m1.f(p0, 0x7f0a32a5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.A = this.r8("user");
       this.B = this.r8("editLogger");
       this.C = this.r8("fragment");
       return;
    }
}
