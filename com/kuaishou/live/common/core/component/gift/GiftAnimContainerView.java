package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$m;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$c;
import java.util.ArrayList;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import com.kuaishou.live.common.core.component.gift.d;
import android.widget.RelativeLayout;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$b;
import java.util.Objects;
import android.os.SystemClock;
import com.kuaishou.live.common.core.component.gift.a;
import android.view.View;
import android.widget.ImageView;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.gift.b;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.component.gift.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import android.animation.Animator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.animation.OvershootInterpolator;
import com.kuaishou.live.basic.model.QLiveMessage;
import va1.a0;
import java.lang.Integer;
import java.lang.System;
import android.widget.TextView;
import android.animation.AnimatorSet;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$h;
import java.lang.Math;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c$a;
import kotlin.jvm.internal.a;
import java.lang.Number;
import android.util.SparseArray;
import java.util.List;
import java.util.Arrays;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$a;
import java.lang.Long;
import wj1.c;
import com.kuaishou.live.common.core.component.gift.DrawingGiftDisplayView;
import android.animation.ValueAnimator;
import ug1.a;
import android.animation.AnimatorSet$Builder;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$e;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$f;
import java.util.Iterator;
import yb6.d;
import com.kuaishou.live.core.show.gift.DrawingGift;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.yxcorp.gifshow.models.GiftActionType;
import java.util.Set;
import java.util.Collection;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$d;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.view.ViewGroup;
import android.os.Handler;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import qrd.p;
import ug1.t0;
import k51.b;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$n;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView$c;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$o;
import wj1.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import a2.i0;
import lnc.a1;
import java.lang.Float;
import x43.c;
import ug1.b;

