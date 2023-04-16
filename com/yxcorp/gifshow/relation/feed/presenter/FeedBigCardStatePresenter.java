package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import android.view.View$OnLongClickListener;
import hka.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$1;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$a;
import vy6.a;
import pac.n;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import brd.t;
import t45.d;
import brd.z;
import pac.k;
import erd.g;
import crd.b;
import java.util.List;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.relation.feed.presenter.g;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import com.kwai.framework.model.user.RecoUser;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.feed.BaseFeed;
import pac.g;
import gac.b;
import java.util.Objects;
import android.view.View;
import qvb.n0;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Boolean;
import hcc.j;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import hcc.j$a;
import le5.f;
import lnc.a1;
import com.yxcorp.gifshow.relation.feed.model.PymkExtParam;
import pac.l;
import pac.h;
import pac.m;
import rd5.a;
import pac.i;
import pac.j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import fac.c;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import java.util.ArrayList;
import java.lang.Math;
import kp.r1;
import com.yxcorp.gifshow.log.c0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.widget.RelativeLayout;
import fac.b;
import java.lang.Integer;
import java.util.Map;
import android.view.ViewParent;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView;
import android.content.Context;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView;
import hcc.a;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.PathInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import a7c.h;
import com.yxcorp.gifshow.pymk.f;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import cw9.c;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import ekd.m1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.utility.n;
import hcc.i;
import e17.i;
import f7c.c;
import io.reactivex.subjects.ReplaySubject;
import bac.f0;
import android.widget.FrameLayout;
import pac.f;
import android.view.View$OnClickListener;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.lang.StringBuilder;
import g7c.e;

public class FeedBigCardStatePresenter extends PresenterV2 implements View$OnLongClickListener, a	// class@00189e
{
    public c A;
    public ReplaySubject B;
    public ViewGroup C;
    public TextView D;
    public PublishSubject E;
    public TextView F;
    public PublishSubject G;
    public PublishSubject H;
    public PublishSubject I;
    public NasaBizParam J;
    public View K;
    public ViewGroup L;
    public BaseCardView M;
    public BaseCardView N;
    public boolean O;
    public KwaiEmptyStateView P;
    public KwaiEmptyStateView Q;
    public KwaiLoadingView R;
    public boolean S;
    public RecoUser T;
    public int U;
    public Animator$AnimatorListener U0;
    public QPhoto V;
    public f0 W;
    public PublishSubject X;
    public final Map Y;
    public final LifecycleObserver Z;
    public SlidePlayViewModel p;
    public PymkRecoBigCardFeed q;
    public SwipeLayout r;
    public c s;
    public TextView t;
    public TextView u;
    public b v;
    public PublishSubject w;
    public c x;
    public h y;
    public BaseFragment z;

