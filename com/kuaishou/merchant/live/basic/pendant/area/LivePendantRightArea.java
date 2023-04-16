package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import x14.b;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import fq5.b;
import pq5.c;
import com.kwai.video.waynelive.LivePlayerController;
import xp5.g;
import aq5.d;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$b;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$e;
import sp5.b;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$d;
import x14.a;
import java.util.ArrayList;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$c;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$f;
import java.util.HashMap;
import java.lang.Object;
import aq5.a;
import java.util.Arrays;
import aq5.b;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import android.view.View$OnLayoutChangeListener;
import ms3.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import bs3.b;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper;
import android.widget.ViewFlipper;
import com.kuaishou.merchant.live.basic.pendant.PendantContainerView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import lnc.a1;
import java.lang.Math;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import android.widget.LinearLayout;
import com.kuaishou.merchant.api.live.service.pendant.model.PendantArea;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import p74.a;
import o74.a;
import com.kwai.library.widget.popup.common.c;
import java.util.Collection;
import trd.x;
import x14.i;
import java.util.Objects;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import z90.a;
import android.content.SharedPreferences;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationUtils;
import qrd.l1;
import android.view.animation.Animation;
import java.lang.Number;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import x14.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import x14.g;
import x14.h;
import android.animation.Animator$AnimatorListener;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Long;
import ekd.k1;
import java.lang.Runnable;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import x14.c;
import android.widget.ImageView;
import android.view.ViewPropertyAnimator;
import x14.d;
import x14.e;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$a;
import trd.t;
import ms3.c;
import android.view.ViewGroup;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g;
import ot3.m0;
import ekd.m1;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$$special$$inlined$let$lambda$1;
import msd.l;
import android.animation.Animator;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.yxcorp.utility.n;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.QLivePlayConfig;
import tkd.b;
import tkd.d;
import fs5.a;
import trd.t0;
import rq5.a;

public final class LivePendantRightArea extends b	// class@0018ad
{
    public final Activity A;
    public final Context B;
    public final View C;
    public final b D;
    public final c E;
    public final LivePlayerController F;
    public final g G;
    public final d c;
    public final boolean d;
    public final b e;
    public final IMediaPlayer$OnVideoSizeChangedListener f;
    public final b g;
    public boolean h;
    public boolean i;
    public FrameLayout j;
    public PendantContainerView k;
    public final View$OnLayoutChangeListener l;
    public boolean m;
    public final a n;
    public Animator o;
    public final List p;
    public boolean q;
    public final Runnable r;
    public boolean s;
    public View t;
    public MerchantViewFlipper u;
    public HorizontalPageIndicator v;
    public final a w;
    public Map x;
    public a y;
    public final Object z;