public class GiftAnimContainerView extends LinearLayout	// class@001128
{
    public int A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float K;
    public final Runnable L;
    public SCLiveGiftTitleChangeInfo b;
    public List c;
    public c d;
    public GiftAnimContainerView$n e;
    public GiftAnimContainerView$n f;
    public GiftAnimContainerView$o g;
    public c h;
    public GiftAnimItemView i;
    public GiftAnimItemView j;
    public DrawingGiftDisplayView k;
    public GiftAnimItemView l;
    public int m;
    public int n;
    public boolean o;
    public final GiftAnimContainerView$m p;
    public final HashMap q;
    public boolean r;
    public boolean s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public void GiftAnimContainerView(Context p0){
       super(p0, null);
    }
    public void GiftAnimContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GiftAnimContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new SCLiveGiftTitleChangeInfo();
       this.m = 3;
       this.n = 1;
       this.o = false;
       this.p = new GiftAnimContainerView$m(this);
       this.q = new HashMap(2);
       this.r = false;
       this.s = false;
       this.E = -1;
       this.F = -1;
       this.G = true;
       this.H = false;
       this.K = 0x3f800000;
       this.L = new GiftAnimContainerView$c(this);
       this.setOrientation(1);
       this.setClipChildren(false);
       this.c = new ArrayList();
    }
    public static int n(GiftMessage p0){
       if (p0 != null) {
          p0 = p0.mDisplayDuration;
          if (p0 > null) {
             return p0;
          }
       }
       return 3000;
    }
    public void a(boolean p0,boolean p1){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, GiftAnimContainerView.class, "7")) {
          return;
       }
       this.I = p0;
       this.J = p1;
       this.s();
       return;
    }
    public void b(GiftAnimContainerView$l p0,GiftAnimItemView p1,GiftAnimContainerView$j p2){
       GiftAnimContainerView$k this;
       d a;
       ObjectAnimator objectAnimat;
       float f;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GiftAnimContainerView.class, "45")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       boolean b = (!(p0.a.mComboCount % 10))? true: false;
       GiftAnimContainerView$k ok = this.m(p1);
       this = ok.d;
       if (this == null) {
          ok.d = super(p1);
          GiftMessage giftMessage = (p1.getGiftMessage() == null)? null: p1.getGiftMessage().mMergeKey;
          if (giftMessage != null) {
             GiftAnimContainerView$k e = ok.e;
             if (e != null && e.equals(giftMessage)) {
                ok.d.a();
             }
          }
          ok.e = giftMessage;
       }else {
          this.a();
       }
       ok = ok.d;
       p1.clearAnimation();
       GiftAnimContainerView$b giftMessage1 = new GiftAnimContainerView$b(this, p1, ok, p2);
       Objects.requireNonNull(ok);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), giftMessage1, ok, uod, "1")) {
          a uoa = new a(ok, SystemClock.elapsedRealtime(), giftMessage1);
          int i2 = 0x3f800000;
          if (!PatchProxy.isSupport(uod) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), uoa, ok, uod, "5") && ok.c == null)) {
             if (!PatchProxy.applyVoid(null, ok, uod, "7") && ok.i == null) {
                ok.a.setVisibility(8);
             }
             if (!PatchProxy.applyVoidOneRefs(uoa, ok, uod, "6")) {
                ok.b.setAlpha(i2);
                ok.b.setTranslationX(0);
                float[] uofloatArray1 = new float[]{0xbf800000 * f,f * 0x3f99999a};
                f = (float)ok.b.getWidth();
                objectAnimat = ObjectAnimator.ofFloat(ok.b, View.TRANSLATION_X, uofloatArray1);
                ok.c = objectAnimat;
                objectAnimat.setDuration(1100);
                ok.c.setInterpolator(new LinearInterpolator());
                ok.c.addListener(new b(ok, uoa));
                ok.c.addUpdateListener(new c(ok));
                j.g(ok.c, LiveDegradeBiz.GiftSlot);
             }
          }
       label_010b :
          if (!PatchProxy.applyVoid(null, ok, uod, "3") && ok.g != null) {
             if (!PatchProxy.applyVoid(null, ok, uod, "4")) {
                ok.a.setVisibility(8);
                a = ok.d;
                if (a != null) {
                   a.removeAllListeners();
                   ok.d.cancel();
                   ok.d = null;
                }
                a = ok.e;
                if (a != null) {
                   a.removeAllListeners();
                   ok.e.cancel();
                   ok.e = null;
                }
                a = ok.f;
                if (a != null) {
                   a.removeAllListeners();
                   ok.f.cancel();
                   ok.f = null;
                }
             }
             ok.a.setVisibility(i1);
             if (ok.a.getAlpha() - i2 < 0) {
                a = ok.a;
                float[] uofloatArray = new float[]{a.getAlpha(),i2};
                objectAnimat = j.a(a, uofloatArray);
                ok.d = objectAnimat;
                objectAnimat.setDuration((long)((i2 - ok.a.getAlpha()) * 91.00f));
                ok.d.setInterpolator(new LinearInterpolator());
                j.g(ok.d, LiveDegradeBiz.GiftSlot);
             }
             objectAnimat = ObjectAnimator.ofFloat(ok.a, "scaleX", new float[2]{0x3fd9999a,0x3f800000});
             ok.e = objectAnimat;
             objectAnimat.setDuration(371);
             ok.e.setInterpolator(new OvershootInterpolator());
             LiveDegradeBiz giftSlot = LiveDegradeBiz.GiftSlot;
             j.g(ok.e, giftSlot);
             objectAnimat = ObjectAnimator.ofFloat(ok.a, "scaleY", new float[2]{0x3fd9999a,0x3f800000});
             ok.f = objectAnimat;
             objectAnimat.setDuration(371);
             ok.f.setInterpolator(new OvershootInterpolator());
             j.g(ok.f, giftSlot);
          }
       }
    label_01da :
       return;
    }
    public void c(GiftAnimItemView p0,GiftAnimContainerView$l p1,GiftAnimContainerView$j p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GiftAnimContainerView.class, "39")) {
          return;
       }
       this.m(p0).b(p1);
       this.m(p0).d();
       p0.r();
       if (this.h(p1)) {
          p0.b(p1.a, true);
          this.b(p1, p0, p2);
       }else if(!a0.g(p1.a)){
          GiftAnimContainerView$l a = p1.a;
          GiftMessage mComboCount = a.mComboCount;
          a.mComboCount = p1.b;
          p0.b(a, true);
          p1.a.mComboCount = mComboCount;
          this.e(p0, p1, p2);
       }else {
          p0.b(p1.a, true);
          this.d(p0, p1.a, p1.c, p2);
       }
       return;
    }
    public void d(GiftAnimItemView p0,GiftMessage p1,int p2,GiftAnimContainerView$j p3){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, GiftAnimContainerView.class, "40")) {
          return;
       }
       long l = System.currentTimeMillis() - this.t;
       this.t = System.currentTimeMillis();
       GiftAnimContainerView$k ok = this.m(p0);
       int i = 0;
       p0.h.setVisibility(i);
       p0.s(p1, p2);
       p0 = p0.h;
       p0.clearAnimation();
       GiftAnimContainerView$k c = ok.c;
       if (c != null) {
          c.removeAllListeners();
          ok.c.cancel();
       }
       long l1 = 400;
       if (l - l1 < 0) {
          i = true;
       }
       AnimatorSet uAnimatorSet = this.l(p0, i, l1);
       uAnimatorSet.addListener(new GiftAnimContainerView$g(this, p3, ok, uAnimatorSet));
       b.d0(LiveLogTag.GIFT, "ComboAnimState animateComboInternal", "animation", uAnimatorSet, "callback", p3);
       j.g(uAnimatorSet, LiveDegradeBiz.GiftSlot);
       ok.c = uAnimatorSet;
       return;
    }
    public void e(GiftAnimItemView p0,GiftAnimContainerView$l p1,GiftAnimContainerView$j p2){
       int this;
       GiftAnimItemView giftAnimItem1;
       int i4;
       int i5;
       int i6;
       AnimatorSet uAnimatorSet2;
       GiftAnimItemView giftAnimItem3;
       LiveLogTag obj1;
       GiftAnimContainerView giftAnimCont = this;
       GiftAnimItemView giftAnimItem = p0;
       GiftAnimContainerView$l ol = p1;
       GiftAnimContainerView$j oj = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GiftAnimContainerView.class, "42")) {
          return;
       }
       GiftAnimContainerView$k ok = this.m(p0);
       int i = 0;
       giftAnimItem.h.setVisibility(i);
       boolean i1 = 400;
       int i2 = 200;
       GiftAnimContainerView$l c = ol.c;
       GiftAnimContainerView$l b = ol.b;
       this = c - b;
       GiftMessage mDisplayDura = ol.a.mDisplayDuration;
       GiftAnimItemView h = giftAnimItem.h;
       p0.e();
       GiftAnimContainerView$k c1 = ok.c;
       if (c1 != null) {
          c1.removeAllListeners();
          ok.c.cancel();
       }
       String str = 1;
       if (this <= str) {
          AnimatorSet uAnimatorSet = giftAnimCont.l(h, i, (long)i1);
          giftAnimItem.s(ol.a, c);
          if (uAnimatorSet != null) {
             uAnimatorSet.addListener(new GiftAnimContainerView$h(giftAnimCont, ok, uAnimatorSet, oj));
             j.g(uAnimatorSet, LiveDegradeBiz.GiftSlot);
             ok.c = uAnimatorSet;
          }else if(oj != null){
             p2.a();
          }
          giftAnimItem1 = h;
          this = 0;
          mDisplayDura = 0;
       }else if(((float)this / ((float)mDisplayDura / 1000.00f)) - 0x40a00000 >= 0){
          i4 = mDisplayDura / i2;
          i1 = 200;
       }else {
          i4 = mDisplayDura / i1;
       }
       if (giftAnimCont.H != null) {
          giftAnimItem1 = h;
          i4 = (int)Math.min((double)i4, Math.ceil((double)(0x43fa0000 / (float)i1)));
       }else {
          giftAnimItem1 = h;
       }
       if (this < i4) {
          i4 = this;
       }
       this = this / i4;
       i2 = i1;
       int i3 = (mDisplayDura > 0)? mDisplayDura: 1;
       int[] ointArray = new int[i3];
       for (i4 = 0; i4 < i3; i4 = i4 + 1) {
          i5 = i3 - 1;
          if (i4 != i5) {
             i5 = i4 + 1;
             i5 = i5 * this;
             i5 = i5 + b;
          }else {
             GiftAnimContainerView$l ol1 = c;
          }
          ointArray[i4] = i5;
       }
       if (giftAnimCont.H != null) {
          String c$a b1 = c.b;
          Objects.requireNonNull(b1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          c$a uoa = c$a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyThreeRefs(ointArray, Integer.valueOf(b), Integer.valueOf(c), b1, c$a.class, "5");
             if (obj != patchProxyRe) {
                ointArray = obj;
             }
          }
          a.p(ointArray, "comboArray");
          if (i3 > str) {
             int i9 = -1;
             if (PatchProxy.isSupport(uoa)) {
                obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(b), Integer.valueOf(c), b1, uoa, "4");
                if (obj1 != patchProxyRe) {
                   i9 = obj1.intValue();
                }else {
                label_010a :
                   b1.b();
                   if (c > b) {
                      this = c.a.size() - 1;
                      while (this >= 0) {
                         i4 = c.a.keyAt(this);
                         i5 = b + 1;
                         if (i5 <= i4 && c > i4) {
                            i9 = i4;
                            break ;
                         }
                         this--;
                      }
                   }
                }
             }else {
                goto label_010a ;
             }
             b1 = "java.util.Arrays.toString\(this\)";
             String str1 = "LiveGiftComboTargetNumManager";
             if (i9 > 0) {
                obj1 = LiveLogTag.GIFT;
                obj1.appendTag(str1);
                LiveLogTag liveLogTag = obj1;
                String str2 = Arrays.toString(ointArray);
                a.o(str2, b1);
                b.V(liveLogTag, "[updateComboNumArray]", "from is ", Integer.valueOf(b), "to is ", Integer.valueOf(c), "old comboNum array is ", str2, "nearTargetNum is ", Integer.valueOf(i9));
                i5 = i3 - 1;
                for (i = 0; i < i5; i5 = i12) {
                   i6 = ointArray[i] - i9;
                   int i10 = i + 1;
                   int i11 = ointArray[i10] - i9;
                   int i12 = i5;
                   if (Math.abs(i6) >= Math.abs(i11)) {
                      i5 = i3 - 2;
                      if (i == i5) {
                         ointArray[i] = i9;
                         break ;
                      }
                   }else {
                      ointArray[i] = i9;
                      break ;
                   }
                   i = i10;
                }
             }
             obj1 = LiveLogTag.GIFT;
             obj1.appendTag(str1);
             String str3 = Arrays.toString(ointArray);
             a.o(str3, b1);
             b.V(obj1, "[updateComboNumArray]", "from is ", Integer.valueOf(b), "to is ", Integer.valueOf(c), "nearTargetNum is ", Integer.valueOf(i9), "new comboNum array is ", str3);
          }
       }
       int[] ointArray1 = ointArray;
       i6 = 1;
       while (i6 <= i3) {
          i1 = (i2 == 200)? true: false;
          GiftAnimItemView giftAnimItem2 = giftAnimItem1;
          AnimatorSet uAnimatorSet1 = giftAnimCont.l(giftAnimItem2, i1, (long)i2);
          i1 = i6 - 1;
          int i7 = ointArray1[i1];
          boolean b2 = (i6 == i3)? true: false;
          i1 = i1 * i2;
          int[] ointArray2 = ointArray1;
          int i8 = i2;
          long l = (long)i1;
          uAnimatorSet1.setStartDelay(l);
          giftAnimItem.postDelayed(new GiftAnimContainerView$i(giftAnimCont, giftAnimItem, i7, ol), l);
          if (b2) {
             ok.c = uAnimatorSet1;
             uAnimatorSet2 = uAnimatorSet1;
             giftAnimItem3 = giftAnimItem2;
             GiftAnimContainerView$a uoa1 = new GiftAnimContainerView$a(this, b2, ok, uAnimatorSet1, p2);
             uAnimatorSet2.addListener(l);
          }else {
             uAnimatorSet2 = uAnimatorSet1;
             giftAnimItem3 = giftAnimItem2;
          }
          j.g(uAnimatorSet2, LiveDegradeBiz.GiftSlot);
          if (!PatchProxy.applyVoidOneRefs(uAnimatorSet2, giftAnimItem, GiftAnimItemView.class, "20")) {
             giftAnimItem.L.add(uAnimatorSet2);
          }
          i6 = i6 + 1;
          i2 = i8;
          ointArray1 = ointArray2;
          giftAnimItem1 = giftAnimItem3;
       }
       return;
    }
    public void f(GiftAnimItemView p0,GiftAnimContainerView$l p1,GiftAnimContainerView$j p2,long p3){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), this, GiftAnimContainerView.class, "32")) {
          return;
       }
       this.m(p0).b(p1);
       p1.a.mComboCount = p1.b;
       p0.r();
       p0.b(p1.a, false);
       if (p1.a.mIsDrawingGift != null) {
          if (this.h.j()) {
             GiftAnimContainerView tk = this.k;
             GiftMessage mDrawingGift = p1.a.mDrawingGift;
             Objects.requireNonNull(tk);
             if (!PatchProxy.applyVoidOneRefs(mDrawingGift, tk, DrawingGiftDisplayView.class, "1")) {
                DrawingGiftDisplayView e = tk.e;
                AnimatorSet uAnimatorSet = null;
                if (e != null) {
                   e.end();
                   tk.e = uAnimatorSet;
                }
                tk.c = mDrawingGift;
                if (!PatchProxy.applyVoid(uAnimatorSet, tk, DrawingGiftDisplayView.class, "4")) {
                   tk.d = 0;
                   AnimatorSet uAnimatorSet1 = new AnimatorSet();
                   uAnimatorSet1.setDuration(2500);
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                   valueAnimato.addUpdateListener(new a(tk));
                   uAnimatorSet1.play(valueAnimato);
                   uAnimatorSet1.setInterpolator(new DecelerateInterpolator());
                   uAnimatorSet1.start();
                }
             }
             this.y = this.y + 1;
          }
          this.l = p0;
       }
       AnimationSet uAnimationSe = new AnimationSet(1);
       uAnimationSe.setDuration(300);
       uAnimationSe.setStartOffset(p3);
       AlphaAnimation uAlphaAnimat = (!p0.getVisibility())? new AlphaAnimation(0, 0x3f800000): new AlphaAnimation(0, 0);
       uAnimationSe.addAnimation(uAlphaAnimat);
       uAnimationSe.setAnimationListener(new GiftAnimContainerView$e(this, p0, p1, p2));
       p0.clearAnimation();
       b.c0(LiveLogTag.GIFT, "ComboAnimState animateToDisplay", "animation", uAnimationSe);
       j.f(p0, uAnimationSe, LiveDegradeBiz.GiftSlot);
       return;
    }
    public void g(GiftAnimItemView p0,GiftAnimContainerView$l p1,GiftAnimContainerView$j p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GiftAnimContainerView.class, "34")) {
          return;
       }
       this.m(p0).b(p1);
       float f = 0;
       AlphaAnimation uAlphaAnimat = (!p0.getVisibility())? new AlphaAnimation(0x3f800000, f): new AlphaAnimation(f, f);
       uAlphaAnimat.setDuration(200);
       uAlphaAnimat.setAnimationListener(new GiftAnimContainerView$f(this, p0, p1, p2));
       p0.clearAnimation();
       b.c0(LiveLogTag.GIFT, "ComboAnimState animateToDisplayAfterReplace", "animation", uAlphaAnimat);
       j.f(p0, uAlphaAnimat, LiveDegradeBiz.GiftSlot);
       this.u(p0);
       if (p1.a.mIsDrawingGift != null) {
          this.o = true;
       }
       return;
    }
    public List getCandidateMergeKeys(){
       int b;
       boolean b1;
       long l;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj1 = PatchProxy.apply(objArray, obj, GiftAnimContainerView.class, "22");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new ArrayList();
       Iterator iterator = obj.c.iterator();
       HashMap hashMap = new HashMap();
       Object obj2 = PatchProxy.apply(objArray, obj, GiftAnimContainerView.class, "25");
       int i = 1;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          b = 0;
          while (true) {
             if (b < this.getChildCount()) {
                GiftAnimItemView childAt = obj.getChildAt(b);
                if (childAt.i() && (childAt.getGiftMessage() != null && (childAt.getDisplayDuration() > GiftAnimContainerView.n(childAt.getGiftMessage()) && childAt.getGiftMessage().mIsDrawingGift != null))) {
                   b = 1;
                label_006a :
                   b = (obj.o != null && !b)? true: false;
                }else {
                   b = b + 1;
                }
             }else {
                b = 0;
                goto label_006a ;
             }
          }
       }
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          i1 = i1 + i;
          GiftMessage giftMessage = iterator.next();
          if (giftMessage.mIsDrawingGift != null && (b || i2)) {
             continue ;
          }else {
             Long obj3 = PatchProxy.applyOneRefs(giftMessage, obj, GiftAnimContainerView.class, "23");
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else if(a0.h(giftMessage, i)){
                b1 = false;
             }else if(a0.d(giftMessage)){
                b1 = obj.s;
             }else {
                b1 = obj.r;
             }
             if (b1 != null) {
                iterator.remove();
             }else {
                obj3 = PatchProxy.applyOneRefs(giftMessage, objArray, GiftAnimContainerView.class, "24");
                if (obj3 != patchProxyRe) {
                   b1 = obj3.booleanValue();
                }else {
                   String str = "message";
                   if (giftMessage.mIsFromBroadCastGiftMessage == null && giftMessage.mExpireDate - d.a() < 0) {
                      b.c0(LiveLogTag.GIFT, "expired_gift", str, giftMessage.toString());
                   }else if(giftMessage.mIsDrawingGift != null){
                      GiftMessage mDrawingGift = giftMessage.mDrawingGift;
                      if (mDrawingGift != null) {
                         DrawingGift mPoints = mDrawingGift.mPoints;
                         if (mPoints != null && !mPoints.size()) {
                         label_011c :
                            b1 = true;
                         }
                      }
                   }
                   Gift gift = a.a(giftMessage.mGiftId);
                   if (gift == null) {
                      b.c0(LiveLogTag.GIFT, "no_cached_gift", str, giftMessage.toString());
                   }else if(gift.mActionType != GiftActionType.DEFAULT_ANIMATION){
                      b.c0(LiveLogTag.GIFT, "illegal_gift_action", str, giftMessage.toString());
                   }else {
                      goto label_011c ;
                   }
                   b1 = false;
                }
                if (!b1) {
                   iterator.remove();
                   continue ;
                }else if(obj.r(giftMessage)){
                   l = 0x7fffffff - (long)i1;
                   hashMap.put(giftMessage.mMergeKey, Long.valueOf(l));
                   continue ;
                }else {
                   obj3 = hashMap.get(giftMessage.mMergeKey);
                   if (obj3 == null) {
                      obj3 = Long.valueOf(0);
                   }
                   l = obj3.longValue() + (long)giftMessage.mRank;
                   hashMap.put(giftMessage.mMergeKey, Long.valueOf(l));
                   if (giftMessage.mIsDrawingGift != null) {
                      i2 = 1;
                      continue ;
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       ArrayList uArrayList = new ArrayList(hashMap.entrySet());
       Collections.sort(uArrayList, new GiftAnimContainerView$d(obj));
       for (int i3 = 0; i3 < this.getChildCount() && i3 < uArrayList.size(); i3 = i3 + 1) {
          obj1.add(uArrayList.get(i3).getKey());
       }
       if (obj1.size() >= 2) {
          String str1 = obj1.get(0);
          if (hashMap.get(str1).longValue() - (hashMap.get(obj1.get(i)).longValue() * 3) > 0) {
             GiftAnimItemView obj4 = PatchProxy.applyOneRefs(str1, obj, GiftAnimContainerView.class, "26");
             if (obj4 != patchProxyRe) {
                i = obj4.booleanValue();
             }else {
                int i4 = 0;
                while (true) {
                   if (i4 < this.getChildCount()) {
                      obj4 = obj.getChildAt(i4);
                      if (!obj4.i() || !(obj4.getGiftMessage().mMergeKey).equals(str1)) {
                         i4 = i4 + 1;
                      }
                   }else {
                      i = false;
                   }
                }
             }
             if (!i) {
                obj1.clear();
                obj1.add(str1);
             }
          }
       }
       obj.h.f(uArrayList, new ArrayList(obj.c));
       return obj1;
    }
    public int getGiftAnimLayout(){
       return 0x7f0d0548;
    }
    public int getVisibleCount(){
       Object obj = PatchProxy.apply(null, this, GiftAnimContainerView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       GiftAnimContainerView ti = this.i;
       if (ti != null && !ti.getVisibility()) {
          i = 1;
       }
       ti = this.j;
       if (ti != null && !ti.getVisibility()) {
          i = i + 1;
       }
       return i;
    }
    public boolean h(GiftAnimContainerView$l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GiftAnimContainerView.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.H == null) {
          p0 = p0.a;
          if (p0.mCount > b && this.q(p0)) {
          label_0026 :
             return b;
          }
       }
       b = false;
       goto label_0026 ;
    }
    public void i(GiftAnimItemView p0,Animation p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GiftAnimContainerView.class, "36")) {
          return;
       }
       if (!a.t().u("SOURCE_LIVE").d("liveGiftSlotAnimationBugFixSwitch", true)) {
          return;
       }
       if (p1 == p0.getAnimation()) {
          p0.setAnimation(null);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView.class, "20")) {
          return;
       }
       this.r = false;
       this.s = false;
       this.x = 0;
       this.y = 0;
       this.c.clear();
       this.q.clear();
       this.t();
       return;
    }
    public void k(GiftAnimContainerView$l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView.class, "30")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          GiftMessage giftMessage = iterator.next();
          if ((p0.a.mMergeKey).equals(giftMessage.mMergeKey)) {
             giftMessage = giftMessage.mComboCount;
             if (giftMessage >= p0.b && giftMessage <= p0.c) {
                iterator.remove();
                int i = this.x + 1;
                this.x = i;
             }
          }
       }
       return;
    }
    public final AnimatorSet l(View p0,boolean p1,long p2){
       ObjectAnimator objectAnimat1;
       ObjectAnimator obj = p0;
       if (PatchProxy.isSupport(GiftAnimContainerView.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, GiftAnimContainerView.class, "43");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       int i = 1;
       int i1 = 2;
       if (p1) {
          super();
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj, View.SCALE_X, new float[i1]{0x3fc00000,0x3f800000});
          objectAnimat1 = ObjectAnimator.ofFloat(obj, View.SCALE_Y, new float[i1]{0x3fc00000,0x3f800000});
          objectAnimat.setDuration(160);
          objectAnimat1.setDuration(160);
          Animator[] uAnimatorArr = new Animator[i1];
          uAnimatorArr[0] = objectAnimat;
          uAnimatorArr[i] = objectAnimat1;
          this.playTogether(uAnimatorArr);
          return this;
       }else {
          float f = (float)p2;
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ObjectAnimator objectAnimat2 = j.a(obj, new float[i1]{0,0x3f800000});
          long l = (long)(int)(0.40f * f);
          objectAnimat2.setDuration(l);
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(obj, View.SCALE_X, new float[i1]{0x40400000,0x3f800000});
          ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(obj, View.SCALE_Y, new float[i1]{0x40400000,0x3f800000});
          objectAnimat3.setDuration(l);
          objectAnimat4.setDuration(l);
          ObjectAnimator objectAnimat5 = ObjectAnimator.ofFloat(obj, View.SCALE_X, new float[i1]{0x3f800000,0x3f99999a});
          ObjectAnimator objectAnimat6 = ObjectAnimator.ofFloat(obj, View.SCALE_Y, new float[i1]{0x3f800000,0x3f99999a});
          long l1 = (long)(int)(0.30f * f);
          objectAnimat5.setDuration(l1);
          objectAnimat6.setDuration(l1);
          objectAnimat5.setStartDelay(l);
          objectAnimat6.setStartDelay(l);
          objectAnimat1 = ObjectAnimator.ofFloat(obj, View.SCALE_X, new float[i1]{0x3f99999a,0x3f800000});
          obj = ObjectAnimator.ofFloat(obj, View.SCALE_Y, new float[i1]{0x3f99999a,0x3f800000});
          objectAnimat1.setDuration(l1);
          obj.setDuration(l1);
          l = (long)(int)(f * 0x3f333333);
          objectAnimat1.setStartDelay(l);
          obj.setStartDelay(l);
          Animator[] uAnimatorArr1 = new Animator[]{objectAnimat2,objectAnimat3,objectAnimat4,objectAnimat5,objectAnimat6,objectAnimat1,obj};
          uAnimatorSet.playTogether(uAnimatorArr1);
          return uAnimatorSet;
       }
    }
    public GiftAnimContainerView$k m(GiftAnimItemView p0){
       GiftAnimContainerView$k obj = PatchProxy.applyOneRefs(p0, this, GiftAnimContainerView.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.get(p0);
       if (obj == null) {
          obj = new GiftAnimContainerView$k(this, p0);
       }
       return obj;
    }
    public GiftAnimContainerView$l o(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, GiftAnimContainerView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.iterator();
       GiftAnimContainerView$l ol = null;
       GiftMessage giftMessage = null;
       GiftMessage giftMessage1 = ol;
       GiftMessage giftMessage2 = null;
       while (true) {
          if (obj.hasNext()) {
             GiftMessage giftMessage3 = obj.next();
             if (!p0.equals(giftMessage3.mMergeKey)) {
                continue ;
             }else if(this.r(giftMessage3)){
                return new GiftAnimContainerView$l(giftMessage3, giftMessage3.mComboCount, giftMessage3.mComboCount);
             }else if(giftMessage == null || giftMessage3.mComboCount < giftMessage){
                giftMessage = giftMessage3.mComboCount;
             }
             if (giftMessage2 == null || giftMessage3.mComboCount > giftMessage2) {
                giftMessage2 = giftMessage3.mComboCount;
             }
             giftMessage1 = giftMessage3;
          }else if(giftMessage1 == null){
             ol = new GiftAnimContainerView$l(giftMessage1, giftMessage, giftMessage2);
             break ;
          }
          break ;
       }
       return ol;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.C = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p.removeCallbacksAndMessages(null);
       this.C = false;
       this.removeCallbacks(this.L);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GiftAnimContainerView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.A = p0;
       this.B = p1;
       return;
    }
    public final void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GiftAnimContainerView.class, "15")) {
          return;
       }
       if (this.getChildCount() > 0) {
          return;
       }
       LiveGiftComboButtonAnimationUtils$a h = LiveGiftComboButtonAnimationUtils.h;
       Objects.requireNonNull(h);
       Boolean uBoolean = PatchProxy.apply(objArray, h, LiveGiftComboButtonAnimationUtils$a.class, "3");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = LiveGiftComboButtonAnimationUtils.d.getValue();
       }
       this.H = uBoolean.booleanValue();
       GiftAnimItemView giftAnimItem = b.f(this.getContext(), this.getGiftAnimLayout(), this, false, t0.a());
       this.i = giftAnimItem;
       giftAnimItem.setClickable(this.G);
       this.i.setOnItemClickListener(this.e);
       this.i.setGiftAnimConfigurator(this.h);
       this.i.setIsGoneWhenUnbind(this.I);
       GiftAnimItemView$c uoc = new GiftAnimItemView$c();
       uoc.a = this.m;
       this.i.setDisplayConfig(uoc);
       this.i.setOnItemLogListener(this.g);
       this.i.setCanShowHintTextEffect(this.H);
       this.i.t(this.b);
       this.i.r();
       this.m(this.i);
       this.addView(this.i);
       giftAnimItem = b.f(this.getContext(), this.getGiftAnimLayout(), this, false, t0.a());
       this.j = giftAnimItem;
       giftAnimItem.setClickable(this.G);
       this.j.setOnItemClickListener(this.f);
       this.j.setGiftAnimConfigurator(this.h);
       this.j.setIsGoneWhenUnbind(this.I);
       uoc = new GiftAnimItemView$c();
       uoc.a = this.n;
       this.j.setDisplayConfig(uoc);
       this.j.setOnItemLogListener(this.g);
       this.j.setCanShowHintTextEffect(this.H);
       this.j.t(this.b);
       this.j.r();
       this.m(this.j);
       this.addView(this.j);
       this.setIsGzone(this.w);
       this.setIsVoiceParty(this.v);
       this.p.sendEmptyMessage(1);
       this.s();
       return;
    }
    public final boolean q(GiftMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GiftAnimContainerView.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.c(p0);
    }
    public final boolean r(GiftMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GiftAnimContainerView.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.me() != null && (p0.mUser != null && (QCurrentUser.me().getId()).equals(p0.mUser.mId)))? true: false;
       return b;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView.class, "4")) {
          return;
       }
       GiftAnimContainerView ti = this.i;
       int i = -1;
       int visibility = (ti != null)? ti.getVisibility(): -1;
       GiftAnimContainerView tj = this.j;
       if (tj != null) {
          i = tj.getVisibility();
       }
       if (View$MeasureSpec.getSize(this.A) > 0 && (View$MeasureSpec.getSize(this.B) > 0 && (this.C != null && (this.getParent() != null && (!this.getParent().isLayoutRequested() && (this.D == this.getChildCount() && (visibility == this.E && i == this.F))))))) {
          if (this.z == null) {
             this.z = true;
             i0.k0(this, this.L);
          }
       }else {
          super.requestLayout();
       }
       this.D = this.getChildCount();
       this.E = visibility;
       this.F = i;
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView.class, "8")) {
          return;
       }
       if (this.I != null) {
          this.p();
       }
       GiftAnimContainerView ti = this.i;
       if (ti != null && this.j != null) {
          int i = 0;
          if (this.J != null) {
             ti.setTopEmptyViewHeight(i);
             this.j.setTopEmptyViewHeight((int)((float)a1.d(R.dimen.arg_RES_7f070783) / this.K));
          }else {
             ti.setTopEmptyViewHeight(i);
             this.j.setTopEmptyViewHeight(i);
             int i1 = 80;
             this.i.setGravity(i1);
             this.j.setGravity(i1);
          }
          this.i.a(this.J);
          this.j.a(this.J);
       }
       return;
    }
    public void setClickable(boolean p0){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GiftAnimContainerView.class, "5")) {
          return;
       }
       this.G = p0;
       GiftAnimContainerView ti = this.i;
       if (ti != null) {
          ti.setClickable(p0);
       }
       ti = this.j;
       if (ti != null) {
          ti.setClickable(p0);
       }
       return;
    }
    public void setDisableDrawingGiftSlotAnimation(boolean p0){
       this.s = p0;
    }
    public void setDisableGiftSlotAnimation(boolean p0){
       this.r = p0;
    }
    public void setDrawingGiftDisplayView(DrawingGiftDisplayView p0){
       this.k = p0;
    }
    public void setGiftAnimConfigurator(c p0){
       this.h = p0;
    }
    public void setGiftScale(float p0){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, GiftAnimContainerView.class, "9")) {
          return;
       }
       this.K = p0;
       this.s();
       return;
    }
    public void setIsAnchor(boolean p0){
       this.u = p0;
    }
    public void setIsGzone(boolean p0){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GiftAnimContainerView.class, "13")) {
          return;
       }
       this.w = p0;
       GiftAnimContainerView ti = this.i;
       if (ti != null) {
          ti.setIsGzone(p0);
       }
       ti = this.j;
       if (ti != null) {
          ti.setIsGzone(p0);
       }
       return;
    }
    public void setIsVoiceParty(boolean p0){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GiftAnimContainerView.class, "12")) {
          return;
       }
       this.v = p0;
       GiftAnimContainerView ti = this.i;
       if (ti != null) {
          ti.setIsVoiceParty(p0);
       }
       ti = this.j;
       if (ti != null) {
          ti.setIsVoiceParty(p0);
       }
       return;
    }
    public void setLiveGiftUnitViewListener(c p0){
       this.d = p0;
    }
    public void setOnBottomItemClickListener(GiftAnimContainerView$n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView.class, "10")) {
          return;
       }
       this.f = p0;
       GiftAnimContainerView tj = this.j;
       if (tj != null) {
          tj.setOnItemClickListener(p0);
       }
       return;
    }
    public void setOnItemLogListener(GiftAnimContainerView$o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView.class, "11")) {
          return;
       }
       this.g = p0;
       GiftAnimContainerView ti = this.i;
       if (ti != null) {
          ti.setOnItemLogListener(p0);
       }
       GiftAnimContainerView tj = this.j;
       if (tj != null) {
          tj.setOnItemLogListener(this.g);
       }
       return;
    }
    public void setOnTopItemClickListener(GiftAnimContainerView$n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView.class, "6")) {
          return;
       }
       this.e = p0;
       GiftAnimContainerView ti = this.i;
       if (ti != null) {
          ti.setOnItemClickListener(p0);
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(GiftAnimContainerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GiftAnimContainerView.class, "18")) {
          return;
       }
       if (this.getVisibility() == 4 && !p0) {
          this.t();
       }
       super.setVisibility(p0);
       return;
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView.class, "21")) {
          return;
       }
       boolean b = false;
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          GiftAnimItemView childAt = this.getChildAt(i);
          this.m(childAt).c();
          childAt.l();
          this.v(childAt);
          childAt.clearAnimation();
       }
       this.o = b;
       GiftAnimContainerView tk = this.k;
       if (tk != null) {
          tk.a();
       }
       this.l = null;
       return;
    }
    public final void u(GiftAnimItemView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView.class, "38")) {
          return;
       }
       if (p0.getGiftMessage() != null && (p0.getGiftMessage().mIsDrawingGift != null && p0 == this.l)) {
          GiftAnimContainerView tk = this.k;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(null, tk, DrawingGiftDisplayView.class, "2") && (!PatchProxy.applyVoid(null, tk, DrawingGiftDisplayView.class, "5") && tk.c != null)) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             tk.e = uAnimatorSet;
             uAnimatorSet.setDuration(500);
             tk.e.play(j.a(tk, new float[2]{0x3f800000,0})).with(ObjectAnimator.ofFloat(tk, "scaleX", new float[2]{0x3f800000,0x3fa66666})).with(ObjectAnimator.ofFloat(tk, "scaleY", new float[2]{0x3f800000,0x3fa66666}));
             tk.e.addListener(new b(tk));
             tk.e.start();
          }
       label_0086 :
          this.l = null;
          this.o = false;
       }
    label_008b :
       return;
    }
    public void v(GiftAnimItemView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView.class, "41")) {
          return;
       }
       p0.r();
       if (this.d == null) {
          return;
       }
       GiftAnimContainerView obj = PatchProxy.applyOneRefs(p0, this, GiftAnimContainerView.class, "33");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.i;
          if (p0 == obj) {
             GiftAnimContainerView tj = this.j;
             if (tj == null || !tj.j()) {
             label_0045 :
                this.d.d(b);
                return;
             }
          }else if(p0 == this.j && (obj != null && obj.j())){
          }
          b = 1;
          goto label_0045 ;
       }
    }
}
