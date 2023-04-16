package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mMaxRequestTime$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mPercent$2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mIntervalMs$2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mPageListObserver$2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mScrollListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.CharSequence;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.framework.model.user.User;
import com.yxcorp.utility.TextUtils;
import iw5.a;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mScrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import s1c.a;
import brd.t;
import j5c.a;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$k;
import z5c.l0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$l;
import erd.r;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$m;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.h;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$n;
import i3c.i;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$o;
import z5c.y1;
import k2b.h;
import lnc.i3;
import k2b.e0;
import k2b.f3;
import java.lang.Integer;
import android.widget.LinearLayout;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.utility.n;
import l17.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.StringBuilder;
import v2c.e;
import v2c.g;
import a3c.e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.ProfileReboundBehavior;
import z5c.h3;
import com.google.android.material.appbar.ViewOffsetBehavior;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$p;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$q;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import java.util.LinkedList;
import lnc.b9;
import ekd.k1;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$b;
import com.yxcorp.gifshow.profile.http.l;
import java.lang.Float;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$c;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.content.Context;
import zf6.j;
import android.graphics.drawable.Drawable;
import z5c.f3;
import android.widget.TextView;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$r;
import android.view.View$OnClickListener;
import ekd.m1;
import j5c.d;
import j3c.r;
import qvb.n0;
import java.lang.Number;
import usd.q;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$d;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$e;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$f;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.AccelerateInterpolator;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$h;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$i;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import androidx.fragment.app.Fragment;
import android.view.ViewStub;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$j;
import qrd.l1;

