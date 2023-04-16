package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import j5c.c;
import u4c.t;
import erd.g;
import z5c.l0;
import crd.b;
import s1c.j1;
import u4c.b0;
import com.yxcorp.gifshow.pymk.widget.PymkHorListView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.animation.AnimatorSet;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.System;
import k2b.k2;
import k2b.u1;
import wkd.b;
import i7c.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import n7c.c;
import cjd.e;
import erd.o;
import u4c.u;
import u4c.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import lnc.a1;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import js6.a;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import android.os.Bundle;
import k2b.e0;
import z5c.y1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.daimajia.easing.Skill;
import android.animation.ValueAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import u4c.z;
import com.daimajia.easing.Glider;
import u4c.a0;
import java.util.Collection;
import g7c.f;
import java.lang.Throwable;
import java.lang.Long;
import android.widget.ImageView;
import i0c.g;
import i0c.e;
import i0c.h;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import a3c.e;
import android.view.ViewGroup$MarginLayoutParams;
import u4c.v;
import java.lang.Runnable;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import t3c.d;
import lnc.i3;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import ekd.m1;
import android.view.ViewStub;
import com.google.android.material.appbar.AppBarLayout;
import u4c.r;
import android.view.View$OnClickListener;
import u4c.w;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.graphics.drawable.Drawable;
import zf6.j;

public class UserProfilePymkPresenter extends PresenterV2	// class@001531
{
    public ImageView A;
    public View B;
    public PymkHorListView C;
    public TextView D;
    public TextView E;
    public ProfilePYMKSwipeDetailLayout F;
    public View G;
    public AppBarLayout H;
    public BaseFragment I;
    public User J;
    public ProfileParam K;
    public j1 L;
    public c M;
    public int N;
    public GifshowActivity O;
    public String P;
    public boolean Q;
    public long R;
    public a S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public ViewTreeObserver$OnPreDrawListener X;
    public RecommendUserResponseV2 Y;
    public boolean Z;
    public AnimatorSet p;
    public AnimatorSet q;
    public ValueAnimator r;
    public ValueAnimator s;
    public ArrayList t;
    public ArrayList u;
    public View v;
    public View w;
    public View x;
    public ViewStub y;
    public View z;

