package com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import o56.f;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;
import java.lang.CharSequence;
import android.widget.TextView;
import a5c.j;
import android.view.View$OnClickListener;
import brd.t;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import a5c.c;
import erd.g;
import z5c.l0;
import crd.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.presenter.profile.hover.d;
import erd.o;
import a5c.d;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.profile.presenter.profile.hover.b;
import erd.r;
import a5c.e;
import com.yxcorp.gifshow.profile.presenter.profile.hover.a;
import a5c.i;
import j5c.c;
import a5c.h;
import j5c.a;
import a5c.f;
import qvb.q;
import qvb.j;
import s1c.o;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo$ShootInspireButtonInfo;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.n;
import android.animation.Animator;
import ekd.f;
import qvb.i;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.kwai.feature.api.social.profile.model.ProfilePostGuideConfig;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.util.Objects;
import qrd.p;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import wh5.c;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import z5c.k0;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.u1;
import android.app.Activity;
import xh7.b;
import qh7.b;
import qh7.a;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import a5c.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.c;
import com.kwai.framework.model.user.UserOwnerCount;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet$Builder;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import pm6.m;
import rq.a;
import z5c.y1;
import java.lang.Math;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.f3;
import k2b.e0;
import s1c.q;
import q87.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import a5c.b;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends PresenterV2	// class@00155c
{
    public View A;
    public i B;
    public ProfileEmptyPhotoGuideInfo C;
    public int D;
    public AnimatorSet E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final q Q;
    public BaseFragment p;
    public User q;
    public ProfileParam r;
    public a s;
    public RxPageBus t;
    public c u;
    public View v;
    public ViewStub w;
    public ExpandableFloatButton x;
    public ViewStub y;
    public ViewStub z;
    public static final int R;

    static {
       e.R = a1.e(70.00f);
    }
    public void e(){
       super();
       this.K = -1;
       this.M = false;
       this.N = false;
       this.O = true;
       this.Q = new e$a(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.H = f.b(this.p.getActivity()) ^ 0x01;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          this.x = this.w.inflate().findViewById(0x7f0a2d09);
          this.D = a1.d(0x7f070d32);
          this.x.setText(a1.p(R.string.arg_RES_7f103f81));
          this.x.t(0);
          this.x.setVisibility(8);
          this.x.setOnClickListener(new j(this));
       }
       this.X7(this.t.f("PROFILE_TAB_CHANGE").subscribe(new c(this), l0.a("MyProfileRecordGuidePresenter")));
       this.X7(this.q.observable().distinctUntilChanged(d.b).subscribe(new d(this), l0.a("MyProfileRecordGuidePresenter")));
       this.X7(this.p.m().filter(b.b).subscribe(new e(this), l0.a("MyProfileRecordGuidePresenter")));
       this.X7(this.t.f("PROFILE_FEED_LOAD").map(a.b).subscribe(new i(this), l0.a("MyProfileRecordGuidePresenter")));
       this.X7(this.u.d().subscribe(new h(this), l0.a("MyProfileRecordGuidePresenter")));
       this.X7(this.s.b().subscribe(new f(this), l0.a("MyProfileRecordGuidePresenter")));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.R8();
       this.G = false;
       e tB = this.B;
       if (tB != null) {
          tB.f(this.Q);
       }
       if (this.M != null && !DateUtils.J(o.c())) {
          SharedPreferences$Editor uEditor = o.a.edit();
          uEditor.putLong(b.d("user")+"has_profile_publish_inspire_shown_last_time", System.currentTimeMillis());
          g.a(uEditor);
       }
       return;
    }
    public final boolean P8(){
       e obj = PatchProxy.apply(null, this, e.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.C;
       boolean b = true;
       if (obj != null) {
          ProfileEmptyPhotoGuideInfo mShootInspir = obj.mShootInspireButtonInfo;
          if (mShootInspir == null || (TextUtils.x(mShootInspir.mIconUrl) || (TextUtils.x(this.C.mShootInspireButtonInfo.mTitle) || (!TextUtils.x(this.C.mShootInspireButtonInfo.mSubTitle) && !TextUtils.x(this.C.mShootInspireButtonInfo.mLinkUrl))))) {
             b = false;
          }
       }
    label_004c :
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       View[] viewArray = new View[]{this.v};
       n.Z(8, viewArray);
       f.a(this.E);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "18")) {
          return;
       }
       n.Y(this.A, 8, false);
       this.N = false;
       return;
    }
    public final boolean V8(){
       e obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       boolean b = (obj != null && obj.isEmpty())? true: false;
       return b;
    }
    public final boolean W8(){
       ProfilePostEmptyCardUtils e;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.B;
       Object[] objArray1 = (obj != null && obj.L0() instanceof ProfileFeedResponse)? this.B.L0(): objArray;
       boolean b = false;
       objArray1 = (objArray1 != null && (objArray1.getPostGuideConfig() != null && (objArray1.getPostGuideConfig().mEmptyGuide == null || objArray1.getPostGuideConfig().mEmptyGuide.c == null)))? 1: 0;
       e tC = this.C;
       if (tC != null && tC.mShootInspireButtonInfo != null) {
          objArray1 = 1;
       }
       e = ProfilePostEmptyCardUtils.e;
       Objects.requireNonNull(e);
       Object obj1 = PatchProxy.apply(objArray, e, ProfilePostEmptyCardUtils.class, "13");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(!e.d()){
          b1 = false;
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, e, ProfilePostEmptyCardUtils.class, "3");
          if (uBoolean == patchProxyRe) {
             uBoolean = ProfilePostEmptyCardUtils.c.getValue();
          }
          b1 = uBoolean.booleanValue();
       }
       if (b1) {
          objArray1 = 0;
       }
       if (objArray1 || (this.V8() || (this.r.mPhotoTabId == 1 || (this.r.mPhotoTabId == 2 && (c.g() && (!this.q.isBanned() && this.H != null)))))) {
          b = true;
       }
    label_00b1 :
       return b;
    }
    public void X8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 1290;
       i3 oi3 = i3.f();
       if (this.N != null) {
          e tC = this.C;
          if (tC != null) {
             ProfileEmptyPhotoGuideInfo mShootInspir = tC.mShootInspireButtonInfo;
             if (mShootInspir != null) {
                oi3.c("exciteType", Integer.valueOf(mShootInspir.mInspireType));
             }
          }
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = PatchProxy.apply(objArray, this, uoe, "14");
       if (uContentPack != PatchProxyResult.class) {
       }else {
          uContentPack = b0.c(this.q.getId(), 1, this.r.mPhotoTabId);
       }
       u1.G(objArray, 1, uElementPack, uContentPack);
       if (this.N != null && this.getActivity() != null) {
          uoe = this.C;
          if (uoe != null && uoe.mShootInspireButtonInfo != null) {
             a.b(b.j(this.getActivity(), this.C.mShootInspireButtonInfo.mLinkUrl), objArray);
          label_0091 :
             this.getActivity().overridePendingTransition(R.anim.arg_RES_7f010033, 0x7f0100f2);
             return;
          }
       }
       this.X7(y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).R(new g(this), c.b));
       goto label_0091 ;
    }
    public final void Y8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "10")) {
          return;
       }
       if (this.F == null) {
          return;
       }
       boolean b = false;
       if (this.W8()) {
          boolean b1 = true;
          e uoe1 = (this.O != null && this.r.mPhotoTabId == b1)? 1: null;
          if (!uoe1 && this.q.mOwnerCount.mPublicPhoto <= null) {
             uoe1 = this.K;
             if (this.I != null) {
                if (this.L != null) {
                   this.K = 2;
                }
                boolean b2 = this.V8();
                if (this.v != null && (this.r.mPhotoTabId == b1 && (ProfilePostEmptyCardUtils.e.d() && b2))) {
                   this.v.setVisibility(4);
                   this.I = b;
                   if (this.L != null) {
                      this.K = uoe1;
                   }
                }
             label_0065 :
                return;
             }else {
                this.I = b1;
                if (this.v == null) {
                   this.v = this.y.inflate();
                }
                if (this.L != null) {
                   this.K = 2;
                }
                if (this.v != null) {
                   boolean b3 = this.V8();
                   if (this.r.mPhotoTabId == b1 && (ProfilePostEmptyCardUtils.e.d() && b3)) {
                      this.v.setVisibility(4);
                      this.I = b;
                      if (this.L != null) {
                         this.K = uoe1;
                      }
                   }else {
                      this.v.setVisibility(b);
                      if (!PatchProxy.applyVoid(objArray, this, uoe, "12") && this.H != null) {
                         if (this.E == null) {
                            this.E = new AnimatorSet();
                            float[] uofloatArray = new float[]{(float)a1.e(15.00f),(float)a1.e(5.00f)};
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.v, "translationY", uofloatArray);
                            objectAnimat.setDuration(500);
                            objectAnimat.setRepeatCount(-1);
                            objectAnimat.setRepeatMode(2);
                            objectAnimat.setInterpolator(a.b(0.39f, 0x3f133333, 0x3f10a3d7, 0x3f800000));
                            this.E.play(objectAnimat);
                         }
                         this.E.start();
                      }
                   }
                }
                return;
             }
          }
       }
    label_0105 :
       this.I = b;
       this.R8();
       return;
    }
    public final void Z8(){
       boolean b;
       boolean b1;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "16")) {
          return;
       }
       if (this.F == null) {
          return;
       }
       if (!this.W8()) {
          this.S8();
          return;
       }else {
          k0 ok0 = k0.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          UserOwnerCount obj = PatchProxy.apply(objArray, this, uoe, "17");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             Object obj1 = PatchProxy.apply(objArray, objArray, ok0, "5");
             String str = "ProfileSidebarEncourage";
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(a.a().c() && (g.G0() || f.e(str))){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1 && (this.W8() && (this.I == null && !this.P8()))) {
                obj1 = PatchProxy.apply(objArray, this, uoe, "21");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   obj1 = PatchProxy.apply(objArray, objArray, m.class, "4");
                   long l = (obj1 != patchProxyRe)? obj1.longValue(): a.J();
                   b1 = DateUtils.J(l);
                }
                if (!b1) {
                   Object obj2 = PatchProxy.apply(objArray, objArray, ok0, "6");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else if(a.a().c() && g.G0()){
                      if (g.G0() == 1) {
                      label_00c7 :
                         b = true;
                      }
                   }else if(f.e(str) == 1){
                      goto label_00c7 ;
                   }
                   b = false;
                   if (!b || !DateUtils.J(o.c())) {
                      b = true;
                   }
                }
             }
          label_00d8 :
             b = false;
          }
          if (b) {
             if (this.N == null) {
                e tp = this.p;
                e tK = this.K;
                obj = this.q.mOwnerCount.mPublicPhoto;
                ProfileEmptyPhotoGuideInfo$ShootInspireButtonInfo mInspireType = this.C.mShootInspireButtonInfo.mInspireType;
                if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidFourRefs(tp, Integer.valueOf(tK), Integer.valueOf(obj), Integer.valueOf(mInspireType), null, y1.class, "107")) {
                   i3 oi3 = i3.f();
                   oi3.c("coin_type", Integer.valueOf(tK));
                   oi3.c("photo_cnt", Integer.valueOf(Math.max(false, obj)));
                   oi3.c("exciteType", Integer.valueOf(mInspireType));
                   f3 uof3 = f3.j("SHOW_I_WANT_TO_CAPTURE_TOO_BUTTON");
                   uof3.b(b0.a(QCurrentUser.ME.getId()));
                   uof3.m(oi3.e());
                   uof3.h(tp);
                }
             }
             n.Y(this.x, 8, false);
             if (!PatchProxy.applyVoid(objArray, this, uoe, "19")) {
                if (this.P8()) {
                   objArray = new Object[false];
                   q.C().w("MyProfileRecordGuidePresenter", "ShootInspireButtonInfo info is insufficient", objArray);
                }else {
                   ProfileEmptyPhotoGuideInfo mShootInspir = this.C.mShootInspireButtonInfo;
                   e tz = this.z;
                   if (tz != null) {
                      if (this.A == null) {
                         View view = tz.inflate();
                         this.A = view;
                         a$a uoa = a.d();
                         uoa.b(":ks-features:ft-social:profile");
                         uoa.d(ImageSource.ICON);
                         view.findViewById(R.id.icon).M(mShootInspir.mIconUrl, uoa.a());
                         this.A.findViewById(R.id.title).setText(mShootInspir.mTitle);
                         KwaiSizeAdjustableTextView kwaiSizeAdju = this.A.findViewById(R.id.subTitle);
                         kwaiSizeAdju.setTextSizeAdjustable(true);
                         kwaiSizeAdju.setText(mShootInspir.mSubTitle);
                         kwaiSizeAdju.setMaxWidth(e.R);
                         this.A.setOnClickListener(new b(this));
                      }
                      n.Y(this.A, false, false);
                      this.M = true;
                      this.N = true;
                   }
                }
             }
          }else {
             this.S8();
             n.Y(this.x, false, false);
          }
          return;
       }
    }
    public void a9(){
       View[] viewArray;
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       if (this.F != null) {
          boolean b = true;
          if (this.r.mPhotoTabId != b || this.G != null) {
             if (!this.p.isResumed()) {
                this.P = b;
                return;
             }else {
                boolean b1 = false;
                this.P = b1;
                if (this.W8()) {
                   this.K = b1;
                   viewArray = new View[b];
                   viewArray[b1] = this.x;
                   n.Z(b1, viewArray);
                }else {
                   this.K = -1;
                   viewArray = new View[b];
                   viewArray[b1] = this.x;
                   n.Z(8, viewArray);
                }
                this.Y8();
                this.Z8();
                if (this.J == null && this.K != -1) {
                   a a = k0.a;
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a32b0);
       this.y = m1.f(p0, 0x7f0a2d08);
       this.z = m1.f(p0, 0x7f0a32af);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p = this.r8("PROFILE_FRAGMENT");
       this.q = this.q8(User.class);
       this.r = this.q8(ProfileParam.class);
       this.s = this.r8("PROFILE_APP_BAR_SCROLL_STATE");
       this.t = this.r8("PROFILE_PAGE_RXBUS");
       this.u = this.r8("PROFILE_LOAD_STATE");
       return;
    }
}
