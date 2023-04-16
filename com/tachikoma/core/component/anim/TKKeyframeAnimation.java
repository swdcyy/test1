package com.tachikoma.core.component.anim.TKKeyframeAnimation;
import com.tachikoma.core.component.anim.TKBasicAnimation$d;
import com.tachikoma.core.component.anim.TKBasicAnimation;
import gx4.f;
import java.util.HashMap;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import android.animation.Keyframe;
import com.tachikoma.core.component.anim.TKKeyframeAnimation$a;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import java.lang.Integer;
import com.tachikoma.core.component.anim.TKBasicAnimation$c;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Array;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import java.lang.Number;
import java.lang.Throwable;
import zp8.a;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import wp8.a;
import android.animation.Animator;
import java.lang.Boolean;
import xo8.e;
import com.tachikoma.core.component.e;
import java.util.Map;
import yp8.a;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;

public class TKKeyframeAnimation extends TKBasicAnimation implements TKBasicAnimation$d	// class@000d5f
{
    public HashMap f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public ArrayList keyframes;
    public float l;
    public float m;
    public float n;
    public boolean needTranformIdentity;
    public JsValueRef o;

    public void TKKeyframeAnimation(f p0){
       super(p0);
       this.f = new HashMap();
       this.g = 0x3f800000;
       this.h = 0x3f800000;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = 0x3f800000;
       this.setBasicAnimatorListener(this);
    }
    public void animAlpha(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKeyframeAnimation.class, "7")) {
          return;
       }
       Keyframe[] keyframeArra = new Keyframe[this.keyframes.size()];
       for (int i = 0; i < this.keyframes.size(); i = i + 1) {
          TKKeyframeAnimation$a uoa = this.keyframes.get(i);
          keyframeArra[i] = Keyframe.ofFloat(uoa.a, this.parseFloatValue(this.trans2String(uoa.b)));
       }
       i = 1;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
       propertyValu[0] = PropertyValuesHolder.ofKeyframe("alpha", keyframeArra);
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       this.animator = objectAnimat;
       objectAnimat.setDuration(this.getAnimDuration());
       objectAnimat.setRepeatCount(this.getRepeatCount());
       if (this.autoReverse != null) {
          i = 2;
       }
       objectAnimat.setRepeatMode(i);
       objectAnimat.setStartDelay((long)this.getAnimDelay());
       objectAnimat.setInterpolator(this.getInterpolator());
       objectAnimat.addListener(this.mAnimatorListenerAdapter);
       objectAnimat.start();
       return;
    }
    public void animBackgroundColor(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKeyframeAnimation.class, "8")) {
          return;
       }
       Keyframe[] keyframeArra = new Keyframe[this.keyframes.size()];
       for (int i = 0; i < this.keyframes.size(); i = i + 1) {
          TKKeyframeAnimation$a uoa = this.keyframes.get(i);
          keyframeArra[i] = Keyframe.ofInt(uoa.a, this.parseColor(this.trans2String(uoa.b)));
       }
       i = 1;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
       propertyValu[0] = PropertyValuesHolder.ofKeyframe("backgroundColor", keyframeArra);
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       this.animator = objectAnimat;
       objectAnimat.setDuration(this.getAnimDuration());
       objectAnimat.setEvaluator(new ArgbEvaluator());
       objectAnimat.setRepeatCount(this.getRepeatCount());
       if (this.autoReverse != null) {
          i = 2;
       }
       objectAnimat.setRepeatMode(i);
       objectAnimat.setStartDelay((long)this.getAnimDelay());
       objectAnimat.setInterpolator(this.getInterpolator());
       objectAnimat.addListener(this.mAnimatorListenerAdapter);
       objectAnimat.start();
       return;
    }
    public void animRotation(View p0,int p1){
       String str;
       TKKeyframeAnimation tKKeyframeAn = TKKeyframeAnimation.class;
       if (PatchProxy.isSupport(tKKeyframeAn) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tKKeyframeAn, "6")) {
          return;
       }
       int i = 2;
       if (p1 != 1) {
          str = (p1 != i)? "rotation": "rotationY";
       }else {
          str = "rotationX";
       }
       Keyframe[] keyframeArra = new Keyframe[this.keyframes.size()];
       for (int i1 = 0; i1 < this.keyframes.size(); i1 = i1 + 1) {
          TKKeyframeAnimation$a uoa = this.keyframes.get(i1);
          keyframeArra[i1] = Keyframe.ofFloat(uoa.a, this.parseFloatValue(this.trans2String(uoa.b)));
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(str, keyframeArra)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       this.animator = objectAnimat;
       objectAnimat.setDuration(this.getAnimDuration());
       objectAnimat.setRepeatCount(this.getRepeatCount());
       if (this.autoReverse == null) {
          i = 1;
       }
       objectAnimat.setRepeatMode(i);
       objectAnimat.setStartDelay((long)this.getAnimDelay());
       objectAnimat.setInterpolator(this.getInterpolator());
       objectAnimat.addListener(this.mAnimatorListenerAdapter);
       objectAnimat.start();
       return;
    }
    public void animScale(View p0,int p1){
       ObjectAnimator objectAnimat;
       PropertyValuesHolder[] propertyValu1;
       TKKeyframeAnimation tKKeyframeAn = TKKeyframeAnimation.class;
       if (PatchProxy.isSupport(tKKeyframeAn) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tKKeyframeAn, "5")) {
          return;
       }
       Keyframe[] keyframeArra = new Keyframe[this.keyframes.size()];
       for (int i = 0; i < this.keyframes.size(); i = i + 1) {
          TKKeyframeAnimation$a uoa = this.keyframes.get(i);
          keyframeArra[i] = Keyframe.ofFloat(uoa.a, this.parseFloatValue(this.trans2String(uoa.b)));
       }
       int i1 = 2;
       if (p1 != 11) {
          if (p1 != 12) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i1];
             propertyValu[0] = PropertyValuesHolder.ofKeyframe("scaleX", keyframeArra);
             propertyValu[1] = PropertyValuesHolder.ofKeyframe("scaleY", keyframeArra);
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          }else {
             propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scaleY", keyframeArra)};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
          }
       }else {
          propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scaleX", keyframeArra)};
          objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
       }
       this.animator = objectAnimat;
       objectAnimat.setDuration(this.getAnimDuration());
       objectAnimat.setRepeatCount(this.getRepeatCount());
       if (this.autoReverse == null) {
          i1 = 1;
       }
       objectAnimat.setRepeatMode(i1);
       objectAnimat.setStartDelay((long)this.getAnimDelay());
       objectAnimat.setInterpolator(this.getInterpolator());
       objectAnimat.addListener(this.mAnimatorListenerAdapter);
       objectAnimat.start();
       return;
    }
    public void animTranslation(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKeyframeAnimation.class, "4")) {
          return;
       }
       Keyframe[] keyframeArra = new Keyframe[this.keyframes.size()];
       Keyframe[] keyframeArra1 = new Keyframe[this.keyframes.size()];
       int i = 0;
       int i1 = 1;
       while (i < this.keyframes.size()) {
          TKKeyframeAnimation$a uoa = this.keyframes.get(i);
          String[] stringArray = this.trans2StringArray(uoa.b);
          keyframeArra[i] = Keyframe.ofFloat(uoa.a, this.parsePxValue(stringArray[0]));
          keyframeArra1[i] = Keyframe.ofFloat(uoa.a, this.parsePxValue(stringArray[i1]));
          i = i + 1;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("translationX", keyframeArra),PropertyValuesHolder.ofKeyframe("translationY", keyframeArra1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       this.animator = objectAnimat;
       objectAnimat.setDuration(this.getAnimDuration());
       objectAnimat.setRepeatCount(this.getRepeatCount());
       if (this.autoReverse != null) {
          i1 = 2;
       }
       objectAnimat.setRepeatMode(i1);
       objectAnimat.setStartDelay((long)this.getAnimDelay());
       objectAnimat.setInterpolator(this.getInterpolator());
       objectAnimat.addListener(this.mAnimatorListenerAdapter);
       objectAnimat.start();
       return;
    }
    public void executeAnimationFunction(TKBasicAnimation$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKeyframeAnimation.class, "2")) {
          return;
       }
       TKKeyframeAnimation to = this.o;
       if (to == null) {
          return;
       }
       V8Array v8Array = to.get();
       if (!y.a(v8Array)) {
          return;
       }
       int i = v8Array.length();
       int i1 = 0;
       while (i1 < i) {
          Object obj = v8Array.get(i1);
          if (obj instanceof V8Function) {
             Object[] objArray = new Object[]{obj};
             obj = obj.call(null, objArray);
             if (p0 != null && obj instanceof Number) {
                p0.a(i1, obj.floatValue(), i);
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public boolean newVersionEnable(){
       boolean b = (this.o != null)? true: false;
       return b;
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       TKKeyframeAnimation tKKeyframeAn = TKKeyframeAnimation.class;
       if (PatchProxy.isSupport(tKKeyframeAn) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKKeyframeAn, "9")) {
          return;
       }
       e.a(this, p0, p1);
       this.resetInitial();
       return;
    }
    public void onAnimationStart(Animator p0,boolean p1){
       e.b(this, p0, p1);
    }
    public void readInitial(){
       if (PatchProxy.applyVoid(null, this, TKKeyframeAnimation.class, "10")) {
          return;
       }
       TKBasicAnimation tmTargetView = this.mTargetView;
       if (tmTargetView != null && this.needTranformIdentity != null) {
          this.g = tmTargetView.getScaleX();
          this.h = this.mTargetView.getScaleY();
          this.i = this.mTargetView.getTranslationX();
          this.j = this.mTargetView.getTranslationY();
          this.k = this.mTargetView.getRotationX();
          this.l = this.mTargetView.getRotationY();
          this.m = this.mTargetView.getRotation();
          this.n = this.mTargetView.getAlpha();
          this.f.putAll(this.mBaseView.style);
       }
       return;
    }
    public void resetInitial(){
       if (PatchProxy.applyVoid(null, this, TKKeyframeAnimation.class, "11")) {
          return;
       }
       if (this.mTargetView != null && this.needTranformIdentity != null) {
          this.mBaseView.setStyle(this.f);
          this.mBaseView.getDomNode().d();
          this.mTargetView.setScaleX(this.g);
          this.mTargetView.setScaleY(this.h);
          this.mTargetView.setTranslationX(this.i);
          this.mTargetView.setTranslationY(this.j);
          this.mTargetView.setRotationX(this.k);
          this.mTargetView.setRotationY(this.l);
          this.mTargetView.setAlpha(this.n);
          this.mTargetView.setRotation(this.m);
       }
       return;
    }
    public void setAnimations(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKeyframeAnimation.class, "1")) {
          return;
       }
       if (!p0 instanceof V8Array) {
          return;
       }
       y.c(this.o);
       this.o = y.b(p0, this);
       return;
    }
    public void setDuration(float p0){
       this.duration = p0;
    }
    public void setKeyframes(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKeyframeAnimation.class, "3")) {
          return;
       }
       this.keyframes = new ArrayList();
       Object[] objArray = p0.toArray();
       for (int i = 0; i < objArray.length; i = i + 1) {
          Object value = V8ObjectUtilsQuick.getValue(objArray[i]);
          TKKeyframeAnimation$a uoa = new TKKeyframeAnimation$a(this);
          String str = "percent";
          if (value.containsKey(str)) {
             uoa.a = value.get(str).floatValue();
          }
          str = "value";
          if (value.containsKey(str)) {
             uoa.b = value.get(str);
          }
          str = "easing";
          if (value.containsKey(str)) {
             uoa.c = value.get(str);
          }
          if (!uoa.a - null) {
             float f = 0x3f800000;
             boolean b = true;
             if (objArray.length == b) {
                uoa.a = f;
             }else if(i > 0){
                int i1 = objArray.length - b;
                f = f / (float)i1;
                f = f * (float)i;
                uoa.a = f;
             }
          }
          this.keyframes.add(uoa);
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKKeyframeAnimation.class, "12")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.o);
       return;
    }
}
