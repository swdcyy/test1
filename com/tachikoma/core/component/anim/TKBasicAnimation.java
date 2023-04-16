package com.tachikoma.core.component.anim.TKBasicAnimation;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import com.tachikoma.core.component.anim.TKBasicAnimation$a;
import com.tachikoma.core.component.anim.TKBasicAnimation$b;
import java.util.HashMap;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorListener;
import android.graphics.drawable.Drawable;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import java.lang.Integer;
import android.animation.PropertyValuesHolder;
import com.tachikoma.core.component.e;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import android.animation.Keyframe;
import android.animation.Animator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Float;
import java.lang.Boolean;
import lg.i;
import com.tachikoma.core.component.anim.TKBasicAnimation$c;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import java.util.ArrayList;
import com.tachikoma.core.component.anim.a;
import java.util.Comparator;
import java.util.Collections;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import yo8.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import no8.a;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Value;
import java.lang.Number;
import android.graphics.Color;
import java.lang.Exception;
import iq8.n;
import com.tachikoma.core.component.anim.TKBasicAnimation$d;
import xo8.a;
import java.util.Objects;
import xo8.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Collection;
import java.lang.Runnable;
import iq8.x;

public class TKBasicAnimation extends TKBaseNativeModule	// class@000d5d
{
    public JsValueRef animNJEndListenerRef;
    public JsValueRef animNJStartListenerRef;
    public String animType;
    public Object animValue;
    public Animator animator;
    public Map animatorMap;
    public Runnable animatorOnStartForDelay;
    public boolean autoReverse;
    public float delay;
    public float duration;
    public JsValueRef endValueRef;
    public AnimatorListenerAdapter mAnimatorListenerAdapter;
    public e mBaseView;
    public TKBasicAnimation$d mBasicAnimatorListener;
    public View mTargetView;
    public int repeatCount;
    public JsValueRef startValueRef;
    public String timeFunction;
    public String timingFunction;

