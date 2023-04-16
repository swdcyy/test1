package com.yxcorp.gifshow.v3.previewer.ktv.l;
import ml8.d;
import jz6.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import android.content.Context;
import android.widget.ImageView;
import android.app.Dialog;
import com.yxcorp.utility.n;
import android.animation.AnimatorSet;
import mwc.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import java.lang.StringBuilder;
import java.lang.Runnable;
import ekd.k1;
import android.widget.CheckBox;
import ooc.p0;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import java.lang.Math;
import android.animation.Animator;
import android.view.ViewAnimationUtils;
import com.yxcorp.gifshow.v3.previewer.ktv.k;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import android.widget.TextView;
import mwc.t;
import android.view.View$OnClickListener;
import mwc.u;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.os.Bundle;
import i2b.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import lnc.a1;
import mwc.v;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.v3.previewer.ktv.j;
import mwc.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import mwc.x;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public class l extends a implements d	// class@0015c7
{
    public int A;
    public KtvInfo B;
    public String C;
    public boolean D;
    public final Runnable E;
    public TextView b;
    public CheckBox c;
    public TextView d;
    public ImageView e;
    public ImageView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public KwaiImageView i;
    public KwaiImageView j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final float p;
    public AnimatorSet q;
    public AnimatorSet r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public String x;
    public String y;
    public boolean z;

    public void l(KtvInfo p0,boolean p1,Context p2,ImageView p3){
       super(p2, 0x7f110128);
       this.k = n.c(this.getContext(), -60.00f);
       this.l = n.c(this.getContext(), 20.00f);
       this.m = n.c(this.getContext(), 0x41f00000);
       this.n = n.c(this.getContext(), 20.00f);
       this.o = n.c(this.getContext(), 0x42f00000);
       this.p = 0.40f;
       this.q = new AnimatorSet();
       this.r = new AnimatorSet();
       this.s = 800;
       this.t = 500;
       this.u = 300;
       this.v = 200;
       this.w = 300;
       this.x = "D";
       this.y = "0";
       this.C = "off";
       this.E = new w(this);
       this.z = p1;
       this.B = p0;
       this.f = p3;
       if (p0 != null) {
          p0 = p0.mKtvScoreInfo;
          if (p0 != null && !PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
             this.x = p0.mLevel;
             this.y = p0.mTotalScore+"";
          }
       }
       return;
    }
    public static void d(l p0){
       super.dismiss();
    }
    public static void e(l p0){
       super.dismiss();
    }
    public void dismiss(){
       l tn;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "4")) {
          return;
       }
       k1.m(this.E);
       if (this.f()) {
          this.B.mKtvScoreInfo.mShouldDisPlay = this.c.isChecked();
       }
       if (this.D == null) {
          int b = true;
          this.D = b;
          boolean b1 = this.c.isChecked();
          l tC = this.C;
          p0 op0 = p0.class;
          if (!PatchProxy.isSupport(op0) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), tC, objArray, op0, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SCORER_CARD";
             String str = "show";
             String str1 = (!b1)? "unshow": str;
             i3 oi3 = i3.f();
             oi3.d("off", tC);
             oi3.d(str, str1);
             uElementPack.params = oi3.e();
             u1.u(b, uElementPack, new ClientContent$ContentPackage());
          }
          if (!PatchProxy.applyVoid(objArray, this, l.class, "16")) {
             View view = this.findViewById(R.id.ktv_score_root);
             if (view != null && view.isAttachedToWindow()) {
                int i = 0;
                if (this.f != null && this.getContext() != null) {
                   int[] ointArray = n.p(this.f);
                   i = ointArray[i] + (this.f.getWidth() / 4);
                   b = (ointArray[b] - n.A(this.getContext())) + (this.f.getHeight() / 2);
                }else {
                   tn = 0;
                }
                if (i <= 0 || b <= 0) {
                   i = view.getWidth() - this.m;
                   tn = this.n;
                }
                Animator uAnimator = ViewAnimationUtils.createCircularReveal(view, i, tn, (float)Math.hypot((double)view.getWidth(), (double)view.getHeight()), 0);
                uAnimator.addListener(new k(this, view));
                uAnimator.setDuration(400);
                uAnimator.start();
             }else {
                l.e(this);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1663);
       this.e = m1.f(p0, 0x7f0a1662);
       this.c = m1.f(p0, 0x7f0a165f);
       this.d = m1.f(p0, 0x7f0a1660);
       m1.a(p0, new t(this), R.id.ktv_score_dialog_know);
       m1.a(p0, new u(this), R.id.ktv_score_dialog_check_state);
       this.g = m1.f(p0, 0x7f0a164f);
       this.h = m1.f(p0, 0x7f0a165c);
       this.i = m1.f(p0, 0x7f0a1650);
       this.j = m1.f(p0, 0x7f0a165d);
       return;
    }
    public final boolean f(){
       l tB = this.B;
       if (tB != null && tB.mKtvScoreInfo != null) {
          return true;
       }
       return false;
    }
    public void onCreate(Bundle p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       super.onCreate(p0);
       View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0714);
       this.setContentView(view);
       this.doBindView(view);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, l.class, "8")) {
          if (this.x == null) {
             this.x = "D";
          }
          this.A = (this.y).length();
          l te = this.e;
          l tx = this.x;
          Object obj = PatchProxy.applyOneRefs(tx, this, l.class, "11");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             Objects.requireNonNull(tx);
             int i1 = -1;
             switch (tx.hashCode()){
                 case 'A':
                   if (tx.equals("A")) {
                      i1 = 0;
                   }
                   break;
                 case 'B':
                   if (tx.equals("B")) {
                      i1 = 1;
                   }
                   break;
                 case 'C':
                   if (tx.equals("C")) {
                      i1 = 2;
                   }
                   break;
                 case 'S':
                   if (tx.equals("S")) {
                      i1 = 3;
                   }
                   break;
                 case 2656:
                   if (tx.equals("SS")) {
                      i1 = 4;
                   }
                   break;
                 case 0x141f3:
                   if (tx.equals("SSS")) {
                      i1 = 5;
                   }
                   break;
                 default:
             }
             switch (i1){
                 case 0:
                   i = 0x7f081030;
                   break;
                 case 1:
                   i = 0x7f081031;
                   break;
                 case 2:
                   i = 0x7f081032;
                   break;
                 case 3:
                   i = 0x7f08102f;
                   break;
                 case 4:
                   i = 0x7f08102e;
                   break;
                 case 5:
                   i = 0x7f081034;
                   break;
                 default:
                   i = 0x7f081033;
             }
          }
          te.setBackground(a1.f(i));
          this.c.setOnCheckedChangeListener(new v(this));
          if (this.f()) {
             this.c.setChecked(this.B.mKtvScoreInfo.mShouldDisPlay);
          }
          if (this.z == null) {
             this.s = 0;
             this.t = 0;
             this.u = 0;
             this.v = 0;
             this.w = 0;
          }else {
             k1.r(this.E, 4000);
          }
          if (!PatchProxy.applyVoid(objArray, this, l.class, "12")) {
             int[] ointArray = new int[]{0,this.B.mKtvScoreInfo.mTotalScore};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             valueAnimato.setInterpolator(new AccelerateInterpolator());
             valueAnimato.setDuration((long)this.s);
             valueAnimato.addListener(new j(this));
             valueAnimato.addUpdateListener(new s(this));
             valueAnimato.start();
          }
          if (!PatchProxy.applyVoid(objArray, this, l.class, "10")) {
             this.g.setPivotX((float)this.o);
             this.g.setPivotY(0);
             this.h.setPivotX((float)this.o);
             this.h.setPivotY(0);
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.g, "rotation", new float[2]{0,0xc1f00000});
             objectAnimat.setInterpolator(new LinearInterpolator());
             objectAnimat.setRepeatCount(0);
             objectAnimat.setDuration(500);
             objectAnimat.addListener(new x(this));
             objectAnimat.start();
             objectAnimat = ObjectAnimator.ofFloat(this.h, "rotation", new float[2]{0,0x41f00000});
             objectAnimat.setInterpolator(new LinearInterpolator());
             objectAnimat.setRepeatCount(0);
             objectAnimat.setDuration(500);
             objectAnimat.start();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       k1.m(this.E);
       super.onDetachedFromWindow();
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       super.show();
       WindowManager$LayoutParams attributes = this.getWindow().getAttributes();
       attributes.gravity = 17;
       attributes.width = -1;
       attributes.height = -1;
       this.getWindow().getDecorView().setPadding(0, 0, 0, 0);
       this.getWindow().setAttributes(attributes);
       return;
    }
}
