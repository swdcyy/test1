package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import android.app.Activity;
import t02.a0;
import cl1.c;
import mk1.x;
import android.view.ViewGroup;
import java.lang.Object;
import crd.a;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e$a;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.LiveGiftBoxWealthGradeBar;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import d61.y;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveUserRightsCenterView;
import android.widget.ProgressBar;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxWealthGradeIncrementProgressBar;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import lnc.a1;
import com.kuaishou.live.widget.ShootMarqueeView;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.f;
import android.widget.FrameLayout;
import cl1.b;
import b11.j;
import b11.a;
import b11.b;
import ok.x;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.d;
import java.lang.Runnable;
import e93.f;
import android.animation.AnimatorSet;
import hm2.a$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import dh1.c;
import dh1.b;
import com.kwai.framework.model.user.QCurrentUser;
import d61.v;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper$UserRightsType;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.c;
import b11.e;
import b11.c;
import erd.g;
import crd.b;
import java.lang.Integer;
import java.lang.Math;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import android.content.res.Resources;
import java.lang.CharSequence;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import nf1.c;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.common.collect.ImmutableCollection;
import android.util.SparseArray;
import b11.j$b;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import b11.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hm2.k;
import zy1.a;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import pp.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;

public class e	// class@000b81
{
    public j A;
    public Activity a;
    public a0 b;
    public x c;
    public c d;
    public final a e;
    public LiveWealthGradeInfo f;
    public final LiveGiftBoxWealthGradeBar g;
    public int h;
    public GiftPanelItem i;
    public View j;
    public TextView k;
    public TextView l;
    public ProgressBar m;
    public LiveGiftBoxWealthGradeIncrementProgressBar n;
    public View o;
    public LiveUserRightsCenterView p;
    public LiveWealthGradeShimmerLayout q;
    public ShootMarqueeView r;
    public TextView s;
    public boolean t;
    public AnimatorSet u;
    public AnimatorSet v;
    public String w;
    public String x;
    public int y;
    public final b z;

