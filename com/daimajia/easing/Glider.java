package com.daimajia.easing.Glider;
import java.lang.Object;
import com.daimajia.easing.Skill;
import android.animation.PropertyValuesHolder;
import com.daimajia.easing.BaseEasingMethod;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;

public class Glider	// class@000f88
{

    public void Glider(){
       super();
    }
    public static PropertyValuesHolder glide(Skill p0,float p1,PropertyValuesHolder p2){
       p2.setEvaluator(p0.getMethod(p1));
       return p2;
    }
    public static ValueAnimator glide(Skill p0,float p1,ValueAnimator p2,BaseEasingMethod$EasingListener[] p3){
       BaseEasingMethod method = p0.getMethod(p1);
       if (p3 != null) {
          method.addEasingListeners(p3);
       }
       p2.setEvaluator(method);
       return p2;
    }
}
