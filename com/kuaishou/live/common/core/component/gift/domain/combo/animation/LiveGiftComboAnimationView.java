package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$c;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.animation.ValueAnimator;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import android.view.View;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ph1.j;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$e;
import android.animation.AnimatorSet;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$a;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$b;
import android.widget.ImageView;
import ph1.q;
import th0.d;
import android.animation.PropertyValuesHolder;
import d61.l;
import ph1.p;
import ph1.o;
import ph1.n;
import th0.c;
import ph1.m;
import rm1.l;
import hc.a;
import android.view.ViewGroup;
import java.lang.Runnable;
import e93.f;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import l12.d;
import va1.f0;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import com.kuaishou.live.common.core.basic.tools.l;
import android.view.MotionEvent;
import ph1.k;
import ph1.l;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$d;
import ph1.r;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import oh1.c;

public class LiveGiftComboAnimationView extends FrameLayout	// class@001178
{
    public KwaiImageView A;
    public KwaiImageView B;
    public AnimatorSet C;
    public ImageView D;
    public boolean E;
    public final Runnable F;
    public KwaiImageView b;
    public View c;
    public KwaiImageView d;
    public AnimatorSet e;
    public AnimatorSet f;
    public ObjectAnimator g;
    public AnimatorSet h;
    public AnimatorSet i;
    public AnimatorSet j;
    public AnimatorSet k;
    public AnimatorSet l;
    public AnimatorSet m;
    public ValueAnimator n;
    public ObjectAnimator o;
    public long p;
    public c q;
    public boolean r;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public AnimatorSet v;
    public a w;
    public Animator x;
    public Animator y;
    public Animator z;
    public static final int G;

