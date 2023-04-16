package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$a;
import nsd.u;
import java.util.HashSet;
import android.view.GestureDetector;
import android.content.Context;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$c;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$mDismissRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import xl8.b;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$d;
import erd.g;
import z5c.l0;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.g;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$f;
import i3c.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$g;
import wca.n;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$h;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$i;
import java.lang.Runnable;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import z5c.m0;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;
import z5c.l2;
import java.lang.reflect.Type;
import java.util.Map;
import s1c.o;
import java.lang.Long;
import z5c.n3;
import java.util.Calendar;
import java.util.TimeZone;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import z5c.k0;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.model.user.User$FollowStatus;
import z5c.f3;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import android.animation.Animator;
import com.kwai.library.widget.popup.common.d;
import a5c.m;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import a5c.l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import im8.f;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$b;
import android.view.View$OnTouchListener;
import i3c.h;
import z5c.y1;
import k2b.f3;
import k2b.e0;
import java.util.HashMap;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$j;
import android.view.ViewStub;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import s1c.j1;

public final class UserProfileFollowGuidePresenter extends PresenterV2	// class@001556
{
    public TextView A;
    public SelectShapeTextView B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final HashSet G;
    public final GestureDetector H;
    public final p I;
    public final int p;
    public DynamicTabHostFragment q;
    public User r;
    public ProfileParam s;
    public f t;
    public j1 u;
    public ViewStub v;
    public b w;
    public RxPageBus x;
    public View y;
    public KwaiImageView z;
    public static final UserProfileFollowGuidePresenter$a J;