    public void TKBasicAnimation(f p0){
       super(p0);
       this.mAnimatorListenerAdapter = new TKBasicAnimation$a(this);
       this.animatorOnStartForDelay = new TKBasicAnimation$b(this);
       this.animatorMap = new HashMap();
    }
    public void animAlpha(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "38")) {
          return;
       }
       float alpha = p0.getAlpha();
       float f = this.parseFloatValue(this.trans2String(this.animValue));
       if (alpha - f) {
          int i = 2;
          float[] uofloatArray = new float[i];
          uofloatArray[0] = alpha;
          uofloatArray[1] = f;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray).setDuration(this.getAnimDuration());
          this.animator = objectAnimat;
          objectAnimat.setRepeatCount(this.getRepeatCount());
          if (this.autoReverse == null) {
             i = 1;
          }
          objectAnimat.setRepeatMode(i);
          objectAnimat.setStartDelay((long)this.getAnimDelay());
          objectAnimat.setInterpolator(this.getInterpolator());
          objectAnimat.addListener(this.mAnimatorListenerAdapter);
          objectAnimat.start();
       }
       return;
    }
    public void animBackgroundColor(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "39")) {
          return;
       }
       int color = p0.getBackground().getColor();
       int i = this.parseColor(this.trans2String(this.animValue));
       if (color != i) {
          int i1 = 2;
          int[] ointArray = new int[i1];
          ointArray[0] = color;
          ointArray[1] = i;
          ObjectAnimator objectAnimat = ObjectAnimator.ofInt(p0, "backgroundColor", ointArray).setDuration(this.getAnimDuration());
          this.animator = objectAnimat;
          objectAnimat.setRepeatCount(this.getRepeatCount());
          if (this.autoReverse == null) {
             i1 = 1;
          }
          objectAnimat.setRepeatMode(i1);
          objectAnimat.setStartDelay((long)this.getAnimDelay());
          objectAnimat.setInterpolator(this.getInterpolator());
          objectAnimat.setEvaluator(new ArgbEvaluator());
          objectAnimat.addListener(this.mAnimatorListenerAdapter);
          objectAnimat.start();
       }
       return;
    }
    public void animRotation(View p0,int p1){
       String str;
       TKBasicAnimation tKBasicAnima = TKBasicAnimation.class;
       if (PatchProxy.isSupport(tKBasicAnima) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tKBasicAnima, "37")) {
          return;
       }
       int i = 2;
       if (p1 != 1) {
          str = (p1 != i)? "rotation": "rotationY";
       }else {
          str = "rotationX";
       }
       float[] uofloatArray = new float[i];
       uofloatArray[0] = 0;
       uofloatArray[1] = this.parseFloatValue(this.trans2String(this.animValue));
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, str, uofloatArray).setDuration(this.getAnimDuration());
       this.animator = objectAnimat;
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
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       TKBasicAnimation tKBasicAnima = TKBasicAnimation.class;
       if (PatchProxy.isSupport(tKBasicAnima) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tKBasicAnima, "36")) {
          return;
       }
       float f = this.parseFloatValue(this.trans2String(this.animValue));
       int i = 2;
       if (p1 != 11) {
          if (p1 != 12) {
             uofloatArray = new float[]{f};
             float[] uofloatArray1 = new float[]{f};
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
             propertyValu[0] = PropertyValuesHolder.ofFloat("scaleX", uofloatArray);
             propertyValu[1] = PropertyValuesHolder.ofFloat("scaleY", uofloatArray1);
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          }else {
             uofloatArray = new float[i];
             uofloatArray[0] = 0;
             uofloatArray[1] = f;
             objectAnimat = ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray).setDuration(this.getAnimDuration());
          }
       }else {
          uofloatArray = new float[i];
          uofloatArray[0] = 0;
          uofloatArray[1] = f;
          objectAnimat = ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray).setDuration(this.getAnimDuration());
       }
       this.animator = objectAnimat;
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
    public void animTranslation(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "35")) {
          return;
       }
       int i = 2;
       float[] uofloatArray = new float[i]{0,0};
       String[] stringArray = this.trans2StringArray(this.animValue);
       if (stringArray != null && stringArray.length == i) {
          uofloatArray[0] = this.parsePxValue(stringArray[0]);
          uofloatArray[1] = this.parsePxValue(stringArray[1]);
       }
       float[] uofloatArray1 = new float[]{uofloatArray[0]};
       float[] uofloatArray2 = new float[]{uofloatArray[1]};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
       propertyValu[0] = PropertyValuesHolder.ofFloat("translationX", uofloatArray1);
       propertyValu[1] = PropertyValuesHolder.ofFloat("translationY", uofloatArray2);
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       this.animator = objectAnimat;
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
    public void beforeStart(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "28")) {
          return;
       }
       this.mBaseView = p0;
       this.mTargetView = p0.getView();
       return;
    }
    public final ObjectAnimator d(String p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TKBasicAnimation.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = this.f(p1);
       if (list == null || list.isEmpty()) {
          return null;
       }
       Keyframe[] keyframeArra = new Keyframe[0];
       int i = 1;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
       propertyValu[0] = PropertyValuesHolder.ofKeyframe(p0, list.toArray(keyframeArra));
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.mTargetView, propertyValu);
       objectAnimat.setDuration(this.getAnimDuration());
       objectAnimat.setRepeatCount(this.getRepeatCount());
       if (this.autoReverse != null) {
          i = 2;
       }
       objectAnimat.setRepeatMode(i);
       return objectAnimat;
    }
    public void destroy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "33")) {
          return;
       }
       if (this.mBaseView != null && this.mTargetView != null) {
          Animator uAnimator = this.animatorMap.get(p0);
          if (uAnimator == null) {
             return;
          }else if(uAnimator.isRunning()){
             uAnimator.cancel();
          }
          this.animatorMap.remove(p0);
       }
       return;
    }
    public Map diffAnimationProperty(List p0,HashMap p1){
       Map$Entry uEntry;
       Object obj1;
       boolean b1;
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, TKBasicAnimation.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p1 != null && p1.size() > 0) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             Iterator iterator1 = p1.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                Float key = uEntry.getKey();
                Map value = uEntry.getValue();
                if (value.isEmpty()) {
                   continue ;
                }else {
                   obj1 = value.get(str);
                   if (obj1 == null) {
                      continue ;
                   }
                }
                linkedHashMa.put(key, obj1);
             }
             if (linkedHashMa.isEmpty()) {
                continue ;
             }
             obj.put(str, linkedHashMa);
          }
          iterator = obj.entrySet().iterator();
          while (iterator.hasNext()) {
             p1 = iterator.next().getValue();
             Map$Entry obj2 = PatchProxy.applyOneRefs(p1, this, TKBasicAnimation.class, "26");
             boolean b = true;
             if (obj2 != PatchProxyResult.class) {
                b = obj2.booleanValue();
             }else if(p1 != null && (p1.isEmpty() || p1.size() == b)){
                Iterator iterator2 = p1.entrySet().iterator();
                obj2 = null;
                if (iterator2.hasNext()) {
                   obj2 = iterator2.next();
                }
                if (obj2 != null) {
                   while (true) {
                      if (iterator2.hasNext()) {
                         uEntry = iterator2.next();
                         Object value1 = obj2.getValue();
                         Object value2 = uEntry.getValue();
                         Object obj3 = PatchProxy.applyTwoRefs(value1, value2, this, TKBasicAnimation.class, "27");
                         if (obj3 != PatchProxyResult.class) {
                            b1 = obj3.booleanValue();
                         }else if(value1 == null && value2 == null){
                            if (value1 instanceof Float && value2 instanceof Float) {
                               if (Float.compare(value1.floatValue(), value2.floatValue())) {
                               }
                            }else if(value1 instanceof Integer && value2 instanceof Integer){
                               if (value1.intValue() != value2.intValue()) {
                               }
                            }else if(value1 instanceof i && (value2 instanceof i && !Float.compare(value1.a, value2.a))){
                            }
                         }
                      label_0135 :
                         b1 = true;
                         if (b1) {
                            obj2 = uEntry;
                         }
                      }
                   }
                }
             }
          label_013d :
             b = false;
             if (!b) {
                iterator.remove();
             }
          }
       }
       return obj;
    }
    public final boolean e(){
       boolean b = (this.mBaseView == null || this.mTargetView == null)? true: false;
       return b;
    }
    public void executeEndValueFunction(TKBasicAnimation$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "4")) {
          return;
       }
       TKBasicAnimation tendValueRef = this.endValueRef;
       if (tendValueRef != null && y.a(tendValueRef.get())) {
          Object[] objArray = new Object[0];
          this.endValueRef.get().call(null, objArray);
          if (p0 != null) {
             p0.b(0x3f800000);
          }
       }
       return;
    }
    public void executeStartValueFunction(TKBasicAnimation$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "2")) {
          return;
       }
       TKBasicAnimation tstartValueR = this.startValueRef;
       if (tstartValueR != null && y.a(tstartValueR.get())) {
          Object[] objArray = new Object[0];
          this.startValueRef.get().call(null, objArray);
          if (p0 != null) {
             tstartValueR = this.endValueRef;
             float f = (tstartValueR == null || tstartValueR.get() == null)? 0x3f800000: 0;
             p0.b(f);
          }
       }
       return;
    }
    public final List f(Map p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, TKBasicAnimation.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || 1 >= p0.size()) {
          return null;
       }
       obj = new ArrayList();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry == null || uEntry.getValue() == null) {
             continue ;
          }else {
             Object value = uEntry.getValue();
             if (value instanceof Float) {
                obj.add(Keyframe.ofFloat(uEntry.getKey().floatValue(), value.floatValue()));
             }else if(value instanceof i){
                obj.add(Keyframe.ofFloat(uEntry.getKey().floatValue(), value.a));
             }else if(value instanceof Integer){
                obj.add(Keyframe.ofInt(uEntry.getKey().floatValue(), value.intValue()));
             }
          }
       }
       Collections.sort(obj, a.b);
       return obj;
    }
    public final void g(AnimatorSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "14")) {
          return;
       }
       p0.pause();
       return;
    }
    public int getAnimDelay(){
       return (int)this.delay;
    }
    public long getAnimDuration(){
       return (long)this.duration;
    }
    public TimeInterpolator getInterpolator(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "5";
       a obj = PatchProxy.apply(objArray, this, TKBasicAnimation.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (("Linear").equalsIgnoreCase(this.timeFunction)) {
          return new LinearInterpolator();
       }
       if (("EaseIn").equalsIgnoreCase(this.timeFunction)) {
          return new AccelerateInterpolator();
       }
       if (("EaseOut").equalsIgnoreCase(this.timeFunction)) {
          return new DecelerateInterpolator();
       }
       if (("EaseInEaseOut").equalsIgnoreCase(this.timeFunction)) {
          return new AccelerateDecelerateInterpolator();
       }
       float f = 0x3f800000;
       float f1 = 0;
       if (("linear").equalsIgnoreCase(this.timingFunction)) {
          obj = PatchProxy.apply(objArray, objArray, a.class, str);
          if (obj != patchProxyRe) {
          }else {
             obj = new a(f1, f1, f, f);
          }
          return obj;
       }else {
          float f2 = 0.42f;
          if (("ease-in").equalsIgnoreCase(this.timingFunction)) {
             obj = PatchProxy.apply(objArray, objArray, a.class, "2");
             if (obj != patchProxyRe) {
             }else {
                obj = new a(f2, f1, f, f);
             }
             return obj;
          }else if(("ease-out").equalsIgnoreCase(this.timingFunction)){
             obj = PatchProxy.apply(objArray, objArray, a.class, "3");
             if (obj != patchProxyRe) {
             }else {
                obj = new a(f1, f1, 0x3f147ae1, f);
             }
             return obj;
          }else if(("ease-in-out").equalsIgnoreCase(this.timingFunction)){
             obj = PatchProxy.apply(objArray, objArray, a.class, "4");
             if (obj != patchProxyRe) {
             }else {
                obj = new a(f2, f1, 0x3f147ae1, f);
             }
             return obj;
          }else if(!TextUtils.isEmpty(this.timingFunction)){
             String[] stringArray = (this.timingFunction).split(" ");
             if (4 != stringArray.length) {
                return new AccelerateDecelerateInterpolator();
             }
             return new a(Float.parseFloat(stringArray[0]), Float.parseFloat(stringArray[1]), Float.parseFloat(stringArray[2]), Float.parseFloat(stringArray[3]));
          }else {
             return new AccelerateDecelerateInterpolator();
          }
       }
    }
    public int getRepeatCount(){
       TKBasicAnimation trepeatCount = this.repeatCount;
       if (trepeatCount == null) {
          return this.autoReverse;
       }
       if (trepeatCount >= Integer.MAX_VALUE || trepeatCount < null) {
          return -1;
       }
       if (this.autoReverse != null) {
          trepeatCount = trepeatCount * 2;
       }
       return (trepeatCount - 1);
    }
    public final void h(AnimatorSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "18")) {
          return;
       }
       p0.resume();
       return;
    }
    public boolean isRunning(){
       TKBasicAnimation obj = PatchProxy.apply(null, this, TKBasicAnimation.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.animator;
       boolean b = (obj != null && obj.isRunning())? true: false;
       return b;
    }
    public boolean newVersionEnable(){
       boolean b = (this.startValueRef != null || this.endValueRef != null)? true: false;
       return b;
    }
    public void on(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKBasicAnimation.class, "11")) {
          return;
       }
       if (a.c.booleanValue() && p1 != null) {
          p1.setFunctionName("TKBasicAnimation_on_"+p0);
       }
       JsValueRef jsValueRef = y.b(p1, this);
       if (("start").equalsIgnoreCase(p0)) {
          y.c(this.animNJStartListenerRef);
          this.animNJStartListenerRef = jsValueRef;
       }else if(("end").equalsIgnoreCase(p0)){
          y.c(this.animNJEndListenerRef);
          this.animNJEndListenerRef = jsValueRef;
       }
       return;
    }
    public int parseColor(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, TKBasicAnimation.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = "#";
       if (!p0.startsWith(obj)) {
          p0 = obj+p0;
       }
       int i = -1;
       try{
          i = Color.parseColor(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return i;
    }
    public float parseFloatValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKBasicAnimation.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       try{
          f = Float.parseFloat(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return f;
    }
    public float parsePxValue(String p0){
       float f1;
       Object obj = PatchProxy.applyOneRefs(p0, this, TKBasicAnimation.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       try{
          f1 = ((p0.toLowerCase()).endsWith("px"))? Float.parseFloat(p0.replace("px", "")): (float)n.a(Float.parseFloat(p0));
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          f1 = f;
       }
       return f1;
    }
    public void pauseAnimation(String p0){
       TKBasicAnimation tKBasicAnima = TKBasicAnimation.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKBasicAnima, "12")) {
          return;
       }
       if (this.e()) {
          return;
       }
       Animator uAnimator = this.animatorMap.get(p0);
       if (!uAnimator instanceof AnimatorSet) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(uAnimator, this, tKBasicAnima, "13")) {
          this.g(uAnimator);
       }
       return;
    }
    public void resumeAnimation(String p0){
       TKBasicAnimation tKBasicAnima = TKBasicAnimation.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKBasicAnima, "16")) {
          return;
       }
       if (this.e()) {
          return;
       }
       AnimatorSet uAnimatorSet = this.animatorMap.get(p0);
       if (uAnimatorSet == null) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(uAnimatorSet, this, tKBasicAnima, "17")) {
          this.h(uAnimatorSet);
       }
       return;
    }
    public void setAnimType(String p0){
       this.animType = p0;
    }
    public void setAnimValue(Object p0){
       this.animValue = p0;
    }
    public void setAutoReverse(boolean p0){
       this.autoReverse = p0;
    }
    public void setBasicAnimatorListener(TKBasicAnimation$d p0){
       this.mBasicAnimatorListener = p0;
    }
    public void setDelay(float p0){
       this.delay = p0;
    }
    public void setDuration(float p0){
       this.duration = p0;
    }
    public void setEndValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "3")) {
          return;
       }
       if (!p0 instanceof V8Function) {
          return;
       }
       if (a.c.booleanValue()) {
          p0.setFunctionName("TKBasicAnimation_setEndValue");
       }
       y.c(this.endValueRef);
       this.endValueRef = y.b(p0, this);
       return;
    }
    public void setRepeatCount(int p0){
       this.repeatCount = p0;
    }
    public void setStartValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "1")) {
          return;
       }
       if (!p0 instanceof V8Function) {
          return;
       }
       if (a.c.booleanValue()) {
          p0.setFunctionName("TKBasicAnimation_setStartValue");
       }
       y.c(this.startValueRef);
       this.startValueRef = y.b(p0, this);
       return;
    }
    public void setTimeFunction(String p0){
       this.timeFunction = p0;
    }
    public void setTimingFunction(String p0){
       this.timingFunction = p0;
    }
    public void start(String p0){
       ObjectAnimator obj2;
       String str6;
       int i;
       String str7;
       String str8;
       int i1;
       AnimatorSet uAnimatorSet;
       TKBasicAnimation mTargetView;
       String str9;
       int i3;
       float alpha;
       float[] uofloatArray;
       int i4;
       float[] uofloatArray2;
       int i6;
       Object obj = this;
       ObjectAnimator obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TKBasicAnimation tKBasicAnima = TKBasicAnimation.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, tKBasicAnima, "29")) {
          return;
       }
       if (this.e()) {
          return;
       }
       this.stop(p0);
       String str = "backgroundColor";
       String str1 = "translationX";
       String str2 = "translationY";
       String str3 = "rotation";
       String str4 = "alpha";
       String str5 = "scaleY";
       if (this.newVersionEnable()) {
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, tKBasicAnima, "20")) {
             HashMap animationPro = obj.mBaseView.getAnimationPropertySnapshot();
             if (animationPro.size() > 0 && !TextUtils.isEmpty(p0)) {
                animationPro = animationPro.get(obj1);
                if (animationPro != null && (animationPro.size() > 0 && !PatchProxy.applyVoidTwoRefs(obj1, animationPro, obj, tKBasicAnima, "21"))) {
                   List list = a.a();
                   Map map = obj.diffAnimationProperty(list, animationPro);
                   if (!map.isEmpty()) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         Iterator iterator1 = iterator;
                         obj2 = iterator.next();
                         Map map1 = map;
                         ArrayList obj3 = map.get(obj2);
                         if (obj3 != null) {
                            ArrayList uArrayList1 = uArrayList;
                            if (1 >= obj3.size()) {
                               uArrayList = uArrayList1;
                            }else {
                               Objects.requireNonNull(obj2);
                               str6 = "translationZ";
                               switch (obj2.hashCode()){
                                   case 0xb588e09a:
                                     if (!obj2.equals("rotationX")) {
                                     label_010f :
                                        i = -1;
                                     }else {
                                        i = 0;
                                     }
                                     break;
                                   case 0xb588e09b:
                                     if (!obj2.equals("rotationY")) {
                                        goto label_010f ;
                                     }else {
                                        i = 1;
                                     }
                                     break;
                                   case 0xb6f463c7:
                                     if (!obj2.equals(str1)) {
                                        goto label_010f ;
                                     }else {
                                        i = 2;
                                     }
                                     break;
                                   case 0xb6f463c8:
                                     if (!obj2.equals(str2)) {
                                        goto label_010f ;
                                     }else {
                                        i = 3;
                                     }
                                     break;
                                   case 0xb6f463c9:
                                     if (!obj2.equals(str6)) {
                                        goto label_010f ;
                                     }else {
                                        i = 4;
                                     }
                                     break;
                                   case 0xc9de204e:
                                     if (!obj2.equals("scaleX")) {
                                        goto label_010f ;
                                     }else {
                                        i = 5;
                                     }
                                     break;
                                   case 0xc9de204f:
                                     if (!obj2.equals(str5)) {
                                        goto label_010f ;
                                     }else {
                                        i = 6;
                                     }
                                     break;
                                   case 0xfd990f7e:
                                     if (!obj2.equals(str3)) {
                                        goto label_010f ;
                                     }else {
                                        i = 7;
                                     }
                                     break;
                                   case 0x589b15e:
                                     if (!obj2.equals(str4)) {
                                        goto label_010f ;
                                     }else {
                                        i = 8;
                                     }
                                     break;
                                   default:
                                     goto label_010f ;
                               }
                               switch (i){
                                   case 0:
                                     obj1 = obj.d("rotationX", obj3);
                                  label_014a :
                                     str7 = str3;
                                     str8 = str4;
                                     break;
                                   case 1:
                                     obj1 = obj.d("rotationY", obj3);
                                     goto label_014a ;
                                     break;
                                   case 2:
                                     obj1 = obj.d(str1, obj3);
                                     goto label_014a ;
                                     break;
                                   case 3:
                                     obj1 = obj.d(str2, obj3);
                                     goto label_014a ;
                                     break;
                                   case 4:
                                     obj1 = obj.d(str6, obj3);
                                     goto label_014a ;
                                     break;
                                   case 5:
                                     obj1 = obj.d("scaleX", obj3);
                                     goto label_014a ;
                                     break;
                                   case 6:
                                     obj1 = obj.d(str5, obj3);
                                     goto label_014a ;
                                     break;
                                   case 7:
                                     obj1 = obj.d(str3, obj3);
                                     goto label_014a ;
                                     break;
                                   case 8:
                                     obj1 = obj.d(str4, obj3);
                                     goto label_014a ;
                                     break;
                                   default:
                                     obj1 = PatchProxy.applyTwoRefs(obj2, obj3, obj, tKBasicAnima, "23");
                                     if (obj1 != patchProxyRe) {
                                        goto label_014a ;
                                     }else if(this.e()){
                                        List list1 = obj.f(obj3);
                                        if (list1 != null && !list1.isEmpty()) {
                                           Object[] objArray = new Object[]{obj2};
                                           str8 = str4;
                                           Keyframe[] keyframeArra = new Keyframe[0];
                                           str7 = str3;
                                           PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(String.format("_%s", objArray), list1.toArray(keyframeArra))};
                                           obj1 = ObjectAnimator.ofPropertyValuesHolder(obj.mTargetView, propertyValu);
                                           if (str.equals(obj2)) {
                                              obj1.setEvaluator(new ArgbEvaluator());
                                           }
                                           obj1.setRepeatCount(this.getRepeatCount());
                                           i1 = (obj.autoReverse != null)? 2: 1;
                                           obj1.setRepeatMode(i1);
                                           obj1.addUpdateListener(new d(obj, obj2));
                                        }
                                     }
                                     str7 = str3;
                                     str8 = str4;
                                     obj1 = null;
                               }
                               obj3 = uArrayList1;
                               if (obj1 != null) {
                                  obj3.add(obj1);
                               }
                               uArrayList = obj3;
                               iterator = iterator1;
                               map = map1;
                               str4 = str8;
                               str3 = str7;
                            }
                         }else {
                            i = p0;
                         }
                         iterator = iterator1;
                         map = map1;
                      }
                      uAnimatorSet = new AnimatorSet();
                      uAnimatorSet.setDuration(this.getAnimDuration());
                      uAnimatorSet.playTogether(uArrayList);
                      uAnimatorSet.setStartDelay((long)this.getAnimDelay());
                      uAnimatorSet.setInterpolator(this.getInterpolator());
                      uAnimatorSet.addListener(obj.mAnimatorListenerAdapter);
                      uAnimatorSet.start();
                      obj.animatorMap.put(p0, uAnimatorSet);
                   }
                }
             }
          }
       }else {
          ObjectAnimator obj4 = obj1;
          str7 = str3;
          str8 = str4;
          str6 = "scale";
          str4 = "position";
          if (!TextUtils.isEmpty(obj.animType)) {
             mTargetView = obj.mTargetView;
             if (!PatchProxy.applyVoidOneRefs(mTargetView, obj, tKBasicAnima, "30")) {
                if (str4.equalsIgnoreCase(obj.animType)) {
                   obj.animTranslation(mTargetView);
                }else if("opacity".equalsIgnoreCase(obj.animType)){
                   obj.animAlpha(mTargetView);
                }else if(str6.equalsIgnoreCase(obj.animType)){
                   obj.animScale(mTargetView, 13);
                }else if("scaleX".equalsIgnoreCase(obj.animType)){
                   obj.animScale(mTargetView, 11);
                }else if(str5.equalsIgnoreCase(obj.animType)){
                   obj.animScale(mTargetView, 12);
                }else if("rotationX".equalsIgnoreCase(obj.animType)){
                   obj.animRotation(mTargetView, 1);
                }else if("rotationY".equalsIgnoreCase(obj.animType)){
                   obj.animRotation(mTargetView, 2);
                }else if(("rotationZ").equalsIgnoreCase(obj.animType)){
                   obj.animRotation(mTargetView, 3);
                }else if(("bgColor").equalsIgnoreCase(obj.animType)){
                   obj.animBackgroundColor(mTargetView);
                }
             }
          }else if(obj.animValue != null){
             mTargetView = obj.mTargetView;
             if (!PatchProxy.applyVoidTwoRefs(mTargetView, obj4, obj, tKBasicAnima, "31") && obj.animValue instanceof Map) {
                obj2 = PatchProxy.applyOneRefs(mTargetView, obj, tKBasicAnima, "40");
                if (obj2 != patchProxyRe) {
                   str9 = str;
                }else if(obj.animValue.containsKey(str4)){
                   String[] stringArray2 = obj.trans2StringArray(obj.animValue.get(str4));
                   if (stringArray2 != null) {
                      i1 = 2;
                      if (stringArray2.length == i1) {
                         float[] uofloatArray4 = new float[i1]{0,0};
                         str9 = str;
                         uofloatArray4[0] = obj.parsePxValue(stringArray2[0]);
                         i6 = 1;
                         uofloatArray4[i6] = obj.parsePxValue(stringArray2[i6]);
                         float[] uofloatArray5 = new float[i6];
                         uofloatArray5[0] = uofloatArray4[0];
                         uofloatArray5 = new float[i6];
                         uofloatArray5[0] = uofloatArray4[i6];
                         PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str1, uofloatArray5),PropertyValuesHolder.ofFloat(str2, uofloatArray5)};
                         obj2 = ObjectAnimator.ofPropertyValuesHolder(mTargetView, propertyValu3);
                         obj2.setDuration(this.getAnimDuration());
                         obj2.setRepeatCount(this.getRepeatCount());
                         i1 = (obj.autoReverse != null)? 2: 1;
                         obj2.setRepeatMode(i1);
                      }
                   }
                }
                str9 = str;
                obj2 = null;
                obj4 = PatchProxy.applyOneRefs(mTargetView, obj, tKBasicAnima, "41");
                if (obj4 != patchProxyRe) {
                }else if(obj.animValue.containsKey(str6)){
                   String[] stringArray1 = obj.trans2StringArray(obj.animValue.get(str6));
                   if (stringArray1 != null) {
                      i3 = 2;
                      if (stringArray1.length == i3) {
                         uofloatArray2 = new float[i3]{0,0};
                         i3 = 0;
                         uofloatArray2[i3] = obj.parseFloatValue(stringArray1[i3]);
                         i4 = 1;
                         uofloatArray2[i4] = obj.parseFloatValue(stringArray1[i4]);
                         float[] uofloatArray3 = new float[i4];
                         uofloatArray3[i3] = uofloatArray2[i3];
                         uofloatArray = new float[i4];
                         uofloatArray[i3] = uofloatArray2[i4];
                         PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", uofloatArray3),PropertyValuesHolder.ofFloat(str5, uofloatArray)};
                         obj4 = ObjectAnimator.ofPropertyValuesHolder(mTargetView, propertyValu2);
                         obj4.setDuration(this.getAnimDuration());
                         obj4.setRepeatCount(this.getRepeatCount());
                         i6 = (obj.autoReverse != null)? 2: 1;
                         obj4.setRepeatMode(i6);
                      }
                   }
                }
                obj4 = null;
                ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(mTargetView, obj, tKBasicAnima, "42");
                if (objectAnimat != patchProxyRe) {
                }else {
                   str5 = str7;
                   if (obj.animValue.containsKey(str5)) {
                      String[] stringArray = obj.trans2StringArray(obj.animValue.get(str5));
                      if (stringArray != null) {
                         i3 = 2;
                         if (stringArray.length == i3) {
                            float[] uofloatArray1 = new float[i3]{0,0};
                            i3 = 0;
                            uofloatArray1[i3] = obj.parseFloatValue(stringArray[i3]);
                            i4 = 1;
                            uofloatArray1[i4] = obj.parseFloatValue(stringArray[i4]);
                            uofloatArray2 = new float[i4];
                            uofloatArray2[i3] = uofloatArray1[i3];
                            uofloatArray = new float[i4];
                            uofloatArray[i3] = uofloatArray1[i4];
                            PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("rotationX", uofloatArray2),PropertyValuesHolder.ofFloat("rotationY", uofloatArray)};
                            objectAnimat = ObjectAnimator.ofPropertyValuesHolder(mTargetView, propertyValu1);
                            objectAnimat.setDuration(this.getAnimDuration());
                            objectAnimat.setRepeatCount(this.getRepeatCount());
                            int i5 = (obj.autoReverse != null)? 2: 1;
                            objectAnimat.setRepeatMode(i5);
                         }
                      }
                   }
                   objectAnimat = null;
                }
                ObjectAnimator objectAnimat1 = PatchProxy.applyOneRefs(mTargetView, obj, tKBasicAnima, "43");
                if (objectAnimat1 != patchProxyRe) {
                }else if(obj.animValue.containsKey("opacity")){
                   alpha = mTargetView.getAlpha();
                   float f = obj.parseFloatValue(obj.trans2String(obj.animValue.get("opacity")));
                   if (alpha - f) {
                      uofloatArray = new float[]{alpha,f};
                      objectAnimat1 = ObjectAnimator.ofFloat(mTargetView, str8, uofloatArray);
                      objectAnimat1.setDuration(this.getAnimDuration());
                      objectAnimat1.setRepeatCount(this.getRepeatCount());
                      i3 = (obj.autoReverse != null)? 2: 1;
                      objectAnimat1.setRepeatMode(i3);
                   }
                }
                objectAnimat1 = null;
                String obj5 = PatchProxy.applyOneRefs(mTargetView, obj, tKBasicAnima, "44");
                if (obj5 != patchProxyRe) {
                   obj1 = obj5;
                }else {
                   obj5 = str9;
                   if (obj.animValue.containsKey(obj5)) {
                      TKViewBackgroundDrawable background = mTargetView.getBackground();
                      int color = background.getColor();
                      int i2 = obj.parseColor(obj.trans2String(obj.animValue.get(obj5)));
                      if (color != i2) {
                         i3 = 2;
                         int[] ointArray = new int[i3];
                         ointArray[0] = color;
                         ointArray[1] = i2;
                         obj1 = ObjectAnimator.ofInt(background, "color", ointArray);
                         obj1.setDuration(this.getAnimDuration());
                         obj1.setEvaluator(new ArgbEvaluator());
                         obj1.setRepeatCount(this.getRepeatCount());
                         if (obj.autoReverse == null) {
                            i3 = 1;
                         }
                         obj1.setRepeatMode(i3);
                      }
                   }
                   obj1 = null;
                }
                ArrayList uArrayList2 = new ArrayList();
                if (obj2 != null) {
                   uArrayList2.add(obj2);
                }
                if (obj4 != null) {
                   uArrayList2.add(obj4);
                }
                if (objectAnimat != null) {
                   uArrayList2.add(objectAnimat);
                }
                if (objectAnimat1 != null) {
                   uArrayList2.add(objectAnimat1);
                }
                if (obj1 != null) {
                   uArrayList2.add(obj1);
                }
                if (uArrayList2.size()) {
                   uAnimatorSet = new AnimatorSet();
                   uAnimatorSet.playTogether(uArrayList2);
                   uAnimatorSet.setStartDelay((long)this.getAnimDelay());
                   uAnimatorSet.setInterpolator(this.getInterpolator());
                   uAnimatorSet.addListener(obj.mAnimatorListenerAdapter);
                   uAnimatorSet.start();
                   obj.animatorMap.put(p0, uAnimatorSet);
                }
             }
          }
       }
    label_052e :
       return;
    }
    public void stop(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKBasicAnimation.class, "32")) {
          return;
       }
       if (this.newVersionEnable() && !this.e()) {
          Animator uAnimator = this.animatorMap.get(p0);
          if (uAnimator != null) {
             uAnimator.removeAllListeners();
             uAnimator.end();
          }
       }
       if (this.isRunning()) {
          this.animator.cancel();
          this.animator = null;
       }
       x.e(this.animatorOnStartForDelay);
       return;
    }
    public String trans2String(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKBasicAnimation.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Map) {
          p0 = p0.get("value");
       }else if(p0 instanceof String){
       }else {
          p0 = String.valueOf(p0);
       }
       return p0;
    }
    public String[] trans2StringArray(Object p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, TKBasicAnimation.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 instanceof Map) {
          obj = new String[2];
          Object obj1 = p0.get("x");
          obj[0] = (obj1 instanceof String)? obj1: String.valueOf(obj1);
          p0 = p0.get("y");
          if (p0 instanceof String) {
             obj[1] = p0;
          }else {
             obj[1] = String.valueOf(p0);
          }
       }
       return obj;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKBasicAnimation.class, "45")) {
          return;
       }
       y.c(this.animNJStartListenerRef);
       y.c(this.animNJEndListenerRef);
       y.c(this.startValueRef);
       y.c(this.endValueRef);
       return;
    }
}
