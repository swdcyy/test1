package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import oha.c;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$b;
import nsd.u;
import android.view.ViewStub;
import android.view.View;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$mEnableNearbyDanmuFrameVertical$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import crd.b;
import lnc.b9;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$s;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$t;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.Log;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import nga.l;
import nga.k;
import lnc.o5;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$f;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$g;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$h;
import erd.a;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$i;
import java.lang.Float;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$c;
import java.util.Collection;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView;
import com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$j;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$k;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$l;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$m;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$n;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$o;
import java.util.Objects;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.animation.ValueAnimator;
import oha.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import oha.j;
import android.animation.Animator$AnimatorListener;
import oha.k;
import android.animation.AnimatorSet;
import android.animation.Animator;
import oha.h;
import kotlin.jvm.internal.Ref$BooleanRef;
import oha.g;
import java.lang.Number;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$c;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$p;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$d;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$d;
import java.lang.Integer;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$q;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$r;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oha.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$u;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$v;
import android.view.View$OnLongClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$w;
import android.view.ViewOutlineProvider;

public final class LiveCoverAnnexHelper implements c	// class@0010e1
{
    public KwaiImageView A;
    public KwaiImageView B;
    public KwaiImageView C;
    public KwaiImageView D;
    public TextView E;
    public CommonMeta F;
    public int G;
    public boolean H;
    public b I;
    public final p J;
    public final p K;
    public final ViewStub L;
    public View M;
    public CardStyle N;
    public SimpleDanmakuView a;
    public LiveCoverAnnexHelper$c b;
    public QPhoto c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public b h;
    public float i;
    public long j;
    public int k;
    public String l;
    public long m;
    public boolean n;
    public boolean o;
    public int p;
    public LiveCoverAnnexHelper$d q;
    public LiveCoverAnnexHelper$a r;
    public boolean s;
    public boolean t;
    public b u;
    public int v;
    public List w;
    public View x;
    public TextView y;
    public TextView z;
    public static final LiveCoverAnnexHelper$b O;