    public void LivePendantRightArea(Activity p0,Context p1,View p2,b p3,c p4,LivePlayerController p5,g p6){
       super();
       this.A = p0;
       this.B = p1;
       this.C = p2;
       this.D = p3;
       this.E = p4;
       this.F = p5;
       this.G = p6;
       d uod = p3.A0();
       this.c = uod;
       this.d = p3.e();
       LivePendantRightArea$b uob = new LivePendantRightArea$b(this);
       this.e = uob;
       LivePendantRightArea$e uoe = new LivePendantRightArea$e(this);
       this.f = uoe;
       this.g = new b();
       this.h = true;
       this.i = true;
       LivePendantRightArea$d uod1 = new LivePendantRightArea$d(this);
       this.l = uod1;
       this.n = new a();
       this.p = new ArrayList();
       this.r = new LivePendantRightArea$c(this);
       this.w = new LivePendantRightArea$f(this);
       this.x = new HashMap();
       this.z = new Object();
       if (uod != null) {
          a[] uoaArray = this.t();
          uod.u5(uob, Arrays.copyOf(uoaArray, uoaArray.length));
       }
       if (p5 != null) {
          p5.addOnVideoSizeChangedListener(uoe);
       }
       this.h = this.w() ^ true;
       View view = p4.Th();
       if (view != null) {
          view.addOnLayoutChangeListener(uod1);
       }
       return;
    }
    public final boolean A(b p0,int p1){
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       if (PatchProxy.isSupport(livePendantR)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, livePendantR, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((p1 & 0x08) > 0 && (!TextUtils.x(p0.z0()) && (this.m == null && this.d == null)))? true: false;
       return b;
    }
    public final void B(boolean p0,String p1){
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       if (PatchProxy.isSupport(livePendantR) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, livePendantR, "22")) {
          return;
       }
       String str = "reason";
       if (p0) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, livePendantR, "20")) {
             this.f("move all pendants to slide container", s0.k(r0.a(str, p1)));
             this.p();
             if (this.b().size()) {
                this.z(true);
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = this.b().iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(this.r(iterator.next()));
                }
                LivePendantRightArea tu = this.u;
                if (tu != null) {
                   tu.b(uArrayList);
                   if (!tu.isFlipping()) {
                      tu.startFlipping();
                   }
                }
                this.h = false;
             }
          }
       }else if(PatchProxy.applyVoidOneRefs(p1, this, livePendantR, "21")){
          this.f("move all pendants to right container", s0.k(r0.a(str, p1)));
          this.q();
          if (this.b().size()) {
             this.o();
             this.C();
             LivePendantRightArea tk = this.k;
             if (tk != null) {
                tk.setLayoutAnimated(false);
             }
             Iterator iterator1 = this.b().iterator();
             while (iterator1.hasNext()) {
                b uob = iterator1.next();
                uob.H().setVisibility(false);
                LivePendantRightArea tk1 = this.k;
                if (tk1 != null) {
                   PendantContainerView.k(tk1, uob.H(), 0, 0, 0, 14, null);
                }
             }
             this.h = true;
          }
       }
       return;
    }
    public final void C(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "15")) {
          return;
       }
       LivePendantRightArea tk = this.k;
       if (tk != null) {
          tk.getLayoutParams().height = -2;
          tk.setMaxHeight(Math.min(this.u(), a1.d(R.dimen.arg_RES_7f0702bf)));
       }
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "23")) {
          return;
       }
       LivePendantRightArea tv = this.v;
       if (tv != null) {
          if (this.b().size() > 0) {
             tv.setItemCount(this.b().size());
          }
          tv.setVisibility(8);
       }
       return;
    }
    public PendantArea a(){
       return PendantArea.AREA_RIGHT;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "11")) {
          return;
       }
       a.s(LiveBasicLogBiz.PENDANT_NEW, "LivePendantRightArea", "hide top right pendants container");
       this.i = false;
       this.x();
       LivePendantRightArea ty = this.y;
       if (ty != null) {
          ty.o();
       }
       return;
    }
    public void d(List p0){
       int b1;
       boolean b2;
       int i2;
       Animator uAnimator = this;
       Iterator obj = p0;
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(obj, uAnimator, livePendantR, str)) {
          return;
       }
       int i = 1;
       if (this.b().isEmpty() ^ i) {
          this.h();
       }
       this.b().addAll(obj);
       x.m0(this.b());
       boolean b = this.w();
       LivePendantRightArea h = uAnimator.h;
       if ((b ^ 0x01) != h) {
          uAnimator.B(b, "insertBatchPendants");
          return;
       }else {
          String str1 = "pendants";
          if (h != null) {
             this.o();
             LivePendantRightArea k = uAnimator.k;
             if (k != null) {
                k.setLayoutAnimated(false);
                this.C();
                uAnimator.f("right container add batch pendants", s0.k(r0.a(str1, Integer.valueOf(p0.size()))));
                obj = this.b().iterator();
                while (obj.hasNext()) {
                   b uob = obj.next();
                   View view = uob.H();
                   PendantContainerView.k(k, view, 0, uAnimator.s(uob.getWidth()), uAnimator.s(uob.getHeight()), 2, null);
                }
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, uAnimator, livePendantR, "32")) {
                   i obj1 = PatchProxy.apply(objArray, uAnimator, livePendantR, "31");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else if(this.b().size() > 4 && uAnimator.d == null){
                      obj1 = i.a;
                      a b3 = uAnimator.n.b;
                      Objects.requireNonNull(obj1);
                      i oi = i.class;
                      if (PatchProxy.isSupport(oi)) {
                         String obj4 = PatchProxy.applyOneRefs(Integer.valueOf(b3), obj1, oi, "3");
                         if (obj4 != patchProxyRe) {
                            b2 = obj4.booleanValue();
                         }else {
                         label_00e4 :
                            obj4 = DateUtils.j(System.currentTimeMillis(), objArray);
                            String str2 = a.a.getString("merchant_pendant_expand_animation_count", "");
                            if (!TextUtils.x(str2)) {
                               String[] stringArray = new String[]{"_"};
                               List list = StringsKt__StringsKt.H4(str2, stringArray, false, 0, 6, null);
                               if (list.size() > i) {
                                  int i3 = Integer.parseInt(list.get(i));
                                  if (TextUtils.n(list.get(false), obj4) && i3 >= b3) {
                                     a.u(LiveBasicLogBiz.PENDANT_NEW, "PendantAnimUtil", "can not show expand anim", "todayCount", Integer.valueOf(i3), "limit", Integer.valueOf(b3));
                                     b2 = false;
                                  }else {
                                     a.a(obj4+'_'+(i3 + i));
                                  label_016e :
                                     b2 = true;
                                  }
                               }
                            }
                            a.a(obj4+"_1");
                            goto label_016e ;
                         }
                      }else {
                         goto label_00e4 ;
                      }
                      if (b2) {
                         b2 = true;
                      }
                   }
                label_0173 :
                   b2 = false;
                   if (b2) {
                      uAnimator.f("show expand anim", objArray);
                      k = uAnimator.k;
                      if (k != null) {
                         long l = 100;
                         Iterator iterator = this.b().iterator();
                         while (iterator.hasNext()) {
                            ScaleAnimation scaleAnimati = v15;
                            ScaleAnimation scaleAnimati1 = v15;
                            scaleAnimati = new ScaleAnimation(0, 0x3f800000, 0, 0x3f800000, 1, 0x3f000000, 1, 0x3f000000);
                            scaleAnimati1.setDuration(300);
                            long l1 = AnimationUtils.currentAnimationTimeMillis() + l;
                            scaleAnimati1.setStartTime(l1);
                            iterator.next().H().setAnimation(scaleAnimati1);
                            l = l + (long)120;
                            i = 1;
                         }
                         i = this.u();
                         AnimatorSet obj2 = PatchProxy.apply(objArray, uAnimator, livePendantR, "13");
                         if (obj2 != patchProxyRe) {
                            b1 = obj2.intValue();
                         }else {
                            Objects.requireNonNull(PendantContainerView.i);
                            int i1 = (PendantContainerView.h * 2) * this.b().size();
                            Iterator iterator1 = this.b().iterator();
                            while (iterator1.hasNext()) {
                               b uob1 = iterator1.next();
                               View obj3 = PatchProxy.applyOneRefs(uob1, uAnimator, b.class, str);
                               if (obj3 != patchProxyRe) {
                                  i2 = obj3.intValue();
                               }else {
                                  obj3 = uob1.H();
                                  int measuredHeig = obj3.getMeasuredHeight();
                                  if (measuredHeig <= 0) {
                                     i2 = a1.e((float)uob1.getHeight());
                                     if (i2 <= 0) {
                                        obj3.measure(false, false);
                                        i2 = obj3.getMeasuredHeight();
                                     }
                                  }else {
                                     i2 = measuredHeig;
                                  }
                               }
                               i1 = i1 + i2;
                            }
                            b1 = i1;
                         }
                         b1 = Math.min(i, b1);
                         obj2 = new AnimatorSet();
                         ValueAnimator valueAnimato = new ValueAnimator();
                         valueAnimato.setDuration(((long)this.b().size() * 160));
                         int[] ointArray = new int[]{false,b1};
                         valueAnimato.setIntValues(ointArray);
                         valueAnimato.addUpdateListener(new f(k, b1, uAnimator));
                         ValueAnimator valueAnimato1 = new ValueAnimator();
                         valueAnimato1.setDuration(600);
                         valueAnimato1.setStartDelay(1000);
                         int[] ointArray1 = new int[]{b1,a1.d(0x7f0702bf)};
                         valueAnimato1.setIntValues(ointArray1);
                         valueAnimato1.addUpdateListener(new g(k, b1, uAnimator));
                         obj2.addListener(new h(k, b1, uAnimator));
                         ValueAnimator[] valueAnimato2 = new ValueAnimator[]{valueAnimato,valueAnimato1};
                         obj2.playSequentially(CollectionsKt__CollectionsKt.L(valueAnimato2));
                         obj2.start();
                         uAnimator.o = obj2;
                      }
                   }
                }
             }
          }else {
             uAnimator.z(true);
             this.D();
             ArrayList uArrayList = new ArrayList();
             Iterator iterator2 = p0.iterator();
             while (iterator2.hasNext()) {
                b uob2 = iterator2.next();
                b uob3 = uAnimator.r(uob2);
                uAnimator.x.put(uob2, uob3);
                uArrayList.add(uob3);
             }
             LivePendantRightArea u = uAnimator.u;
             if (u != null) {
                uAnimator.f("slide container add batch pendants", s0.k(r0.a(str1, Integer.valueOf(p0.size()))));
                u.b(uArrayList);
                if (!u.isFlipping()) {
                   u.startFlipping();
                }
             }
          }
          b1 = true;
          uAnimator.y(b1);
          return;
       }
    }
    public void e(b p0,int p1){
       boolean b;
       float f;
       Object obj = this;
       Object obj1 = p0;
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       String str = "1";
       if (PatchProxy.isSupport(livePendantR) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, livePendantR, str)) {
          return;
       }
       FrameLayout$LayoutParams obj2 = PatchProxy.applyOneRefs(obj1, obj, b.class, str);
       b = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): obj.a.contains(obj1);
       if (b) {
          return;
       }else {
          str = "pendantId";
          if (this.A(p0, p1)) {
             if (obj.q == null) {
                obj.f("insert animated pendant before batch", s0.k(r0.a(str, Long.valueOf(p0.u1()))));
                k1.n(this);
                obj.r.run();
             }
          }else if(obj.q == null){
             obj.p.add(obj1);
             k1.n(this);
             if ((p1 & 0x04) > 0) {
                obj.r.run();
             }else {
                k1.s(obj.r, obj, 500);
             }
             return;
          }
          this.b().add(obj1);
          x.m0(this.b());
          b = this.w();
          LivePendantRightArea h = obj.h;
          if ((b ^ 0x01) != h) {
             obj.B(b, "insertPendant");
             return;
          }else {
             boolean b1 = true;
             if (h != null) {
                this.o();
                this.C();
                if (this.A(p0, p1)) {
                   if (!PatchProxy.applyVoidOneRefs(obj1, obj, livePendantR, "34")) {
                      obj.f("show insert anim", s0.k(r0.a(str, Long.valueOf(p0.u1()))));
                      livePendantR = obj.j;
                      if (livePendantR != null) {
                         int i = this.b().indexOf(obj1);
                         View view = p0.H();
                         MerchantKwaiImageView merchantKwai = new MerchantKwaiImageView(obj.B);
                         merchantKwai.L(p0.z0());
                         int i1 = a1.d(R.dimen.arg_RES_7f070254);
                         int i2 = a1.d(R.dimen.pv);
                         obj2 = new FrameLayout$LayoutParams(i1, i1);
                         obj2.gravity = 0x800015;
                         obj2.setMarginEnd(i2);
                         livePendantR.addView(merchantKwai, obj2);
                         LivePendantRightArea k = obj.k;
                         if (k != null) {
                            k.setLayoutAnimated(b1);
                            k.j(view, i, obj.s(p0.getWidth()), obj.s(p0.getHeight()));
                            c uoc = h;
                            c uoc1 = h;
                            uoc = new c(k, view, i, this, p0);
                            k1.s(uoc1, k, 0);
                            f = 0;
                            view.setAlpha(f);
                         }else {
                            f = 0;
                         }
                         merchantKwai.setTranslationX((float)(i2 + i1));
                         merchantKwai.setPivotX(f);
                         merchantKwai.setPivotY(f);
                         merchantKwai.animate().translationX(f).setDuration(600).withStartAction(new d(obj, obj1)).withEndAction(new e(merchantKwai, view, obj, obj1)).start();
                      }
                   }
                }else {
                   livePendantR = obj.k;
                   if (livePendantR != null) {
                      livePendantR.setLayoutAnimated((obj.d ^ 1));
                      obj.f("right container add pendant", s0.k(r0.a(str, Long.valueOf(p0.u1()))));
                      livePendantR.j(p0.H(), this.b().indexOf(obj1), obj.s(p0.getWidth()), obj.s(p0.getHeight()));
                      k1.s(new LivePendantRightArea$a(livePendantR, obj, obj1), livePendantR, 0);
                   }
                }
             }else {
                obj.z(true);
                this.D();
                b uob = this.r(p0);
                obj.x.put(obj1, uob);
                LivePendantRightArea u = obj.u;
                if (u != null) {
                   obj.f("slide container add pendant", s0.k(r0.a(str, Long.valueOf(p0.u1()))));
                   u.b(t.k(uob));
                   if (!u.isFlipping()) {
                      u.startFlipping();
                   }
                }
             }
             obj.y(true);
             return;
          }
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "9")) {
          return;
       }
       this.p.clear();
       k1.n(this);
       k1.n(this.z);
       LivePendantRightArea ty = this.y;
       if (ty != null) {
          ty.o();
       }
       this.y = null;
       View view = this.E.Th();
       if (view != null) {
          view.removeOnLayoutChangeListener(this.l);
       }
       ty = this.c;
       if (ty != null) {
          a[] uoaArray = this.t();
          ty.G5(this.e, Arrays.copyOf(uoaArray, uoaArray.length));
       }
       ty = this.F;
       if (ty != null) {
          ty.removeOnVideoSizeChangedListener(this.f);
       }
       this.h();
       this.k = null;
       this.j = null;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "4")) {
          return;
       }
       this.f("remove all pendants", s0.k(r0.a("pendantSize", Integer.valueOf(this.b().size()))));
       this.b().clear();
       this.y(false);
       this.p();
       this.q();
       return;
    }
    public void i(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePendantRightArea.class, "3")) {
          return;
       }
       if (this.q == null) {
          this.f("remove pending pendant before insert", s0.k(r0.a("pendant", Long.valueOf(p0.u1()))));
          this.p.remove(p0);
          return;
       }else {
          this.b().remove(p0);
          if (!this.b().size()) {
             this.h();
             return;
          }else {
             boolean b = this.w();
             LivePendantRightArea th = this.h;
             if ((b ^ 0x01) != th) {
                this.B(b, "removePendant");
                return;
             }else if(th != null){
                LivePendantRightArea tk = this.k;
                if (tk != null) {
                   tk.setLayoutAnimated(false);
                   View view = p0.H();
                   if (!PatchProxy.applyVoidOneRefs(view, tk, PendantContainerView.class, "7")) {
                      tk.l().removeView(view);
                   }
                }
             }else {
                b uob = this.x.get(p0);
                if (uob != null) {
                   LivePendantRightArea tu = this.u;
                   if (tu != null) {
                      tu.d(uob);
                   }
                   this.D();
                }
                this.x.remove(p0);
             }
             return;
          }
       }
    }
    public void j(String p0,Runnable p1){
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, livePendantR, "6")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (TextUtils.n(String.valueOf(uob.u1()), p0)) {
             if (PatchProxy.applyVoidTwoRefs(uob, p1, this, livePendantR, "5") || this.m != null) {
                break ;
             }else {
                LivePendantRightArea tk = this.k;
                if (tk != null) {
                   tk.m(uob.H(), p1);
                   break ;
                }else {
                   break ;
                }
             }
          }
       }
       return;
    }
    public void k(b p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePendantRightArea.class, "5")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       LivePendantRightArea tk = this.k;
       if (tk != null) {
          tk.m(p0.H(), p1);
       }
       return;
    }
    public void l(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePendantRightArea.class, "8")) {
          return;
       }
       LivePendantRightArea tn = this.n;
       Objects.requireNonNull(tn);
       tn.a = p0.a;
       tn.b = p0.b;
       return;
    }
    public void m(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePendantRightArea.class, "7")) {
          return;
       }
       k1.n(this.z);
       LivePendantRightArea tA = this.A;
       if (tA != null && (this.h != null && this.C instanceof ViewGroup)) {
          Iterator iterator = this.b().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (TextUtils.n(String.valueOf(obj.u1()), p0.a())) {
                LivePendantRightArea ty = this.y;
                if (ty != null) {
                   ty.o();
                }
                ty = this.k;
                if (ty != null) {
                   View view = obj.H();
                   ty.m(view, null);
                   LivePendantRightArea$g og = new LivePendantRightArea$g(view, obj, tA, this, p0);
                   k1.s(ty, this.z, 400);
                   break ;
                }
             }
          }
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "10")) {
          return;
       }
       a.s(LiveBasicLogBiz.PENDANT_NEW, "LivePendantRightArea", "show top right pendants container");
       this.i = true;
       this.x();
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "16")) {
          return;
       }
       if (this.j != null) {
          this.x();
       }else {
          FrameLayout uFrameLayout = m0.b(this.C, R.id.live_merchant_right_pendant_container_stub, 0x7f0d0c9c, R.id.live_merchant_right_pendant_container);
          this.j = uFrameLayout;
          if (uFrameLayout != null) {
             PendantContainerView pendantConta = m1.f(uFrameLayout, R.id.pendant_right_container);
             this.k = pendantConta;
             if (pendantConta != null) {
                pendantConta.setMTouchListener(new LivePendantRightArea$$special$$inlined$let$lambda$1(this));
             }
          }
          this.x();
          boolean b = (this.j != null)? true: false;
          this.f("init right container", s0.k(r0.a("isSucceed", Boolean.valueOf(b))));
       }
       return;
    }
    public final void p(){
       View view;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePendantRightArea.class, "18")) {
          return;
       }
       LivePendantRightArea tk = this.k;
       if (tk != null) {
          boolean b = false;
          tk.setLayoutAnimated(b);
          int pendantCount = tk.getPendantCount();
          while (b < pendantCount) {
             if (PatchProxy.isSupport(PendantContainerView.class)) {
                view = PatchProxy.applyOneRefs(Integer.valueOf(b), tk, PendantContainerView.class, "10");
                if (view != PatchProxyResult.class) {
                label_003d :
                   if (view != null) {
                      view.clearAnimation();
                   }
                   b = b + 1;
                }
             }
             view = tk.l().getChildAt(b);
             goto label_003d ;
          }
          if (!PatchProxy.applyVoid(objArray, tk, PendantContainerView.class, "8")) {
             tk.l().removeAllViews();
          }
       }
       tk = this.o;
       if (tk != null) {
          tk.removeAllListeners();
          tk.cancel();
       }
       this.o = objArray;
       tk = this.j;
       if (tk != null) {
          tk.setVisibility(8);
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "19")) {
          return;
       }
       this.x.clear();
       LivePendantRightArea tu = this.u;
       if (tu != null) {
          tu.stopFlipping();
          int childCount = tu.getChildCount();
          int i = 0;
          while (i < childCount) {
             View childAt = tu.getChildAt(i);
             if (childAt != null) {
                childAt.clearAnimation();
             }
             i = i + 1;
          }
          tu.removeAllViews();
       }
       this.D();
       this.z(false);
       return;
    }
    public final b r(b p0){
       b obj = PatchProxy.applyOneRefs(p0, this, LivePendantRightArea.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.d = p0.H();
       obj.b = p0.getWidth();
       obj.c = p0.getHeight();
       obj.f = p0.getPriority();
       return obj;
    }
    public final int s(int p0){
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       if (PatchProxy.isSupport(livePendantR)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, livePendantR, "35");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return a1.e((float)p0);
    }
    public final a[] t(){
       a[] uoaArray;
       int i = 7;
       int i1 = 6;
       int i2 = 5;
       int i3 = 4;
       int i4 = 3;
       int i5 = 2;
       int i6 = 1;
       int i7 = 0;
       if (this.d != null) {
          uoaArray = new a[i];
          uoaArray[i7] = AnchorBizRelation.VOICE_PARTY;
          uoaArray[i6] = AnchorBizRelation.VOICE_PARTY_KTV;
          uoaArray[i5] = AnchorBizRelation.PK;
          uoaArray[i4] = AnchorBizRelation.LIVE_LINE;
          uoaArray[i3] = AnchorBizRelation.LIVE_MULTI_LINE;
          uoaArray[i2] = AnchorBizRelation.LIVE_MULTI_PK;
          uoaArray[i1] = AnchorBizRelation.CHAT_CENTER_VIEW;
       }else {
          uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_KTV,AudienceBizRelation.PK,AudienceBizRelation.LIVE_LINE,AudienceBizRelation.LIVE_MULTI_LINE,AudienceBizRelation.LIVE_MULTI_PK,AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW};
       }
       return uoaArray;
    }
    public final int u(){
       int i1;
       int[] obj = PatchProxy.apply(null, this, LivePendantRightArea.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = Integer.MAX_VALUE;
       LivePendantRightArea tk = this.k;
       if (tk != null) {
          int i = n.p(tk)[1];
          View view = this.E.Th();
          if (view != null) {
             i1 = (n.p(view)[1] - i) - a1.d(0x7f07034b);
          }
       }
       return i1;
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, LivePendantRightArea.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       boolean b1 = (this.D.B0() == StreamType.GAME_LIVE.toInt())? true: false;
       LiveStreamFeedWrapper liveStreamFe = this.D.r5();
       if (liveStreamFe != null) {
          QLivePlayConfig livePlayConf = liveStreamFe.getLivePlayConfig();
          if (livePlayConf != null) {
             if (!d.a(-1397441499).R40(livePlayConf, this.D.d()) && !b1) {
                b = false;
             }
             return b;
          }
       }
       return b1;
    }
    public final boolean w(){
       boolean b;
       boolean b1;
       int b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       Object[] objArray = null;
       LivePendantRightArea obj = PatchProxy.apply(objArray, this, livePendantR, "26");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, this, livePendantR, "27");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.c;
          if (obj != null) {
             a[] uoaArray = this.t();
             int len = uoaArray.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (obj.r2(uoaArray[i1])) {
                      b = true;
                   }else {
                      i1 = i1 + 1;
                   }
                }
             }
          }
          b = false;
       }
       LivePendantRightArea obj1 = PatchProxy.apply(objArray, this, livePendantR, "28");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          obj1 = this.F;
          if (obj1 != null) {
             b1 = (obj1.getVideoWidth() > 0 && (obj1.getVideoHeight() > 0 && obj1.getVideoWidth() > obj1.getVideoHeight()))? true: false;
          }else {
             b1 = d.a(-1397441499).E(this.A);
          }
       }
       Pair[] obj2 = PatchProxy.apply(objArray, this, livePendantR, "29");
       if (obj2 != patchProxyRe) {
          b2 = obj2.booleanValue();
       }else {
          b2 = this.D.B0();
          b2 = (this.v() || b2 == StreamType.VOICEPARTY.toInt())? true: false;
       }
       obj2 = new Pair[]{r0.a("hasCompatibleBiz", Boolean.valueOf(b)),r0.a("isVideoViewLandscape", Boolean.valueOf(b1)),r0.a("isGameOrChatLive", Boolean.valueOf(b2))};
       this.f("check container status", t0.W(obj2));
       if (b || (!b1 && !b2)) {
          i = false;
       }
       return i;
    }
    public final void x(){
       LivePendantRightArea tj;
       if (PatchProxy.applyVoid(null, this, LivePendantRightArea.class, "12")) {
          return;
       }
       if (this.i != null) {
          tj = this.j;
          if (tj != null) {
             tj.setVisibility(0);
          }
       }else {
          tj = this.j;
          if (tj != null) {
             tj.setVisibility(4);
          }
       }
       return;
    }
    public final void y(boolean p0){
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       if (PatchProxy.isSupport(livePendantR) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, livePendantR, "25")) {
          return;
       }
       livePendantR = this.c;
       if (livePendantR != null) {
          AnchorBizRelation mERCHANT_NEW = (this.d != null)? AnchorBizRelation.MERCHANT_NEW_PENDANT: AudienceBizRelation.MERCHANT_NEW_PENDANT;
          if (p0 && !livePendantR.r2(mERCHANT_NEW)) {
             livePendantR.Pj(mERCHANT_NEW);
          }else if(!p0 && livePendantR.r2(mERCHANT_NEW)){
             livePendantR.yj(mERCHANT_NEW);
          }
       }
    label_0039 :
       return;
    }
    public final void z(boolean p0){
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       if (PatchProxy.isSupport(livePendantR) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, livePendantR, "17")) {
          return;
       }
       if (p0 && this.s == null) {
          if (this.d != null) {
             this.E.eo(this.w);
          }else {
             this.E.gj(this.w);
          }
          this.s = true;
       }else if(!p0 && this.s != null){
          if (this.d != null) {
             this.E.g9(this.w);
          }else {
             this.E.Jg(this.w);
          }
          this.s = false;
       }
       return;
    }
}