    public void UserProfilePymkPresenter(){
       super();
       this.t = new ArrayList();
       this.u = new ArrayList();
       this.Q = false;
       this.U = false;
       this.V = false;
       this.Z = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePymkPresenter.class, "3")) {
          return;
       }
       this.O = this.getActivity();
       this.X7(this.M.e().subscribe(new t(this), l0.a("UserProfilePymkPresenterV2")));
       this.X7(this.L.f.subscribe(new b0(this), l0.a("UserProfilePymkPresenterV2")));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePymkPresenter.class, "6")) {
          return;
       }
       UserProfilePymkPresenter tC = this.C;
       if (tC != null) {
          tC.z();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePymkPresenter.class, "5")) {
          return;
       }
       if (this.V != null) {
          if (this.Q != null) {
             this.Y8("leave_on_requesting");
          }else {
             this.Y8("leave_on_no_shown");
          }
       }
       if (this.B != null) {
          if (this.C.getViewTreeObserver() != null && this.X != null) {
             this.C.getViewTreeObserver().removeOnPreDrawListener(this.X);
          }
          this.B.setVisibility(8);
       }
       return;
    }
    public boolean P8(){
       boolean b = (this.Y != null)? true: false;
       return b;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePymkPresenter.class, "21")) {
          return;
       }
       UserProfilePymkPresenter tB = this.B;
       if (tB != null && tB.getHeight() > 1) {
          tB = this.q;
          if (tB != null) {
             tB.start();
          }
       }
       return;
    }
    public final void S8(String p0,boolean p1){
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, userProfileP, "7")) {
          return;
       }
       if (this.Q == null && this.z.getVisibility() != 8) {
          boolean b = true;
          this.Q = b;
          this.V = b;
          if (!PatchProxy.isSupport(userProfileP) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, userProfileP, "11")) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, userProfileP, "12")) {
                Objects.requireNonNull(p0);
                int i = -1;
                User user = 2;
                switch (p0.hashCode()){
                    case 0xb45d3bb1:
                      if (p0.equals("follow")) {
                         i = 0;
                      }
                      break;
                    case 0xe934338a:
                      if (p0.equals("unfollow")) {
                         i = 1;
                      }
                      break;
                    case 0x58c7409:
                      if (p0.equals("arrow")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      this.W = b;
                      break;
                    case 1:
                      this.W = user;
                      break;
                    case 2:
                      this.W = 3;
                      break;
                    default:
                }
             }
             this.R = System.currentTimeMillis();
             k2 ok2 = u1.n();
             String str = (ok2 == null)? "": ok2.d;
             this.X7(b.a(-1302358859).i(2, this.J.mId, RequestTiming.DEFAULT, this.O.Q2(), this.W, str, c.g()).map(new e()).subscribe(new u(this, p0, p1), new s(this)));
          }
       }
       return;
    }
    public void V8(){
       int i;
       String str;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userProfileP, "17")) {
          return;
       }
       Object[] objArray1 = new Object[]{Integer.valueOf(i),a1.p(0x7f10013d),str,this.J.getId()};
       i = 22;
       int i1 = 0;
       int i2 = 1;
       str = "profile";
       String str1 = String.format("kwai://aggregate/user?contentType=%d&title=%s&pageType=%s&extParams={\"profileUserId\":\"%s\"}", objArray1);
       Intent intent = b.a(0x66dce92a).c(this.getActivity(), w0.f(str1), i2, i1);
       if (intent != null) {
          Object obj = PatchProxy.apply(objArray, this, userProfileP, "32");
          b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("socialPymkSwitchToKrn", i1);
          if (b) {
             a obj1 = PatchProxy.apply(objArray, this, userProfileP, "33");
             boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("profilePymkKrnPreRequest", i1);
             if (b1 && (!PatchProxy.applyVoidOneRefs(str1, this, userProfileP, "31") && !TextUtils.x(str1))) {
                obj1 = a.b;
                LaunchModel launchModel = PatchProxy.applyOneRefs(str1, this, userProfileP, "34");
                if (launchModel != patchProxyRe) {
                }else {
                   Uri uri = Uri.parse(str1);
                   String str2 = w0.a(uri, "extraInfo");
                   LaunchModel$b uob = new LaunchModel$b();
                   Bundle uBundle = new Bundle();
                   uBundle.putBoolean("isBizPreRequest", i2);
                   uBundle.putString("source", str);
                   uob.i("SocialPymkGroup");
                   uob.j("UserAggregate");
                   LaunchModel$b uob1 = uob.b("contentType", i).e("pageType", str).e("prsid", "").e("referPage", str.toUpperCase()).e("extraInfo", str2).e("extParams", w0.a(uri, "extParams"));
                   Objects.requireNonNull(uob1);
                   if (PatchProxy.applyTwoRefs("kdsKrnExtraInfoForLogger", uBundle, uob1, LaunchModel$b.class, "11") != patchProxyRe) {
                   }else {
                      uob1.d.putBundle("kdsKrnExtraInfoForLogger", uBundle);
                   }
                   launchModel = uob.h();
                }
                obj1.Gg(launchModel);
             }
          }
       label_0116 :
          this.getActivity().startActivity(intent);
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePymkPresenter.class, "18")) {
          return;
       }
       String str = "arrow";
       if (!this.P8()) {
          this.S8(str, true);
          y1.D(this.I, this.J.mId, false);
          return;
       }else {
          UserProfilePymkPresenter tB = this.B;
          if (tB == null) {
             this.b9(false);
             return;
          }else if(tB.getHeight() <= 1){
             this.d9(str);
             this.b9(true);
             y1.D(this.I, this.J.mId, false);
          }else {
             this.R8();
             this.b9(false);
             y1.D(this.I, this.J.mId, true);
          }
          return;
       }
    }
    public final void X8(int p0){
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, userProfileP, "10")) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = this.x.getLayoutParams();
       UserProfilePymkPresenter tr = this.r;
       if (tr != null) {
          this.t.remove(tr);
       }
       tr = this.s;
       if (tr != null) {
          this.u.remove(tr);
       }
       int[] ointArray = new int[]{0,p0};
       p0 = - p0;
       BaseEasingMethod$EasingListener[] uEasingListe = new BaseEasingMethod$EasingListener[]{new z(this, layoutParams)};
       ValueAnimator valueAnimato = Glider.glide(Skill.QuadEaseOut, 300.00f, ValueAnimator.ofInt(ointArray), uEasingListe);
       this.r = valueAnimato;
       this.t.add(valueAnimato);
       int[] ointArray1 = new int[]{p0,0};
       BaseEasingMethod$EasingListener[] uEasingListe1 = new BaseEasingMethod$EasingListener[]{new a0(this, layoutParams)};
       ValueAnimator valueAnimato1 = Glider.glide(Skill.QuadEaseIn, 300.00f, ValueAnimator.ofInt(ointArray1), uEasingListe1);
       this.s = valueAnimato1;
       this.u.add(valueAnimato1);
       this.p = new AnimatorSet();
       this.q = new AnimatorSet();
       this.p.playTogether(this.t);
       this.p.setDuration(300);
       this.q.playTogether(this.u);
       this.q.setDuration(300);
       return;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePymkPresenter.class, "24")) {
          return;
       }
       if (this.V != null) {
          this.V = false;
          f.a(2, null, p0);
       }
       return;
    }
    public final void Z8(long p0,Throwable p1){
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, userProfileP, "25")) {
          return;
       }
       f.b(2, null, (System.currentTimeMillis() - p0), p1);
       return;
    }
    public void a9(boolean p0){
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileP, "23")) {
          return;
       }
       this.z.setClickable(p0);
       this.A.setClickable(p0);
       return;
    }
    public final void b9(boolean p0){
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileP, "19")) {
          return;
       }
       this.U = p0;
       if (this.Z == null) {
          e.a().c("");
          this.Z = true;
       }
       return;
    }
    public final void c9(View p0,boolean p1,int p2,int p3){
       if (PatchProxy.isSupport(UserProfilePymkPresenter.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, UserProfilePymkPresenter.class, "30")) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (!e.a(this.N)) {
          p2 = p3;
       }
       layoutParams.topMargin = (p1)? p2: p2;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void d9(String p0){
       UserProfilePymkPresenter userProfileP = UserProfilePymkPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, userProfileP, "20")) {
          return;
       }
       if (!this.z.isEnabled()) {
          return;
       }
       UserProfilePymkPresenter tB = this.B;
       if (tB != null && tB.getHeight() > 1) {
          return;
       }
       if (!this.P8()) {
          if (this.Q == null && !PatchProxy.applyVoidOneRefs(p0, this, userProfileP, "8")) {
             this.S8(p0, false);
          }
       }else {
          userProfileP = this.p;
          if (userProfileP != null && userProfileP.getDuration() > 0) {
             this.B.post(new v(this));
          }
          if (this.K.mUserProfileResponse != null) {
             userProfileP = this.I;
             User mId = this.J.mId;
             if (!PatchProxy.applyVoidThreeRefs(userProfileP, mId, p0, null, d.class, "1")) {
                i3 oi3 = null;
                if (!TextUtils.x(p0)) {
                   oi3 = i3.f();
                   oi3.d("show_type", p0);
                   oi3 = oi3.e();
                }
                f3 uof3 = f3.j("PYMK_CARD_LIST");
                uof3.m(oi3);
                uof3.n(3);
                uof3.b(b0.f(mId));
                uof3.h(userProfileP);
             }
          }
       }
    label_0096 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePymkPresenter.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a337d);
       this.w = m1.f(p0, 0x7f0a336a);
       this.x = m1.f(p0, 0x7f0a32cb);
       this.z = m1.f(p0, 0x7f0a3471);
       this.y = m1.f(p0, 0x7f0a349c);
       this.A = m1.f(p0, 0x7f0a3472);
       this.G = m1.f(p0, 0x7f0a3cb0);
       this.H = m1.f(p0, 0x7f0a0225);
       m1.a(p0, new r(this), R.id.recommend_btn);
       m1.a(p0, new w(this), R.id.recommend_btn_img);
       return;
    }
    public void j8(){
       UserProfilePymkPresenter tA;
       if (PatchProxy.applyVoid(null, this, UserProfilePymkPresenter.class, "1")) {
          return;
       }
       this.I = this.r8("PROFILE_FRAGMENT");
       this.J = this.q8(User.class);
       this.K = this.q8(ProfileParam.class);
       this.L = this.q8(j1.class);
       this.M = this.r8("PROFILE_LOAD_STATE");
       int i = this.r8("PROFILE_STYLE").intValue();
       this.N = i;
       if (e.a(i)) {
          tA = this.A;
          tA.setImageDrawable(j.n(tA.getContext(), R.drawable.arg_RES_7f0822af, 0x7f0606c8));
       }else {
          tA = this.A;
          tA.setImageDrawable(j.n(tA.getContext(), R.drawable.arg_RES_7f0822f8, 0x7f060148));
       }
       return;
    }
}