    public void FeedBigCardStatePresenter(){
       super();
       this.E = PublishSubject.g();
       this.G = PublishSubject.g();
       this.H = PublishSubject.g();
       this.S = false;
       this.U = 2;
       this.Y = new HashMap();
       this.Z = new FeedBigCardStatePresenter$1(this);
       this.U0 = new FeedBigCardStatePresenter$b(this);
    }
    public void E8(){
       FeedBigCardStatePresenter tv;
       FeedBigCardStatePresenter obj;
       int b;
       Object[] objArray;
       PymkRecoBigCardFeed mRecommendUs1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "3")) {
          return;
       }
       this.p = SlidePlayViewModel.B0(this.z.getParentFragment());
       this.r = w9.c(this.z.requireActivity());
       this.p.P(this.z, new FeedBigCardStatePresenter$a(this));
       if (!PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "16")) {
          this.v.h(new n(this));
          this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new k(this)));
       }
       PymkBigCardUserMeta pymkBigCardU = PatchProxy.apply(null, this, FeedBigCardStatePresenter.class, "34");
       if (pymkBigCardU != patchProxyRe) {
       }else {
          tv = this.q;
          if (tv != null) {
             mRecommendUs1 = tv.mRecommendUserMeta;
             if (mRecommendUs1 != null) {
                pymkBigCardU = mRecommendUs1.mUsers;
                if (pymkBigCardU != null && pymkBigCardU.size() > 0) {
                   String str = e.h(this.q, CommonMeta.class, g.b);
                   if (!TextUtils.x(str)) {
                      Iterator iterator = this.q.mRecommendUserMeta.mUsers.iterator();
                      while (iterator.hasNext()) {
                         RecoUser recoUser = iterator.next();
                         if (!q.f(recoUser.mFeedList)) {
                            Iterator iterator1 = recoUser.mFeedList.iterator();
                            while (iterator1.hasNext()) {
                               e.h(iterator1.next(), CommonMeta.class, new g(str));
                            }
                         }
                      }
                   }
                   pymkBigCardU = this.q.mRecommendUserMeta.mUsers;
                }
             }
          }
          tv = this.q;
          if (tv != null) {
             mRecommendUs1 = tv.mCacheUserList;
             if (mRecommendUs1 != null && mRecommendUs1.size() > 0) {
                mRecommendUs1 = this.q.mCacheUserList;
             }
          }
          pymkBigCardU = null;
       }
       PymkRecoBigCardFeed pymkRecoBigC = PatchProxy.apply(null, this, FeedBigCardStatePresenter.class, "35");
       if (pymkRecoBigC != patchProxyRe) {
       }else {
          obj = this.q;
          if (obj != null) {
             pymkRecoBigC = obj.mCacheUserList;
             if (pymkRecoBigC != null && pymkRecoBigC.size() > 0) {
                pymkRecoBigC = this.q.mCacheUserList;
             }
          }
          objArray = null;
       }
       if (pymkRecoBigC != null && pymkRecoBigC.size() > 0) {
          this.v.t2(pymkRecoBigC);
          tv = this.v;
          pymkRecoBigC = PatchProxy.apply(null, this, FeedBigCardStatePresenter.class, "36");
          if (pymkRecoBigC != patchProxyRe) {
          }else {
             obj = this.q;
             if (obj != null) {
                pymkRecoBigC = obj.mAllShowedUser;
                if (pymkRecoBigC != null && pymkRecoBigC.size() > 0) {
                   pymkRecoBigC = this.q.mAllShowedUser;
                }
             }
             objArray = null;
          }
          Objects.requireNonNull(tv);
          if (pymkRecoBigC != null) {
             tv.H = pymkRecoBigC;
          }
          this.K.setVisibility(0);
          this.l9();
       }else if(pymkBigCardU != null){
          this.v.t2(pymkBigCardU);
          this.K.setVisibility(0);
          this.l9();
       }else if(!this.v.isEmpty()){
          this.K.setVisibility(0);
          this.l9();
       }else if(this.v.hasMore()){
          this.v.load();
       }else {
          this.h9();
       }
       if (!PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "9")) {
          if (this.p.H(this.V)) {
             RelativeLayout$LayoutParams layoutParams = this.t.getLayoutParams();
             obj = PatchProxy.apply(null, this, FeedBigCardStatePresenter.class, "39");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(j.c.j(this.J) || f.r()){
                b = true;
             }else {
                b = false;
             }
             b = (b)? a1.d(R.dimen.arg_RES_7f070271): a1.d(R.dimen.arg_RES_7f070bf1);
             layoutParams.bottomMargin = b;
             this.t.setLayoutParams(layoutParams);
             this.t.setVisibility(0);
             FeedBigCardStatePresenter tq = this.q;
             if (tq != null) {
                PymkRecoBigCardFeed mRecommendUs = tq.mRecommendUserMeta;
                if (mRecommendUs != null) {
                   PymkBigCardUserMeta mPymkExtPara = mRecommendUs.mPymkExtParam;
                   if (mPymkExtPara != null && !TextUtils.x(mPymkExtPara.mSlideText)) {
                      this.t.setText(this.q.mRecommendUserMeta.mPymkExtParam.mSlideText);
                   }
                }
             }
             this.t.setText(R.string.arg_RES_7f101000);
          }else {
             this.t.setVisibility(8);
          }
          this.a9();
       }
       if (!PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "4")) {
          this.X7(this.E.subscribe(new l(this)));
          this.X7(this.H.subscribe(new h(this)));
          this.X7(this.G.subscribe(new m(this)));
       }
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new i(this)));
       this.X7(this.I.subscribe(new j(this)));
       this.z.getLifecycle().addObserver(this.Z);
       this.Z8(this.A.g());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "33")) {
          return;
       }
       FeedBigCardStatePresenter tM = this.M;
       if (tM != null) {
          tM.a();
       }
       tM = this.q;
       if (tM == null) {
          return;
       }else if(tM.mCacheUserList == null){
          tM.mCacheUserList = new ArrayList();
       }
       this.q.mCacheUserList.clear();
       if (!this.v.getItems().size()) {
          tM = this.T;
          if (tM != null && tM.mUser != null) {
             this.q.mCacheUserList.add(tM);
          }
       }else {
          Iterator iterator = this.v.getItems().iterator();
          while (iterator.hasNext()) {
             RecoUser recoUser = iterator.next();
             if (recoUser == null || recoUser.mUser == null) {
                this.v.v2(recoUser);
             }
          }
          this.q.mCacheUserList.addAll(this.v.getItems());
       }
       this.q.mAllShowedUser = new ArrayList();
       this.q.mAllShowedUser.addAll(this.v.H);
       PymkRecoBigCardFeed mRecommendUs = this.q.mRecommendUserMeta;
       if (mRecommendUs != null) {
          PymkBigCardUserMeta mPymkExtPara = mRecommendUs.mPymkExtParam;
          if (mPymkExtPara != null) {
             mPymkExtPara.mPrsid = this.v.m2();
          }
       }
       this.z.getLifecycle().removeObserver(this.Z);
       return;
    }
    public void P8(RecoUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter.class, "7")) {
          return;
       }
       if (p0 != null && !q.f(p0.mFeedList)) {
          int i = 0;
          while (i < Math.min(p0.mFeedList.size(), 3)) {
             BaseFeed uBaseFeed = p0.mFeedList.get(i);
             if (uBaseFeed != null && r1.w0(uBaseFeed) != null) {
                c0.q().k(p0.mFeedList.get(i));
             }
             i = i + 1;
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "8")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.L.getLayoutParams();
       if (layoutParams.topMargin != this.A.a()) {
          layoutParams.topMargin = this.A.a();
          this.L.setLayoutParams(layoutParams);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "40")) {
          return;
       }
       j$a c = j.c;
       if (c.i(this.q, this.z, this.J)) {
          c uoc = c.c(this.z, this.q, this.J);
          if (uoc != null && uoc.g() != this.A.g()) {
             this.A = uoc;
             this.Z8(uoc.g());
             this.R8();
             FeedBigCardStatePresenter tN = this.N;
             if (tN != null) {
                ViewGroup$LayoutParams layoutParams = tN.getLayoutParams();
                layoutParams.width = uoc.g();
                layoutParams.height = uoc.c();
                this.N.setLayoutParams(layoutParams);
                this.N.setParams(this.Y8());
                this.N.requestLayout();
                this.N.c();
             }
          }
       }
       return;
    }
    public final void V8(){
       FriendPymkBigCardView uFriendPymkB1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeedBigCardStatePresenter.class, "18")) {
          return;
       }
       FeedBigCardStatePresenter tN = this.N;
       this.M = tN;
       if (tN != null) {
          tN.a();
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.apply(objArray, this, FeedBigCardStatePresenter.class, "13");
       if (obj != patchProxyRe) {
       }else {
          obj = this.Y.get(Integer.valueOf(this.T.mType));
          BaseCardView uBaseCardVie = PatchProxy.applyOneRefs(obj, this, FeedBigCardStatePresenter.class, "15");
          if (uBaseCardVie != patchProxyRe) {
          }else if(obj == null){
             Iterator iterator = obj.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   BaseCardView uBaseCardVie1 = iterator.next();
                   if (uBaseCardVie1 != null && uBaseCardVie1.getParent() == null) {
                      uBaseCardVie = uBaseCardVie1;
                      break ;
                   }
                }
             }
          }
          uBaseCardVie = objArray;
          if (uBaseCardVie == null) {
             FeedBigCardStatePresenter tT = this.T;
             FriendPymkBigCardView uFriendPymkB = PatchProxy.applyOneRefs(tT, this, FeedBigCardStatePresenter.class, "12");
             if (uFriendPymkB != patchProxyRe) {
             }else if(tT.mType != 1){
                uFriendPymkB1 = new FriendPymkBigCardView(this.getContext(), this.q.mCommonMeta);
             }else {
                uFriendPymkB1 = new ContactBigCardView(this.getContext());
             }
             uFriendPymkB = uFriendPymkB1;
             if (this.Y.size()) {
                uFriendPymkB.setAlpha(0);
             }
             if (obj == null) {
                obj = new ArrayList();
             }
             obj.add(uFriendPymkB);
             this.Y.put(Integer.valueOf(this.T.mType), obj);
             obj = uFriendPymkB;
          }else {
             obj = uBaseCardVie;
          }
       }
       this.N = obj;
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(this.A.g(), this.A.c());
       layoutParams.addRule(14);
       layoutParams.addRule(15);
       this.L.addView(this.N, layoutParams);
       tN = this.N;
       if (!PatchProxy.applyVoidOneRefs(tN, this, FeedBigCardStatePresenter.class, "14")) {
          if (tN instanceof ContactBigCardView) {
             tN.setData(this.T.mContactCard);
             this.m8().setOnLongClickListener(objArray);
          }else if(tN instanceof FriendPymkBigCardView){
             tN.setData(this.T);
             tN.setOnLongClickListener(this);
             this.m8().setOnLongClickListener(this);
          }
       }
       this.N.setParams(this.Y8());
       this.N.c();
       this.N.b(this.D, this.F);
       return;
    }
    public void W8(boolean p0){
       FeedBigCardStatePresenter tM;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       AnimatorSet uAnimatorSet;
       Animator[] uAnimatorArr;
       a uoa = a.class;
       if (PatchProxy.isSupport(FeedBigCardStatePresenter.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FeedBigCardStatePresenter.class, "24")) {
          return;
       }
       if (this.v.getCount() > 0) {
          this.T = this.v.getItem(0);
          this.V8();
          this.P8(this.T);
          int i = 3;
          float f = 0x3f147ae1;
          String str = "alpha";
          float f1 = 0;
          Object[] objArray = null;
          if (p0) {
             if (!PatchProxy.applyVoid(objArray, this, FeedBigCardStatePresenter.class, "30")) {
                tM = this.M;
                if (tM != null && !PatchProxy.applyVoidTwoRefs(tM, objArray, objArray, uoa, "3")) {
                   tM.setAlpha(0x3f800000);
                   tM.setTranslationX(f1);
                   tM.setRotation(f1);
                   objectAnimat = ObjectAnimator.ofFloat(tM, str, new float[2]{0x3f800000,0});
                   objectAnimat.setInterpolator(new LinearInterpolator());
                   objectAnimat1 = ObjectAnimator.ofFloat(tM, "translationX", new float[2]{0,0xc3480000});
                   objectAnimat1.setInterpolator(new PathInterpolator(0x3f70a3d7, 0x3f800000, f, 0x3f800000));
                   ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(tM, "rotation", new float[2]{0,0xc1900000});
                   objectAnimat2.setInterpolator(new PathInterpolator(0x3f70a3d7, 0x3f800000, f, 0x3f800000));
                   uAnimatorSet = new AnimatorSet();
                   uAnimatorArr = new Animator[i];
                   uAnimatorArr[0] = objectAnimat;
                   uAnimatorArr[1] = objectAnimat1;
                   uAnimatorArr[2] = objectAnimat2;
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.setDuration(250);
                   uAnimatorSet.start();
                }
                tM = this.N;
                if (tM != null) {
                   a.a(tM, this.U0, 0);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, this, FeedBigCardStatePresenter.class, "31")){
             tM = this.M;
             if (tM != null && !PatchProxy.applyVoidTwoRefs(tM, objArray, objArray, uoa, "1")) {
                float[] uofloatArray = new float[]{f1};
                objectAnimat = ObjectAnimator.ofFloat(tM, str, uofloatArray);
                objectAnimat.setInterpolator(new LinearInterpolator());
                float[] uofloatArray1 = new float[]{a.a,a.b};
                objectAnimat1 = ObjectAnimator.ofFloat(tM, "scaleX", uofloatArray1);
                objectAnimat1.setInterpolator(new PathInterpolator(0x3f800000, 0x3f70a3d7, f, 0x3f800000));
                float[] uofloatArray2 = new float[]{a.a,a.b};
                objectAnimat1.setInterpolator(new PathInterpolator(0x3f800000, 0x3f70a3d7, f, 0x3f800000));
                uAnimatorSet = new AnimatorSet();
                uAnimatorSet.setDuration(250);
                uAnimatorArr = new Animator[i];
                uAnimatorArr[0] = objectAnimat;
                uAnimatorArr[1] = objectAnimat1;
                uAnimatorArr[2] = ObjectAnimator.ofFloat(tM, "scaleY", uofloatArray2);
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.start();
             }
             tM = this.N;
             if (tM != null) {
                a.a(tM, this.U0, 1);
             }
          }
          this.d9();
       }else if(this.v.hasMore()){
          this.v.load();
          this.S = false;
       }else {
          this.h9();
       }
       return;
    }
    public void X8(boolean p0){
       if (PatchProxy.isSupport(FeedBigCardStatePresenter.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FeedBigCardStatePresenter.class, "32")) {
          return;
       }
       this.F.setClickable(p0);
       this.D.setClickable(p0);
       return;
    }
    public b Y8(){
       b obj = PatchProxy.apply(null, this, FeedBigCardStatePresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.a = this.z;
       obj.e = this.w;
       obj.d = this.A;
       obj.c = this.y.t();
       obj.b = this.v.l2();
       obj.i = this.x;
       obj.g = this.E;
       obj.f = this.H;
       obj.h = this.G;
       obj.j = this.y;
       obj.k = this.p;
       return obj;
    }
    public final void Z8(int p0){
       int i;
       if (PatchProxy.isSupport(FeedBigCardStatePresenter.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FeedBigCardStatePresenter.class, "37")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.C.getLayoutParams();
       layoutParams.width = p0;
       Resources resources = a.b().getResources();
       if (this.A.i()) {
          i = c.b(resources, R.dimen.arg_RES_7f0700c3);
          layoutParams.height = c.b(resources, 0x7f0700bf);
          layoutParams.bottomMargin = c.b(resources, 0x7f0700c1);
       }else {
          i = c.b(resources, R.dimen.arg_RES_7f0700c2);
          layoutParams.height = c.b(resources, 0x7f0700be);
          layoutParams.bottomMargin = c.b(resources, 0x7f0700c0);
       }
       float f = (float)i;
       this.C.findViewById(R.id.change_btn).setTextSize(0, f);
       this.C.findViewById(R.id.follow_btn).setTextSize(0, f);
       this.C.setLayoutParams(layoutParams);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "10")) {
          return;
       }
       PymkRecoBigCardFeed mRecommendUs = this.q.mRecommendUserMeta;
       if (mRecommendUs != null && !TextUtils.x(mRecommendUs.mTitle)) {
          RelativeLayout$LayoutParams layoutParams = this.u.getLayoutParams();
          layoutParams.topMargin = (int)((float)this.A.a() - this.u.getTextSize());
          this.u.setLayoutParams(layoutParams);
          this.u.setText(this.q.mRecommendUserMeta.mTitle);
          this.u.setVisibility(0);
       }else {
          this.u.setVisibility(8);
       }
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "17")) {
          return;
       }
       if (this.S != null) {
          this.S = false;
       }else if(!this.v.hasMore()){
          this.h9();
       }else {
          this.e9();
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "1")) {
          return;
       }
       if (this.v.getCount() > 1) {
          FeedBigCardStatePresenter tT = this.T;
          if (tT != null) {
             RecoUser mUser = tT.mUser;
             if (mUser != null && (mUser.getFollowStatus() == User$FollowStatus.FOLLOWING || this.T.mUser.getFollowStatus() == User$FollowStatus.FOLLOW_REQUESTING)) {
                this.v.v2(this.T);
                this.W8(false);
             }
          }
       }
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "23")) {
          return;
       }
       if (this.v.getCount() <= this.U && this.S == null) {
          this.S = true;
          this.v.load();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter.class, "21")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a2a4a);
       this.u = p0.findViewById(0x7f0a3f76);
       this.D = p0.findViewById(0x7f0a06ab);
       this.K = p0.findViewById(0x7f0a4430);
       this.L = p0.findViewById(0x7f0a0666);
       this.R = p0.findViewById(0x7f0a0433);
       this.P = m1.f(p0, 0x7f0a0d89);
       this.Q = m1.f(p0, 0x7f0a0d35);
       this.C = m1.f(p0, 0x7f0a0483);
       this.F = p0.findViewById(0x7f0a0f4c);
       return;
    }
    public void e9(){
       FeedBigCardStatePresenter tN;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeedBigCardStatePresenter.class, "26")) {
          return;
       }
       if (this.v.getCount() > 0) {
          if (!PatchProxy.applyVoid(objArray, this, FeedBigCardStatePresenter.class, "27")) {
             tN = this.N;
             if (tN != null) {
                tN.setAlpha(0);
                this.L.removeView(this.N);
                this.N = objArray;
             }
          }
          this.T = this.v.getItem(0);
          this.V8();
          tN = this.N;
          if (tN != null) {
             a.a(tN, this.U0, true);
          }
       }
       this.K.setVisibility(0);
       this.R.setVisibility(8);
       if (this.p.H(this.V)) {
          this.t.setVisibility(0);
       }
       return;
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "29")) {
          return;
       }
       int i = 0x7f10420d;
       if (TextUtils.n(this.q.mCustomPageLogName, "FRIEND_PYMK_PAGE")) {
          FeedBigCardStatePresenter tW = this.W;
          if (tW != null && tW.getItemCount() > 0) {
             this.W.M0();
             this.W.k0();
             tW = this.X;
             if (tW != null) {
                tW.onNext(Integer.valueOf(301));
             }
          }
          View[] viewArray = new View[]{this.K,this.C};
          n.Z(8, viewArray);
          View[] viewArray1 = new View[]{this.Q};
          n.Z(0, viewArray1);
          tW = this.Q;
          tW.g(i);
          tW.i(R.drawable.arg_RES_7f0805f6);
          tW.q(3);
          return;
       }else {
          i.e(this.p);
          i.e(R.style.arg_RES_7f11066a, this.n8(i), 0);
          return;
       }
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeedBigCardStatePresenter.class, "2")) {
          return;
       }
       this.J = this.r8("KEY_DETAIL_SOURCE");
       this.v = this.r8("PAGE_LIST");
       this.y = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.w = this.r8("PYMK_ACCESS_IDScurrentUser");
       this.x = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.z = this.r8("FRAGMENT");
       this.A = this.r8("PYMK_ACCESS_IDScard_size");
       this.B = this.r8("PYMK_ACCESS_IDScard_size_change");
       this.q = this.q8(PymkRecoBigCardFeed.class);
       this.V = this.q8(QPhoto.class);
       this.I = this.r8("ON_MULTI_WINDOW_MODE_CHANGED_EVENT");
       Object obj = this.t8("ADAPTER");
       if (obj instanceof f0) {
          objArray = obj;
       }
       this.W = objArray;
       this.X = this.t8("PYMK_ACCESS_IDScard_play");
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "28")) {
          return;
       }
       this.K.setVisibility(8);
       this.P.setVisibility(0);
       this.P.q(3);
       this.P.i(R.drawable.arg_RES_7f0805f5);
       this.P.p(new f(this));
       this.t.setVisibility(8);
       return;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "38")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       d uod = new d(this.getActivity());
       uod.b1(KwaiDialogOption.d);
       uod.L(new FeedBigCardStatePresenter$d(this));
       uod.O(j.a);
       this.s = uod.Y(new FeedBigCardStatePresenter$c(this));
       return;
    }
    public void l9(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter.class, "6")) {
          return;
       }
       this.R8();
       RecoUser item = this.v.getItem(0);
       this.T = item;
       if (item != null) {
          this.V8();
          this.P8(this.T);
       }else {
          e.a("FeedBigCardStatePresenter", "mCurrentRecoUser == null, count"+this.v.getCount());
       }
       this.d9();
       return;
    }
    public boolean onBackPressed(){
       return false;
    }
    public boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, FeedBigCardStatePresenter.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.k9();
       return true;
    }
}
