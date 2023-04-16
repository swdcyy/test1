package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import rd0.r;
import be0.c;
import be0.b;
import be0.a;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$e;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$c;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$d;
import android.util.AttributeSet;
import com.kuaishou.growth.pendant.model.CompleteTipConfigV2;
import dd0.k$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import mf0.b;
import java.lang.Integer;
import java.lang.StringBuilder;
import ld0.c;
import dd0.m;
import ld0.d;
import ed0.a;
import qrd.l1;
import java.util.Objects;
import com.google.gson.JsonObject;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import rd0.q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.growth.pendant.model.TaskReportResponseV2;
import com.kuaishou.growth.pendant.model.RewardV2;
import dd0.k;
import com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import nsd.r0;
import java.util.Arrays;
import rd0.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import brd.t;
import rd0.g;
import rd0.h;
import erd.g;
import crd.b;
import android.animation.AnimatorSet;
import java.lang.CharSequence;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import java.lang.Number;
import com.kuaishou.growth.pendant.model.PendantCycleFinishedTextConfig;
import u79.b;
import android.animation.TimeInterpolator;
import rd0.i;
import rd0.j;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Float;
import com.kuaishou.growth.pendant.ui.widget.CircularProgressView;
import zsd.u;
import rd0.e;
import rd0.f;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView$a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ed0.b;
import com.kuaishou.growth.pendant.coin.task.double.PendantDoubleExpHelper;
import mf0.a;
import java.lang.System;
import java.lang.Math;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import id0.b;
import gd0.b;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$f;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.util.rx.RxBus;
import te0.a;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$g;
import sf0.f;
import sf0.a;
import sf0.b;
import sf0.e;
import sf0.d;
import android.animation.ValueAnimator;
import yd0.f;
import qf0.b;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$a;
import com.kuaishou.growth.pendant.model.PendantActiveParams;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$b;
import ae0.b;
import android.view.View$OnClickListener;
import dd0.m$a;
import rd0.m;
import rd0.n;
import android.graphics.Color;

public final class SectionPendantV2 extends KemPendantV2	// class@000626
{
    public ImageView A;
    public b B;
    public ValueAnimator C;
    public b D;
    public b E;
    public final r F;
    public final c G;
    public final b H;
    public final a I;
    public float J;
    public Runnable K;
    public Runnable L;
    public final m M;
    public final m N;
    public final SectionPendantV2$d O;
    public PendantAnimImageView o;
    public PendantAnimImageView p;
    public KwaiBindableImageView q;
    public View r;
    public KwaiImageView s;
    public TextView t;
    public CircularProgressView u;
    public View v;
    public TextView w;
    public a x;
    public PendantDoubleExpHelper y;
    public int z;

