package com.daimajia.easing.BaseEasingMethod;
import android.animation.TypeEvaluator;
import java.lang.Object;
import java.util.ArrayList;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import java.lang.Float;
import java.lang.Number;
import java.util.Iterator;

public abstract class BaseEasingMethod implements TypeEvaluator	// class@000f86
{
    public float mDuration;
    public ArrayList mListeners;

    public void BaseEasingMethod(float p0){
       super();
       this.mListeners = new ArrayList();
       this.mDuration = p0;
    }
    public void addEasingListener(BaseEasingMethod$EasingListener p0){
       this.mListeners.add(p0);
    }
    public void addEasingListeners(BaseEasingMethod$EasingListener[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.mListeners.add(p0[i]);
       }
       return;
    }
    public abstract Float calculate(float p0,float p1,float p2,float p3);
    public void clearEasingListeners(){
       this.mListeners.clear();
    }
    public final Float evaluate(float p0,Number p1,Number p2){
       float f = this.mDuration * p0;
       p0 = p1.floatValue();
       float f1 = p2.floatValue() - p1.floatValue();
       BaseEasingMethod tmDuration = this.mDuration;
       float f2 = this.calculate(f, p0, f1, tmDuration).floatValue();
       Iterator iterator = this.mListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().on(f, f2, p0, f1, tmDuration);
       }
       return Float.valueOf(f2);
    }
    public Object evaluate(float p0,Object p1,Object p2){
       return this.evaluate(p0, p1, p2);
    }
    public void removeEasingListener(BaseEasingMethod$EasingListener p0){
       this.mListeners.remove(p0);
    }
    public void setDuration(float p0){
       this.mDuration = p0;
    }
}
