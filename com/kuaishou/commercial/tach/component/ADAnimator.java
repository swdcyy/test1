package com.kuaishou.commercial.tach.component.ADAnimator;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.String;
import android.animation.PropertyValuesHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tkruntime.v8.V8Function;
import java.lang.Integer;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import gx4.c;
import com.tachikoma.core.component.e;
import com.tkruntime.v8.V8Value;
import java.util.Map;
import com.tkruntime.v8.V8;
import java.util.ArrayList;
import com.kuaishou.commercial.tach.component.ADAnimationWrapper;
import java.lang.Number;
import lg.i;
import yp8.b;
import com.facebook.yoga.YogaUnit;
import iq8.p;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import pz.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class ADAnimator extends TKBaseNativeModule	// class@001647
{
    public long f;
    public String g;

    public void ADAnimator(f p0){
       super(p0);
    }
    public static PropertyValuesHolder createHolder(String p0,float p1){
       float[] obj;
       ADAnimator uADAnimator = ADAnimator.class;
       if (PatchProxy.isSupport(uADAnimator)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uADAnimator, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{(float)a1.e(p1)};
       return PropertyValuesHolder.ofFloat(p0, obj);
    }
    public static PropertyValuesHolder createHolderNonFormat(String p0,float p1){
       float[] obj;
       ADAnimator uADAnimator = ADAnimator.class;
       if (PatchProxy.isSupport(uADAnimator)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uADAnimator, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{p1};
       return PropertyValuesHolder.ofFloat(p0, obj);
    }
    public static TimeInterpolator getInterpolator(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ADAnimator.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("Linear").equalsIgnoreCase(p0)) {
          return new LinearInterpolator();
       }
       if (("EaseIn").equalsIgnoreCase(p0)) {
          return new AccelerateInterpolator();
       }
       if (("EaseOut").equalsIgnoreCase(p0)) {
          return new DecelerateInterpolator();
       }
       if (("EaseInEaseOut").equalsIgnoreCase(p0)) {
          return new AccelerateDecelerateInterpolator();
       }
       return new LinearInterpolator();
    }
    public void animate(V8Function p0,int p1,String p2){
       if (PatchProxy.isSupport(ADAnimator.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ADAnimator.class, "1")) {
          return;
       }
       if (y.a(p0)) {
          this.f = (long)p1;
          this.g = p2;
          Object[] objArray = new Object[0];
          p0.call(null, objArray);
       }
       return;
    }
    public void updateStyle(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ADAnimator.class, "2")) {
          return;
       }
       c nativeModule = this.getNativeModule(p0);
       if (!nativeModule instanceof e) {
          return;
       }
       Map all = p0.v8.getAll(p1.getHandle());
       if (all != null && !all.isEmpty()) {
          this.updateStyle(all, nativeModule);
       }
       return;
    }
    public void updateStyle(Map p0,e p1){
       i oi;
       i b;
       YogaUnit yogaUnit;
       float[] uofloatArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ADAnimator.class, "4")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ADAnimationWrapper uADAnimation = new ADAnimationWrapper(p1);
       String str = "top";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolder(str, p0.get(str).floatValue()));
       }
       str = "start";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolder(str, p0.get(str).floatValue()));
       }
       str = "bottom";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolder(str, p0.get(str).floatValue()));
       }
       str = "end";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolder(str, p0.get(str).floatValue()));
       }
       str = "left";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolder(str, p0.get(str).floatValue()));
       }
       str = "right";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolder(str, p0.get(str).floatValue()));
       }
       str = "width";
       int i = 1;
       if (p0.containsKey(str)) {
          oi = b.b(0, p0.get(str));
          if (oi != null) {
             b = oi.b;
             yogaUnit = (b == YogaUnit.PERCENT)? 1: null;
             b = (b == YogaUnit.AUTO)? 1: null;
             if (!b && !yogaUnit) {
                uArrayList.add(ADAnimator.createHolderNonFormat(str, oi.a));
             }
          }
       }
       str = "height";
       if (p0.containsKey(str)) {
          oi = b.b(0, p0.get(str));
          if (oi != null) {
             b = oi.b;
             yogaUnit = (b == YogaUnit.PERCENT)? 1: 0;
             uofloatArray = (b == YogaUnit.AUTO)? 1: null;
             if (!uofloatArray && !yogaUnit) {
                uArrayList.add(ADAnimator.createHolderNonFormat(str, oi.a));
             }
          }
       }
       str = "opacity";
       if (p0.containsKey(str)) {
          uofloatArray = new float[i];
          uofloatArray[0] = p0.get(str).floatValue();
          uArrayList.add(PropertyValuesHolder.ofFloat(str, uofloatArray));
       }
       str = "color";
       if (p0.containsKey(str)) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p.b(p0.get(str)));
          uArrayList.add(PropertyValuesHolder.ofObject("textColor", new ArgbEvaluator(), objArray));
       }
       str = "backgroundColor";
       if (p0.containsKey(str)) {
          Object[] objArray1 = new Object[i];
          objArray1[0] = Integer.valueOf(p.b(p0.get(str)));
          uArrayList.add(PropertyValuesHolder.ofObject(str, new ArgbEvaluator(), objArray1));
       }
       str = "fontSize";
       if (p0.containsKey(str)) {
          uArrayList.add(ADAnimator.createHolderNonFormat(str, p0.get(str).floatValue()));
       }
       if (p0.containsKey("borderRadius")) {
          uArrayList.add(ADAnimator.createHolder("borderRadius", p0.get("borderRadius").floatValue()));
       }
       if (!uArrayList.size()) {
          return;
       }else {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[uArrayList.size()];
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(uADAnimation, uArrayList.toArray(propertyValu));
          objectAnimat.setDuration(this.f);
          objectAnimat.setInterpolator(ADAnimator.getInterpolator(this.g));
          objectAnimat.addUpdateListener(new a(p1));
          objectAnimat.start();
          return;
       }
    }
}
