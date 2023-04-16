package com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView;
import s53.f;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import k77.t$b;
import com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import s53.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.live.gzone.treasurebox.widget.b;
import ok.h;
import lnc.b9;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView$b;
import java.lang.Enum;
import java.util.List;
import s53.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.lang.Boolean;
import android.animation.Animator;
import android.widget.ImageView;
import java.lang.Integer;
import k77.t$a;
import java.lang.Number;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.Math;
import s53.e;
import k77.t;
import android.animation.AnimatorSet;
import k77.u;
import java.util.ArrayList;
import android.animation.ValueAnimator;
import android.animation.TypeEvaluator;
import k77.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import k77.m;
import k77.n;
import android.animation.Animator$AnimatorListener;
import k77.o;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import k77.s;
import k77.c;
import k77.d;
import k77.e;
import k77.f;
import k77.g;
import k77.h;
import k77.i;
import k77.j;
import android.view.animation.OvershootInterpolator;
import k77.p;
import k77.q;
import k77.r;
import ekd.m1;
import s53.g;
import android.view.View$OnClickListener;
import s53.h;
import s53.i;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.IllegalArgumentException;

public class TreasureBoxV2StyleCellView extends ConstraintLayout implements f, d	// class@001caa
{
    public int B;
    public int C;
    public KwaiImageView D;
    public TextView E;
    public View F;
    public View G;
    public KwaiImageView H;
    public ViewGroup I;
    public ViewGroup J;
    public ImageView[] K;
    public LiveTreasureBoxModel L;
    public LiveTreasureBoxModel$BoxStatus M;
    public d N;
    public b O;
    public b P;
    public LiveTreasureBoxModel$BoxStatus Q;
    public t$b R;
    public Animator S;
    public AnimatorListenerAdapter T;
    public static final int U;
    public static final int V;
    public static final int W;

