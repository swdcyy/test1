package com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Long;
import s4c.y;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.g;
import ok.x;
import com.google.common.base.Suppliers;
import s4c.a0;
import rkd.b;
import s4c.x;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$a;
import android.widget.CompoundButton;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import java.lang.Integer;
import z5c.b2;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserProfile;
import z5c.z1;
import java.lang.CharSequence;
import android.widget.Button;
import a3c.e;
import android.widget.TextView;
import z5c.g3;
import android.text.SpannableString;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$c;
import s4c.j0;
import s4c.k0;
import s4c.l0;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.j;
import s4c.m0;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.i;
import s4c.z;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import java.lang.Runnable;
import android.widget.ToggleButton;
import com.kwai.framework.model.user.User$FollowStatus;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.profile.util.o;
import android.animation.ValueAnimator;
import s4c.n0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import s4c.v0;
import android.animation.Animator$AnimatorListener;
import s4c.w;
import s4c.w0;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$d;
import android.animation.TimeInterpolator;
import s4c.u0;
import s4c.o0;
import s4c.y0;
import s4c.g0;
import s4c.z0;
import s4c.x0;
import ekd.f;
import android.widget.CompoundButton$OnCheckedChangeListener;
import s4c.r0;
import android.text.SpannableStringBuilder;
import t4c.j;
import lnc.b3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.profile.widget.DelegateToggleButton$a;
import com.yxcorp.gifshow.profile.widget.DelegateToggleButton;
import s1c.j1;
import java.util.Set;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import s4c.d0;
import z5c.l0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.h;
import erd.o;
import s4c.e0;
import j5c.c;
import s4c.f0;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import s4c.c0;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.q;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import s4c.i0;
import erd.r;
import s4c.b0;
import io.reactivex.internal.functions.Functions;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import android.widget.ImageView;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.util.Property;
import u3c.d$b;
import u3c.d$c;
import z5c.r;
import u3c.d;
import k2b.e0;
import z5c.y1;
import java.lang.Number;
import com.yxcorp.utility.n;
import ekd.m1;
import com.kwai.library.widget.button.SizeAdjustableButton;
import s4c.p0;
import android.view.View$OnClickListener;
import s4c.q0;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$c;
import xl8.b;
import z5c.m2;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.UserInfo;
import z5c.o3;
import wh5.c;
import e17.i;
import mz6.b;
import android.app.Application;
import o56.a;
import mz6.a;
import mz6.b$d;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.k;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.kwai.framework.model.user.UserOwnerCount;
import z5c.d3;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import s4c.s0;
import v17.b;

public class n extends PresenterV2	// class@001510
{
    public User A;
    public BaseFragment B;
    public ProfileParam C;
    public c D;
    public b E;
    public int F;
    public RxPageBus G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Set Q;
    public a R;
    public UserProfile S;
    public final e T;
    public AnimatorSet U;
    public final x U0;
    public AnimatorSet V;
    public final DelegateToggleButton$a V0;
    public long W;
    public final boolean W0;
    public boolean X;
    public final b X0;
    public f Y;
    public final b Y0;
    public j Z;
    public View p;
    public View q;
    public SizeAdjustableButton r;
    public ImageView s;
    public View t;
    public SizeAdjustableButton u;
    public View v;
    public View w;
    public SizeAdjustableButton x;
    public DelegateToggleButton y;
    public j1 z;
    public static final int Z0;
    public static final int a1;
    public static final int b1;
    public static final Long c1;
    public static final int d1;