    static {
       UserProfileFollowGuidePresenter.J = new UserProfileFollowGuidePresenter$a(null);
    }
    public void UserProfileFollowGuidePresenter(){
       super();
       this.p = 3;
       this.G = new HashSet();
       this.H = new GestureDetector(this.getContext(), new UserProfileFollowGuidePresenter$c(this));
       this.I = s.c(new UserProfileFollowGuidePresenter$mDismissRunnable$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, UserProfileFollowGuidePresenter.class, "4")) {
          return;
       }
       UserProfileFollowGuidePresenter tw = this.w;
       if (tw == null) {
          a.S("mLastVisibleFeedPositionSubject");
       }
       String str = "UserProfileFollowGuidePresenter";
       this.X7(tw.observable().distinctUntilChanged().subscribe(new UserProfileFollowGuidePresenter$d(this), l0.a(str)));
       tw = this.q;
       if (tw == null) {
          a.S("mBaseFragment");
       }
       this.X7(tw.m().subscribe(new UserProfileFollowGuidePresenter$e(this), l0.a(str)));
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(g.class, mAIN).subscribe(new UserProfileFollowGuidePresenter$f(this)));
       this.X7(f.g(g.class, mAIN).subscribe(new UserProfileFollowGuidePresenter$g(this)));
       this.X7(f.g(n.class, mAIN).subscribe(new UserProfileFollowGuidePresenter$h(this)));
       tw = this.x;
       if (tw == null) {
          a.S("mRxPageBus");
       }
       this.X7(tw.f("PROFILE_TAB_CHANGE").subscribe(new UserProfileFollowGuidePresenter$i(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, UserProfileFollowGuidePresenter.class, "7")) {
          return;
       }
       UserProfileFollowGuidePresenter ty = this.y;
       if (ty != null) {
          ty.removeCallbacks(this.R8());
          ty.clearAnimation();
       }
       return;
    }
    public final void P8(){
       int b;
       boolean i1;
       UserProfileFollowGuidePresenter userProfileF1;
       UserProfileFollowGuidePresenter r1;
       int i2;
       View view = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserProfileFollowGuidePresenter userProfileF = UserProfileFollowGuidePresenter.class;
       m0 om0 = m0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, view, userProfileF, "8")) {
          return;
       }
       if (view.F != null) {
          return;
       }
       UserProfileFollowGuidePresenter r = view.r;
       if (r == null) {
          a.S("mUser");
       }
       String id = r.getId();
       Map obj = PatchProxy.applyOneRefs(id, objArray, om0, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = o.p(l2.P);
          if (obj != null && obj.containsKey(id)) {
             long l = obj.get(id).longValue();
             if (PatchProxy.isSupport(om0)) {
                Object obj2 = PatchProxy.applyOneRefs(Long.valueOf(l), objArray, om0, "3");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }
             }
             long l1 = n3.a();
             if (l - ((l1 - (((long)Calendar.getInstance().getTimeZone().getRawOffset() + l1) % 0x5265c00)) - 0x1cf7c5800) >= 0) {
                b = false;
             }
          }
       label_0086 :
          b = true;
       }
       if (!b) {
          return;
       }else {
          r = view.r;
          if (r == null) {
             a.S("mUser");
          }
          UserProfileFollowGuidePresenter d = view.D;
          UserProfileFollowGuidePresenter c = view.C;
          int i = view.G.size();
          if (PatchProxy.isSupport(om0)) {
             i1 = i;
             userProfileF1 = c;
             Object obj1 = PatchProxy.applyFourRefs(r, Boolean.valueOf(d), Integer.valueOf(c), Integer.valueOf(i), null, m0.class, "1");
             if (obj1 != patchProxyRe) {
                i1 = obj1.booleanValue();
             }else if(!QCurrentUser.me().isLogined()){
                obj1 = PatchProxy.apply(objArray, objArray, k0.class, "33");
                boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("profileFollowGuideOptimization", false);
                if (b1) {
                   if (d == null || (r.getFollowStatus() == User$FollowStatus.FOLLOWING || (!m0.a(m0.a, (m0.b - 1), userProfileF1) && i1 < m0.c))) {
                   label_0133 :
                      i1 = false;
                   }
                }else {
                   UserProfileFollowGuidePresenter userProfileF2 = userProfileF1;
                   if (d == null || (r.getFollowStatus() == User$FollowStatus.FOLLOWING || (!m0.a(m0.a, (m0.b - 1), userProfileF2) || i1 < m0.c))) {
                   }
                }
                i1 = true;
             }
          }else {
             i1 = i;
             userProfileF1 = c;
             goto label_00cd ;
          }
          if (!i1) {
             r1 = view.r;
             if (r1 == null) {
                a.S("mUser");
             }
             if (r1.getFollowStatus() == User$FollowStatus.FOLLOWING) {
                r1 = view.y;
                if (r1 != null) {
                   r1.setVisibility(8);
                   r1.removeCallbacks(this.R8());
                }
             }
             return;
          }else if(!PatchProxy.applyVoid(objArray, view, userProfileF, "9") && view.y == null){
             r1 = view.v;
             if (r1 == null) {
                a.S("mFollowGuideViewStub");
             }
             View view1 = f3.a(r1);
             view.y = view1;
             if (view1 != null) {
                if (!PatchProxy.applyVoidOneRefs(view1, view, userProfileF, "13")) {
                   Activity activity = this.getActivity();
                   Integer integer = (activity != null)? Integer.valueOf(n.k(activity)): objArray;
                   if (integer != null) {
                      float f = (float)integer.intValue() / (float)a1.e(0x43cf0000);
                      view1.setScaleX(f);
                      view1.setScaleY(f);
                   }
                }
                b = 0;
                view1.measure(b, b);
             }
             if (!PatchProxy.applyVoid(objArray, view, userProfileF, "11")) {
                Animator uAnimator = d.a(view.y);
                uAnimator.addListener(new m(view));
                uAnimator.start();
             }
             view.z = m1.f(view.y, 0x7f0a0f5e);
             view.A = m1.f(view.y, 0x7f0a0f64);
             SelectShapeTextView selectShapeT = m1.f(view.y, R.id.follow_guide_btn);
             view.B = selectShapeT;
             if (selectShapeT != null) {
                selectShapeT.setOnClickListener(new l(view));
             }
          }
       label_01f3 :
          r1 = view.z;
          if (r1 != null) {
             userProfileF = view.r;
             if (userProfileF == null) {
                a.S("mUser");
             }
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-social:profile");
             r1.X(userProfileF.getAvatars(), uoa.a());
          }
          r1 = view.t;
          if (r1 == null) {
             a.S("mUserProfileRef");
          }
          UserProfile userProfile = r1.get();
          if (userProfile != null) {
             userProfile = userProfile.mProfile;
             if (userProfile != null && userProfile.mVisitorBeFollowed != null) {
                i2 = 1;
             label_0230 :
                if (i2) {
                   r1 = view.A;
                   if (r1 != null) {
                      r1.setText(a1.p(R.string.arg_RES_7f10494f));
                   }
                   r1 = view.B;
                   if (r1 != null) {
                      r1.setText(a1.p(R.string.arg_RES_7f10408e));
                   }
                }else {
                   r1 = view.A;
                   if (r1 != null) {
                      r1.setText(a1.p(R.string.arg_RES_7f10494e));
                   }
                   r1 = view.B;
                   if (r1 != null) {
                      r1.setText(a1.p(R.string.arg_RES_7f100f8f));
                   }
                }
                r1 = view.y;
                if (r1 != null) {
                   r1.setOnTouchListener(new UserProfileFollowGuidePresenter$b(view));
                   RxBus.f.b(new h());
                   r1.setVisibility(0);
                   view.E = true;
                   userProfileF = view.q;
                   if (userProfileF == null) {
                      a.S("mBaseFragment");
                   }
                   if (!PatchProxy.applyVoidOneRefs(userProfileF, objArray, y1.class, "119")) {
                      f3.j("SHOW_FOLLOW_BOTTOM_GUIDE_BAR").h(userProfileF);
                   }
                   r1.removeCallbacks(this.R8());
                   r1.postDelayed(this.R8(), ((long)view.p * 1000));
                }
                r1 = view.r;
                if (r1 == null) {
                   a.S("mUser");
                }
                if (!PatchProxy.applyVoidOneRefs(r1, objArray, om0, "4")) {
                   Map map = o.p(l2.P);
                   if (map == null) {
                      map = new HashMap();
                   }
                   map.put(r1.getId(), Long.valueOf(System.currentTimeMillis()));
                   SharedPreferences$Editor uEditor = o.a.edit();
                   uEditor.putString(b.d("user")+"user_profile_follow_guide_show_in_limited_day", b.e(map));
                   g.a(uEditor);
                }
                return;
             }
          }
          i2 = 0;
          goto label_0230 ;
       }
    }
    public final Runnable R8(){
       Object obj = PatchProxy.apply(null, this, UserProfileFollowGuidePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.getValue();
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, UserProfileFollowGuidePresenter.class, "12")) {
          return;
       }
       Animator uAnimator = d.b(this.y);
       uAnimator.addListener(new UserProfileFollowGuidePresenter$j(this));
       uAnimator.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.profile_bottom_follow_guide_viewstub);
       a.o(p0, "ViewBindUtils.bindWidget¡­om_follow_guide_viewstub\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, UserProfileFollowGuidePresenter.class, "3")) {
          return;
       }
       f obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.r = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.s = obj;
       obj = this.x8("DATA_USER_PROFILE");
       a.o(obj, "injectRef\(SocialAccessIds.DATA_USER_PROFILE\)");
       this.t = obj;
       Object obj1 = this.q8(j1.class);
       a.o(obj1, "inject\(UserProfileCallerContext::class.java\)");
       this.u = obj1;
       obj1 = this.r8("PROFILE_LAST_VISIABLE_FEED_POSITION_PUBLISHER");
       a.o(obj1, "inject\(ProfileCommonAcce¡­_FEED_POSITION_PUBLISHER\)");
       this.w = obj1;
       obj1 = this.r8("PROFILE_PAGE_RXBUS");
       a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_PAGE_RXBUS\)");
       this.x = obj1;
       return;
    }
}