    public void e(Activity p0,a0 p1,c p2,x p3,ViewGroup p4){
       super();
       this.e = new a();
       e$a uoa = new e$a(this);
       this.z = uoa;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       LiveGiftBoxWealthGradeBar liveGiftBoxW = new LiveGiftBoxWealthGradeBar(p4.getContext());
       this.g = liveGiftBoxW;
       p4.addView(liveGiftBoxW);
       if (PatchProxy.applyVoidOneRefs(liveGiftBoxW, this, e.class, "6")) {
       }else {
          ViewStub viewStub = liveGiftBoxW.findViewById(R.id.live_gift_box_wealth_grade_container_stub);
          int i = (y.d(this.a))? 0x7f0d0b2d: 0x7f0d0b2c;
          viewStub.setLayoutResource(i);
          viewStub.inflate();
          this.j = liveGiftBoxW.findViewById(0x7f0a2803);
          this.k = liveGiftBoxW.findViewById(0x7f0a281a);
          this.l = liveGiftBoxW.findViewById(0x7f0a2821);
          this.p = liveGiftBoxW.findViewById(0x7f0a1d83);
          this.m = liveGiftBoxW.findViewById(0x7f0a2820);
          this.o = liveGiftBoxW.findViewById(0x7f0a2822);
          this.n = liveGiftBoxW.findViewById(0x7f0a281b);
          this.s = liveGiftBoxW.findViewById(0x7f0a282c);
          LiveWealthGradeShimmerLayout liveWealthGr = liveGiftBoxW.findViewById(R.id.live_wealth_grade_upgrade_container);
          this.q = liveWealthGr;
          liveWealthGr.setRadius(((float)a1.d(R.dimen.arg_RES_7f070a30) / 2.00f));
          this.r = liveGiftBoxW.findViewById(0x7f0a282a);
          a uoa1 = new a(this);
          this.j.setOnClickListener(uoa1);
          this.s.setOnClickListener(uoa1);
          this.p.setOnClickListener(new f(this));
       }
       if (!PatchProxy.applyVoid(null, this, e.class, "9")) {
          this.d.l(uoa);
          this.A = new j(this.l, new a(this), new b(this), this.a);
          this.h("on_controller_init");
          f.k("updateGradeInfo", new d(this), this, 300);
       }
       return;
    }
    public static void a(e p0){
       p0.d();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "19")) {
          return;
       }
       e tu = this.u;
       if (tu != null && tu.isRunning()) {
          this.u.removeAllListeners();
          this.u.cancel();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "20")) {
          return;
       }
       e tv = this.v;
       if (tv != null && tv.isRunning()) {
          this.v.removeAllListeners();
          this.v.cancel();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "21")) {
          return;
       }
       e tb = this.b;
       tb.i2.Y7(tb, this.b.i2.Xa(), tb.Z2.b().getChildFragmentManager(), "LiveWealthGradeDetailFragment");
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       this.e.c(b.b().c(v.f(QCurrentUser.ME.getId(), 0), this.b.Z2.getLiveStreamId(), LiveUserRightsInfoHelper$UserRightsType.WealthGrade.getType()).map(new e()).map(c.b).subscribe(new e(this), new c(this)));
       return;
    }
    public final void f(int p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "14")) {
          return;
       }
       this.n.setMax(p1);
       this.n.setProgress(Math.min(p0, p1));
       return;
    }
    public void g(GiftPanelItem p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "4")) {
          return;
       }
       this.i = p0;
       if (p0 != null) {
          GiftPanelItem mWealthGrade = p0.mWealthGradeScore;
          if (mWealthGrade > 0) {
             this.h = (int)mWealthGrade * this.d.g();
          label_0026 :
             this.h(p1);
             return;
          }
       }
       this.h = 0;
       goto label_0026 ;
    }
    public void h(String p0){
       LiveWealthGradeInfo mCurrentGrad1;
       e a;
       Object obj3;
       int i4;
       int b;
       int i5;
       LiveWealthGradeInfo liveWealthGr = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, liveWealthGr, e.class, "13")) {
          return;
       }
       LiveWealthGradeInfo liveWealthGr1 = liveWealthGr.b.i2.yb();
       liveWealthGr.f = liveWealthGr1;
       int i = 8;
       int i1 = 0;
       if (liveWealthGr1 != null) {
          e uoe = (liveWealthGr.j.getVisibility() == i)? 1: null;
          liveWealthGr.j.setVisibility(i1);
          if (uoe && liveWealthGr.g.isShown()) {
             liveWealthGr.c.a();
          }
          Integer integer = null;
          if (!liveWealthGr1.mCurrentScore - integer) {
             liveWealthGr.s.setVisibility(i1);
             liveWealthGr.k.setVisibility(i);
             liveWealthGr.m.setVisibility(i);
             liveWealthGr.o.setVisibility(i);
             if (y.d(liveWealthGr.a)) {
                liveWealthGr.s.setText(a1.m().getString(R.string.arg_RES_7f102ebf));
             }else {
                liveWealthGr.s.setText(a1.m().getString(R.string.arg_RES_7f102ebe));
             }
          }else {
             liveWealthGr.s.setVisibility(i);
             liveWealthGr.k.setVisibility(i1);
             liveWealthGr.m.setVisibility(i1);
             liveWealthGr.o.setVisibility(i1);
             liveWealthGr.k.setText(c.b(liveWealthGr1.mGradeIconSegment, a1.d(R.dimen.arg_RES_7f070a32)));
             uoe = liveWealthGr.k;
             float f = (liveWealthGr1.mIsGradeLightOff != null)? 0x3f000000: 0x3f800000;
             uoe.setAlpha(f);
             if (liveWealthGr1.mIsGradeLightOff != null) {
                LiveWealthGradeInfo mLightOnTota = liveWealthGr1.mLightOnTotalScore;
                i5 = mLightOnTota - liveWealthGr1.mLightOnGradeScore;
                liveWealthGr.m.setMax(mLightOnTota);
                liveWealthGr.m.setProgress(i5);
                liveWealthGr.f((i5 + liveWealthGr.h), liveWealthGr1.mLightOnTotalScore);
             }else {
                i5 = (int)Math.max((liveWealthGr1.mNextGradeScore - liveWealthGr1.mCurrentGradeStartScore), integer);
                b = (int)Math.max((liveWealthGr1.mCurrentScore - liveWealthGr1.mCurrentGradeStartScore), integer);
                liveWealthGr.m.setMax(i5);
                liveWealthGr.m.setProgress(b);
                liveWealthGr.f((b + liveWealthGr.h), i5);
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(liveWealthGr1, obj, liveWealthGr, e.class, "15")) {
             if (!liveWealthGr1.mCurrentScore - integer) {
                liveWealthGr.l.setVisibility(i);
             }else {
                liveWealthGr.l.setVisibility(i1);
                a = liveWealthGr.A;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(obj, a, j.class, "2")) {
                   Object obj1 = a.c.get();
                   int i2 = a.d.get().intValue();
                   Object obj2 = a.b.get();
                   if (obj2 == null) {
                      b.Z(LiveLogTag.WEALTH_GRADE, "[LiveGiftBoxWealthGradeTipLogic][showGradeTipText]: tipTv is null");
                   }else if(obj1 == null){
                      b.Z(LiveLogTag.WEALTH_GRADE, "[LiveGiftBoxWealthGradeTipLogic][showGradeTipText]: gradeInfo is null");
                   }else {
                      int i3 = a.b(obj1);
                      if (PatchProxy.isSupport(j.class)) {
                         i1 = i3;
                         obj3 = obj2;
                         i4 = i2;
                         Object obj4 = PatchProxy.applyThreeRefs(Integer.valueOf(i3), Integer.valueOf(i2), p0, a, j.class, "5");
                         if (obj4 != PatchProxyResult.class) {
                            b = obj4.booleanValue();
                            i = i4;
                         }else if(!a.f.contains(obj) || i1 == 1){
                            i = i4;
                         }else {
                            i = i4;
                            if (i > 0) {
                               b = true;
                            }
                         }
                         b = false;
                      }else {
                         i1 = i3;
                         obj3 = obj2;
                         i4 = i2;
                         goto label_0192 ;
                      }
                      if (!b) {
                         obj3.setText(a.a.get(i1).a(i, obj1));
                      }else {
                         obj3.setText(a.a.get(2).a(i, obj1));
                         if (!PatchProxy.applyVoid(null, a, j.class, "6")) {
                            a.a();
                            a.e = t.timer(5000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new i(a));
                         }
                      }
                   }
                }
             }
          }
          LiveWealthGradeInfo mCurrentGrad = liveWealthGr1.mCurrentGrade;
          if (!PatchProxy.isSupport(e.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(mCurrentGrad), liveWealthGr, e.class, "22") && liveWealthGr.t == null)) {
             liveWealthGr.t = true;
             ClientContent$LiveStreamPackage liveStreamPa = liveWealthGr.b.Z2.a();
             k ok = k.class;
             if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mCurrentGrad), liveStreamPa, null, ok, "1")) {
                k.f(mCurrentGrad, liveStreamPa, "PRIVILEGE_ENTRANCE", 6);
             }
          }
       }else {
          liveWealthGr.j.setVisibility(i);
       }
    label_0235 :
       a0 h2 = liveWealthGr.b.H2;
       LiveLogTag wEALTH_GRADE = LiveLogTag.WEALTH_GRADE;
       Boolean uBoolean = Boolean.valueOf(a.b());
       i1 = (liveWealthGr1 == null)? 0: liveWealthGr1.mCurrentGrade;
       h2.m(wEALTH_GRADE, "LiveAudienceGiftBoxWealthGradeBarController updateGradeInfoView show gift page", ImmutableMap.of("enableShowWealthGrade", uBoolean, "currentGrade", Integer.valueOf(i1)));
       return;
    }
    public final void i(String p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "12")) {
          return;
       }
       b.d0(LiveLogTag.WEALTH_GRADE, "updateUserRightsInfoView", "shouldRedDotShown", Boolean.valueOf(p1), "mLiveUserRightsCenterView.text ", p0);
       this.p.b(p0);
       this.p.a(p1);
       this.p.setVisibility(0);
       ClientContent$LiveStreamPackage liveStreamPa = this.b.Z2.a();
       e tx = this.x;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tx, null, k.class, "20")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_PANEL_RIGHTS_CENTER";
          i3 oi3 = i3.f();
          oi3.d("button_text", TextUtils.k(tx));
          oi3.d("type", "USER_LEVEL");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.C0("", null, 9, uElementPack, uContentPack);
       }
       return;
    }
}