    static {
       n.Z0 = a1.d(0x7f070d47);
       n.a1 = a1.d(0x7f070d48);
       n.b1 = a1.d(0x7f070cfc);
       n.c1 = Long.valueOf(3000);
       n.d1 = a1.d(0x7f070cfb);
    }
    public void n(){
       super();
       this.T = new y(this);
       this.U0 = Suppliers.a(g.b);
       this.V0 = new a0(this);
       this.W0 = b.g();
       this.X0 = new x(this);
       this.Y0 = new n$a(this);
    }
    public static void P8(n p0,CompoundButton p1,boolean p2){
       Objects.requireNonNull(p0);
       n on = n.class;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(p2), p0, on, "19")) {
          p0.o9(p1, p2, null);
       }
       return;
    }
    public static void u9(View p0,int p1,int p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, n.class, "17")) {
          return;
       }
       b2.a(p0, p1, p2);
       return;
    }
    public static void x9(View p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, on, "16")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.width != p1) {
          layoutParams.width = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public void B9(){
       int i;
       AnimatorSet uAnimatorSet;
       ValueAnimator valueAnimato;
       int i1;
       int d1;
       Animator[] uAnimatorArr;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "10")) {
          return;
       }
       String str = z1.b(this.S);
       this.r.setText(str);
       if (!e.a(this.F)) {
          i = 15;
          g3.e(this.u, i);
          this.r.setText(g3.b(str, g3.a(i)));
          g3.e(this.y, i);
       }
       this.q9();
       UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(new i(this));
       uoc.a(new z(this));
       UserStateExtBuilder userStateExt = new UserStateExtBuilder().b(new UserStateExtBuilder$c(new j0(this))).e(new UserStateExtBuilder$c(new k0(this))).a(new UserStateExtBuilder$c(new l0(this))).c(new UserStateExtBuilder$c(new j(this))).d(new UserStateExtBuilder$c(new m0(this))).h(uoc);
       Runnable runnable = userStateExt.f(this.A, this.C.mUserProfile);
       if (runnable != null) {
          runnable.run();
          return;
       }else {
          boolean b = true;
          this.y.setEnabled(b);
          i = 8;
          this.x.setVisibility(i);
          this.a9();
          User$FollowStatus fOLLOWING = User$FollowStatus.FOLLOWING;
          if (this.A.mFollowStatus == fOLLOWING && this.j9(this.U)) {
             return;
          }else if(this.A.mFollowStatus == User$FollowStatus.UNFOLLOW && this.j9(this.V)){
             return;
          }else {
             n tC = this.C;
             if (tC.mProfileFollow != null) {
                if (this.A.mFollowStatus == fOLLOWING) {
                   ProfileParam mUserProfile = tC.mUserProfile;
                   if (mUserProfile != null) {
                      mUserProfile.isFriend = this.m9();
                   }
                   this.H = this.m9();
                   this.s9(b);
                   if (!PatchProxy.applyVoid(objArray, this, on, "27")) {
                      tC = this.V;
                      if (tC != null && tC.isRunning()) {
                         this.V.end();
                      }
                      if (!PatchProxy.applyVoid(objArray, this, on, "11")) {
                         this.v.setTag("pre");
                         this.C9();
                         this.S8();
                      }
                      uAnimatorSet = PatchProxy.apply(objArray, this, on, "28");
                      if (uAnimatorSet != patchProxyRe) {
                      }else {
                         uAnimatorSet = new AnimatorSet();
                         if (this.X == null && o.v(this.C.mUserProfile, this.A)) {
                            valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(350);
                            i1 = (!this.v.getVisibility())? (this.b9() + n.d1) + false: 0;
                            i1 = this.d9(i1) - this.b9();
                            d1 = n.d1;
                            i = ((i1 - (this.b9() + d1)) / 2) - d1;
                            valueAnimato.addUpdateListener(new n0(this, i, i1));
                            valueAnimato.addListener(new v0(this));
                         }else {
                            valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(350);
                            i1 = (!this.v.getVisibility())? (this.b9() + n.d1) + false: 0;
                            i1 = this.d9(i1) - this.b9();
                            d1 = n.d1;
                            i = (i1 / 2) - d1;
                            i1 = i1 - d1;
                            valueAnimato.addUpdateListener(new w(this, i, i1));
                            valueAnimato.addListener(new w0(this));
                         }
                         uAnimatorSet.setInterpolator(new n$d(this, objArray));
                         uAnimatorArr = new Animator[]{valueAnimato,this.X8(this.r, 100),this.Y8(this.s, 100)};
                         uAnimatorSet.playTogether(uAnimatorArr);
                      }
                      this.U = uAnimatorSet;
                      uAnimatorSet.addListener(new u0(this));
                      this.U.start();
                   }
                }else {
                   this.s9(false);
                   if (!PatchProxy.applyVoid(objArray, this, on, "29")) {
                      this.y.setText(a1.p(R.string.arg_RES_7f100f8f));
                      tC = this.U;
                      if (tC != null && tC.isRunning()) {
                         this.U.end();
                      }
                      uAnimatorSet = PatchProxy.apply(objArray, this, on, "30");
                      if (uAnimatorSet != patchProxyRe) {
                      }else {
                         uAnimatorSet = new AnimatorSet();
                         if (!this.t.getVisibility() && !o.w(this.C.mUserProfile, this.A)) {
                            valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0}).setDuration(350);
                            i1 = (!this.v.getVisibility())? (this.b9() + n.d1) + false: 0;
                            i1 = this.d9(i1) - this.b9();
                            d1 = n.d1;
                            i = ((i1 - (this.b9() + d1)) / 2) - d1;
                            valueAnimato.addUpdateListener(new o0(this, i, i1));
                            valueAnimato.addListener(new y0(this));
                         }else {
                            valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0}).setDuration(350);
                            i1 = (!this.v.getVisibility())? (this.b9() + n.d1) + false: 0;
                            i1 = this.d9(i1) - this.b9();
                            valueAnimato.addUpdateListener(new g0(this, ((i1 / 2) - n.d1), i1));
                            valueAnimato.addListener(new z0(this));
                         }
                         uAnimatorSet.setInterpolator(new n$d(this, objArray));
                         uAnimatorArr = new Animator[]{valueAnimato,this.Y8(this.r, 100),this.X8(this.s, 100)};
                         uAnimatorSet.playTogether(uAnimatorArr);
                      }
                      this.V = uAnimatorSet;
                      uAnimatorSet.addListener(new x0(this));
                      this.V.start();
                   }
                   this.I = b;
                   this.y.setChecked(false);
                   this.J = false;
                }
                this.C.mProfileFollow = false;
             }else {
                f.a(this.U);
                f.a(this.V);
                this.y.setEnabled(b);
                this.y.setText(a1.p(R.string.arg_RES_7f100f8f));
                n tC1 = this.C;
                if (!o.v(tC1.mUserProfile, tC1.mUser) || this.X != null) {
                   this.t.setVisibility(i);
                   this.w.setVisibility(i);
                }
                if (this.A.mFollowStatus != fOLLOWING) {
                   b = false;
                }
                this.s9(b);
                this.y.setOnCheckedChangeListener(objArray);
                this.y.setChecked(this.A.isFollowingOrFollowRequesting());
                this.y.setOnCheckedChangeListener(new r0(this));
             }
             this.t9();
             return;
          }
       }
    }
    public void C9(){
       if (PatchProxy.applyVoid(null, this, n.class, "38")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       this.u.setSelected(this.H);
       if (this.H != null) {
          spannableStr.append(a1.p(R.string.arg_RES_7f100faa));
       }else {
          spannableStr.append(a1.p(R.string.arg_RES_7f101034));
       }
       if (this.Z.a(true)) {
          spannableStr.append(" ");
          b3 uob3 = new b3(this.getContext(), j.n(this.u.getContext(), 0x7f082264, 0x7f061f84));
          uob3.b(false);
          spannableStr.append(uob3.a());
       }
       this.u.setText(spannableStr);
       return;
    }
    public final void D9(){
       if (PatchProxy.applyVoid(null, this, n.class, "7")) {
          return;
       }
       n tS = this.S;
       if (tS != null && tS.mIsolated != null) {
          this.q.setVisibility(8);
       }else {
          this.q.setVisibility(0);
       }
       this.y.setEnabled(true);
       this.y.setToggleDelegate(this.V0);
       this.B9();
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       this.z.b.add(this.Y0);
       n tz = this.z;
       j oj = new j(this.B, this.A, this.C, tz.b, tz.e);
       this.Z = v0;
       this.Y.set(v0);
       this.X7(this.z.g.subscribe(new d0(this), l0.a));
       this.X7(this.A.observable().distinctUntilChanged(h.b).subscribe(new e0(this), l0.a("UserProfileFollowNewAnimatePresenter")));
       this.X7(this.D.e().subscribe(new f0(this), l0.a("UserProfileFollowNewAnimatePresenter")));
       this.z.e.add(this.T);
       boolean b = (this.A.mFollowStatus == User$FollowStatus.FOLLOWING)? true: false;
       this.s9(b);
       this.X7(this.G.f("PROFILE_EMPTY_PHOTO_MISSU_SHOW").subscribe(new c0(this)));
       if (b.a(-1578665399).F()) {
          this.X7(RxBus.f.g(q.class, RxBus$ThreadMode.MAIN).filter(new i0(this)).subscribe(new b0(this), Functions.d()));
       }
       if (this.W0 != null && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().i3(this.X0);
       }
       return;
    }
    public final void E9(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "33")) {
          return;
       }
       int i = 0;
       if (p0) {
          this.r.setVisibility(i);
          this.s.setVisibility(8);
       }else {
          this.r.setVisibility(4);
          this.s.setVisibility(i);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "8")) {
          return;
       }
       u.c(this.R);
       this.W8();
       this.z.e.remove(this.T);
       f.a(this.U);
       f.a(this.V);
       if (this.W0 != null && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.X0);
       }
       n tZ = this.Z;
       Objects.requireNonNull(tZ);
       if (!PatchProxy.applyVoid(null, tZ, j.class, "3")) {
          j a = tZ.a;
          if (a != null) {
             a.q(3);
          }
          tZ.a = null;
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, n.class, "14")) {
          return;
       }
       n.x9(this.y, this.d9(0));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, n.class, "12")) {
          return;
       }
       boolean b = (this.A.mFollowStatus == User$FollowStatus.FOLLOWING)? true: false;
       this.V8(b);
       return;
    }
    public void V8(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "13")) {
          return;
       }
       int i = 0;
       if (!this.v.getVisibility()) {
          i = i + (n.d1 + this.b9());
       }
       if (!this.t.getVisibility()) {
          i = i + (n.d1 + this.b9());
       }
       if (!p0) {
          i = n.d1;
          n.x9(this.y, ((this.d9(i) - this.b9()) - i));
          n.x9(this.r, i);
          n.x9(this.s, i);
       }else {
          int i1 = (this.d9(i) - this.b9()) / 2;
          n.x9(this.u, i1);
          n.x9(this.y, i1);
          n.x9(this.r, i1);
          n.x9(this.s, i1);
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, n.class, "42")) {
          return;
       }
       if (this.U0.get().booleanValue()) {
          KwaiSensorManager.d().j(this.B.getLifecycle());
       }
       this.y.setShowGravityEffect(false);
       return;
    }
    public final ObjectAnimator X8(View p0,long p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, on, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(p1);
    }
    public final ObjectAnimator Y8(View p0,long p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, on, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0}).setDuration(p1);
    }
    public final void Z8(boolean p0,String p1,CompoundButton p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, n.class, "22")) {
          return;
       }
       int i = this.c9();
       n tB = this.B;
       d$b uob = new d$b();
       uob.j = p3;
       uob.e(this.H);
       uob.b(this.getActivity());
       uob.h(this.A);
       uob.f(this.C);
       p3 = (p0 || p3)? true: false;
       uob.d(p3);
       uob.i = p1;
       uob.g(r.b(this.getActivity(), this.B, this.A, this.H, this.S, this.C, this.z.b));
       uob.c(this.z.b);
       o.h(tB, uob.a());
       if (!p0) {
          this.y.setChecked(true);
       }
       if (this.J == null) {
          return;
       }else {
          y1.O(this.B, this.A, i, "normal");
          return;
       }
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, n.class, "25")) {
          return;
       }
       if (this.P != null) {
          return;
       }
       this.P = true;
       y1.U(this.B, this.A.getId(), "normal");
       return;
    }
    public int b9(){
       Object obj = PatchProxy.apply(null, this, n.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.a(this.F)) {
          return n.a1;
       }
       return n.Z0;
    }
    public final int c9(){
       n tA = this.A;
       User mFollowStatu = tA.mFollowStatus;
       if (mFollowStatu == User$FollowStatus.FOLLOWING) {
          return -1;
       }
       if (tA.mVisitorBeFollowed != null && mFollowStatu == User$FollowStatus.UNFOLLOW) {
          return 0;
       }
       return 1;
    }
    public int d9(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return ((n.z(this.getContext()) - (n.b1 * 2)) - p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3cb0);
       this.q = m1.f(p0, 0x7f0a1272);
       this.t = m1.f(p0, 0x7f0a3292);
       this.r = m1.f(p0, 0x7f0a387c);
       this.s = m1.f(p0, 0x7f0a387e);
       this.u = m1.f(p0, 0x7f0a1260);
       this.x = m1.f(p0, 0x7f0a4323);
       this.v = m1.f(p0, 0x7f0a3471);
       this.w = m1.f(p0, 0x7f0a2b8c);
       this.y = m1.f(p0, 0x7f0a125e);
       m1.a(p0, new p0(this), R.id.header_follow_status_button);
       this.y.setOnTouchListener(new q0(this));
       this.r.setOnClickListener(new n$b(this));
       n ts = this.s;
       if (ts != null) {
          ts.setOnClickListener(new n$c(this));
       }
       return;
    }
    public final int e9(){
       Object obj = PatchProxy.apply(null, this, n.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.a(this.F)) {
          return 0x7f081d58;
       }
       return 0x7f081d57;
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, n.class, "26")) {
          return;
       }
       this.u.setVisibility(4);
       View[] viewArray = new View[]{this.r,this.s};
       n.Z(8, viewArray);
       return;
    }
    public void j8(){
       int i1;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       this.z = this.q8(j1.class);
       this.A = this.q8(User.class);
       this.B = this.r8("PROFILE_FRAGMENT");
       this.C = this.q8(ProfileParam.class);
       this.D = this.r8("PROFILE_LOAD_STATE");
       this.E = this.r8("PROFILE_OPERATION_BTN_SCROLL_TO_TOP");
       this.Q = this.r8("PROFILE_BUBBLE_SHOW_TASK_LIST");
       this.F = this.r8("PROFILE_STYLE").intValue();
       this.G = this.r8("PROFILE_PAGE_RXBUS");
       this.Y = this.x8("PROFILE_OPERATION_HELPER_REFERENCE");
       if (!PatchProxy.applyVoid(objArray, this, on, "4")) {
          n ts = this.s;
          if (ts != null) {
             ts.setBackgroundResource(this.e9());
          }
          ts = this.F;
          int i = 5;
          View[] viewArray = new View[i];
          viewArray[0] = this.u;
          viewArray[1] = this.r;
          viewArray[2] = m1.f(this.m8(), 0x7f0a3292);
          viewArray[3] = this.v;
          viewArray[4] = this.x;
          m2 om2 = m2.class;
          if (!PatchProxy.isSupport(om2) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(ts), viewArray, objArray, om2, "6")) {
             a.p(viewArray, "views");
             if (e.a(ts)) {
                for (i1 = 0; i1 < i; i1 = i1 + 1) {
                   viewArray[i1].setBackgroundResource(R.drawable.arg_RES_7f081d58);
                }
             }else {
                for (i1 = 0; i1 < i; i1 = i1 + 1) {
                   viewArray[i1].setBackgroundResource(R.drawable.arg_RES_7f081d57);
                }
             }
          }
          i1 = (e.a(this.F))? 10: 12;
          if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, on, "5")) {
             b2.d(this.F, this.s, R.drawable.arg_RES_7f0822ad);
             if (this.A.mFollowStatus != User$FollowStatus.FOLLOWING) {
                this.s.setVisibility(0);
                this.r.setVisibility(4);
             }else {
                this.s.setVisibility(8);
                this.r.setVisibility(0);
             }
             m2.c(this.s, i1);
             m2.c(this.r, i1);
          }
          n.x9(this.w, i1);
          m2.c(this.v, i1);
          if (e.a(this.F)) {
             on = this.r;
             on.setTextColor(j.d(on, R.color.arg_RES_7f0606c8));
             this.u.setTextColor(j.d(this.r, R.color.arg_RES_7f0606c8));
             this.x.setTextColor(j.d(this.r, R.color.arg_RES_7f061e52));
          }
       }
       return;
    }
    public final boolean j9(Animator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.isStarted() || p0.isRunning()) {
          b = true;
       }
       return b;
    }
    public final boolean k9(){
       ProfileParam mUserProfile = this.C.mUserProfile;
       boolean b = (mUserProfile != null && mUserProfile.mIsBlockedByOwner != null)? true: false;
       return b;
    }
    public final boolean l9(){
       n tA = this.A;
       boolean b = (tA.mPrivate != null && tA.mFollowStatus == User$FollowStatus.FOLLOW_REQUESTING)? true: false;
       return b;
    }
    public final boolean m9(){
       boolean b;
       ProfileParam mUserProfile = this.C.mUserProfile;
       if (mUserProfile != null) {
          UserProfile mProfile = mUserProfile.mProfile;
          if (mProfile != null && mProfile.mVisitorBeFollowed != null) {
             b = true;
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
    public void n9(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       if (this.A.isBanned()) {
          o3.a(a1.p(R.string.arg_RES_7f104fe8), this.B);
          return;
       }else if(!c.e()){
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          return;
       }else {
          Activity activity = this.getActivity();
          if (activity == null) {
             return;
          }
          y1.T(this.B, this.A.getId(), "normal");
          o.s(this.A, activity, false, this.S);
          return;
       }
    }
    public final void o9(CompoundButton p0,boolean p1,String p2){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, n.class, "20")) {
          return;
       }
       boolean b = false;
       if (this.I != null) {
          this.I = b;
          return;
       }else if(this.A.mBlacked != null){
          if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p1), p2, p0, this, n.class, "21")) {
             Activity activity = this.getActivity();
             if (activity != null) {
                b uob = new b(activity);
                uob.n(R.string.arg_RES_7f104efb);
                int[] ointArray = new int[]{a1.e(40.00f),a1.e(19.00f),a1.e(40.00f),a1.e(19.00f)};
                uob.p(14.00f, j.b(a.b(), R.color.arg_RES_7f061692), ointArray);
                a uoa = a.b();
                uoa.g(R.string.arg_RES_7f100565);
                uoa.n(j.b(a.b(), R.color.arg_RES_7f060b15));
                uob.a(uoa.a());
                uob.l(new k(this, p1, p2, p0));
                uob.q();
             }
          }
       }else {
          this.Z8(p1, p2, p0, b);
       }
       return;
    }
    public final void q9(){
       UserProfile mOwnerCount;
       if (PatchProxy.applyVoid(null, this, n.class, "9")) {
          return;
       }
       n tC = this.C;
       ProfileParam mUserProfile = tC.mUserProfile;
       int i = 1;
       if (mUserProfile != null) {
          mOwnerCount = mUserProfile.mOwnerCount;
          if (mOwnerCount != null && mOwnerCount.mPublicPhoto != null) {
             mOwnerCount = 0;
          label_0020 :
             ProfileParam mUser = tC.mUser;
             if (mUser != null && !d3.b(mUser, mUserProfile)) {
                i = 0;
             }
             if (!HoldoutConfigUtilKt.a() && (i || mOwnerCount)) {
                this.v.setVisibility(8);
                return;
             }else {
                this.v.setVisibility(0);
                return;
             }
          }
       }
       mOwnerCount = 1;
       goto label_0020 ;
    }
    public final void s9(boolean p0){
       n ty;
       int i2;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "23")) {
          return;
       }
       int i = 8;
       String str = 0x3f800000;
       int i1 = 4;
       if (!p0) {
          if (!PatchProxy.applyVoid(null, this, on, "31")) {
             this.E9(false);
             this.u.setVisibility(i1);
             this.x.setVisibility(i);
             this.y.setVisibility(false);
             this.y.setAlpha(str);
             if (this.X == null) {
                ty = this.C;
                if (o.w(ty.mUserProfile, ty.mUser)) {
                   this.t.setAlpha(str);
                   this.t.setVisibility(false);
                   this.w.setVisibility(false);
                   n.u9(this.t, n.d1, n.d1);
                   n.x9(this.w, this.b9());
                   this.Q.add(new s0(this));
                label_007e :
                   this.S8();
                   this.y9();
                }
             }
             this.t.setVisibility(i);
             goto label_007e ;
          }
          i = 0x7f061e52;
          if (!this.k9() && this.l9()) {
             this.W8();
             ty = this.y;
             Object obj = PatchProxy.apply(null, this, on, "45");
             if (obj != PatchProxyResult.class) {
                i2 = obj.intValue();
             }else if(e.a(this.F)){
                i = 0x7f0616a7;
             }
             i2 = i;
             ty.setTextColor(j.d(ty, i2));
             this.y.setBackgroundResource(this.e9());
          }else if(!PatchProxy.applyVoid(null, this, on, "41") && this.U0.get().booleanValue()){
             this.y.setShowGravityEffect(true);
             KwaiSensorManager.d().g(this.B.getLifecycle(), this.y);
          }
          ty = this.y;
          if (!e.a(this.F)) {
             i = 0x7f061fbd;
          }
          ty.setTextColor(j.d(ty, i));
          this.y.setBackgroundResource(R.drawable.arg_RES_7f081d60);
       }else {
          this.W8();
          if (!PatchProxy.applyVoid(null, this, on, "32")) {
             this.y.setVisibility(i1);
             this.E9(true);
             this.u.setVisibility(false);
             this.u.setAlpha(str);
             this.x.setVisibility(i);
             if (this.X == null) {
                ty = this.C;
                if (o.v(ty.mUserProfile, ty.mUser)) {
                   this.t.setAlpha(str);
                   this.t.setVisibility(false);
                   this.w.setVisibility(false);
                   n.u9(this.t, n.d1, n.d1);
                   n.x9(this.w, this.b9());
                label_016e :
                   this.S8();
                   this.C9();
                }
             }
             this.w.setVisibility(i);
             this.t.setVisibility(i);
             goto label_016e ;
          }
       }
       return;
    }
    public final void t9(){
       if (PatchProxy.applyVoid(null, this, n.class, "24")) {
          return;
       }
       if (this.O != null) {
          return;
       }
       this.O = true;
       y1.P(this.B, this.A.getId(), this.c9(), "normal");
       return;
    }
    public void y9(){
       if (PatchProxy.applyVoid(null, this, n.class, "37")) {
          return;
       }
       if (this.l9()) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       n tA = this.A;
       if (tA.mPrivate == null || tA.mFollowStatus != User$FollowStatus.FOLLOW_REQUESTING) {
          int i = 0x7f0822d7;
          int i1 = 0x7f100f8f;
          if (this.m9()) {
             i = 0x7f0822d8;
             i1 = 0x7f10408e;
          }
          b3 uob3 = new b3(this.getContext(), i);
          uob3.b(false);
          String str = a1.p(i1);
          if (!e.a(this.F)) {
             uob3.d(g3.a(a1.d(R.dimen.arg_RES_7f0702b8)), g3.a(a1.d(R.dimen.arg_RES_7f0702b8)));
             str = g3.b(a1.p(i1), g3.a(15));
          }
          spannableStr.append(uob3.a());
          spannableStr.append(" ").append(str);
          this.y.setText(spannableStr);
       }
       return;
    }
}
