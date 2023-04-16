package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$mMissUListener$2;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g9c.d;
import qvb.q;
import qvb.a;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$b;
import erd.g;
import z5c.l0;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$c;
import lnc.b9;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import z5c.k0;
import lnc.a1;
import z5c.g3;
import android.content.Context;
import zf6.j;
import android.text.SpannableStringBuilder;
import lnc.b3;
import android.text.SpannableString;
import java.lang.CharSequence;
import java.lang.Number;
import com.kwai.framework.model.user.User;
import nsd.r0;
import java.util.Arrays;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import xh7.b;
import qh7.b;
import qh7.a;
import z5c.o0;
import java.lang.Boolean;
import android.widget.TextView;
import g7c.f;
import com.yxcorp.gifshow.profile.http.l;
import s1c.r0;
import java.util.Objects;
import s1c.j1;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.System;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout;
import z5c.j0;
import com.yxcorp.utility.n;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.FrameLayout;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.gifshow.profile.util.o;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import u3c.h;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import com.yxcorp.utility.TextUtils;
import s1c.o;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import u4c.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import z5c.y1;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$d;
import android.view.View$OnClickListener;
import s1c.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import z5c.d3;
import s3c.d;
import java.util.Set;
import ekd.m1;
import com.yxcorp.gifshow.pymk.widget.PymkHorListView;
import u4c.n;
import o7c.b;
import k2b.f3;
import lnc.i3;
import k2b.e0;
import u4c.o;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout;
import u4c.p;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$c;
import java.util.List;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class UserProfilePhotoEmptyPymkTipsPresenter extends PresenterV2	// class@00152e
{
    public TextView A;
    public TextView B;
    public TextView C;
    public View D;
    public a E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final p J;
    public final p K;
    public boolean L;
    public String M;
    public long N;
    public boolean O;
    public RecommendUserResponseV2 P;
    public b Q;
    public View R;
    public PymkHorListView S;
    public TextView T;
    public TextView U;
    public ProfilePYMKSwipeDetailLayout V;
    public RecyclerFragment p;
    public l q;
    public c r;
    public r0 s;
    public ProfileParam t;
    public UserProfile u;
    public j1 v;
    public t w;
    public User x;
    public d y;
    public View z;
    public static final UserProfilePhotoEmptyPymkTipsPresenter$a W;

    static {
       UserProfilePhotoEmptyPymkTipsPresenter.W = new UserProfilePhotoEmptyPymkTipsPresenter$a(null);
    }
    public void UserProfilePhotoEmptyPymkTipsPresenter(){
       super();
       this.F = true;
       this.J = s.c(new UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2(this));
       this.K = s.c(new UserProfilePhotoEmptyPymkTipsPresenter$mMissUListener$2(this));
    }
    public static final ProfileParam P8(UserProfilePhotoEmptyPymkTipsPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mParam");
       }
       return p0;
    }
    public static final RecyclerFragment R8(UserProfilePhotoEmptyPymkTipsPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mProfilePhotoFragment");
       }
       return p0;
    }
    public static final t S8(UserProfilePhotoEmptyPymkTipsPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mTipsHelper");
       }
       return p0;
    }
    public static final UserProfile V8(UserProfilePhotoEmptyPymkTipsPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mUserProfile");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "4")) {
          return;
       }
       UserProfilePhotoEmptyPymkTipsPresenter tp = this.p;
       if (tp == null) {
          a.S("mProfilePhotoFragment");
       }
       this.y = tp.ia();
       tp = this.q;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.h(this.W8());
       tp = this.r;
       if (tp == null) {
          a.S("mLoadState");
       }
       this.X7(tp.e().subscribe(new UserProfilePhotoEmptyPymkTipsPresenter$b(this), l0.a("UserProfilePhotoEmptyTipsPresenter")));
       this.X7(RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new UserProfilePhotoEmptyPymkTipsPresenter$c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "5")) {
          return;
       }
       UserProfilePhotoEmptyPymkTipsPresenter tq = this.q;
       if (tq == null) {
          a.S("mPageList");
       }
       tq.f(this.W8());
       b9.a(this.Q);
       u.c(this.E);
       return;
    }
    public final q W8(){
       Object obj = PatchProxy.apply(null, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.J.getValue();
    }
    public final View X8(){
       return this.R;
    }
    public final Drawable Y8(int p0,int p1){
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       if (PatchProxy.isSupport(userProfileP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, userProfileP, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0x7f070295;
       int i1 = (k0.t())? g3.a(a1.d(i)): a1.d(i);
       Drawable uDrawable = j.n(this.getContext(), p0, p1);
       if (uDrawable != null) {
          uDrawable.setBounds(0, 0, i1, i1);
       }else {
          uDrawable = null;
       }
       return uDrawable;
    }
    public final SpannableStringBuilder Z8(int p0,int p1,Context p2){
       SpannableStringBuilder obj;
       if (PatchProxy.isSupport(UserProfilePhotoEmptyPymkTipsPresenter.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SpannableStringBuilder();
       b3 uob3 = new b3(p2, j.n(p2, p0, p1));
       uob3.b(false);
       uob3.f(p0);
       uob3.g(a1.d(R.dimen.arg_RES_7f0702e3));
       obj.append(uob3.a());
       return obj;
    }
    public final int a9(){
       UserProfilePhotoEmptyPymkTipsPresenter obj = PatchProxy.apply(null, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("mParam");
       }
       ProfileParam mUser = obj.mUser;
       a.o(mUser, "mParam.mUser");
       int i = (mUser.isFemale())? 0x7f103f11: 0x7f103f12;
       return i;
    }
    public final void b9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "11")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(22),a1.p(0x7f10013d),"profile",p0};
       p0 = String.format("kwai://aggregate/user?contentType=%d&title=%s&pageType=%s&extParams={\"profileUserId\":\"%s\"}", Arrays.copyOf(objArray, 4));
       a.o(p0, "java.lang.String.format\(format, *args\)");
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       a.b(b.j(uActivityCon.e(), p0), null);
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "7")) {
          return;
       }
       this.I = false;
       UserProfilePhotoEmptyPymkTipsPresenter ty = this.y;
       if (ty != null) {
          o0.b(ty, this.R);
          o0.c(ty, this.z);
       }
       return;
    }
    public final void d9(boolean p0){
       UserProfilePhotoEmptyPymkTipsPresenter tA;
       Context context;
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileP, "21")) {
          return;
       }
       this.H = p0;
       int i = 0x7f0702e3;
       String str = "it.context";
       if (p0) {
          tA = this.A;
          if (tA != null) {
             if (this.F != null) {
                tA.setText(a1.p(R.string.arg_RES_7f10364f));
                tA.setCompoundDrawablePadding(a1.d(i));
                tA.setCompoundDrawables(this.Y8(R.drawable.arg_RES_7f082306, 0x7f061674), null, null, null);
             }else {
                context = tA.getContext();
                a.o(context, str);
                tA.setText(this.Z8(R.drawable.arg_RES_7f082306, 0x7f061674, context).append(a1.p(R.string.arg_RES_7f10364f)));
             }
             tA.setTextColor(j.d(tA, R.color.arg_RES_7f061674));
             tA.setBackground(j.m(tA, R.drawable.arg_RES_7f081d5b));
          }
       }else {
          tA = this.A;
          if (tA != null) {
             if (this.F != null) {
                tA.setText(a1.p(R.string.arg_RES_7f103638));
                tA.setCompoundDrawablePadding(a1.d(i));
                tA.setCompoundDrawables(this.Y8(R.drawable.arg_RES_7f082302, 0x7f061e52), null, null, null);
             }else {
                context = tA.getContext();
                a.o(context, str);
                tA.setText(this.Z8(R.drawable.arg_RES_7f082302, 0x7f061e52, context).append(a1.p(R.string.arg_RES_7f103638)));
             }
             tA.setTextColor(j.d(tA, R.color.arg_RES_7f061e52));
             tA.setBackground(j.m(tA, R.drawable.arg_RES_7f081d5c));
          }
       }
       return;
    }
    public final void e9(boolean p0){
       UserProfilePhotoEmptyPymkTipsPresenter tt;
       ProfileParam mUser;
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileP, "24")) {
          return;
       }
       String str = "mParam";
       if (p0) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          mUser = tt.mUser;
          a.o(mUser, "mParam.mUser");
          if (mUser.isFemale()) {
             tt = this.C;
             if (tt != null) {
                tt.setText(a1.p(R.string.arg_RES_7f103fae));
             }
          }else {
             tt = this.C;
             if (tt != null) {
                tt.setText(a1.p(R.string.arg_RES_7f103f0f));
             }
          }
       }else {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          mUser = tt.mUser;
          a.o(mUser, "mParam.mUser");
          if (mUser.isFemale()) {
             tt = this.C;
             if (tt != null) {
                tt.setText(a1.p(R.string.arg_RES_7f103d22));
             }
          }else {
             tt = this.C;
             if (tt != null) {
                tt.setText(a1.p(R.string.arg_RES_7f103d23));
             }
          }
       }
    label_007a :
       return;
    }
    public final void h9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "12")) {
          return;
       }
       if (this.O != null) {
          this.O = false;
          f.a(54, null, p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, UserProfilePhotoEmptyPymkTipsPresenter.class, "3")) {
          return;
       }
       ProfileParam obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.q = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.r = obj;
       obj = this.q8(r0.class);
       a.o(obj, "inject\(ProfilePageParam::class.java\)");
       this.s = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.t = obj;
       obj = obj.mUserProfile;
       a.o(obj, "mParam.mUserProfile");
       this.u = obj;
       UserProfilePhotoEmptyPymkTipsPresenter ts = this.s;
       if (ts == null) {
          a.S("mPageParam");
       }
       r0 g = ts.g;
       Objects.requireNonNull(g, "null cannot be cast to non-null type com.yxcorp.gifshow.profile.UserProfileCallerContext");
       this.v = g;
       Object obj1 = this.q8(t.class);
       a.o(obj1, "inject\(TipsHelper::class.java\)");
       this.w = obj1;
       ts = this.t;
       if (ts == null) {
          a.S("mParam");
       }
       obj = ts.mUser;
       a.o(obj, "mParam.mUser");
       this.x = obj;
       return;
    }
    public final void j9(long p0,Throwable p1){
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, userProfileP, "13")) {
          return;
       }
       f.b(54, null, (System.currentTimeMillis() - p0), p1);
       return;
    }
    public final void k9(){
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userProfileP, "15")) {
          return;
       }
       if (this.F != null) {
          UserProfilePhotoEmptyPymkTipsPresenter ty = this.y;
          if (ty != null) {
             o0.b(ty, this.R);
             o0.c(ty, this.z);
             this.z = objArray;
          }
       }
       this.F = false;
       if (!PatchProxy.applyVoid(objArray, this, userProfileP, "16")) {
          if (this.z == null) {
             this.z = a.a(this.getContext(), 0x7f0d127d);
             Activity activity = this.getActivity();
             View view = (activity != null)? activity.findViewById(R.id.app_bar_layout): objArray;
             this.D = view;
             userProfileP = this.z;
             if (userProfileP != null) {
                objArray = userProfileP.getLayoutParams();
             }
             if (objArray != null) {
                objArray.width = -1;
             }
             if (objArray) {
                objArray.height = -2;
             }
             userProfileP = this.z;
             if (userProfileP != null) {
                UserProfilePhotoEmptyPymkTipsPresenter tD = this.D;
                int i = (tD != null && tD instanceof AppBarLayout)? j0.a(tD, false): n.c(this.getContext(), 245.00f);
                userProfileP.setMinimumHeight(i);
             }
             userProfileP = this.z;
             if (userProfileP != null) {
                userProfileP.setLayoutParams(objArray);
             }
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.m(this.a9());
             UserProfilePhotoEmptyPymkTipsPresenter tz = this.z;
             if (tz != null) {
                KwaiEmptyStateView kwaiEmptySta = uoa.a(tz);
                a.o(kwaiEmptySta, "builder.applyToEmptyView\(it\)");
                this.C = kwaiEmptySta.findViewById(0x7f0a417a);
                this.A = kwaiEmptySta.findViewById(0x7f0a35e0);
             }
          }
          this.l9(false);
       }
       return;
    }
    public final void l9(boolean p0){
       int b2;
       UserProfilePhotoEmptyPymkTipsPresenter a;
       String str1;
       UserProfilePhotoEmptyPymkTipsPresenter s;
       a uoa;
       ProfileParam mUser;
       UserProfilePhotoEmptyPymkTipsPresenter x;
       boolean b = this;
       boolean b1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       if (PatchProxy.isSupport(userProfileP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), b, userProfileP, "17")) {
          return;
       }
       UserProfilePhotoEmptyPymkTipsPresenter obj = PatchProxy.apply(null, b, userProfileP, "26");
       String str = "mUserProfile";
       int i = 0;
       if (obj != patchProxyRe) {
          b2 = obj.booleanValue();
       }else {
          obj = b.x;
          String str3 = "mUser";
          if (obj == null) {
             a.S(str3);
          }
          if (obj.getFollowStatus() == User$FollowStatus.UNFOLLOW) {
             obj = b.u;
             if (obj == null) {
                a.S(str);
             }
             x = b.x;
             if (x == null) {
                a.S(str3);
             }
             if (o.w(obj, x)) {
             label_0077 :
                b2 = true;
             }
          }
          obj = b.x;
          if (obj == null) {
             a.S(str3);
          }
          if (obj.getFollowStatus() == User$FollowStatus.FOLLOWING) {
             obj = b.u;
             if (obj == null) {
                a.S(str);
             }
             x = b.x;
             if (x == null) {
                a.S(str3);
             }
             if (o.v(obj, x)) {
                goto label_0077 ;
             }
          }
          b2 = false;
       }
       if (b2) {
          obj = b.u;
          if (obj == null) {
             a.S(str);
          }
          UserProfileMissUInfo userProfileM = h.j(obj);
          int b3 = (userProfileM != null && userProfileM.mShowAlreadyMissUStatus == true)? true: false;
          b.d9(b3);
          b.e9(b3);
          b.I = true;
          a = b.A;
          if (a != null) {
             a.setVisibility(i);
          }
          a = b.t;
          if (a == null) {
             a.S("mParam");
          }
          ProfileParam mMomentParam = a.mMomentParam;
          Activity obj1 = PatchProxy.applyOneRefs(mMomentParam, b, userProfileP, "20");
          if (obj1 != patchProxyRe) {
             b3 = obj1.booleanValue();
          }else if(mMomentParam != null && !TextUtils.x(mMomentParam.getMomentId())){
             str1 = 1;
          }
          b3 = str1;
          str1 = "mParam.mUser";
          if (!b3 && (userProfileM != null && (userProfileM.mShowBubble != null && (o.d() || (!PatchProxy.applyVoid(null, b, userProfileP, "18") && this.getActivity() != null))))) {
             UserProfilePhotoEmptyPymkTipsPresenter a1 = b.A;
             if (a1 != null) {
                obj1 = this.getActivity();
                a.m(obj1);
                a.o(obj1, "activity!!");
                String str2 = PatchProxy.apply(null, b, userProfileP, "19");
                if (str2 != patchProxyRe) {
                }else {
                   obj = b.t;
                   if (obj == null) {
                      a.S("mParam");
                   }
                   mUser = obj.mUser;
                   a.o(mUser, str1);
                   if (mUser.isFemale()) {
                      str2 = a1.p(R.string.arg_RES_7f100fd5);
                      a.o(str2, "CommonUtil.string\(R.stri¡­w_list_missu_hint_female\)");
                   }else {
                      str2 = a1.p(R.string.arg_RES_7f100fd6);
                      a.o(str2, "CommonUtil.string\(R.stri¡­low_list_missu_hint_male\)");
                   }
                }
                Object obj3 = str2;
                uoa = u.j(obj1, a1, obj3, BubbleInterface$Position.BOTTOM, new q(b), 0, 32, null);
             }else {
                uoa = null;
             }
             b.E = uoa;
          }
       label_0143 :
          b2 = 1209;
          a = b.t;
          if (a == null) {
             a.S("mParam");
          }
          mMomentParam = a.mUser;
          a.o(mMomentParam, str1);
          str = mMomentParam.getId();
          str1 = (b1)? "NO_PHOTO_1": "NO_PHOTO_0";
          y1.z(true, b2, str, str1);
          obj = b.A;
          if (obj != null) {
             obj.setOnClickListener(new UserProfilePhotoEmptyPymkTipsPresenter$d(b, b1));
          }
          s = b.s;
          if (s == null) {
             a.S("mPageParam");
          }
          s.e.d.a("PROFILE_EMPTY_PHOTO_MISSU_SHOW");
       }else {
          s = b.t;
          if (s == null) {
             a.S("mParam");
          }
          ProfileParam mUser1 = s.mUser;
          obj = b.u;
          if (obj == null) {
             a.S(str);
          }
          b2 = 8;
          if (d3.d(mUser1, obj)) {
             s = b.z;
             if (s != null) {
                s.setVisibility(b2);
             }
          }else {
             s = b.A;
             if (s != null) {
                s.setVisibility(b2);
             }
          }
       }
       s = b.v;
       if (s == null) {
          a.S("mUserCallerContext");
       }
       j1 c = s.c;
       Object obj2 = PatchProxy.apply(null, b, userProfileP, "2");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = b.K.getValue();
       }
       c.add(obj2);
       s = b.y;
       if (s != null) {
          UserProfilePhotoEmptyPymkTipsPresenter z = b.z;
          if (!PatchProxy.applyVoidTwoRefs(s, z, null, o0.class, "1")) {
             a.p(s, "adapter");
             if (s.U0(z)) {
                s.m1(z);
             }
             if (!s.U0(z)) {
                o0.a(z);
                s.P0(z);
             }
          }
       }
       return;
    }
    public final void m9(User p0){
       UserProfilePhotoEmptyPymkTipsPresenter userProfileP = UserProfilePhotoEmptyPymkTipsPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, userProfileP, "8")) {
          return;
       }
       UserProfilePhotoEmptyPymkTipsPresenter tP = this.P;
       if (tP != null) {
          if (this.F == null) {
             UserProfilePhotoEmptyPymkTipsPresenter ty = this.y;
             if (ty != null) {
                o0.c(ty, this.z);
                this.z = null;
             }
          }
          boolean b = true;
          this.F = b;
          if (!PatchProxy.applyVoid(null, this, userProfileP, "14")) {
             if (this.z == null) {
                View view1 = a.a(this.getContext(), R.layout.arg_RES_7f0d124e);
                this.z = view1;
                this.B = m1.f(view1, 0x7f0a2a59);
                TextView textView1 = m1.f(this.z, R.id.sub_title);
                this.C = textView1;
                if (textView1 != null) {
                   textView1.setText(this.a9());
                }
                this.A = m1.f(this.z, 0x7f0a2b8b);
                if (k0.t()) {
                   UserProfilePhotoEmptyPymkTipsPresenter tB = this.B;
                   int i = 14;
                   if (tB != null) {
                      g3.e(tB, i);
                   }
                   tB = this.C;
                   if (tB != null) {
                      g3.e(tB, 13);
                   }
                   tB = this.A;
                   if (tB != null) {
                      g3.e(tB, i);
                   }
                }
             }
          label_0089 :
             this.l9(b);
          }
          String str = "mProfilePhotoFragment";
          if (!PatchProxy.applyVoidOneRefs(p0, this, userProfileP, "9")) {
             if (this.R == null) {
                View view = a.a(this.getContext(), R.layout.arg_RES_7f0d1269);
                this.R = view;
                PymkHorListView pymkHorListV = (view != null)? view.findViewById(R.id.recommend_user_list): null;
                this.S = pymkHorListV;
                if (pymkHorListV != null) {
                   pymkHorListV.setPymkHorListener(new n(this));
                }
             }
             userProfileP = this.R;
             TextView textView = (userProfileP != null)? userProfileP.findViewById(R.id.label): null;
             this.T = textView;
             userProfileP = this.R;
             textView = (userProfileP != null)? userProfileP.findViewById(R.id.more): null;
             this.U = textView;
             userProfileP = this.p;
             if (userProfileP == null) {
                a.S(str);
             }
             User mId = p0.mId;
             if (!PatchProxy.applyVoidTwoRefs(userProfileP, mId, null, y1.class, "129")) {
                f3 uof3 = f3.j("PHOTO_PYMK_MORE_BUTTON");
                i3 oi3 = i3.f();
                oi3.d("visited_uid", mId);
                uof3.m(oi3.e());
                uof3.h(userProfileP);
             }
             userProfileP = this.U;
             if (userProfileP != null) {
                userProfileP.setOnClickListener(new o(this, p0));
             }
             userProfileP = this.R;
             if (userProfileP != null) {
                userProfileP.setTag(R.id.tag_view_refere, Integer.valueOf(20));
             }
             userProfileP = this.R;
             ProfilePYMKSwipeDetailLayout profilePYMKS = (userProfileP != null)? userProfileP.findViewById(R.id.recommand_user_list_container): null;
             this.V = profilePYMKS;
             if (profilePYMKS != null) {
                profilePYMKS.setSwipeFooterListener(new p(this, p0));
             }
          }
          UserProfilePhotoEmptyPymkTipsPresenter tS = this.S;
          if (tS != null) {
             userProfileP = this.p;
             if (userProfileP == null) {
                a.S(str);
             }
             tS.A(userProfileP, 54, this.M, tP.getItems());
          }
          tS = this.y;
          if (tS != null) {
             userProfileP = this.R;
             if (!PatchProxy.applyVoidTwoRefs(tS, userProfileP, null, o0.class, "2")) {
                a.p(tS, "adapter");
                if (tS.T0(userProfileP)) {
                   tS.l1(userProfileP);
                }
                if (!tS.T0(userProfileP)) {
                   o0.a(userProfileP);
                   tS.L0(userProfileP);
                }
             }
          }
       }
    label_0189 :
       return;
    }
}