    public void SectionPendantV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.F = new r();
       this.G = new c(this);
       this.H = new b(this);
       this.I = new a(this);
       this.J = 0xbf800000;
       this.M = new SectionPendantV2$e(this);
       this.N = new SectionPendantV2$c(this);
       this.O = new SectionPendantV2$d(this);
    }
    public void SectionPendantV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.F = new r();
       this.G = new c(this);
       this.H = new b(this);
       this.I = new a(this);
       this.J = 0xbf800000;
       this.M = new SectionPendantV2$e(this);
       this.N = new SectionPendantV2$c(this);
       this.O = new SectionPendantV2$d(this);
    }
    public void SectionPendantV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.F = new r();
       this.G = new c(this);
       this.H = new b(this);
       this.I = new a(this);
       this.J = 0xbf800000;
       this.M = new SectionPendantV2$e(this);
       this.N = new SectionPendantV2$c(this);
       this.O = new SectionPendantV2$d(this);
    }
    public static void A(SectionPendantV2 p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.z(p1);
       return;
    }
    public static void E(SectionPendantV2 p0,String p1,CompleteTipConfigV2 p2,k$b p3,int p4,Object p5){
       p0.D(p1, p2, null);
    }
    public final boolean B(){
       Object obj = PatchProxy.apply(null, this, SectionPendantV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.s(this.getMParams());
    }
    public final void C(int p0){
       if (PatchProxy.isSupport(SectionPendantV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SectionPendantV2.class, "27")) {
          return;
       }
       c.c("switchPendantToDoubleStatus isTaskComplete="+this.B());
       if (!this.B()) {
          boolean b = true;
          this.z(b);
          if (p0 == b) {
             a uoa = new a();
             uoa.d(b);
             uoa.c(b);
             d.g().UT(this, this.getMParams(), "doubleStatusActive", uoa);
          }
       }
       return;
    }
    public final void D(String p0,CompleteTipConfigV2 p1,k$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SectionPendantV2.class, "6")) {
          return;
       }
       SectionPendantV2 tF = this.F;
       Objects.requireNonNull(tF);
       if (!PatchProxy.applyVoidFourRefs(this, p0, p1, p2, tF, r.class, "1")) {
          a.p(this, "pendant");
          if (p1 != null) {
             String mBubbleText = p1.getMBubbleText();
             q r mBubbleText1 = (mBubbleText == null || !mBubbleText.length())? 1: null;
             if (!mBubbleText1 && tF.b == null) {
                tF.c = p1;
                String mBubbleText2 = p1.getMBubbleText();
                if (mBubbleText2 != null) {
                   r c = tF.c;
                   int i = (c != null)? c.getMBubbleSecond(): 3;
                   c = tF.c;
                   JsonObject mReport = (c != null)? c.getMReport(): null;
                   mBubbleText1 = new q(tF, this, p0, mBubbleText2, i, mReport, p2);
                   this.getViewTreeObserver().addOnGlobalLayoutListener(v10);
                   tF.b = true;
                }
             }
          }
       label_0075 :
          if (p2 != null) {
             p2.a();
          }
       }
    label_007a :
       return;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, SectionPendantV2.class, "24")) {
          return;
       }
       SectionPendantV2 tL = this.L;
       if (tL != null) {
          k1.m(tL);
       }
       this.L = null;
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, SectionPendantV2.class, "21")) {
          return;
       }
       SectionPendantV2 tK = this.K;
       if (tK != null) {
          k1.m(tK);
       }
       return;
    }
    public final void H(TaskReportResponseV2 p0){
       String mRewardCount;
       TaskParamsV2 mNextTaskPar;
       boolean b;
       PatchProxyResult patchProxyRe;
       SectionPendantV2 sectionPenda;
       a a;
       Animator[] obj2;
       long l;
       SectionPendantV2 obj3;
       long l1;
       SectionPendantV2 u1;
       Object obj = this;
       TaskParamsV2 obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SectionPendantV2.class, "12")) {
          return;
       }
       String str = "13";
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, SectionPendantV2.class, str)) {
          c.c("doUpdateCompleteUiStyle7");
          int i = (int)this.getMParams().getMRewardCount();
          if (obj1 != null) {
             RewardV2 mRewardV2 = p0.getMRewardV2();
             if (mRewardV2 != null) {
                i = (int)mRewardV2.getMRewardCount();
                mRewardCount = mRewardV2.getMRewardCountStr();
             label_003e :
                if (i <= 0) {
                   k ok = d.c();
                   Context realContext = this.getRealContext();
                   a.o(realContext, "realContext");
                   mRewardCount = b.g(this.getMParams());
                   mNextTaskPar = (obj1 != null)? p0.getMNextTaskParamsV2(): null;
                   ok.F0(realContext, mRewardCount, mNextTaskPar);
                }else {
                   String str1 = 2;
                   int i1 = 0;
                   int i2 = 1;
                   b = (this.getMParams().getMAnimationId() == str1)? true: false;
                   int i3 = 8;
                   if (!PatchProxy.isSupport(SectionPendantV2.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), obj, SectionPendantV2.class, "15")) {
                      if (b) {
                         u1 = obj.u;
                         if (u1 != null) {
                            u1.setVisibility(i1);
                         }
                         u1 = obj.w;
                         if (u1 != null) {
                            u1.setVisibility(i1);
                         }
                         u1 = obj.o;
                         if (u1 != null) {
                            u1.setVisibility(i3);
                         }
                      }else {
                         u1 = obj.u;
                         if (u1 != null) {
                            u1.setVisibility(i3);
                         }
                         u1 = obj.w;
                         if (u1 != null) {
                            u1.setVisibility(i3);
                         }
                         u1 = obj.o;
                         if (u1 != null) {
                            u1.setVisibility(i1);
                         }
                      }
                      u1 = obj.p;
                      if (u1 != null) {
                         u1.setVisibility(i3);
                      }
                      u1 = obj.r;
                      if (u1 != null) {
                         u1.setVisibility(i3);
                      }
                   }
                   if (b) {
                      SectionPendantV2 u = obj.u;
                      if (u != null) {
                         u.setVisibility(i3);
                      }
                      u = obj.q;
                      if (u != null) {
                         u.setVisibility(i3);
                      }
                      u = obj.p;
                      if (u != null) {
                         u.setVisibility(i1);
                      }
                      u = obj.x;
                      if (u != null) {
                         obj1 = (obj1 != null)? p0.getMNextTaskParamsV2(): null;
                         SectionPendantV2 w = obj.w;
                         TaskParamsV2 taskParamsV2 = (mRewardCount == null || !mRewardCount.length())? 1: null;
                         if (taskParamsV2) {
                            Object[] objArray = new Object[i2];
                            objArray[i1] = Integer.valueOf(i);
                            mRewardCount = String.format("+%d", Arrays.copyOf(objArray, i2));
                            a.o(mRewardCount, "java.lang.String.format\(format, *args\)");
                         }else {
                            a.m(mRewardCount);
                         }
                         b uob = b.class;
                         patchProxyRe = PatchProxyResult.class;
                         sectionPenda = w;
                         if (!PatchProxy.applyVoidThreeRefs(obj1, w, mRewardCount, u, a.class, "12")) {
                            a.p(mRewardCount, "rewardCountStr");
                            c.c("updateCompleteUiAnim2");
                            a = u.a;
                            a = (a == null || !a.length())? 1: null;
                            a = (a)? u.f: u.a;
                            a h = u.h;
                            if (h != null) {
                               h.setVisibility(i1);
                               u.g(R.drawable.arg_RES_7f080d7a);
                               a uoa = (!a.length())? 1: null;
                               if (uoa) {
                                  u.a(h, u.b());
                               }else {
                                  u.d(a, "end").subscribe(new g(h, u, a), new h(h, u, a));
                               }
                            }
                            if (sectionPenda != null) {
                               AnimatorSet uAnimatorSet = PatchProxy.applyTwoRefs(sectionPenda, mRewardCount, u, a.class, str);
                               if (uAnimatorSet != patchProxyRe) {
                               }else {
                                  sectionPenda.setText(mRewardCount);
                                  float f = 0;
                                  sectionPenda.setScaleX(f);
                                  sectionPenda.setScaleY(f);
                                  AnimatorSet uAnimatorSet1 = new AnimatorSet();
                                  obj2 = new Animator[str1];
                                  obj2[i1] = ObjectAnimator.ofFloat(sectionPenda, "scaleX", new float[str1]{0,0x3f800000});
                                  obj2[1] = ObjectAnimator.ofFloat(sectionPenda, "scaleY", new float[str1]{0,0x3f800000});
                                  uAnimatorSet1.playTogether(obj2);
                                  a i6 = u.i;
                                  Object obj4 = PatchProxy.applyOneRefs(i6, null, uob, "38");
                                  if (obj4 != patchProxyRe) {
                                     l = obj4.longValue();
                                  }else {
                                     a.p(i6, "$this$findCycleFinishedTextAnimPlayDuration");
                                     PendantCycleFinishedTextConfig mCycleFinish1 = i6.getMCycleFinishedTextConfig();
                                     l = (mCycleFinish1 == null || mCycleFinish1.getTextAnimPlayDuration() <= 0)? 417: mCycleFinish1.getTextAnimPlayDuration();
                                  }
                                  uAnimatorSet1.setDuration(l);
                                  uAnimatorSet1.setInterpolator(new b(f, f, 0.27f, 0x3fb33333));
                                  uAnimatorSet = uAnimatorSet1;
                               }
                               i oi = new i(uAnimatorSet);
                               a i4 = u.i;
                               obj2 = PatchProxy.applyOneRefs(i4, null, uob, "37");
                               if (obj2 != patchProxyRe) {
                                  l = obj2.longValue();
                               }else {
                                  a.p(i4, "$this$findCycleFinishedTextEnterDelayDuration");
                                  PendantCycleFinishedTextConfig mCycleFinish = i4.getMCycleFinishedTextConfig();
                                  l = (mCycleFinish == null || mCycleFinish.getTextEnterDelayDuration() <= 0)? 833: mCycleFinish.getTextEnterDelayDuration();
                               }
                               k1.r(oi, l);
                            }
                            j oj = new j(u, obj1);
                            a i5 = u.i;
                            obj3 = PatchProxy.applyOneRefs(i5, null, uob, "36");
                            if (obj3 != patchProxyRe) {
                               l1 = obj3.longValue();
                            }else {
                               a.p(i5, "$this$findCycleFinishedAnimDuration");
                               l1 = (i5.getMCycleFinishedAnimDuration() > 0)? i5.getMCycleFinishedAnimDuration(): 1290;
                            }
                            k1.r(oj, l1);
                         }
                      }
                   }else if(PatchProxy.applyVoidOneRefs(obj1, obj, SectionPendantV2.class, "14")){
                      obj3 = obj.q;
                      if (obj3 != null) {
                         CDNUrl[] uCDNUrlArray = b.c(this.getMParams());
                         if (uCDNUrlArray != null) {
                            patchProxyRe = (!uCDNUrlArray.length)? 1: 0;
                            if (!patchProxyRe) {
                               sectionPenda = 0;
                            label_028f :
                               if (!sectionPenda) {
                                  b uob1 = null;
                                  obj3.a0(uCDNUrlArray, uob1);
                                  obj3.setVisibility(i1);
                               label_029b :
                                  obj3 = obj.x;
                                  if (obj3 != null) {
                                     if (obj1 != null) {
                                        mNextTaskPar = p0.getMNextTaskParamsV2();
                                     }
                                     obj3.i(mNextTaskPar);
                                  }
                               }
                            }
                         }
                         sectionPenda = 1;
                         goto label_028f ;
                      }
                      mNextTaskPar = null;
                      goto label_029b ;
                   }
                }
             }
          }
          mRewardCount = null;
          goto label_003e ;
       }
    label_02a8 :
       return;
    }
    public void b(float p0){
       a obj;
       float f;
       a b;
       if (PatchProxy.isSupport(SectionPendantV2.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SectionPendantV2.class, "7")) {
          return;
       }
       int mTarCount = this.getMParams().getMTargetCount();
       int[] mSectionInte = this.getMParams().getMSectionIntervals();
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(SectionPendantV2.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Integer.valueOf(mTarCount), mSectionInte, this, SectionPendantV2.class, "18");
          if (obj != PatchProxyResult.class) {
             f = obj.floatValue();
          }else if(mSectionInte != null){
             int i3 = (!mSectionInte.length)? 1: 0;
             if (!i3 && mSectionInte.length != i) {
                if (p0 - (float)mTarCount < 0) {
                   mTarCount = this.y(p0, mSectionInte);
                   i3 = (mTarCount > 0)? mSectionInte[(mTarCount - 1)]: 0;
                   mTarCount = (mTarCount >= mSectionInte.length)? mSectionInte[(mSectionInte.length - i)]: mSectionInte[mTarCount];
                   float f1 = p0 - (float)i3;
                   mTarCount = mTarCount - i3;
                   if (mTarCount) {
                      f = (f1 * 0x3f800000) / (float)mTarCount;
                   }
                }
                f = 0x3f800000;
             }
          }
       label_008d :
          f = (p0 * 0x3f800000) / (float)mTarCount;
       }else {
          goto label_0054 ;
       }
       SectionPendantV2 tu = this.u;
       if (tu != null) {
          tu.setProgress(f);
       }
       if (b.j(this.getMParams())) {
          tu = this.J;
          if (tu > 0 && tu - 0x3f800000 < 0) {
             obj = 0x3eaaaaab;
             if (f - obj < 0 || tu - obj >= 0) {
                obj = 0x3f2aaaab;
                if (f - obj < 0 || tu - obj >= 0) {
                label_0104 :
                   this.J = f;
                   String mAnimationRe = this.getMParams().getMAnimationResourceUrl();
                   TaskParamsV2 taskParamsV2 = (mAnimationRe == null || !mAnimationRe.length())? 1: null;
                   if (taskParamsV2) {
                      return;
                   }else {
                      int i2 = this.y(p0, this.getMParams().getMSectionIntervals());
                      if (this.z != i2) {
                         this.z = i2;
                         int[] mSectionInte1 = this.getMParams().getMSectionIntervals();
                         if (mSectionInte1 != null) {
                            if (mSectionInte1.length) {
                               i = 0;
                            }
                            if (!i) {
                               i1 = mSectionInte1.length;
                            }
                         }
                         if (i2 != i1) {
                            SectionPendantV2 tx = this.x;
                            if (tx != null) {
                               tx.e("stage", false, b.e(this.getMParams()), null, null);
                            }
                         }
                      }
                   label_0160 :
                      return;
                   }
                }
             }
             tu = this.x;
             if (tu == null || PatchProxy.applyVoid(null, tu, a.class, "6")) {
                goto label_0104 ;
             }else {
                c.c("playDoubleCoinAnim");
                obj = tu.j;
                if (obj != null) {
                   b = tu.b;
                   b = (b == null || u.S1(b))? 1: null;
                   if (!b) {
                      tu.d(tu.b, "double").subscribe(new e(obj, tu), new f(obj));
                      goto label_0104 ;
                   }else {
                      goto label_0104 ;
                   }
                }else {
                   goto label_0104 ;
                }
             }
          }else {
             goto label_0104 ;
          }
       }else {
          goto label_0104 ;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       this.v = m1.f(p0, 0x7f0a2fd2);
       this.u = m1.f(p0, 0x7f0a32de);
       this.o = m1.f(p0, 0x7f0a2fc8);
       this.q = m1.f(p0, 0x7f0a2fce);
       this.w = m1.f(p0, 0x7f0a0385);
       this.p = m1.f(p0, 0x7f0a2fc6);
       this.r = m1.f(p0, 0x7f0a0db0);
       this.s = m1.f(p0, 0x7f0a0db1);
       this.t = m1.f(p0, 0x7f0a0db2);
       this.A = m1.f(p0, 0x7f0a2fca);
       return;
    }
    public void g(TaskParamsV2 p0,float p1,boolean p2){
       if (PatchProxy.isSupport(SectionPendantV2.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), this, SectionPendantV2.class, "8")) {
          return;
       }
       a.p(p0, "taskParamsV2");
       super.g(p0, p1, p2);
       this.getMBuilder().s(p0);
       if (p2 && !PatchProxy.applyVoid(null, this, SectionPendantV2.class, "10")) {
          this.removeAllViews();
          Context context = this.getContext();
          a.o(context, "context");
          this.p(context);
       }
       this.b(p1);
       return;
    }
    public final TextView getMAwardCountTV$pendant_coin_task_release(){
       return this.w;
    }
    public final View getMExpandBtnContainer$pendant_coin_task_release(){
       return this.r;
    }
    public final KwaiImageView getMPendantExpandBtnBg$pendant_coin_task_release(){
       return this.s;
    }
    public final TextView getMPendantExpandBtnText$pendant_coin_task_release(){
       return this.t;
    }
    public void j(TaskReportResponseV2 p0){
       PendantDoubleExpHelper a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2.class, "9")) {
          return;
       }
       a.p(p0, "responseV2");
       super.j(p0);
       SectionPendantV2 ty = this.y;
       if (ty != null && !PatchProxy.applyVoid(null, ty, PendantDoubleExpHelper.class, "5")) {
          a.c("onProgressFull");
          if (Math.abs((System.currentTimeMillis() - PendantDoubleExpHelper.g)) - (long)1000 < 0) {
             a.c("onProgressFull noise");
          }else {
             PendantDoubleExpHelper.g = System.currentTimeMillis();
             a = ty.a;
             if (a != null && a.isRunning() == true) {
                int intx = ty.c().getInt("SP_UN_DOUBLE_STATUS_ANIM_SHOW_CIRCLES", 0);
                a.c("onProgressFull add, lastPlayCircles="+intx);
                g.a(ty.c().edit().putInt("SP_UN_DOUBLE_STATUS_ANIM_SHOW_CIRCLES", (intx + 1)));
             }
             ty.a();
          }
       }
       this.F();
       this.H(p0);
       d.b().c(this.getMParams());
       return;
    }
    public void o(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2.class, "2")) {
          return;
       }
       a.p(p0, "context");
       super.o(p0);
       this.f(this.O);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SectionPendantV2.class, "16")) {
          return;
       }
       super.onAttachedToWindow();
       this.D = this.getUiChangedSubject().subscribe(new SectionPendantV2$f(this), Functions.d());
       this.E = RxBus.f.f(a.class).observeOn(a.c()).subscribe(new SectionPendantV2$g(this));
       f d = f.d;
       d.d(this.G);
       d.e(this.H);
       e.b.a(this.I);
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SectionPendantV2.class, "17")) {
          return;
       }
       super.onDetachedFromWindow();
       SectionPendantV2 tx = this.x;
       if (tx != null) {
          tx.f();
       }
       tx = this.y;
       if (tx != null && !PatchProxy.applyVoid(objArray, tx, PendantDoubleExpHelper.class, "6")) {
          tx.a();
       }
       tx = this.C;
       if (tx != null) {
          tx.removeAllListeners();
          tx.cancel();
       }
       f.b(this.D);
       f.b(this.E);
       f d = f.d;
       d.g(this.G);
       d.i(this.H);
       e.b.b(this.I);
       this.k(this.O);
       this.G();
       this.F();
       return;
    }
    public void p(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2.class, "3")) {
          return;
       }
       a.p(p0, "context");
       super.p(p0);
       if (b.j()) {
          this.x();
       }
       return;
    }
    public final void setMAwardCountTV$pendant_coin_task_release(TextView p0){
       this.w = p0;
    }
    public final void setMExpandBtnContainer$pendant_coin_task_release(View p0){
       this.r = p0;
    }
    public final void setMPendantExpandBtnBg$pendant_coin_task_release(KwaiImageView p0){
       this.s = p0;
    }
    public final void setMPendantExpandBtnText$pendant_coin_task_release(TextView p0){
       this.t = p0;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, SectionPendantV2.class, "23")) {
          return;
       }
       this.F();
       SectionPendantV2$a uoa = new SectionPendantV2$a(this);
       this.L = uoa;
       k1.r(uoa, 1267);
       return;
    }
    public final void w(){
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SectionPendantV2.class, "20")) {
          return;
       }
       TaskParamsV2 mParams = this.getMParams();
       Object obj = PatchProxy.applyOneRefs(mParams, objArray, b.class, "27");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          a.p(mParams, "$this$getHideProtectTime");
          PendantActiveParams mActiveWidPa = mParams.getMActiveWidgetParams();
          l = (mActiveWidPa != null)? mActiveWidPa.getMHideProtectTime(): 0;
       }
       if (b.m(this.getMParams()) && l > 0) {
          SectionPendantV2 tK = this.K;
          if (tK != null) {
             k1.m(tK);
          }
          SectionPendantV2$b uob = new SectionPendantV2$b(this);
          this.K = uob;
          k1.r(uob, l);
       }
       return;
    }
    public final void x(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SectionPendantV2.class, "5")) {
          return;
       }
       Context realContext = this.getRealContext();
       a.o(realContext, "realContext");
       this.x = new a(realContext, this.o, this.getMParams(), this.p);
       this.y = new PendantDoubleExpHelper(this, this.getMParams(), this.r);
       this.B = new b(this.getMParams());
       this.setOnClickListener(this.M);
       SectionPendantV2.A(this, false, 1, objArray);
       if (this.B()) {
          c.c("init CountDownPendantView, task is complete");
          this.H(objArray);
       }
       if (b.m(this.getMParams())) {
          m$a.a(d.g(), this, this.getMParams(), "inactiveGuideBubble", null, 8, null);
       }else if(b.k(this.getMParams())){
          m$a.a(d.g(), this, this.getMParams(), "extraLimitVideoTaskStart", null, 8, null);
       }else {
          SectionPendantV2.E(this, b.g(this.getMParams()), this.getMParams().getMCompleteTipConfigV2(), null, 4, null);
       }
       SectionPendantV2 ty = this.y;
       if (ty != null) {
          ty.d();
       }
       this.w();
       return;
    }
    public final int y(float p0,int[] p1){
       if (PatchProxy.isSupport(SectionPendantV2.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), p1, this, SectionPendantV2.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 != null) {
          int i = (!p1.length)? 1: 0;
          if (!i) {
             Arrays.sort(p1);
             i = p1.length;
             i = i - 1;
             while (i >= 0) {
                if (p0 - (float)p1[i] >= 0) {
                   return (i + 1);
                }
             }
          }
       }
       return 0;
    }
    public final void z(boolean p0){
       int i1;
       a a;
       if (PatchProxy.isSupport(SectionPendantV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SectionPendantV2.class, "11")) {
          return;
       }
       c.c("initUi");
       SectionPendantV2 tx = this.x;
       int i = 0;
       if (tx != null && !PatchProxy.applyVoid(null, tx, a.class, "8")) {
          a h = tx.h;
          if (h != null) {
             tx.g(R.drawable.arg_RES_7f080d7b);
             a = tx.a;
             CDNUrl[] uCDNUrlArray = (a == null || !a.length())? 1: null;
             if (uCDNUrlArray) {
                tx.a(h, tx.c());
             }else {
                tx.d(tx.a, "stage").subscribe(new m(h, tx), new n(h, tx));
             }
          }
       }
       tx = this.o;
       if (tx != null) {
          tx.setFailureImage(R.drawable.arg_RES_7f081a93);
       }
       tx = this.q;
       if (tx != null) {
          tx.setVisibility(8);
          tx.setFailureImage(R.drawable.arg_RES_7f081a92);
       }
       f.i(this);
       f.h(this);
       tx = this.u;
       if (tx != null) {
          i1 = (b.m(this.getMParams()))? 8: 0;
          tx.setVisibility(i1);
       }
       tx = this.v;
       if (tx != null) {
          i1 = (b.m(this.getMParams()))? 8: 0;
          tx.setVisibility(i1);
       }
       tx = this.p;
       if (tx != null) {
          if (this.B() || !b.j(this.getMParams())) {
             i = 8;
          }
          tx.setVisibility(i);
       }
       tx = this.u;
       if (tx != null) {
          tx.setColor(Color.parseColor(this.getMParams().getMProgressColor()));
       }
       tx = this.u;
       if (tx != null) {
          tx.setProgressBgColor(Color.parseColor(this.getMParams().getMProgressBgColor()));
       }
       if (!p0) {
          this.z = this.y((float)this.getMParams().getMCurrentCount(), this.getMParams().getMSectionIntervals());
          this.b((float)this.getMParams().getMCurrentCount());
       }
       SectionPendantV2 tA = this.A;
       if (tA != null) {
          tA.setOnClickListener(this.N);
       }
       return;
    }
}