public class UserProfileLastSeenPresenter extends PresenterV2	// class@001472
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public b F;
    public int G;
    public int H;
    public long I;
    public boolean J;
    public TextView K;
    public ImageView L;
    public PathLoadingView M;
    public KwaiImageView N;
    public View O;
    public View P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final p U;
    public final p V;
    public final p W;
    public final p X;
    public final p Y;
    public a p;
    public BaseFragment q;
    public RecyclerFragment r;
    public n0 s;
    public RecyclerView t;
    public r0 u;
    public int v;
    public String w;
    public AppBarLayout x;
    public ViewStub y;
    public View z;
    public static final UserProfileLastSeenPresenter$a Z;

    static {
       UserProfileLastSeenPresenter.Z = new UserProfileLastSeenPresenter$a(null);
    }
    public void UserProfileLastSeenPresenter(){
       super();
       this.v = 5;
       this.D = -1;
       this.U = s.c(new UserProfileLastSeenPresenter$mMaxRequestTime$2(this));
       this.V = s.c(new UserProfileLastSeenPresenter$mPercent$2(this));
       this.W = s.c(new UserProfileLastSeenPresenter$mIntervalMs$2(this));
       this.X = s.c(new UserProfileLastSeenPresenter$mPageListObserver$2(this));
       this.Y = s.c(new UserProfileLastSeenPresenter$mScrollListener$2(this));
    }
    public final int B9(){
       return this.D;
    }
    public final void C9(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenter.class, "20")) {
          return;
       }
       if (this.E == 1) {
          UserProfileLastSeenPresenter tz = this.z;
          if (tz != null) {
             tz.setVisibility(8);
          }
       }
       return;
    }
    public final boolean D9(){
       Object[] objArray = null;
       UserProfileLastSeenPresenter obj = PatchProxy.apply(objArray, this, UserProfileLastSeenPresenter.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mProfilePageParam");
       }
       r0 d = obj.d;
       if (d != null) {
          objArray = d.mPhotoSceneType;
       }
       return a.g("SEARCH", objArray);
    }
    public void E8(){
       z a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "19")) {
          return;
       }
       UserProfileLastSeenPresenter tw = this.w;
       tw = (tw == null || !tw.length())? 1: null;
       if (!tw) {
          tw = this.u;
          String str = "mProfilePageParam";
          if (tw == null) {
             a.S(str);
          }
          if (tw.d.mBaseFeed != null) {
             tw = this.u;
             if (tw == null) {
                a.S(str);
             }
             if (!r1.S2(tw.d.mBaseFeed)) {
                tw = this.u;
                if (tw == null) {
                   a.S(str);
                }
                String str1 = r1.U1(tw.d.mBaseFeed);
                UserProfileLastSeenPresenter tu = this.u;
                if (tu == null) {
                   a.S(str);
                }
                ProfileParam mUser = tu.d.mUser;
                a.o(mUser, "mProfilePageParam.mParam.mUser");
                if (TextUtils.n(str1, mUser.getId())) {
                   a e = a.e;
                   UserProfileLastSeenPresenter tu1 = this.u;
                   if (tu1 == null) {
                      a.S(str);
                   }
                   e.c(tu1.d.mBaseFeed);
                   tw = this.s;
                   if (tw == null) {
                      a.S("mPageList");
                   }
                   tw.h(this.t9());
                   tw = this.t;
                   if (tw == null) {
                      a.S("mRecyclerView");
                   }
                   tw.addOnScrollListener(this.y9());
                   tw = this.p;
                   if (tw == null) {
                      a.S("mProfileCallerContext");
                   }
                   this.X7(tw.k.b().subscribe(new UserProfileLastSeenPresenter$k(this), l0.a));
                   tw = this.r;
                   if (tw == null) {
                      a.S("mFragment");
                   }
                   this.X7(tw.Vg().j().filter(new UserProfileLastSeenPresenter$l(this)).subscribe(new UserProfileLastSeenPresenter$m(this)));
                   RxBus f = RxBus.f;
                   a = d.a;
                   this.X7(f.f(h.class).observeOn(a).subscribe(new UserProfileLastSeenPresenter$n(this)));
                   this.X7(f.f(i.class).observeOn(a).subscribe(new UserProfileLastSeenPresenter$o(this)));
                   return;
                }
             }
          }
       }
    label_010b :
       a.e.c(objArray);
       return;
    }
    public final void E9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "41")) {
          return;
       }
       UserProfileLastSeenPresenter tq = this.q;
       if (tq == null) {
          a.S("mProfileFragment");
       }
       String str = (this.Q != null)? "UP": "DOWN";
       if (!PatchProxy.applyVoidTwoRefs(tq, str, objArray, y1.class, "94")) {
          h oh = h.k("LAST_VIEWED_BUTTON");
          i3 oi3 = i3.f();
          oi3.d("button_type", str);
          oh.n(oi3.e());
          oh.i(tq);
       }
       return;
    }
    public final void F9(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "40")) {
          return;
       }
       UserProfileLastSeenPresenter tq = this.q;
       if (tq == null) {
          a.S("mProfileFragment");
       }
       boolean b = true;
       if (this.Q != null) {
          this.R = b;
          str = "UP";
       }else {
          this.S = b;
          str = "DOWN";
       }
       if (!PatchProxy.applyVoidTwoRefs(tq, str, objArray, y1.class, "93")) {
          f3 uof3 = f3.j("LAST_VIEWED_BUTTON");
          i3 oi3 = i3.f();
          oi3.d("button_type", str);
          uof3.m(oi3.e());
          uof3.h(tq);
       }
       return;
    }
    public boolean G9(int p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       if (PatchProxy.isSupport(userProfileL)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, userProfileL, "31");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (this.D == -1 && this.B < this.o9()) {
          int i = this.u9();
          if (PatchProxy.isSupport(userProfileL)) {
             Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), this, userProfileL, "32");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
             label_004d :
                UserProfileLastSeenPresenter tx = this.x;
                int height = (tx != null)? tx.getHeight(): 0;
                if (p0 >= (((height - (this.A + a1.d(0x7f070310))) * i) / 100)) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
          }else {
             goto label_004d ;
          }
          if (b1) {
          label_006f :
             return b;
          }
       }
    label_006e :
       b = false;
       goto label_006f ;
    }
    public final void H9(int p0,boolean p1){
       int i4;
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       if (PatchProxy.isSupport(userProfileL) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, userProfileL, "25")) {
          return;
       }
       Activity activity = this.getActivity();
       a.m(activity);
       int i = n.j(activity);
       a uoa = this.b9();
       UserProfileLastSeenPresenter tt = this.t;
       if (tt == null) {
          a.S("mRecyclerView");
       }
       RecyclerView$LayoutManager layoutManage = tt.getLayoutManager();
       Object[] objArray = null;
       View view = (layoutManage != null)? layoutManage.findViewByPosition(p0): objArray;
       int i1 = uoa.b();
       int i2 = 0;
       if (view != null) {
          int i3 = n.o(view)[1];
          if (p0 < i1) {
             UserProfileLastSeenPresenter tt1 = this.t;
             if (tt1 == null) {
                a.S("mRecyclerView");
             }
             tt1.startNestedScroll(2, 1);
             tt1 = this.t;
             if (tt1 == null) {
                a.S("mRecyclerView");
             }
             tt1.smoothScrollBy(i2, (i3 - (i / 2)));
             return;
          }else {
             UserProfileLastSeenPresenter tt2 = this.t;
             if (tt2 == null) {
                a.S("mRecyclerView");
             }
             if (p0 <= this.c9(tt2, 100)) {
                return;
             }else if(p0 <= uoa.e()){
                UserProfileLastSeenPresenter tt3 = this.t;
                if (tt3 == null) {
                   a.S("mRecyclerView");
                }
                tt3.startNestedScroll(2, 1);
                tt3 = this.t;
                if (tt3 == null) {
                   a.S("mRecyclerView");
                }
                i3 = i3 - (i / 2);
                tt3.smoothScrollBy(i2, i3);
                g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "goToLastSeeIndex "+p0+" scroll: "+i3);
                return;
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, userProfileL, "27")) {
          i4 = (e.a(this.v))? a1.d(R.dimen.arg_RES_7f070313): a1.d(R.dimen.arg_RES_7f07030d);
          UserProfileLastSeenPresenter tx = this.x;
          if (tx != null) {
             i2 = tx.getHeight();
          }
          i2 = (i2 - (this.A + i4)) - this.H;
          if (i2 > 0) {
             ProfileReboundBehavior profileRebou = h3.a(this.x);
             if (profileRebou != null) {
                profileRebou.setTopAndBottomOffset((profileRebou.getTopAndBottomOffset() - i2));
             }
          }
       }
    label_00f2 :
       userProfileL = this.t;
       if (userProfileL == null) {
          a.S("mRecyclerView");
       }
       RecyclerView$LayoutManager layoutManage1 = userProfileL.getLayoutManager();
       if (layoutManage1 instanceof LinearLayoutManager) {
          objArray = layoutManage1;
       }
       if (p1) {
          userProfileL = this.t;
          if (userProfileL == null) {
             a.S("mRecyclerView");
          }
          i4 = userProfileL.getHeight() / 2;
       }else {
          userProfileL = this.t;
          if (userProfileL == null) {
             a.S("mRecyclerView");
          }
          i4 = userProfileL.getHeight();
       }
       if (objArray != null) {
          objArray.scrollToPositionWithOffset(p0, i4);
       }
       userProfileL = this.t;
       if (userProfileL == null) {
          a.S("mRecyclerView");
       }
       userProfileL.post(new UserProfileLastSeenPresenter$p(this, p0, i1, p1));
       this.V8();
       this.X7(t.timer(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new UserProfileLastSeenPresenter$q(this)));
       g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "goToLastSeeIndex "+this.D);
       return;
    }
    public final void I9(int p0){
       this.B = p0;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "38")) {
          return;
       }
       a e = a.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(objArray, e, a.class, "4")) {
          ReentrantReadWriteLock$WriteLock c = a.c;
          c.lock();
          LinkedList d = a.d;
          if (d.size() > 0) {
             d.removeLast();
          }
          c.unlock();
       }
       UserProfileLastSeenPresenter tw = this.w;
       tw = (tw == null || !tw.length())? 1: null;
       if (!tw) {
          tw = this.u;
          String str = "mProfilePageParam";
          if (tw == null) {
             a.S(str);
          }
          if (tw.d.mBaseFeed != null) {
             tw = this.u;
             if (tw == null) {
                a.S(str);
             }
             if (!r1.S2(tw.d.mBaseFeed)) {
                tw = this.u;
                if (tw == null) {
                   a.S(str);
                }
                String str1 = r1.U1(tw.d.mBaseFeed);
                UserProfileLastSeenPresenter tu = this.u;
                if (tu == null) {
                   a.S(str);
                }
                ProfileParam mUser = tu.d.mUser;
                a.o(mUser, "mProfilePageParam.mParam.mUser");
                if (TextUtils.n(str1, mUser.getId())) {
                   b9.a(this.F);
                   tw = this.s;
                   if (tw == null) {
                      a.S("mPageList");
                   }
                   tw.f(this.t9());
                   tw = this.t;
                   if (tw == null) {
                      a.S("mRecyclerView");
                   }
                   tw.removeOnScrollListener(this.y9());
                   k1.n("ZoomAnimation");
                }
             }
          }
       }
    label_00b3 :
       return;
    }
    public final void J9(int p0){
       this.E = p0;
    }
    public final void K9(int p0){
       this.C = p0;
    }
    public final void L9(long p0){
       this.I = p0;
    }
    public final void M9(boolean p0){
       this.T = p0;
    }
    public final void O9(int p0){
       this.D = p0;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenter.class, "39")) {
          return;
       }
       this.E9();
       this.H9(this.D, true);
       this.E = 3;
       UserProfileLastSeenPresenter tz = this.z;
       if (tz != null) {
          tz.setVisibility(8);
       }
       k1.s(new UserProfileLastSeenPresenter$b(this), "ZoomAnimation", 300);
       return;
    }
    public final void Q9(boolean p0){
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       if (PatchProxy.isSupport(userProfileL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileL, "37")) {
          return;
       }
       userProfileL = this.s;
       if (userProfileL == null) {
          a.S("mPageList");
       }
       if (!userProfileL instanceof l) {
          userProfileL = null;
       }
       if (userProfileL != null) {
          userProfileL.w = p0;
       }
       return;
    }
    public final void R8(View p0,float p1){
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       if (PatchProxy.isSupport(userProfileL) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, userProfileL, "44")) {
          return;
       }
       float[] uofloatArray = new float[]{p1,p1,p1,p1,p1,p1,p1,p1};
       int i = 0;
       int i1 = 2;
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.player_cover);
       this.N = kwaiImageVie;
       if (kwaiImageVie != null) {
          kwaiImageVie.setOutlineProvider(new UserProfileLastSeenPresenter$c(p1));
       }
       UserProfileLastSeenPresenter tN = this.N;
       if (tN != null) {
          tN.setClipToOutline(1);
       }
       View view = p0.findViewById(R.id.profilegrid_like_count);
       this.P = view;
       if (view != null) {
          int[] ointArray = new int[i1];
          ointArray[i] = j.b(view.getContext(), 0x7f062030);
          ointArray[1] = j.b(view.getContext(), 0x7f060759);
          GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray);
          gradientDraw.setShape(i);
          gradientDraw.setCornerRadii(uofloatArray);
          view.setBackground(gradientDraw);
       }
       p0 = p0.findViewById(R.id.profilegrid_lastSee);
       this.O = p0;
       if (p0 != null) {
          GradientDrawable gradientDraw1 = new GradientDrawable();
          gradientDraw1.setShape(i);
          gradientDraw1.setCornerRadii(uofloatArray);
          gradientDraw1.setColor(j.b(p0.getContext(), R.color.arg_RES_7f06204d));
          p0.setBackground(gradientDraw1);
       }
       return;
    }
    public void R9(){
       UserProfileLastSeenPresenter ty;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "22")) {
          return;
       }
       if (this.z == null) {
          ty = this.y;
          View view = (ty != null)? f3.a(ty): objArray;
          this.z = view;
          TextView textView = (view != null)? view.findViewById(R.id.last_seen_btn): objArray;
          this.K = textView;
          ty = this.z;
          ImageView imageView = (ty != null)? ty.findViewById(R.id.last_seen_arrow): objArray;
          this.L = imageView;
          this.S8(false);
          ty = this.z;
          if (ty != null) {
             objArray = ty.findViewById(0x7f0a16c6);
          }
          this.M = objArray;
          if (objArray != null) {
             objArray.f(LoadingStyle.CUSTOM, R.color.arg_RES_7f061d77);
          }
          ty = this.z;
          if (ty != null) {
             m1.a(ty, new UserProfileLastSeenPresenter$r(this), R.id.profile_last_seen_view);
          }
       }
       ty = this.r;
       if (ty == null) {
          a.S("mFragment");
       }
       if (ty.Vg().c()) {
          ty = this.Q;
          if (ty == null || (this.R == null || (ty == null && this.S == null))) {
             this.F9();
          }
          ty = this.z;
          if (ty != null) {
             ty.setVisibility(false);
          }
       }else {
          ty = this.z;
          if (ty != null) {
             ty.setVisibility(8);
          }
       }
       return;
    }
    public final void S8(boolean p0){
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       if (PatchProxy.isSupport(userProfileL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileL, "42")) {
          return;
       }
       userProfileL = this.L;
       if (userProfileL != null) {
          Drawable uDrawable = (p0)? j.n(userProfileL.getContext(), R.drawable.arg_RES_7f082300, 0x7f0606ce): j.n(userProfileL.getContext(), R.drawable.arg_RES_7f0822ff, 0x7f0606ce);
          userProfileL.setImageDrawable(uDrawable);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenter.class, "29")) {
          return;
       }
       ProfileReboundBehavior profileRebou = h3.a(this.x);
       if (profileRebou != null && this.G != profileRebou.getTopAndBottomOffset()) {
          this.G = profileRebou.getTopAndBottomOffset();
          UserProfileLastSeenPresenter tp = this.p;
          if (tp == null) {
             a.S("mProfileCallerContext");
          }
          tp.k.a(new d((- this.G)));
       }
       return;
    }
    public void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "34")) {
          return;
       }
       if (this.E != 3) {
          UserProfileLastSeenPresenter userProfileL = -1;
          if (this.D != userProfileL) {
             boolean i = this.b9().b();
             if (i == userProfileL) {
                return;
             }else if((this.D + this.d9()) >= i){
                UserProfileLastSeenPresenter tt = this.t;
                if (tt == null) {
                   a.S("mRecyclerView");
                }
                RecyclerView$LayoutManager layoutManage = tt.getLayoutManager();
                if (layoutManage != null) {
                   objArray = layoutManage.findViewByPosition((this.D + this.d9()));
                }
                i = false;
                if (objArray != null) {
                   if (r.b(objArray, 100)) {
                      this.E = 2;
                      tt = this.z;
                      if (tt != null) {
                         tt.setVisibility(8);
                      }
                   }else {
                      this.E = 1;
                      this.R9();
                      this.Q = i;
                      this.S8(i);
                   }
                }else {
                   this.E = 1;
                   this.R9();
                   this.Q = i;
                   this.S8(i);
                }
             }else {
                this.E = 1;
                this.R9();
                this.Q = true;
                this.S8(1);
             }
          }
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenter.class, "24")) {
          return;
       }
       KsLogProfileTag pHOTO_LAST_S = KsLogProfileTag.PHOTO_LAST_SEEN;
       g.h(pHOTO_LAST_S, "checkLoadMore mAlreadyRequestTime: "+this.B+", mMaxRequestTime: "+this.o9());
       if (this.D == -1) {
          UserProfileLastSeenPresenter ts = this.s;
          if (ts == null) {
             a.S("mPageList");
          }
          if (ts.hasMore() && this.B < this.o9()) {
             g.h(pHOTO_LAST_S, "try load more mAlreadyRequestTime: "+this.B);
             this.Q9(true);
             UserProfileLastSeenPresenter ts1 = this.s;
             if (ts1 == null) {
                a.S("mPageList");
             }
             ts1.load();
          }
       }
    label_0070 :
       return;
    }
    public final void Y8(){
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userProfileL, "23")) {
          return;
       }
       if (this.B >= this.o9() && this.T == null) {
          return;
       }
       b9.a(this.F);
       UserProfileLastSeenPresenter tI = this.I;
       Number number = PatchProxy.apply(objArray, this, userProfileL, "15");
       if (number == PatchProxyResult.class) {
          number = this.W.getValue();
       }
       this.F = t.timer(q.o(100, ((tI + number.longValue()) - k1.i())), TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new UserProfileLastSeenPresenter$d(this));
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenter.class, "21")) {
          return;
       }
       UserProfileLastSeenPresenter tt = this.t;
       String str = "mRecyclerView";
       if (tt == null) {
          a.S(str);
       }
       int i = this.c9(tt, 100);
       if (i < 0 && this.J == null) {
          this.J = true;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tt.post(new UserProfileLastSeenPresenter$e(this));
          return;
       }else if(i >= this.D){
          this.E = 2;
          tt = this.z;
          if (tt != null) {
             tt.setVisibility(8);
          }
       }else {
          this.E = 1;
          this.R9();
       }
       return;
    }
    public final AnimatorSet a9(View p0){
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       ValueAnimator obj = PatchProxy.applyOneRefs(p0, this, userProfileL, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       int i = 0;
       int i1 = 1;
       int i2 = 2;
       if (!PatchProxy.applyVoidOneRefs(p0, this, userProfileL, "45")) {
          userProfileL = this.D;
          if (userProfileL == null) {
             p0.setPivotX(i);
             p0.setPivotY(i);
          }else {
             double d = 0x3fe0000000000000;
             if (userProfileL == i1) {
                p0.setPivotX((float)((double)p0.getWidth() * d));
                p0.setPivotY(i);
             }else if(userProfileL == i2){
                p0.setPivotX((float)p0.getWidth());
                p0.setPivotY(i);
             }else {
                int i3 = userProfileL % 3;
                if (!i3) {
                   p0.setPivotX(i);
                   p0.setPivotY((float)((double)p0.getHeight() * d));
                }else if(i3 == i2){
                   p0.setPivotX((float)p0.getWidth());
                   p0.setPivotY((float)((double)p0.getHeight() * d));
                }
             }
          }
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i2];
       propertyValu[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i2]{0x3f800000,0x3f8ccccd});
       propertyValu[i1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i2]{0x3f800000,0x3f8ccccd});
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­view, scaleInX, scaleInY\)");
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(new DecelerateInterpolator());
       objectAnimat.addListener(new UserProfileLastSeenPresenter$f(p0));
       float[] uofloatArray = new float[i2];
       uofloatArray[0] = i;
       uofloatArray[i1] = (float)a1.e(8.00f);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       a.o(valueAnimato, "radiusInAnimator");
       valueAnimato.setDuration(300);
       valueAnimato.setInterpolator(new DecelerateInterpolator());
       valueAnimato.addUpdateListener(new UserProfileLastSeenPresenter$g(this, p0));
       PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i2];
       propertyValu1[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i2]{0x3f8ccccd,0x3f800000});
       propertyValu1[i1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i2]{0x3f8ccccd,0x3f800000});
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
       a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­ew, scaleOutX, scaleOutY\)");
       objectAnimat1.setDuration(200);
       objectAnimat1.setInterpolator(new AccelerateInterpolator());
       objectAnimat1.addListener(new UserProfileLastSeenPresenter$h(p0));
       float[] uofloatArray1 = new float[i2];
       uofloatArray1[0] = (float)a1.e(8.00f);
       uofloatArray1[i1] = i;
       obj = ValueAnimator.ofFloat(uofloatArray1);
       a.o(obj, "radiusOutAnimator");
       obj.setInterpolator(new AccelerateInterpolator());
       obj.setDuration(200);
       obj.addUpdateListener(new UserProfileLastSeenPresenter$i(this, p0));
       uAnimatorSet.play(objectAnimat).with(valueAnimato);
       AnimatorSet$Builder uBuilder = uAnimatorSet.play(objectAnimat1).with(obj);
       uBuilder.after(350);
       return uAnimatorSet;
    }
    public final a b9(){
       UserProfileLastSeenPresenter obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       a uoa = a.a(obj);
       a.o(uoa, "RecyclerViewPositionHelp¡­eateHelper\(mRecyclerView\)");
       return uoa;
    }
    public final int c9(RecyclerView p0,int p1){
       View childAt;
       UserProfileLastSeenPresenter userProfileL = UserProfileLastSeenPresenter.class;
       if (PatchProxy.isSupport(userProfileL)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, userProfileL, "28");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "recyclerView");
       int i = p0.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          childAt = p0.getChildAt(i);
          if (r.b(childAt, p1)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return (p0.getChildAdapterPosition(childAt) - this.d9());
    }
    public final int d9(){
       Object[] objArray = null;
       UserProfileLastSeenPresenter obj = PatchProxy.apply(objArray, this, UserProfileLastSeenPresenter.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       RecyclerView$Adapter adapter = obj.getAdapter();
       if (adapter instanceof d) {
          objArray = adapter;
       }
       int i = (objArray != null)? objArray.b1(): 0;
       return i;
    }
    public final int e9(){
       return this.B;
    }
    public final int h9(){
       return this.E;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter.class, "18")) {
          return;
       }
       ProfileParam obj = this.q8(r0.class);
       a.o(obj, "inject\(ProfilePageParam::class.java\)");
       this.u = obj;
       obj = obj.d.mPhotoID;
       this.w = obj;
       UserProfileLastSeenPresenter userProfileL = (obj == null || !obj.length())? 1: null;
       if (!userProfileL) {
          userProfileL = this.u;
          String str = "mProfilePageParam";
          if (userProfileL == null) {
             a.S(str);
          }
          if (userProfileL.d.mBaseFeed != null) {
             userProfileL = this.u;
             if (userProfileL == null) {
                a.S(str);
             }
             if (!r1.S2(userProfileL.d.mBaseFeed)) {
                userProfileL = this.u;
                if (userProfileL == null) {
                   a.S(str);
                }
                String str1 = r1.U1(userProfileL.d.mBaseFeed);
                UserProfileLastSeenPresenter tu = this.u;
                if (tu == null) {
                   a.S(str);
                }
                ProfileParam mUser = tu.d.mUser;
                a.o(mUser, "mProfilePageParam.mParam.mUser");
                if (TextUtils.n(str1, mUser.getId())) {
                   View obj1 = this.q8(a.class);
                   a.o(obj1, "inject\(BaseProfileCallerContext::class.java\)");
                   this.p = obj1;
                   obj1 = this.r8("FRAGMENT");
                   a.o(obj1, "inject\(AccessIds.FRAGMENT\)");
                   this.r = obj1;
                   obj1 = this.q8(RecyclerView.class);
                   a.o(obj1, "inject\(RecyclerView::class.java\)");
                   this.t = obj1;
                   obj1 = this.r8("PAGE_LIST");
                   a.o(obj1, "inject\(PageAccessIds.PAGE_LIST\)");
                   this.s = obj1;
                   obj1 = this.r8("PROFILE_STYLE");
                   a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
                   this.v = obj1.intValue();
                   obj1 = this.r8("PROFILE_FRAGMENT");
                   a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
                   this.q = obj1;
                   obj1 = obj1.getView();
                   if (obj1 != null) {
                      this.x = obj1.findViewById(0x7f0a0225);
                      ViewStub viewStub = obj1.findViewById(R.id.profile_last_seen_viewstub);
                      this.y = viewStub;
                      if (viewStub == null) {
                         View view = obj1.findViewById(R.id.profile_last_seen_view);
                         if (view != null) {
                            m1.a(view, new UserProfileLastSeenPresenter$j(this), R.id.profile_last_seen_view);
                            UserProfileLastSeenPresenter tz = this.z;
                            if (tz != null) {
                               tz.setVisibility(0);
                            }
                            objArray = view;
                         }
                         this.z = objArray;
                      }
                      obj1 = obj1.findViewById(R.id.title_root);
                      a.o(obj1, "findViewById<View>\(R.id.title_root\)");
                      this.A = obj1.getHeight();
                   }
                }
             }
          }
       }
    label_0128 :
       return;
    }
    public final int j9(){
       return this.C;
    }
    public final PathLoadingView k9(){
       return this.M;
    }
    public final String l9(){
       return this.w;
    }
    public final View m9(){
       return this.z;
    }
    public final boolean n9(){
       return this.Q;
    }
    public final int o9(){
       Object obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "13");
       if (obj == PatchProxyResult.class) {
          obj = this.U.getValue();
       }
       return obj.intValue();
    }
    public final boolean q9(){
       return this.T;
    }
    public final n0 s9(){
       UserProfileLastSeenPresenter obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mPageList");
       }
       return obj;
    }
    public q t9(){
       Object obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.X.getValue();
    }
    public final int u9(){
       Object obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "14");
       if (obj == PatchProxyResult.class) {
          obj = this.V.getValue();
       }
       return obj.intValue();
    }
    public final RecyclerView x9(){
       UserProfileLastSeenPresenter obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       return obj;
    }
    public final UserProfileLastSeenPresenter$mScrollListener$2$a y9(){
       Object obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y.getValue();
    }
}