    static {
       LiveCoverAnnexHelper.O = new LiveCoverAnnexHelper$b(null);
    }
    public void LiveCoverAnnexHelper(ViewStub p0,View p1,CardStyle p2){
       a.p(p0, "mDanmakuViewStub");
       a.p(p1, "mCommodityLabelContainer");
       a.p(p2, "cardStyle");
       super();
       this.L = p0;
       this.M = p1;
       this.N = p2;
       this.v = -1;
       this.w = new ArrayList();
       this.J = s.c(new LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2(this));
       this.K = s.c(new LiveCoverAnnexHelper$mEnableNearbyDanmuFrameVertical$2(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "27")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("LiveCoverAnnexHelper"), "startShowCoverAnnex");
       b9.a(this.h);
       this.h = this.e().observeOn(d.a).subscribe(new LiveCoverAnnexHelper$s(this), LiveCoverAnnexHelper$t.b);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCoverAnnexHelper.class, "30")) {
          return;
       }
       b9.a(this.h);
       b9.a(this.I);
       LiveCoverAnnexHelper tc = this.c;
       if (tc != null) {
          objArray = tc.getPhotoId();
       }
       Log.b("LiveCoverAnnex", a.C(objArray, ": pauseShowCoverAnnex resetRepeatRequestStatus"));
       this.k();
       this.o();
       tc = this.F;
       if (tc != null) {
          tc.mTransientCommodityType = "";
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "32")) {
          return;
       }
       this.u();
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCoverAnnexHelper.class, "31")) {
          return;
       }
       b9.a(this.h);
       LiveCoverAnnexHelper tc = this.c;
       if (tc != null) {
          objArray = tc.getPhotoId();
       }
       Log.b("LiveCoverAnnex", a.C(objArray, ": stopShowCoverAnnex resetRepeatRequestStatus"));
       this.t();
       this.u();
       this.o();
       this.m();
       return;
    }
    public t e(){
       Object[] objArray = null;
       LiveCoverAnnexHelper obj = PatchProxy.apply(objArray, this, LiveCoverAnnexHelper.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.n = true;
       l ol = k.b();
       obj = this.c;
       String str = (obj != null)? obj.getLiveStreamId(): objArray;
       obj = this.c;
       if (obj != null) {
          objArray = obj.getUserId();
       }
       t ot = ol.b(str, o5.c(objArray), 200, this.l, this.f, this.g, CardStyle.getStyleTypeByCardStyle(this.N), this.s).doOnSubscribe(new LiveCoverAnnexHelper$f(this)).map(new e()).doOnNext(new LiveCoverAnnexHelper$g(this)).doFinally(new LiveCoverAnnexHelper$h(this)).doOnError(new LiveCoverAnnexHelper$i(this));
       a.o(ot, "HomeLiveApiService.get\(\)¡­rror { mLoading = false }");
       return ot;
    }
    public void f(boolean p0){
       this.H = p0;
    }
    public void g(){
       LiveCoverAnnexHelper liveCoverAnn = LiveCoverAnnexHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveCoverAnn, "29")) {
          return;
       }
       if (Float.compare(this.i, 0x3fe38e39) > 0) {
          return;
       }
       if (this.a != null) {
          LiveCoverAnnexHelper tb = this.b;
          List list = (tb != null)? tb.g(): objArray;
          tb = (list == null || list.isEmpty())? 1: null;
          if (!tb) {
             tb = this.F;
             if (tb == null || tb.mTransientShowedCommodity != true) {
                this.o = true;
                liveCoverAnn = this.a;
                if (liveCoverAnn != null) {
                   liveCoverAnn.e();
                }
                return;
             }
          }
       }
    label_0047 :
       if (!PatchProxy.applyVoid(objArray, this, liveCoverAnn, "27")) {
          c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("LiveCoverAnnexHelper"), "startShowCoverAnnex");
          b9.a(this.h);
          this.h = this.e().observeOn(d.a).subscribe(new LiveCoverAnnexHelper$s(this), LiveCoverAnnexHelper$t.b);
       }
       return;
    }
    public final void h(LiveCoverAnnexResponse p0){
       LiveCoverAnnexHelper liveCoverAnn2;
       LiveCoverAnnexHelper liveCoverAnn = LiveCoverAnnexHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveCoverAnn, "28")) {
          return;
       }
       KsLogFollowTag fOLLOW_STAGG = KsLogFollowTag.FOLLOW_STAGGER;
       String str = "LiveCoverAnnexHelper";
       fOLLOW_STAGG.appendTag(str);
       c.i(fOLLOW_STAGG, "dispatchShowCoverAnnex");
       if (q.f(p0.mLiveCoverAnnex)) {
          fOLLOW_STAGG.appendTag(str);
          c.i(fOLLOW_STAGG, "response is empty");
          this.v = -1;
          this.s();
          LiveCoverAnnexHelper tF = this.F;
          if (tF == null || tF.mTransientShowedCommodity != 1) {
             this.p();
          }
          return;
       }else {
          Iterator iterator = p0.mLiveCoverAnnex.iterator();
          boolean b = false;
          while (iterator.hasNext()) {
             LiveCoverAnnex liveCoverAnn1 = iterator.next();
             LiveCoverAnnex mType = liveCoverAnn1.mType;
             TimeUnit timeUnit = 0x3f800000;
             if (mType != 1) {
                if (mType != 3) {
                   if (mType != 5) {
                      continue ;
                   }else if(this.i - timeUnit < 0){
                      liveCoverAnn2 = 1;
                   }else {
                      liveCoverAnn2 = null;
                   }
                   if (liveCoverAnn2) {
                      if (this.H != null) {
                         this.H = b;
                         this.I = t.timer(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new LiveCoverAnnexHelper$e(this, liveCoverAnn1));
                      }else {
                         a.o(liveCoverAnn1, "liveCoverAnnex");
                         this.q(this.o, liveCoverAnn1);
                      }
                      this.l("startLoopRequest");
                   }
                }else {
                   liveCoverAnn1 = liveCoverAnn1.mLiveInfos;
                   if (liveCoverAnn1 != null) {
                      this.r(CollectionsKt___CollectionsKt.J5(liveCoverAnn1));
                   }
                }
             }else {
                Object obj = PatchProxy.apply(null, this, liveCoverAnn, "36");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(CardStyle.isV4Bottom(this.N.mBottomType)){
                   if (this.e != null && this.i - timeUnit < 0) {
                      b = true;
                   }
                }else {
                   b = this.e;
                }
                if (b != null) {
                   liveCoverAnn1 = liveCoverAnn1.mComments;
                   if (liveCoverAnn1 != null) {
                      this.r(CollectionsKt___CollectionsKt.J5(liveCoverAnn1));
                   }
                }
             }
          }
          this.H = b;
          return;
       }
    }
    public final boolean i(){
       Object obj = PatchProxy.apply(null, this, LiveCoverAnnexHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.J.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, LiveCoverAnnexHelper.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.K.getValue();
       }
       return obj.booleanValue();
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "23")) {
          return;
       }
       LiveCoverAnnexHelper ta = this.a;
       if (ta != null) {
          ta.d();
          this.o = false;
       }
       return;
    }
    public final void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper.class, "15")) {
          return;
       }
       LiveCoverAnnexHelper tF = this.F;
       boolean b = true;
       if (tF != null) {
          tF.mTransientShowedCommodity = b;
       }
       if (this.t != null) {
          return;
       }else {
          this.t = b;
          c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("LiveCoverAnnexHelper"), p0+" requestCoverAnnexInterval");
          b9.a(this.u);
          if (!this.j) {
             this.j = 5000;
          }
          this.u = t.interval(this.j, this.j, TimeUnit.MILLISECONDS).flatMap(new LiveCoverAnnexHelper$j(this)).observeOn(d.a).subscribe(new LiveCoverAnnexHelper$k(this), new LiveCoverAnnexHelper$l(this));
          return;
       }
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "4")) {
          return;
       }
       this.d = true;
       this.o = false;
       this.p = 0;
       this.G = 0;
       this.l = null;
       LiveCoverAnnexHelper tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "19")) {
          return;
       }
       LiveCoverAnnexHelper ta = this.a;
       if (ta != null) {
          ta.setVisibility(8);
          ta.setAlpha(0x3f800000);
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "16")) {
          return;
       }
       b9.a(this.u);
       this.t = false;
       return;
    }
    public final void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCoverAnnexHelper.class, "22")) {
          return;
       }
       String str = "LiveCoverAnnex";
       Log.b(str, "retryWhenEmpty");
       LiveCoverAnnexHelper tp = this.p;
       if (tp >= this.k) {
          this.o();
          this.s();
          tp = this.c;
          if (tp != null) {
             objArray = tp.getPhotoId();
          }
          Log.b(str, a.C(objArray, ": retryWhenEmpty resetRepeatRequestStatus"));
          LiveCoverAnnexHelper ta = this.a;
          if (ta != null) {
             ta.setAutoStop(true);
          }
          return;
       }else {
          this.p = tp + true;
          this.n = true;
          b9.a(this.h);
          this.h = t.timer(this.j, TimeUnit.MILLISECONDS).flatMap(new LiveCoverAnnexHelper$m(this)).observeOn(d.a).subscribe(new LiveCoverAnnexHelper$n(this), new LiveCoverAnnexHelper$o(this));
          return;
       }
    }
    public final void q(boolean p0,LiveCoverAnnex p1){
       ValueAnimator valueAnimato;
       View view;
       LiveCoverAnnexHelper liveCoverAnn = LiveCoverAnnexHelper.class;
       if (PatchProxy.isSupport(liveCoverAnn) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, liveCoverAnn, "7")) {
          return;
       }
       KsLogFollowTag fOLLOW_STAGG = KsLogFollowTag.FOLLOW_STAGGER;
       String str = "LiveCoverAnnexHelper";
       fOLLOW_STAGG.appendTag(str);
       c.i(fOLLOW_STAGG, "setCommodityInfo");
       int i = 1;
       if (this.M instanceof ViewStub && !PatchProxy.applyVoid(null, this, liveCoverAnn, "12")) {
          LiveCoverAnnexHelper tM = this.M;
          Objects.requireNonNull(tM, "null cannot be cast to non-null type android.view.ViewStub");
          tM.setLayoutResource(R.layout.arg_RES_7f0d01f3);
          tM = this.M;
          Objects.requireNonNull(tM, "null cannot be cast to non-null type android.view.ViewStub");
          view = tM.inflate();
          a.o(view, "\(mCommodityLabelContainer as ViewStub\).inflate\(\)");
          this.M = view;
          view.setAlpha(0);
          this.z = m1.f(this.M, 0x7f0a08c1);
          this.D = m1.f(this.M, 0x7f0a08bf);
          this.E = m1.f(this.M, 0x7f0a08c8);
          this.x = m1.f(this.M, 0x7f0a00b3);
          this.y = m1.f(this.M, 0x7f0a08c2);
          this.A = m1.f(this.M, 0x7f0a00b0);
          this.B = m1.f(this.M, 0x7f0a00b1);
          KwaiImageView kwaiImageVie = m1.f(this.M, R.id.action_user_avatar3);
          this.C = kwaiImageVie;
          KwaiImageView[] kwaiImageVie1 = new KwaiImageView[]{this.A,this.B,kwaiImageVie};
          this.w = CollectionsKt__CollectionsKt.P(kwaiImageVie1);
       }
       this.M.setVisibility(0);
       if (p0) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, liveCoverAnn, "11")) {
             fOLLOW_STAGG.appendTag(str);
             c.i(fOLLOW_STAGG, "startDanmakuViewHideAndShowLabelAnimation");
             this.v(p1);
             valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             valueAnimato.setDuration(400);
             valueAnimato.addUpdateListener(new i(this));
             valueAnimato.addListener(new j(this));
             ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             valueAnimato1.setDuration(400);
             valueAnimato1.addUpdateListener(new k(this));
             AnimatorSet uAnimatorSet = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
             uAnimatorSet.playSequentially(uAnimatorArr);
             uAnimatorSet.start();
          }
       }else {
          LiveCoverAnnexHelper tv = this.v;
          if (tv == -1) {
             if (!PatchProxy.applyVoidOneRefs(p1, this, liveCoverAnn, "9")) {
                fOLLOW_STAGG.appendTag(str);
                c.i(fOLLOW_STAGG, "startCommodityLabelShowAnimation");
                if (this.M.getVisibility() == 8) {
                   this.M.setVisibility(0);
                }
                this.v(p1);
                valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato.setDuration(400);
                valueAnimato.addUpdateListener(new h(this));
                valueAnimato.start();
             }
          }else if(p1.mCardType == tv){
             this.v(p1);
          }else if(PatchProxy.applyVoidOneRefs(p1, this, liveCoverAnn, "8")){
             fOLLOW_STAGG.appendTag(str);
             c.i(fOLLOW_STAGG, "startCommodityLabelChangeShowAnimation");
             if (this.M.getVisibility() == 8) {
                this.M.setVisibility(0);
             }
             valueAnimato = ValueAnimator.ofFloat(new float[3]{0x3f800000,0,0x3f800000});
             Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
             uBooleanRef.element = false;
             valueAnimato.setDuration(800);
             valueAnimato.addUpdateListener(new g(uBooleanRef, this, p1));
             valueAnimato.start();
          }
       }
       this.v = p1.mCardType;
       return;
    }
    public final void r(List p0){
       View view;
       String obj;
       ViewGroup$LayoutParams layoutParams;
       LiveCoverAnnexHelper ta1;
       Object[] objArray1;
       LiveCoverAnnexHelper ta2;
       int b;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveCoverAnnexHelper liveCoverAnn = LiveCoverAnnexHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveCoverAnn, "5")) {
          return;
       }
       LiveCoverAnnexHelper ta = this.a;
       int i = 0;
       if (ta != null) {
          ta.setVisibility(i);
       }
       String str = "LiveCoverAnnex";
       if (q.f(p0)) {
          Log.b(str, "show danmu view but is empty");
          return;
       }else {
          Log.b(str, "show danmu view");
          Object[] objArray = null;
          if (this.a == null) {
             view = this.L.inflate();
             Objects.requireNonNull(view, "null cannot be cast to non-null type com.kwai.component.feedstaggercard.widget.SimpleDanmakuView");
             this.a = view;
             obj = PatchProxy.apply(objArray, this, liveCoverAnn, "24");
             int i1 = (obj != patchProxyRe)? obj.intValue(): a1.e(12.00f);
             view.setSpan(i1);
             ta = this.a;
             if (ta != null) {
                ta.setAnimationDuration(2800);
             }
             ta = this.a;
             if (ta != null) {
                ta.setLoopPlay(i);
             }
          }
          obj = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
          if (CardStyle.isV4Bottom(this.N.mBottomType)) {
             ta = this.a;
             layoutParams = (ta != null)? ta.getLayoutParams(): objArray;
             Objects.requireNonNull(layoutParams, obj);
             layoutParams.bottomMargin = a1.d(0x7f07061e);
          }
          int i2 = 0x7f07105e;
          if (CardStyle.isV5Bottom(this.N.mBottomType)) {
             ta = this.a;
             layoutParams = (ta != null)? ta.getLayoutParams(): objArray;
             Objects.requireNonNull(layoutParams, obj);
             layoutParams.bottomMargin = a1.d(i2);
          }
          if (this.j()) {
             ta = this.a;
             layoutParams = (ta != null)? ta.getLayoutParams(): objArray;
             Objects.requireNonNull(layoutParams, obj);
             layoutParams.bottomMargin = a1.d(i2);
          }
          if (this.v != -1) {
             this.v = -1;
             this.s();
          }
          if (this.d != null) {
             this.d = i;
             this.o = true;
             this.b = new LiveCoverAnnexHelper$c(this, p0);
             if (this.i()) {
                ta1 = this.a;
                if (ta1 != null) {
                   ta1.setFrameVertical(true);
                }
                ta1 = this.a;
                if (ta1 != null) {
                   ta1.setAnimationDuration(4500);
                }
                ta1 = this.a;
                ViewGroup$LayoutParams layoutParams1 = (ta1 != null)? ta1.getLayoutParams(): objArray;
                if (layoutParams1 != null) {
                   layoutParams1.height = a1.d(0x7f071064);
                }
                liveCoverAnn = this.a;
                if (liveCoverAnn != null) {
                   liveCoverAnn.setLayoutParams(layoutParams1);
                }
                ta1 = this.a;
                if (ta1 != null) {
                   ta1.setSpan(a1.d(R.dimen.arg_RES_7f071063));
                }
                ta1 = this.a;
                layoutParams1 = (ta1 != null)? ta1.getLayoutParams(): objArray;
                Objects.requireNonNull(layoutParams1, obj);
                layoutParams1.leftMargin = a1.d(0x7f071061);
                ta1 = this.a;
                if (ta1 != null) {
                   objArray = ta1.getLayoutParams();
                }
                Objects.requireNonNull(objArray, obj);
                objArray.rightMargin = a1.d(0x7f071062);
             }
             ta1 = this.a;
             if (ta1 != null) {
                ta1.setAdapter(this.b);
             }
             ta1 = this.a;
             if (ta1 != null) {
                ta1.setAutoStop(i);
             }
             ta1 = this.a;
             if (ta1 != null) {
                ta1.setOnItemShowListener(new LiveCoverAnnexHelper$p(this));
             }
             ta1 = this.q;
             if (ta1 != null) {
                ta1.a(this.c, p0.size());
             }
          }else if(!q.f(p0)){
             ta = this.F;
             if (ta != null && ta.mTransientShowedCommodity == true) {
                ta = this.b;
                Integer integer = (ta != null)? Integer.valueOf(ta.c()): objArray;
                if (integer == null) {
                   return;
                }else {
                   ta = this.b;
                   integer = (ta != null)? Integer.valueOf(ta.c()): objArray;
                   a.m(integer);
                   if (integer.intValue() <= 500) {
                      ta1 = this.b;
                      if (ta1 != null) {
                         ta1.f(p0);
                      }
                   }else {
                      Object obj1 = PatchProxy.apply(objArray, this, liveCoverAnn, "6");
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else {
                         ta1 = this.b;
                         b = (ta1 != null)? ta1.c(): Integer.MAX_VALUE;
                         if ((b - this.G) <= 0) {
                            i = 1;
                         }
                         b = i;
                      }
                      if (b) {
                         ta1 = this.b;
                         if (ta1 != null) {
                            ta1.b();
                         }
                         ta1 = this.b;
                         if (ta1 != null) {
                            ta1.f(p0);
                         }
                         ta2 = this.a;
                         if (ta2 != null) {
                            ta2.h = -1;
                         }
                      }
                   }
                }
             }else {
             label_01f1 :
                ta1 = this.b;
                if (ta1 != null) {
                   ta1.f(p0);
                }
             }
          }else {
             goto label_01f1 ;
          }
          ta2 = this.a;
          if (ta2 != null && !ta2.getChildCount()) {
             if (this.o == null) {
                ta2 = this.F;
                if (ta2 == null || ta2.mTransientShowedCommodity != true) {
                label_0217 :
                   return;
                }
             }
             this.o = true;
             ta2 = this.a;
             if (ta2 != null) {
                ta2.e();
                goto label_0217 ;
             }else {
                goto label_0217 ;
             }
          }else {
             goto label_0217 ;
          }
       }
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "10")) {
          return;
       }
       Log.b("LiveCoverAnnexHelper", "startCommodityLabelHidAnimation: ÉÌÆ·¿¨½¥Òþ¶¯»­");
       LiveCoverAnnexHelper tF = this.F;
       if (tF != null) {
          tF.mTransientCommodityType = "";
       }
       if (this.M.getVisibility() == 8) {
          return;
       }else {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
          valueAnimato.setDuration(400);
          valueAnimato.addUpdateListener(new LiveCoverAnnexHelper$q(this));
          valueAnimato.addListener(new LiveCoverAnnexHelper$r(this));
          valueAnimato.start();
          return;
       }
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "35")) {
          return;
       }
       LiveCoverAnnexHelper ta = this.a;
       if (ta != null) {
          ta.g();
       }
       this.o = false;
       this.d = true;
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper.class, "18")) {
          return;
       }
       b9.a(this.I);
       LiveCoverAnnexHelper tF = this.F;
       if (tF != null) {
          tF.mTransientCommodityType = "";
       }
       this.v = -1;
       this.M.setAlpha(0);
       this.M.setVisibility(8);
       return;
    }
    public final void v(LiveCoverAnnex p0){
       LiveCoverAnnexHelper liveCoverAnn = LiveCoverAnnexHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveCoverAnn, "13")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("LiveCoverAnnexHelper"), "updateCommodityCard");
       String str = PatchProxy.applyOneRefs(p0, this, liveCoverAnn, "14");
       if (str != PatchProxyResult.class) {
       }else {
          str = p0.mExtraInfo.get("logInfo");
          if (TextUtils.x(str)) {
             str = "";
          }else {
             a.m(str);
          }
       }
       LiveCoverAnnexHelper tF = this.F;
       KwaiImageView obj = null;
       CommonMeta mTransientCo = (tF != null)? tF.mTransientCommodityType: obj;
       if (!TextUtils.n(mTransientCo, str)) {
          tF = this.c;
          if (!PatchProxy.applyVoidTwoRefs(str, tF, obj, t.class, "7")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$PhotoPackage photoPackage = w1.f(tF.mEntity);
             uContentPack.photoPackage = photoPackage;
             photoPackage.identity = r1.t1(tF.getEntity());
             uContentPack.photoPackage.expTag = r1.M0(tF.getEntity());
             ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             liveStreamPa.liveStreamId = r1.n1(tF.getEntity());
             uContentPack.liveStreamPackage.serverExpTag = r1.I1(tF.getEntity());
             uContentPack.liveStreamPackage.anchorUserId = r1.U1(tF.getEntity());
             i3 oi3 = i3.f();
             oi3.d("merchant_card_type", str);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_COVER_CARD";
             uElementPack.params = TextUtils.k(oi3.e());
             u1.B0(new ShowMetaData().setType(6).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(tF.getFeedLogCtx()));
          }
          tF = this.F;
          if (tF != null) {
             tF.mTransientCommodityType = str;
          }
       }
       this.M.setOnClickListener(new LiveCoverAnnexHelper$u(this, p0));
       this.M.setOnLongClickListener(new LiveCoverAnnexHelper$v(this));
       liveCoverAnn = this.y;
       if (liveCoverAnn != null) {
          liveCoverAnn.setText(p0.mTitle);
       }
       liveCoverAnn = this.z;
       if (liveCoverAnn != null) {
          liveCoverAnn.setText(p0.mAction);
       }
       LiveCoverAnnex mCardType = p0.mCardType;
       int i = 0x7f061d77;
       boolean b = true;
       if (mCardType != b && mCardType != 2) {
          if (mCardType == 3) {
             liveCoverAnn = this.x;
             if (liveCoverAnn != null) {
                liveCoverAnn.setVisibility(0);
             }
             liveCoverAnn = this.D;
             if (liveCoverAnn != null) {
                liveCoverAnn.setVisibility(8);
             }
             liveCoverAnn = this.E;
             if (liveCoverAnn != null) {
                liveCoverAnn.setVisibility(8);
             }
             liveCoverAnn = this.z;
             if (liveCoverAnn != null) {
                liveCoverAnn.setTextColor(a1.a(i));
             }
             int i1 = this.w.size();
             i = 0;
             while (i < i1) {
                if (!q.f(p0.mIconUrls) && i < p0.mIconUrls.size()) {
                   obj = this.w.get(i);
                   if (obj != null) {
                      obj.U(p0.mIconUrls.get(i));
                   }
                   obj = this.w.get(i);
                   if (obj != null) {
                      obj.setVisibility(0);
                   }
                }else {
                   obj = this.w.get(i);
                   if (obj != null) {
                      obj.setVisibility(8);
                   }
                }
                i = i + 1;
             }
          }
       }else {
          liveCoverAnn = this.x;
          if (liveCoverAnn != null) {
             liveCoverAnn.setVisibility(8);
          }
          liveCoverAnn = this.D;
          if (liveCoverAnn != null) {
             liveCoverAnn.setVisibility(0);
          }
          if (p0.mActionType == null) {
             liveCoverAnn = this.z;
             if (liveCoverAnn != null) {
                liveCoverAnn.setTextColor(a1.a(i));
             }
          }else {
             liveCoverAnn = this.z;
             if (liveCoverAnn != null) {
                liveCoverAnn.setTextColor(a1.a(R.color.arg_RES_7f061de2));
             }
          }
          if (p0.mActionType == b) {
             liveCoverAnn = this.E;
             if (liveCoverAnn != null) {
                liveCoverAnn.setVisibility(0);
             }
          }else {
             liveCoverAnn = this.E;
             if (liveCoverAnn != null) {
                liveCoverAnn.setVisibility(8);
             }
          }
          if (!q.f(p0.mIconUrls)) {
             liveCoverAnn = this.D;
             if (liveCoverAnn != null) {
                liveCoverAnn.setClipToOutline(b);
             }
             liveCoverAnn = this.D;
             if (liveCoverAnn != null) {
                liveCoverAnn.setOutlineProvider(new LiveCoverAnnexHelper$w());
             }
             liveCoverAnn = this.D;
             if (liveCoverAnn != null) {
                liveCoverAnn.U(p0.mIconUrls.get(0));
             }
          }
       }
       return;
    }
}