    static {
       TreasureBoxV2StyleCellView.U = a1.e(48.00f);
       TreasureBoxV2StyleCellView.V = a1.e(6.00f);
       TreasureBoxV2StyleCellView.W = a1.e(2.00f);
    }
    public void TreasureBoxV2StyleCellView(Context p0){
       super(p0, null);
    }
    public void TreasureBoxV2StyleCellView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TreasureBoxV2StyleCellView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = a.a().a().getResources().getColor(0x7f06042a);
       this.C = a.B.getResources().getColor(0x106000b);
       this.R = new t$b();
       this.T = new TreasureBoxV2StyleCellView$a(this);
       if (PatchProxy.applyVoidOneRefs(p0, this, TreasureBoxV2StyleCellView.class, "2")) {
       }else {
          this.doBindView(a.d(p0, this.getLayoutResId(), this, true));
          this.setClipChildren(false);
          this.setClipToPadding(false);
          this.C = p0.getResources().getColor(0x7f0617d0);
       }
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxV2StyleCellView.class, "10")) {
          return;
       }
       if (this.L != null) {
          TreasureBoxV2StyleCellView tO = this.O;
          if (tO == null || tO.isDisposed()) {
             this.O = this.L.observable().subscribe(new j(this), Functions.d());
             this.P = b9.c(this.P, new b(this));
          }
       }
       return;
    }
    public final String M(LiveTreasureBoxModel$BoxStatus p0){
       LiveTreasureBoxModel obj = PatchProxy.applyOneRefs(p0, this, TreasureBoxV2StyleCellView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L.mBoxIcons;
       if (q.f(obj)) {
          return null;
       }
       if (TreasureBoxV2StyleCellView$b.a[p0.ordinal()] != 1) {
          return obj.get(0);
       }
       String str = (obj.size() > 2)? obj.get(2): "";
       return str;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxV2StyleCellView.class, "6")) {
          return;
       }
       LiveTreasureBoxModel$BoxStatus oPENED = LiveTreasureBoxModel$BoxStatus.OPENED;
       int i = 1;
       TreasureBoxV2StyleCellView treasureBoxV = (this.M == oPENED && this.L.isSignInBox())? 1: null;
       if (treasureBoxV) {
          treasureBoxV = this.N;
          if (treasureBoxV != null) {
             treasureBoxV.b(this.L);
             return;
          }
       }
       if (this.M != oPENED || (!this.L.isGoldBox() || TextUtils.x(this.L.mJumpUrl))) {
          i = 0;
       }
       if (this.M != LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN && !i) {
          return;
       }else {
          treasureBoxV = this.N;
          if (treasureBoxV != null && treasureBoxV.b(this.L)) {
             this.T();
          }
          return;
       }
    }
    public final void O(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxV2StyleCellView.class, "17")) {
          return;
       }
       this.E.getLayoutParams().width = a1.e(46.00f);
       this.E.getLayoutParams().height = a1.e(19.00f);
       return;
    }
    public void P(boolean p0){
       if (PatchProxy.isSupport(TreasureBoxV2StyleCellView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TreasureBoxV2StyleCellView.class, "9")) {
          return;
       }
       TreasureBoxV2StyleCellView tS = this.S;
       if (tS != null && (tS.isRunning() && !p0)) {
          this.S.cancel();
       }
    label_0028 :
       TreasureBoxV2StyleCellView tS1 = this.S;
       if (tS1 != null) {
          tS1.removeAllListeners();
          this.S = null;
       }
       return;
    }
    public final void Q(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(TreasureBoxV2StyleCellView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, TreasureBoxV2StyleCellView.class, "15")) {
          return;
       }
       int i = 0;
       int i1 = 8;
       if (p1) {
          this.J.setVisibility(i);
          this.I.setVisibility(i1);
       }else {
          this.J.setVisibility(i1);
       }
       if (p2) {
          this.J.setVisibility(i1);
          this.I.setVisibility(i);
       }else {
          this.I.setVisibility(i1);
       }
       TreasureBoxV2StyleCellView tD = this.D;
       if (p1 || p2) {
          i = 4;
       }
       tD.setVisibility(i);
       float f = (p0)? 0x3f19999a: 0x3f800000;
       this.setAlpha(f);
       return;
    }
    public final void R(String p0,int p1,boolean p2,int p3,boolean p4,int p5){
       if (PatchProxy.isSupport(TreasureBoxV2StyleCellView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, TreasureBoxV2StyleCellView.class, "16")) {
             return;
          }
       }
       if (!TextUtils.n(p0, this.E.getText())) {
          this.E.setText(p0);
       }
       this.E.setBackgroundResource(p1);
       this.E.setEnabled(p2);
       this.E.setTextColor(p3);
       TreasureBoxV2StyleCellView tE = this.E;
       float f = (p4)? 12.00f: 11.00f;
       tE.setTextSize(1, f);
       if (!p1) {
          tE.width = this.getWidth();
       }else {
          this.O();
       }
       return;
    }
    public final void S(View p0,t$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TreasureBoxV2StyleCellView.class, "11")) {
          return;
       }
       if (p0 != null) {
          p0.setPivotX(((float)p0.getWidth() * p1.c));
          p0.setPivotY(((float)p0.getHeight() * p1.d));
          p0.setRotation(p1.a());
          p0.setScaleX(p1.b());
          p0.setScaleY(p1.b());
       }
       return;
    }
    public void T(){
       TreasureBoxV2StyleCellView d;
       object obj;
       int i;
       object obj1;
       object oobject2;
       AnimatorSet uAnimatorSet1;
       PatchProxyResult patchProxyRe1;
       ArrayList obj1;
       float[] uofloatArray;
       float[] uofloatArray1;
       float[] uofloatArray2;
       AnimatorSet uAnimatorSet3;
       long l1;
       long l2;
       AnimatorSet uAnimatorSet4;
       long[] olongArray2;
       int i7;
       ValueAnimator valueAnimato2;
       float[] uofloatArray4;
       ArrayList uArrayList6;
       AnimatorSet uAnimatorSet6;
       int i9;
       float[] uofloatArray7;
       long l6;
       long l8;
       LiveTreasureBoxModel$BoxStatus uBoxStatus = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uBoxStatus, TreasureBoxV2StyleCellView.class, "14")) {
          return;
       }
       LiveTreasureBoxModel$BoxStatus boxStatus = uBoxStatus.L.getBoxStatus();
       uBoxStatus.M = boxStatus;
       int b = true;
       if (TextUtils.x(uBoxStatus.M(boxStatus))) {
          d = uBoxStatus.D;
          TreasureBoxV2StyleCellView m = uBoxStatus.M;
          obj = PatchProxy.applyOneRefs(m, uBoxStatus, TreasureBoxV2StyleCellView.class, "3");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(TreasureBoxV2StyleCellView$b.a[m.ordinal()] != b){
             i = this.getTreasureBoxDrawableRes();
          }else {
             i = 0x7f0814a1;
          }
          d.setImageResource(i);
       }else {
          String str = uBoxStatus.M(uBoxStatus.M);
          if (uBoxStatus.D.getTag() == null || !TextUtils.n(uBoxStatus.D.getTag(), str)) {
             uBoxStatus.D.setImageURI(str);
             uBoxStatus.D.setTag(str);
          }
       }
       int i1 = TreasureBoxV2StyleCellView$b.a[uBoxStatus.M.ordinal()];
       ArrayList uArrayList = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int b1 = false;
       if (i1 != b) {
          if (i1 != i4) {
             if (i1 != i3) {
                if (i1 != i2) {
                   if (i1 == uArrayList) {
                      this.R(this.getContext().getString(R.string.arg_RES_7f102d3b), this.getTextBackgroundDrawableRes(), false, uBoxStatus.B, false, TreasureBoxV2StyleCellView.V);
                      uBoxStatus.Q(b1, b, b1);
                   }
                }else {
                   this.R(this.getContext().getString(R.string.arg_RES_7f10252d), this.getTextBackgroundDrawableRes(), true, uBoxStatus.B, false, TreasureBoxV2StyleCellView.V);
                   uBoxStatus.Q(b1, b, b1);
                }
             }else {
                this.R(e.a(Math.max(b1, uBoxStatus.L.getRemainSecond())), this.getTextBackgroundDrawableRes(), true, uBoxStatus.B, true, TreasureBoxV2StyleCellView.V);
                uBoxStatus.Q(b1, b1, b1);
             }
          }else {
             this.R(this.getContext().getString(R.string.arg_RES_7f102d40), 0, true, uBoxStatus.C, false, TreasureBoxV2StyleCellView.W);
             uBoxStatus.Q(b, b1, b1);
          }
       }else if(uBoxStatus.L.isGoldBox() && !TextUtils.x(uBoxStatus.L.mJumpUrl)){
          this.R(this.getContext().getString(R.string.arg_RES_7f10247c), this.getTextBackgroundDrawableRes(), true, uBoxStatus.B, false, TreasureBoxV2StyleCellView.V);
       }else {
          Object[] objArray1 = new Object[b];
          objArray1[b1] = String.valueOf(uBoxStatus.L.mKShell);
          this.R(String.format(this.getContext().getString(R.string.arg_RES_7f10252c), objArray1), 0, false, uBoxStatus.C, false, 0);
       }
       if (uBoxStatus.L.mPendingAnimation != null || uBoxStatus.Q == LiveTreasureBoxModel$BoxStatus.OPENING) {
          if (!PatchProxy.applyVoid(objArray, uBoxStatus, TreasureBoxV2StyleCellView.class, "18")) {
             d = uBoxStatus.L;
             if (d != null && d.mPendingAnimation != null) {
                d = uBoxStatus.S;
                if (d == null || !d.isRunning()) {
                   uBoxStatus.Q(b1, b1, b);
                   d.mPendingAnimation = b1;
                   d = uBoxStatus.K;
                   object oobject = d[b1];
                   obj = d[b];
                   object oobject1 = d[i4];
                   obj1 = d[i3];
                   t ot = t.class;
                   AnimatorSet uAnimatorSet = PatchProxy.applyFourRefs(oobject, obj, oobject1, obj1, null, t.class, "4");
                   if (uAnimatorSet != patchProxyRe) {
                      obj1 = uBoxStatus;
                   }else {
                      uAnimatorSet = new AnimatorSet();
                      u ou = new u();
                      uArrayList = new ArrayList(i2);
                      ArrayList uArrayList1 = PatchProxy.applyTwoRefs(ou, oobject, objArray, ot, "5");
                      int i5 = 6;
                      if (uArrayList1 != patchProxyRe) {
                         oobject2 = oobject1;
                         uAnimatorSet1 = uAnimatorSet;
                      }else {
                         uArrayList1 = new ArrayList(i4);
                         float[] uofloatArray8 = new float[7]{0,0,0x3f800000,0x3f000000,0x3f800000,0x3f000000,0};
                         long[] olongArray5 = new long[7]{0,350,550,750,950,1150,1550};
                         ArrayList uArrayList8 = new ArrayList();
                         i7 = 0;
                         while (i7 < i5) {
                            uofloatArray4 = new float[i4];
                            uofloatArray4[0] = uofloatArray8[i7];
                            int i10 = i7 + 1;
                            uofloatArray4[1] = uofloatArray8[i10];
                            ValueAnimator valueAnimato5 = ValueAnimator.ofFloat(uofloatArray4);
                            long l7 = olongArray5[i10] - olongArray5[i7];
                            l8 = l7 * 1;
                            valueAnimato5.setDuration(l8);
                            valueAnimato5.setEvaluator(ou);
                            valueAnimato5.setTarget(oobject);
                            valueAnimato5.addUpdateListener(new l(oobject));
                            ArrayList uArrayList9 = uArrayList8;
                            uArrayList9.add(valueAnimato5);
                            uArrayList8 = uArrayList9;
                            i7 = i10;
                            i5 = 6;
                            uArrayList9 = 2;
                         }
                         uAnimatorSet3 = new AnimatorSet();
                         uAnimatorSet3.playSequentially(uArrayList8);
                         uAnimatorSet6 = new AnimatorSet();
                         uArrayList6 = new ArrayList();
                         uofloatArray7 = new float[4]{0x3f000000,0x3f800000,0x3f800000,0x3f800000};
                         long[] olongArray6 = new long[4]{0,350,1350,1550};
                         uAnimatorSet1 = uAnimatorSet;
                         patchProxyRe1 = 3;
                         i4 = 0;
                         while (i4 < patchProxyRe1) {
                            uofloatArray = new float[]{uofloatArray7[i4],uofloatArray7[i9]};
                            i9 = i4 + 1;
                            ValueAnimator valueAnimato6 = ValueAnimator.ofFloat(uofloatArray);
                            l6 = olongArray6[i9] - olongArray6[i4];
                            l8 = l6 * 1;
                            valueAnimato6.setDuration(l8);
                            valueAnimato6.setEvaluator(ou);
                            valueAnimato6.setTarget(oobject);
                            valueAnimato6.addUpdateListener(new m(oobject));
                            uArrayList6.add(valueAnimato6);
                            oobject1 = oobject1;
                            i4 = i9;
                            patchProxyRe1 = 3;
                         }
                         oobject2 = oobject1;
                         uAnimatorSet6.playSequentially(uArrayList6);
                         uArrayList1.add(uAnimatorSet3);
                         uArrayList1.add(uAnimatorSet6);
                         uArrayList6.get(0).addListener(new n(oobject));
                         uArrayList6.get((uArrayList6.size() - 1)).addListener(new o(oobject));
                      }
                      uArrayList.addAll(uArrayList1);
                      ArrayList uArrayList2 = PatchProxy.applyTwoRefs(ou, obj1, null, ot, "7");
                      if (uArrayList2 != patchProxyRe) {
                         patchProxyRe1 = patchProxyRe;
                      }else {
                         uArrayList2 = new ArrayList(3);
                         uofloatArray4 = new float[3]{0,0x43870000,0x43870000};
                         olongArray2 = new long[3]{0,700,1550};
                         AnimatorSet uAnimatorSet5 = new AnimatorSet();
                         uArrayList6 = new ArrayList();
                         int i8 = 0;
                         i7 = 2;
                         while (i8 < i7) {
                            uofloatArray1 = new float[i7];
                            uofloatArray1[0] = uofloatArray4[i8];
                            i4 = i8 + 1;
                            uofloatArray1[1] = uofloatArray4[i4];
                            valueAnimato2 = ValueAnimator.ofFloat(uofloatArray1);
                            long l3 = olongArray2[i4] - olongArray2[i8];
                            l2 = l3 * 1;
                            valueAnimato2.setDuration(l2);
                            valueAnimato2.setTarget(obj1);
                            valueAnimato2.setInterpolator(new LinearInterpolator());
                            valueAnimato2.addUpdateListener(new s(obj1));
                            uArrayList6.add(valueAnimato2);
                            patchProxyRe = patchProxyRe;
                            i8 = i4;
                         }
                         patchProxyRe1 = patchProxyRe;
                         uAnimatorSet5.playSequentially(uArrayList6);
                         uofloatArray2 = new float[5]{0,0x3f800000,0x3f800000,0,0};
                         long[] olongArray3 = new long[5]{0,250,450,700,1550};
                         uAnimatorSet6 = new AnimatorSet();
                         uArrayList6 = new ArrayList();
                         i7 = 4;
                         i3 = 0;
                         while (i3 < i7) {
                            i4 = uofloatArray2[i3];
                            i9 = i3 + 1;
                            float[] uofloatArray5 = new float[]{i4,b1};
                            b1 = uofloatArray2[i9];
                            ValueAnimator valueAnimato3 = ValueAnimator.ofFloat(uofloatArray5);
                            long l4 = olongArray3[i9] - olongArray3[i3];
                            long l5 = l4 * 1;
                            valueAnimato3.setDuration(l5);
                            valueAnimato3.setEvaluator(ou);
                            valueAnimato3.setTarget(obj1);
                            valueAnimato3.addUpdateListener(new c(i4, b1, obj1));
                            uArrayList6.add(valueAnimato3);
                            i3 = i9;
                            valueAnimato3 = 4;
                         }
                         uAnimatorSet6.playSequentially(uArrayList6);
                         AnimatorSet uAnimatorSet7 = new AnimatorSet();
                         ArrayList uArrayList7 = new ArrayList();
                         float[] uofloatArray6 = new float[4]{0x3e4ccccd,0x3f99999a,0x3f99999a,0x3f99999a};
                         long[] olongArray4 = new long[4]{0,350,700,1550};
                         Animator uAnimator = 3;
                         i4 = 0;
                         while (i4 < uAnimator) {
                            uofloatArray7 = new float[]{uofloatArray6[i4],uofloatArray6[i9]};
                            i9 = i4 + 1;
                            ValueAnimator valueAnimato4 = ValueAnimator.ofFloat(uofloatArray7);
                            l6 = olongArray4[i9] - olongArray4[i4];
                            l2 = l6 * 1;
                            valueAnimato4.setDuration(l2);
                            valueAnimato4.setEvaluator(ou);
                            valueAnimato4.setTarget(obj1);
                            valueAnimato4.addUpdateListener(new d(obj1));
                            uArrayList7.add(valueAnimato4);
                            uAnimatorSet7 = uAnimatorSet7;
                            i4 = i9;
                            uAnimator = 3;
                         }
                         AnimatorSet uAnimatorSet8 = uAnimatorSet7;
                         uAnimatorSet8.playSequentially(uArrayList7);
                         uArrayList2.add(uAnimatorSet5);
                         uArrayList2.add(uAnimatorSet6);
                         uArrayList2.add(uAnimatorSet8);
                         uArrayList7.get(0).addListener(new e(obj1));
                         uArrayList7.get((uArrayList7.size() - 1)).addListener(new f(obj1));
                      }
                      uArrayList.addAll(uArrayList2);
                      obj1 = PatchProxy.applyTwoRefs(ou, obj, null, ot, "9");
                      if (obj1 != patchProxyRe1) {
                      }else {
                         i = 2;
                         obj1 = new ArrayList(i);
                         uofloatArray2 = new float[6]{0,0,0x3f800000,0x3f000000,0x3f800000,0};
                         long[] olongArray1 = new long[6]{0,550,750,950,1150,1150};
                         uAnimatorSet3 = new AnimatorSet();
                         ArrayList uArrayList4 = new ArrayList();
                         i2 = 0;
                         uofloatArray1 = 5;
                         while (i2 < uofloatArray1) {
                            float[] uofloatArray3 = new float[i];
                            uofloatArray3[0] = uofloatArray2[i2];
                            i = i2 + 1;
                            uofloatArray3[1] = uofloatArray2[i];
                            ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray3);
                            l1 = olongArray1[i] - olongArray1[i2];
                            l2 = l1 * 1;
                            valueAnimato1.setDuration(l2);
                            valueAnimato1.setEvaluator(ou);
                            valueAnimato1.setTarget(obj);
                            valueAnimato1.addUpdateListener(new g(obj));
                            uArrayList4.add(valueAnimato1);
                            i2 = i;
                            uAnimatorSet4 = 2;
                         }
                         uAnimatorSet3.playSequentially(uArrayList4);
                         uAnimatorSet4 = new AnimatorSet();
                         ArrayList uArrayList5 = new ArrayList();
                         uofloatArray2 = new float[3]{0x3f000000,0x3f800000,0x3f800000};
                         olongArray2 = new long[3]{0,550,1550};
                         i7 = 2;
                         i2 = 0;
                         while (i2 < i7) {
                            uofloatArray1 = new float[i7];
                            uofloatArray1[0] = uofloatArray2[i2];
                            i4 = i2 + 1;
                            uofloatArray1[1] = uofloatArray2[i4];
                            valueAnimato2 = ValueAnimator.ofFloat(uofloatArray1);
                            l1 = olongArray2[i4] - olongArray2[i2];
                            l2 = l1 * 1;
                            valueAnimato2.setDuration(l2);
                            valueAnimato2.setEvaluator(ou);
                            valueAnimato2.setTarget(obj);
                            valueAnimato2.addUpdateListener(new h(obj));
                            uArrayList5.add(valueAnimato2);
                            i2 = i4;
                            i7 = 2;
                         }
                         uAnimatorSet4.playSequentially(uArrayList5);
                         obj1.add(uAnimatorSet3);
                         obj1.add(uAnimatorSet4);
                         uArrayList5.get(0).addListener(new i(obj));
                         uArrayList5.get((uArrayList5.size() - 1)).addListener(new j(obj));
                      }
                      uArrayList.addAll(obj1);
                      oobject = oobject2;
                      obj1 = PatchProxy.applyOneRefs(oobject, null, ot, "6");
                      if (obj1 != patchProxyRe1) {
                      }else {
                         obj1 = new ArrayList(2);
                         uofloatArray = new float[4]{0,0,0x3f800000,0x3f800000};
                         long[] olongArray = new long[4]{0,300,700,1550};
                         AnimatorSet uAnimatorSet2 = new AnimatorSet();
                         ArrayList uArrayList3 = new ArrayList();
                         patchProxyRe = 3;
                         for (int i6 = 0; i6 < patchProxyRe; i6 = b) {
                            b = i6 + 1;
                            uofloatArray1 = new float[]{uofloatArray[i6],uofloatArray[b]};
                            ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray1);
                            long l = olongArray[b] - olongArray[i6];
                            l = l * 1;
                            valueAnimato.setDuration(l);
                            valueAnimato.setInterpolator(new OvershootInterpolator());
                            valueAnimato.setTarget(oobject);
                            valueAnimato.addUpdateListener(new p(oobject));
                            uArrayList3.add(valueAnimato);
                         }
                         uAnimatorSet2.playSequentially(uArrayList3);
                         obj1.add(uAnimatorSet2);
                         uArrayList3.get(0).addListener(new q(oobject));
                         uArrayList3.get((uArrayList3.size() - 1)).addListener(new r(oobject));
                      }
                      uArrayList.addAll(obj1);
                      AnimatorSet obj11 = uAnimatorSet1;
                      obj11.playTogether(uArrayList);
                      uAnimatorSet = obj11;
                      obj1 = this;
                   }
                   obj1.S = uAnimatorSet;
                   uAnimatorSet.addListener(obj1.T);
                   obj1.S.start();
                label_058f :
                   obj1.Q = obj1.M;
                   return;
                }
             }
          }
       }else {
          d = uBoxStatus.S;
          if (d == null || !d.isRunning()) {
             uBoxStatus.Q(b1, b1, b1);
          }
       }
    label_008d :
       obj1 = uBoxStatus;
       goto label_058f ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TreasureBoxV2StyleCellView.class, "1")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a38c2);
       this.J = m1.f(p0, 0x7f0a38bf);
       this.H = m1.f(p0, 0x7f0a38c0);
       this.E = m1.f(p0, 0x7f0a0509);
       this.D = m1.f(p0, 0x7f0a050b);
       this.F = m1.f(p0, 0x7f0a38c1);
       this.I = m1.f(p0, 0x7f0a2ebc);
       ImageView[] imageViewArr = new ImageView[]{m1.f(p0, 0x7f0a2ebf),m1.f(p0, 0x7f0a2ec0),m1.f(p0, 0x7f0a2ebd),m1.f(p0, 0x7f0a2ebe)};
       this.K = imageViewArr;
       m1.a(p0, new g(this), R.id.box_button);
       m1.a(p0, new h(this), R.id.box_image_view);
       m1.a(p0, new i(this), R.id.shake_anim_container);
       this.O();
       return;
    }
    public final String getBoxAnimDrawableUrl(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, TreasureBoxV2StyleCellView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.L.mBoxIcons) || this.L.mBoxIcons.size() < 2) {
          return objArray;
       }
       return this.L.mBoxIcons.get(1);
    }
    public final int getLayoutResId(){
       return 0x7f0d0e2b;
    }
    public final int getTextBackgroundDrawableRes(){
       return 0x7f0814a7;
    }
    public final int getTreasureBoxDrawableRes(){
       return 0x7f0814a8;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxV2StyleCellView.class, "12")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.L != null) {
          TreasureBoxV2StyleCellView tO = this.O;
          if (tO == null || tO.isDisposed()) {
             this.L();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxV2StyleCellView.class, "13")) {
          return;
       }
       super.onDetachedFromWindow();
       this.release();
       return;
    }
    public void p(LiveTreasureBoxModel p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TreasureBoxV2StyleCellView.class, "7")) {
          return;
       }
       this.L = p0;
       this.N = p1;
       if (p0 == null || p1 == null) {
          throw new IllegalArgumentException("Çë¼ì²é²ÎÊý");
       }
       if (TextUtils.x(this.getBoxAnimDrawableUrl())) {
          this.H.setPlaceHolderImage(this.getTreasureBoxDrawableRes());
          this.H.L(null);
       }else {
          this.H.L(this.getBoxAnimDrawableUrl());
       }
       this.L();
       this.T();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxV2StyleCellView.class, "8")) {
          return;
       }
       b9.a(this.O);
       b9.a(this.P);
       TreasureBoxV2StyleCellView tL = this.L;
       if (tL != null) {
          if (tL.getBoxStatus() == LiveTreasureBoxModel$BoxStatus.OPENING) {
             this.L.setBoxStatus(LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN);
             this.T();
          }
          this.L.mPendingAnimation = false;
       }
       this.Q = null;
       this.P(false);
       return;
    }
}
