package com.yxcorp.gifshow.slider.SliderView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import hjc.b;
import java.util.ArrayList;
import o79.i;
import android.view.VelocityTracker;
import android.view.View;
import a2.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.TextPaint;
import kotlin.jvm.internal.a;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.Log;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.yxcorp.gifshow.slider.SliderView$b;
import android.animation.Animator$AnimatorListener;
import th0.j;
import android.animation.TimeInterpolator;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import g79.a;
import w69.x;
import java.lang.Float;
import java.util.List;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.slider.SliderView$a;
import java.lang.CharSequence;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;

public final class SliderView extends LinearLayout	// class@001d43
{
    public b b;
    public List c;
    public boolean d;
    public int e;
    public TextView f;
    public TextView g;
    public TextView h;
    public boolean i;
    public boolean j;
    public float k;
    public final int l;
    public final VelocityTracker m;
    public float n;
    public HashMap o;

    public void SliderView(Context p0){
       super(p0, null, 0);
       this.b = new b(0, 0);
       this.c = new ArrayList();
       this.e = 1;
       this.l = i.d(16.00f);
       this.m = VelocityTracker.obtain();
       this.setAlpha(0);
       this.setOrientation(1);
       i0.A0(this, 24.00f);
       this.setBackgroundResource(R.drawable.arg_RES_7f080f8e);
    }
    public void SliderView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.b = new b(0, 0);
       this.c = new ArrayList();
       this.e = 1;
       this.l = i.d(16.00f);
       this.m = VelocityTracker.obtain();
       this.setAlpha(0);
       this.setOrientation(1);
       i0.A0(this, 24.00f);
       this.setBackgroundResource(R.drawable.arg_RES_7f080f8e);
    }
    public void SliderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new b(0, 0);
       this.c = new ArrayList();
       this.e = 1;
       this.l = i.d(16.00f);
       this.m = VelocityTracker.obtain();
       this.setAlpha(0);
       this.setOrientation(1);
       i0.A0(this, 24.00f);
       this.setBackgroundResource(R.drawable.arg_RES_7f080f8e);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SliderView.class, "10")) {
          return;
       }
       float f = 12.00f;
       int i = 0;
       this.setPadding(i.d(f), i, i.d(f), i);
       if (this.f != null) {
          return;
       }
       TextView textView = new TextView(this.getContext());
       this.f = textView;
       textView.setGravity(17);
       textView.setTextSize(1, f);
       TextPaint paint = textView.getPaint();
       a.h(paint, "paint");
       paint.setFakeBoldText(1);
       textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.arg_RES_7f060b75));
       textView.setTypeface(Typeface.create("sans-serif-medium", i));
       textView.setMinWidth(i.d(48.00f));
       this.addView(this.f, new LinearLayout$LayoutParams(-2, -1));
       this.getLayoutParams().width = -2;
       this.requestLayout();
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SliderView.class, "3")) {
          return;
       }
       if (this.i == null && this.j == null) {
          Log.g("Slider", "slider show");
          AnimatorSet uAnimatorSet = new AnimatorSet();
          float[] uofloatArray = new float[]{(float)(this.getWidth() + this.l),0};
          uAnimatorSet.setDuration(100);
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this, View.ALPHA, new float[2]{0,0x3f800000}),ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray)};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.addListener(new SliderView$b(this));
          uAnimatorSet.setInterpolator(new j());
          uAnimatorSet.start();
          if (!PatchProxy.applyVoid(objArray, objArray, d.class, "21")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             showEvent.urlPackage = urlPackage;
             urlPackage.params = "task_id="+d.a;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FAST_LOACTION";
             showEvent.elementPackage = uElementPack;
             a.c.f().h(showEvent);
          }
          this.i = true;
       }
       return;
    }
    public final void c(float p0){
       if (PatchProxy.isSupport(SliderView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SliderView.class, "5")) {
          return;
       }
       SliderView tb = this.b;
       float f = tb.b();
       float f1 = tb.a();
       float f2 = this.getTranslationY() + p0;
       if (f2 - f < 0) {
          if (p0 - (float)0 > 0) {
             f = f + p0;
          }
          f1 = f;
       }else if(f2 - f1 > 0){
          f1 = f2;
       }
       if (f2 - f1) {
          Log.g("Slider", "before adjust dy="+p0+", finalTranslationY="+f2);
          Log.g("Slider", "after adjust dy="+p0+", finalTranslationY="+f1);
       }
       this.setTranslationY(f1);
       Log.g("Slider", "translationY = "+this.getTranslationY()+", range="+tb);
       return;
    }
    public final boolean getGuiding$core_release(){
       return this.d;
    }
    public final b getSlideRange$core_release(){
       return this.b;
    }
    public final List getSliderStateListeners(){
       return this.c;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float[] uofloatArray;
       SliderView te;
       StringBuilder str1;
       SliderView th;
       CharSequence text;
       Object obj = PatchProxy.applyOneRefs(p0, this, SliderView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.i == null) {
          return b;
       }
       if (p0 != null) {
          this.m.addMovement(p0);
          float f = Float.valueOf(p0.getRawY()).floatValue();
          int action = p0.getAction();
          String str = "translationAnim";
          float f1 = 48.00f;
          float f2 = 0;
          CharSequence uCharSequenc = null;
          int i = 2;
          if (action) {
             if (action != 1) {
                if (action != i) {
                   if (action == 3) {
                   }
                }else {
                   float f3 = f - this.k;
                   this.n = this.n + f3;
                   this.c(f3);
                   this.m.computeCurrentVelocity(1000);
                   Iterator iterator1 = this.c.iterator();
                   while (iterator1.hasNext()) {
                      SliderView tm = this.m;
                      a.h(tm, "velocityTracker");
                      iterator1.next().b(f3, tm.getYVelocity());
                   }
                }
             }else {
             }
          }else {
             this.requestDisallowInterceptTouchEvent(true);
             Iterator iterator = this.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().c();
             }
             float[] uofloatArray1 = new float[i];
             uofloatArray1[b] = f2;
             uofloatArray1[1] = - (float)i.d(f1);
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray1);
             a.h(objectAnimat, str);
             objectAnimat.setInterpolator(new j());
             objectAnimat.setDuration(100);
             objectAnimat.start();
             if (!PatchProxy.applyVoid(uCharSequenc, uCharSequenc, d.class, "22")) {
                ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                uClickEvent.urlPackage = urlPackage;
                urlPackage.params = "task_id="+d.a;
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "FAST_LOACTION";
                uClickEvent.elementPackage = uElementPack;
                a.c.f().e(uClickEvent);
             }
          }
          this.k = f;
       }
       return true;
    }
    public final void setGuiding$core_release(boolean p0){
       this.d = p0;
    }
    public final void setSlideRange$core_release(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SliderView.class, "1")) {
          return;
       }
       a.q(p0, "value");
       if (a.g(p0, this.b) ^ 0x01) {
          Log.g("Slider", "setSlideRange: "+p0);
          if (this.getTranslationY() - null) {
             this.setTranslationY((this.getTranslationY() + ((p0.a() * (this.getTranslationY() / this.b.a())) - this.getTranslationY())));
          }
       }
       this.b = p0;
       return;
    }
    public final void setSliderStateListeners(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SliderView.class, "2")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.c = p0;
       return;
    }
}