    public void LiveGiftComboAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveGiftComboAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftComboAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = 3000;
       this.r = false;
       this.F = new LiveGiftComboAnimationView$c(this);
    }
    public final void a(int p0,int p1,boolean p2,Animator$AnimatorListener p3){
       if (PatchProxy.isSupport(LiveGiftComboAnimationView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, LiveGiftComboAnimationView.class, "24")) {
          return;
       }
       LiveGiftComboAnimationView tn = this.n;
       if (tn != null && (tn.isRunning() && this.n.getDuration() > 0)) {
          long duration = this.n.getDuration();
          long currentPlayT = this.n.getCurrentPlayTime();
          this.n.pause();
          long l = (long)p0;
          this.n.setDuration(l);
          this.n.setRepeatCount(p1);
          this.n.removeAllListeners();
          if (p3 != null) {
             this.n.addListener(p3);
          }
          this.n.resume();
          this.n.setCurrentPlayTime((((currentPlayT % duration) * l) / duration));
       }else if(p2){
          this.c(p0, p1, p3);
       }else if(p3 != null){
          p3.onAnimationEnd(this.n);
       }
       return;
    }
    public void b(){
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.j = null;
       this.k = null;
       this.l = null;
       this.m = null;
       this.o = null;
       this.q = null;
    }
    public final void c(int p0,int p1,Animator$AnimatorListener p2){
       ObjectAnimator objectAnimat;
       if (PatchProxy.isSupport(LiveGiftComboAnimationView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LiveGiftComboAnimationView.class, "23")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       this.n();
       LiveGiftComboAnimationView tt = this.t;
       float[] uofloatArray = new float[2]{0,0x43b40000};
       if (PatchProxy.isSupport(LiveGiftComboAnimationView.class)) {
          objectAnimat = PatchProxy.applyFourRefs(tt, Integer.valueOf(p0), p2, uofloatArray, this, LiveGiftComboAnimationView.class, "25");
          if (objectAnimat != PatchProxyResult.class) {
          label_0066 :
             this.n = objectAnimat;
             objectAnimat.setRepeatCount(p1);
             this.n.start();
             return;
          }
       }
       objectAnimat = ObjectAnimator.ofFloat(tt, View.ROTATION, uofloatArray);
       objectAnimat.setDuration((long)p0);
       objectAnimat.setInterpolator(new LinearInterpolator());
       objectAnimat.addListener(new j(this, tt, p2));
       goto label_0066 ;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "12")) {
          return;
       }
       this.i((int)b.b("DefaultPreferenceHelper").getLong("giftComboExpireSeconds", 3000), true, 0, false, new LiveGiftComboAnimationView$e(this));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "20")) {
          return;
       }
       this.k();
       this.j();
       this.p();
       int i = 1;
       String str = "scaleY";
       String str1 = "scaleX";
       int i1 = 2;
       if (this.m == null) {
          this.m = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.d, str1, new float[i1]{0x3f800000,0x3fc00000}),ObjectAnimator.ofFloat(this.d, str, new float[i1]{0x3f800000,0x3fc00000}),j.a(this.d, new float[i1]{0x3f333333,0})};
          this.m.playTogether(uAnimatorArr);
          this.m.setDuration(500);
       }
       this.m.removeAllListeners();
       this.m.addListener(new LiveGiftComboAnimationView$a(this));
       if (this.k == null) {
          this.k = new AnimatorSet();
          Animator[] uAnimatorArr1 = new Animator[i1];
          uAnimatorArr1[0] = ObjectAnimator.ofFloat(this.c, str1, new float[i1]{0x3f4ccccd,0x3f800000});
          uAnimatorArr1[i] = ObjectAnimator.ofFloat(this.c, str, new float[i1]{0x3f4ccccd,0x3f800000});
          this.k.playTogether(uAnimatorArr1);
          this.k.setDuration(200);
       }
       this.k.removeAllListeners();
       this.k.addListener(new LiveGiftComboAnimationView$b(this));
       this.d.setVisibility(0);
       this.m.start();
       this.k.start();
       return;
    }
    public void f(){
       ObjectAnimator objectAnimat;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "13")) {
          return;
       }
       if (this.r != null) {
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "15")) {
             this.l();
             this.d();
          }
       }else if(PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "16")){
          this.l();
          int i = 2;
          if (this.g == null) {
             LiveGiftComboAnimationView tD = (this.r != null)? this.D: this.b;
             objectAnimat = ObjectAnimator.ofFloat(tD, "rotation", new float[i]{0,0x43b40000});
             this.g = objectAnimat;
             objectAnimat.setDuration(this.p);
             this.g.start();
          }
          this.g.removeAllListeners();
          this.g.addListener(new q(this));
          this.g.start();
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "17")) {
             if (this.h == null) {
                this.h = new AnimatorSet();
                objectAnimat = ObjectAnimator.ofFloat(this.c, "scaleX", new float[3]{0x3f800000,0x3f666666,0x3f800000});
                objectAnimat.setInterpolator(new d());
                objectAnimat.setRepeatCount(10);
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.c, "scaleY", new float[3]{0x3f800000,0x3f666666,0x3f800000});
                objectAnimat1.setRepeatCount(10);
                objectAnimat1.setInterpolator(new d());
                Animator[] uAnimatorArr = new Animator[i];
                uAnimatorArr[0] = objectAnimat;
                uAnimatorArr[1] = objectAnimat1;
                this.h.playTogether(uAnimatorArr);
                this.h.setDuration(1000);
             }
             this.d.setVisibility(0);
             this.h.start();
          }
       }
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "6")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       int i2 = 2;
       if (this.r != null) {
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "8")) {
             if (this.y == null) {
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i2];
                propertyValu[i1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i2]{0x3f800000,0});
                propertyValu[i] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i2]{0x3f800000,0});
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu);
                this.y = objectAnimat;
                objectAnimat.setInterpolator(new l(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
                this.y.setDuration(120);
             }
             this.y.removeAllListeners();
             this.y.addListener(new p(this));
             this.y.start();
          }
       }else if(PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "7")){
          if (this.j == null) {
             this.j = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.c, "scaleX", new float[i2]{0x3f800000,0}),ObjectAnimator.ofFloat(this.c, "scaleX", new float[i2]{0x3f800000,0x3f333333}),ObjectAnimator.ofFloat(this.c, "scaleY", new float[i2]{0x3f800000,0x3f333333})};
             this.j.playTogether(uAnimatorArr);
             this.j.setDuration(300);
          }
          this.j.start();
          this.j.removeAllListeners();
          this.j.addListener(new o(this));
       }
       return;
    }
    public void h(){
       int i1;
       int i2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "2")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "45")) {
          LiveGiftComboAnimationView ts = this.s;
          i1 = 8;
          if (ts != null) {
             i2 = (this.r != null)? 0: 8;
             ts.setVisibility(i2);
          }
          ts = this.b;
          if (ts != null) {
             i2 = (this.r != null)? 8: 0;
             ts.setVisibility(i2);
          }
          ts = this.D;
          if (ts != null) {
             if (this.r != null) {
                i1 = 0;
             }
             ts.setVisibility(i1);
          }
       }
       i1 = 1;
       i2 = 2;
       if (this.r != null) {
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "4")) {
             if (this.x == null) {
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i2];
                propertyValu[i] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i2]{0,0x3f800000});
                propertyValu[i1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i2]{0,0x3f800000});
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu);
                this.x = objectAnimat;
                objectAnimat.setInterpolator(new l(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
                this.x.setDuration(120);
             }
             this.x.removeAllListeners();
             this.x.addListener(new n(this));
             this.x.start();
          }
       }else if(PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "3")){
          if (this.e == null) {
             this.e = new AnimatorSet();
             this.e.setDuration(500);
             this.e.setInterpolator(new c());
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.c, "scaleX", new float[i2]{0x3f000000,0x3f800000}),ObjectAnimator.ofFloat(this.c, "scaleY", new float[i2]{0x3f000000,0x3f800000}),j.a(this.c, new float[i2]{0,0x3f800000})};
             this.e.playTogether(uAnimatorArr);
          }
          this.e.start();
          this.e.removeAllListeners();
          this.e.addListener(new m(this));
       }
       return;
    }
    public void i(int p0,boolean p1,int p2,boolean p3,Animator$AnimatorListener p4){
       if (PatchProxy.isSupport(LiveGiftComboAnimationView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Boolean.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "22")) {
             return;
          }
       }
       if (this.t == null) {
          return;
       }else if(!p1){
          this.a(p0, p2, p3, p4);
       }else {
          this.c(p0, p2, p4);
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "34")) {
          return;
       }
       LiveGiftComboAnimationView tl = this.l;
       if (tl != null) {
          tl.removeAllListeners();
          this.l.end();
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "33")) {
          return;
       }
       LiveGiftComboAnimationView tk = this.k;
       if (tk != null) {
          tk.removeAllListeners();
          this.k.end();
       }
       return;
    }
    public void l(){
       LiveGiftComboAnimationView tz;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "30")) {
          return;
       }
       if (this.r != null) {
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "31")) {
             if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "5")) {
                tz = this.x;
                if (tz != null) {
                   tz.removeAllListeners();
                   this.x.cancel();
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "9")) {
                tz = this.y;
                if (tz != null) {
                   tz.removeAllListeners();
                   this.y.cancel();
                }
             }
             this.o();
             if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "41")) {
                tz = this.z;
                if (tz != null) {
                   tz.removeAllListeners();
                   this.z.end();
                }
                tz = this.D;
                if (tz != null) {
                   tz.setScaleX(0x3f800000);
                   this.D.setScaleY(0x3f800000);
                }
             }
             this.m();
          }
       }else if(PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "29")){
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "18")) {
             tz = this.e;
             if (tz != null) {
                tz.removeAllListeners();
                this.e.end();
             }
             tz = this.f;
             if (tz != null) {
                tz.removeAllListeners();
                this.f.end();
             }
             tz = this.o;
             if (tz != null) {
                tz.removeAllListeners();
                this.o.end();
             }
          }
          this.m();
          this.p();
          if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "32")) {
             tz = this.j;
             if (tz != null) {
                tz.removeAllListeners();
                this.j.end();
             }
          }
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "27")) {
          return;
       }
       LiveGiftComboAnimationView tg = this.g;
       if (tg != null) {
          tg.removeAllListeners();
          this.g.end();
       }
       this.d.setVisibility(8);
       tg = this.h;
       if (tg != null) {
          tg.removeAllListeners();
          this.h.end();
       }
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "28")) {
          return;
       }
       LiveGiftComboAnimationView tn = this.n;
       if (!PatchProxy.applyVoidOneRefs(tn, objArray, l.class, "6") && (tn != null && tn.isRunning())) {
          tn.removeAllListeners();
          tn.end();
       }
    label_0027 :
       this.n = objArray;
       tn = this.t;
       if (tn != null) {
          tn.setVisibility(8);
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "42")) {
          return;
       }
       LiveGiftComboAnimationView tw = this.w;
       if (tw != null && this.u != null) {
          tw.stop();
          this.u.setVisibility(8);
       }
       tw = this.v;
       if (tw != null && this.A != null) {
          tw.cancel();
          this.A.setVisibility(8);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "46")) {
          return;
       }
       super.onDetachedFromWindow();
       f.f(this.F);
       this.l();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       KwaiImageView kwaiImageVie = m1.f(this, R.id.live_gift_box_combo_button_count_down_view);
       this.b = kwaiImageVie;
       f0.a(kwaiImageVie, LiveGiftResourcePathConstant.LIVE_GIFT_COMBO_BUTTON_ICON);
       this.c = m1.f(this, 0x7f0a1d12);
       this.d = m1.f(this, 0x7f0a1d14);
       this.u = m1.f(this, 0x7f0a1d35);
       this.s = m1.f(this, 0x7f0a1d13);
       this.A = m1.f(this, 0x7f0a1d1b);
       this.B = m1.f(this, 0x7f0a1d1a);
       this.D = m1.f(this, 0x7f0a1d16);
       this.t = m1.f(this, 0x7f0a1d17);
       LiveGiftComboButtonAnimationUtils$a h = LiveGiftComboButtonAnimationUtils.h;
       l.a(this.d, h.a("live_gift_combo_light_wave"));
       l.a(this.A, h.a("live_gift_combo_light_wave"));
       l.a(this.s, h.a("live_gift_combo_bg"));
       l.a(this.B, h.a("live_gift_combo_water_wave"));
       l.a(this.t, h.a("live_gift_combo_progress"));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LiveGiftComboAnimationView tD;
       int i2;
       int i4;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftComboAnimationView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getVisibility()) {
          this.l();
          this.n();
          return b;
       }else {
          int action = p0.getAction();
          int i = 0x3f800000;
          String str = "scaleY";
          String str1 = "scaleX";
          Object[] objArray = null;
          if (action) {
             int i1 = 3;
             if (action == 1 || action == i1) {
                if (this.r != null) {
                   f.f(this.F);
                   this.o();
                   this.setCountDownViewPressed(b);
                   if (this.E != null) {
                      if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "40")) {
                         tD = this.D;
                         if (tD != null && tD.getScaleX() - i) {
                            float[] uofloatArray = new float[]{this.D.getScaleX(),0x3f866666,i2,i,i4,i};
                            i2 = 0x3f6147ae;
                            int i3 = 4;
                            i4 = 0x3f75c28f;
                            int i5 = 5;
                            float[] uofloatArray1 = new float[]{this.D.getScaleY(),0x3f866666,i2,i,i4,i};
                            PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1)};
                            ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.D, propertyValu);
                            this.z = objectAnimat;
                            objectAnimat.setDuration(1000);
                            this.z.setInterpolator(new LinearInterpolator());
                            this.z.addListener(new k(this));
                            this.z.start();
                         }
                      }
                      this.i(1000, false, 0, false, null);
                      this.E = b;
                   }else if(!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "43") && (this.B == null || this.D == null)){
                      if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "44")) {
                         tD = this.C;
                         if (tD != null && this.B != null) {
                            tD.removeAllListeners();
                            this.C.cancel();
                            this.B.setVisibility(8);
                         }
                      }
                      this.B.setVisibility(b);
                      if (this.C == null) {
                         this.C = new AnimatorSet();
                         PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0x3f800000,0x3f733333,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0x3f800000,0x3f733333,0x3f800000})};
                         ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.D, propertyValu1);
                         objectAnimat1.setDuration(80);
                         objectAnimat1.setInterpolator(new LinearInterpolator());
                         Animator[] uAnimatorArr = new Animator[i1];
                         uAnimatorArr[b] = ObjectAnimator.ofFloat(this.B, str1, new float[2]{0x3f59999a,0x3fa147ae});
                         uAnimatorArr[1] = ObjectAnimator.ofFloat(this.B, str, new float[2]{0x3f59999a,0x3fa147ae});
                         uAnimatorArr[2] = objectAnimat1;
                         this.C.playTogether(uAnimatorArr);
                      }
                      this.C.removeAllListeners();
                      this.C.addListener(new l(this));
                      this.C.start();
                   }
                }else {
                   this.e();
                }
                this.requestDisallowInterceptTouchEvent(b);
             }
          }else if(this.r != null){
             this.l();
             if (!PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "11")) {
                tD = this.c;
                if (tD != null) {
                   tD.setScaleX(i);
                   this.c.setScaleY(i);
                   this.c.setAlpha(i);
                }
             }
             this.n();
             f.j("comboButtonHold", this.F, 500);
             this.setCountDownViewPressed(true);
             this.i(400, true, 0, false, new LiveGiftComboAnimationView$d(this));
          }else if(PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView.class, "19")){
             this.l();
             this.j();
             this.k();
             if (this.l == null) {
                AnimatorSet uAnimatorSet = new AnimatorSet();
                this.l = uAnimatorSet;
                Animator[] uAnimatorArr1 = new Animator[]{ObjectAnimator.ofFloat(this.c, str1, new float[2]{0x3f800000,0x3f4ccccd}),ObjectAnimator.ofFloat(this.c, str, new float[2]{0x3f800000,0x3f4ccccd})};
                uAnimatorSet.playTogether(uAnimatorArr1);
                this.l.setDuration(200);
             }
             this.l.removeAllListeners();
             this.l.addListener(new r(this));
             this.d.setVisibility(b);
             this.l.start();
          }
          this.requestDisallowInterceptTouchEvent(true);
          return true;
       }
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "26")) {
          return;
       }
       if (this.i != null) {
          this.d.setVisibility(8);
          this.i.removeAllListeners();
          this.i.end();
       }
       return;
    }
    public void setComboAnimViewNewStyleEnabled(boolean p0){
       if (PatchProxy.isSupport(LiveGiftComboAnimationView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftComboAnimationView.class, "35")) {
          return;
       }
       this.r = p0;
       if (p0 && !PatchProxy.applyVoid(null, this, LiveGiftComboAnimationView.class, "14")) {
          View view = m1.f(this, R.id.live_gift_box_combo_button_text_view);
          if (view instanceof KwaiImageView) {
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             layoutParams.width = a1.d(0x7f070310);
             layoutParams.height = a1.d(0x7f0702fe);
             view.setLayoutParams(layoutParams);
             l.a(view, LiveGiftComboButtonAnimationUtils.h.a("live_gift_send_combo_press_new"));
          }
       }
       return;
    }
    public void setComboCountDownDuration(long p0){
       this.p = p0;
    }
    public final void setCountDownViewPressed(boolean p0){
       if (PatchProxy.isSupport(LiveGiftComboAnimationView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftComboAnimationView.class, "36")) {
          return;
       }
       LiveGiftComboAnimationView tD = this.D;
       if (tD != null) {
          Drawable drawable = tD.getDrawable();
          if (drawable instanceof TransitionDrawable) {
             drawable.setCrossFadeEnabled(true);
             if (p0) {
                drawable.startTransition(40);
             }else {
                drawable.reverseTransition(40);
             }
          }
       }
       return;
    }
    public void setLiveGifComboAnimationListener(c p0){
       this.q = p0;
    }
}
