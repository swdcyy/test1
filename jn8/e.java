package jn8.e;
import androidx.transition.Transition;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import java.lang.Object;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import jn8.a;
import e3.m;
import e3.n;
import androidx.transition.Visibility;
import androidx.transition.Fade;
import jn8.b;
import androidx.transition.Slide;
import androidx.transition.TransitionSet;
import com.facebook.react.bridge.ReadableArray;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeTransform;

public class e	// class@002984
{

    public static void a(Transition p0,ReadableMap p1){
       String str = "durationMs";
       if (p1.hasKey(str)) {
          p0.Z((long)p1.getInt(str));
       }
       str = "interpolation";
       if (p1.hasKey(str)) {
          str = p1.getString(str);
          if (str.equals("easeIn")) {
             p0.b0(new AccelerateInterpolator());
          }else if(str.equals("easeOut")){
             p0.b0(new DecelerateInterpolator());
          }else if(str.equals("easeInOut")){
             p0.b0(new AccelerateDecelerateInterpolator());
          }else if(str.equals("linear")){
             p0.b0(new LinearInterpolator());
          }else {
             throw new JSApplicationIllegalArgumentException("Invalid interpolation type "+str);
          }
       }
       str = "propagation";
       if (p1.hasKey(str)) {
          str = p1.getString(str);
          a uoa = new a();
          if (("top").equals(str)) {
             uoa.j(80);
          }else if(("bottom").equals(str)){
             uoa.j(48);
          }else if(("left").equals(str)){
             uoa.j(5);
          }else if(("right").equals(str)){
             uoa.j(3);
          }
          p0.e0(uoa);
       }else {
          p0.e0(null);
       }
       str = "delayMs";
       if (p1.hasKey(str)) {
          p0.g0((long)p1.getInt(str));
       }
       return;
    }
    public static Visibility b(String p0){
       if (p0 == null || ("none").equals(p0)) {
          return null;
       }
       int i = 3;
       if (("fade").equals(p0)) {
          return new Fade(i);
       }
       if (("scale").equals(p0)) {
          return new b();
       }
       if (("slide-top").equals(p0)) {
          return new Slide(48);
       }
       if (("slide-bottom").equals(p0)) {
          return new Slide(80);
       }
       if (("slide-right").equals(p0)) {
          return new Slide(5);
       }
       if (("slide-left").equals(p0)) {
          return new Slide(i);
       }
       throw new JSApplicationIllegalArgumentException("Invalid transition type "+p0);
    }
    public static Transition c(ReadableMap p0){
       Transition transition;
       Visibility visibility;
       String str = p0.getString("type");
       int i = 1;
       if (("group").equals(str)) {
          TransitionSet transitionSe = new TransitionSet();
          String str1 = "sequence";
          int i1 = 0;
          if (p0.hasKey(str1) && p0.getBoolean(str1)) {
             transitionSe.t0(i);
          }else {
             transitionSe.t0(i1);
          }
          ReadableArray array = p0.getArray("transitions");
          int i2 = array.size();
          while (i1 < i2) {
             transition = e.c(array.getMap(i1));
             if (transition != null) {
                transitionSe.l0(transition);
             }
             i1 = i1 + 1;
          }
          return transitionSe;
       }else {
          Transition transition1 = null;
          if (("in").equals(str)) {
             visibility = e.b(p0.getString("animation"));
             if (visibility != null) {
                visibility.q0(i);
                e.a(visibility, p0);
                transition1 = visibility;
             }
             return transition1;
          }else if(("out").equals(str)){
             visibility = e.b(p0.getString("animation"));
             if (visibility != null) {
                visibility.q0(2);
                e.a(visibility, p0);
                transition1 = visibility;
             }
             return transition1;
          }else if(("change").equals(str)){
             ChangeBounds uChangeBound = new ChangeBounds();
             ChangeTransform uChangeTrans = new ChangeTransform();
             e.a(uChangeBound, p0);
             e.a(uChangeTrans, p0);
             TransitionSet transitionSe1 = new TransitionSet();
             transitionSe1.l0(uChangeBound);
             transitionSe1.l0(uChangeTrans);
             return transitionSe1;
          }else {
             throw new JSApplicationIllegalArgumentException("Unrecognized transition type "+str);
          }
       }
    }
}
