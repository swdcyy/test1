package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import crd.b;
import lnc.b9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.lang.Long;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import aa4.h;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.CharSequence;
import android.widget.TextView;
import android.animation.Animator;
import java.util.Locale;
import lnc.a1;
import aa4.i;
import android.widget.ProgressBar;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.b;
import ekd.m1;
import com.kwai.library.widget.progressbar.RedPacketCircleProgressBar;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;

public class LiveMerchantDiscountDialogGrabButtonView extends FrameLayout implements d	// class@001c1e
{
    public RedPacketCircleProgressBar b;
    public ImageView c;
    public MerchantKwaiImageView d;
    public LinearLayout e;
    public TextView f;
    public TextView g;
    public ConstraintLayout h;
    public TextView i;
    public TextView j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public AnimatorSet n;
    public ObjectAnimator o;
    public ObjectAnimator p;
    public ObjectAnimator q;
    public ObjectAnimator r;
    public b s;
    public b t;
    public b u;
    public int v;
    public int w;
    public boolean x;
    public static final int A = 2131764971;
    public static final int y = 2131761241;
    public static final int z = 2131761242;

    public void LiveMerchantDiscountDialogGrabButtonView(Context p0){
       super(p0, null);
    }
    public void LiveMerchantDiscountDialogGrabButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMerchantDiscountDialogGrabButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogGrabButtonView.class, "1")) {
       }else {
          a.b(p0, R.layout.arg_RES_7f0d1681, this);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDiscountDialogGrabButtonView.class, "23")) {
          return;
       }
       b9.a(this.s);
       this.s = null;
       b9.a(this.t);
       this.t = null;
       LiveMerchantDiscountDialogGrabButtonView tn = this.n;
       if (tn != null) {
          tn.cancel();
          this.n = null;
       }
       tn = this.o;
       if (tn != null) {
          tn.cancel();
          this.o = null;
       }
       this.e();
       this.p = null;
       this.x = false;
       LiveMerchantDiscountDialogGrabButtonView tq = this.q;
       if (tq != null) {
          tq.cancel();
          this.q = null;
       }
       tq = this.r;
       if (tq != null) {
          tq.cancel();
          this.r = null;
       }
       this.v = 0;
       return;
    }
    public void b(long p0){
       if (PatchProxy.isSupport(LiveMerchantDiscountDialogGrabButtonView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveMerchantDiscountDialogGrabButtonView.class, "9")) {
          return;
       }
       MerchantMarketingShopLogBiz lIVE_MERCHAN = MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT;
       String str = "LiveMerchantDiscountDialogButtonView";
       a.s(lIVE_MERCHAN, str, "hide button with anim");
       LiveMerchantDiscountDialogGrabButtonView tq = this.q;
       if (tq != null && tq.isRunning()) {
          this.q.end();
       }
       if (!PatchProxy.isSupport(LiveMerchantDiscountDialogGrabButtonView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveMerchantDiscountDialogGrabButtonView.class, "10")) {
          tq = this.r;
          if (tq != null && tq.isRunning()) {
             a.s(lIVE_MERCHAN, str, "button hide animator is already running");
          }else if(this.r == null){
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3e99999a}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3e99999a}),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
             this.r = objectAnimat;
             objectAnimat.setDuration(p0);
             this.r.addListener(new h(this));
          }
          this.r.start();
       }
       return;
    }
    public final void c(Long p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogGrabButtonView.class, "11")) {
          return;
       }
       String str = null;
       b uob = null;
       if (p0.longValue() - str <= 0) {
          this.d();
          b9.a(this.s);
          this.s = uob;
       }else {
          long l = 0x2710;
          if (p0.longValue() - l <= 0) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogGrabButtonView.class, "19")) {
                int i = 3;
                if (this.v != i) {
                   this.v = i;
                   if (!PatchProxy.applyVoid(uob, this, LiveMerchantDiscountDialogGrabButtonView.class, "21")) {
                      this.h.setVisibility(0);
                      this.d.setVisibility(0);
                      this.l.setVisibility(4);
                      this.e.setVisibility(4);
                   }
                }
                if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogGrabButtonView.class, "20")) {
                   int i1 = (int)(p0.longValue() / 1000);
                   if (p0.longValue() - l < 0) {
                      this.j.setText(String.valueOf((i1 + 1)));
                   }else {
                      this.j.setText("");
                   }
                   this.i.setText(String.valueOf(i1));
                   if (this.n == null) {
                      PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
                      propertyValu[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3fc00000,0x3f800000});
                      propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3fc00000,0x3f800000});
                      propertyValu[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      this.n = uAnimatorSet;
                      Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofPropertyValuesHolder(this.i, propertyValu),ObjectAnimator.ofFloat(this.j, View.ALPHA, new float[2]{0x3f800000,0})};
                      uAnimatorSet.playTogether(uAnimatorArr);
                      this.n.setDuration(300);
                   }
                   this.n.start();
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogGrabButtonView.class, "17")){
             if (this.v != 2) {
                this.v = 2;
                if (!PatchProxy.applyVoid(uob, this, LiveMerchantDiscountDialogGrabButtonView.class, "18")) {
                   this.e.setVisibility(0);
                   this.d.setVisibility(0);
                   this.l.setVisibility(4);
                   this.h.setVisibility(4);
                }
             }
             long l1 = p0.longValue() / 0xea60;
             long l2 = Long.valueOf((p0.longValue() % 0xea60)).longValue() / 1000;
             if (!l1 - str) {
                Object[] objArray = new Object[]{Long.valueOf(l2)};
                str1 = String.format(Locale.CHINA, a1.p(LiveMerchantDiscountDialogGrabButtonView.z), objArray);
             }else {
                Object[] objArray1 = new Object[]{Long.valueOf(l1),Long.valueOf(l2)};
                str1 = String.format(Locale.CHINA, a1.p(LiveMerchantDiscountDialogGrabButtonView.y), objArray1);
             }
             this.f.setText(str1);
          }
       }
       return;
    }
    public final void d(){
       ObjectAnimator objectAnimat;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMerchantDiscountDialogGrabButtonView.class, "13")) {
          return;
       }
       String str = 1;
       if (this.v == str) {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "grab status is already set, no need repeat setup");
          return;
       }else {
          this.v = str;
          int i = 3;
          int i1 = 0;
          if (!PatchProxy.applyVoid(objArray, this, LiveMerchantDiscountDialogGrabButtonView.class, "14")) {
             if (this.o == null) {
                PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i];
                propertyValu1[i1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i]{0x3f800000,0x3f99999a,0x3f800000});
                propertyValu1[str] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i]{0x3f800000,0x3f99999a,0x3f800000});
                propertyValu1[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.l, propertyValu1);
                this.o = objectAnimat;
                objectAnimat.setDuration(300);
                this.o.addListener(new i(this));
             }
             this.setVisibility(i1);
             this.o.start();
             int i2 = 4;
             this.b.setVisibility(i2);
             this.c.setVisibility(i2);
             this.d.setVisibility(i2);
             this.e.setVisibility(i2);
             this.h.setVisibility(i2);
          }
          if (!PatchProxy.applyVoid(objArray, this, LiveMerchantDiscountDialogGrabButtonView.class, "15")) {
             if (this.p == null) {
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
                propertyValu[i1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3fc00000});
                propertyValu[str] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3fc00000});
                propertyValu[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.m, propertyValu);
                this.p = objectAnimat;
                objectAnimat.setDuration(400);
                this.p.setInterpolator(new AccelerateDecelerateInterpolator());
                this.p.addListener(new b(this));
             }
             this.p.start();
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogGrabButtonView.class, "3")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a32df);
       this.c = m1.f(p0, 0x7f0a1393);
       this.d = m1.f(p0, 0x7f0a138d);
       this.e = m1.f(p0, 0x7f0a17a6);
       this.f = m1.f(p0, 0x7f0a3e5c);
       this.g = m1.f(p0, 0x7f0a3e5f);
       this.h = m1.f(p0, 0x7f0a0912);
       this.i = m1.f(p0, 0x7f0a3e5e);
       this.j = m1.f(p0, 0x7f0a3e5d);
       this.k = m1.f(p0, 0x7f0a3e60);
       this.l = m1.f(p0, 0x7f0a138e);
       this.m = m1.f(p0, 0x7f0a1398);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDiscountDialogGrabButtonView.class, "16")) {
          return;
       }
       LiveMerchantDiscountDialogGrabButtonView tp = this.p;
       if (tp != null) {
          tp.cancel();
          this.p = null;
       }
       b9.a(this.u);
       this.u = null;
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDiscountDialogGrabButtonView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       int a = LiveMerchantDiscountDialogGrabButtonView.A;
       this.g.setText(a1.p(a));
       this.k.setText(a1.p(a));
       LiveMerchantDiscountDialogGrabButtonView td = this.d;
       int[] ointArray = new int[]{a1.a(0x7f061de0),a1.a(0x7f061df2)};
       int i = 1;
       GradientDrawable gradientDraw = PatchProxy.applyOneRefs(ointArray, this, LiveMerchantDiscountDialogGrabButtonView.class, "22");
       if (gradientDraw != PatchProxyResult.class) {
       }else {
          gradientDraw = new GradientDrawable();
          gradientDraw.setShape(i);
          gradientDraw.setOrientation(GradientDrawable$Orientation.TOP_BOTTOM);
          gradientDraw.setColors(ointArray);
       }
       td.setBackground(gradientDraw);
       return;
    }
}
