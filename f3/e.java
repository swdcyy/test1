package f3.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.animation.Animator;
import android.util.AttributeSet;
import android.util.Xml;
import android.animation.AnimatorSet;
import java.lang.String;
import java.lang.Object;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import f3.a;
import android.content.res.TypedArray;
import o1.g;
import android.animation.PropertyValuesHolder;
import java.util.ArrayList;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.Iterator;
import android.animation.Keyframe;
import java.lang.Class;
import java.lang.Float;
import java.lang.Integer;
import android.util.TypedValue;
import p1.d$b;
import p1.d;
import f3.e$a;
import android.animation.TypeEvaluator;
import android.view.InflateException;
import f3.f;
import android.os.Build$VERSION;
import android.animation.AnimatorInflater;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$NotFoundException;
import java.lang.Throwable;
import android.view.animation.Interpolator;
import f3.d;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.lang.Math;

public class e	// class@001fc2
{

    public static Animator a(Context p0,Resources p1,Resources$Theme p2,XmlPullParser p3,float p4){
       return e.b(p0, p1, p2, p3, Xml.asAttributeSet(p3), null, 0, p4);
    }
    public static Animator b(Context p0,Resources p1,Resources$Theme p2,XmlPullParser p3,AttributeSet p4,AnimatorSet p5,int p6,float p7){
       Resources resources = p1;
       Resources$Theme theme = p2;
       XmlPullParser xmlPullParse = p3;
       AnimatorSet uAnimatorSet = p5;
       int depth = p3.getDepth();
       int[] ointArray = null;
       ArrayList uArrayList = ointArray;
       while (true) {
          int i = p3.next();
          int i1 = 0;
          if (i != 3 || (p3.getDepth() > depth && i != 1)) {
             if (i != 2) {
                continue ;
             }else {
                String name = p3.getName();
                if (name.equals("objectAnimator")) {
                   ointArray = e.n(p0, p1, p2, p4, p7, p3);
                label_003f :
                   int i2 = p0;
                }else if(name.equals("animator")){
                   ointArray = e.l(p0, p1, p2, p4, null, p7, p3);
                   goto label_003f ;
                }else if(name.equals("set")){
                   AnimatorSet uAnimatorSet1 = new AnimatorSet();
                   TypedArray typedArray = g.k(resources, theme, p4, a.h);
                   TypedArray typedArray1 = typedArray;
                   e.b(p0, p1, p2, p3, p4, uAnimatorSet1, g.g(typedArray, xmlPullParse, "ordering", i1, i1), p7);
                   typedArray1.recycle();
                   ointArray = uAnimatorSet1;
                }else if(name.equals("propertyValuesHolder")){
                   PropertyValuesHolder[] propertyValu = e.p(p0, resources, theme, xmlPullParse, Xml.asAttributeSet(p3));
                   if (propertyValu != null && ointArray instanceof ValueAnimator) {
                      ointArray.setValues(propertyValu);
                   }
                   i1 = 1;
                }else {
                   throw new RuntimeException("Unknown animator name: "+p3.getName());
                }
                if (uAnimatorSet && !i1) {
                   if (uArrayList == null) {
                      uArrayList = new ArrayList();
                   }
                   uArrayList.add(ointArray);
                }
             }
          }else if(uAnimatorSet && uArrayList != null){
             Animator[] uAnimatorArr = new Animator[uArrayList.size()];
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                int i3 = i1 + 1;
                uAnimatorArr[i1] = iterator.next();
                i1 = i3;
             }
             if (!p6) {
                uAnimatorSet.playTogether(uAnimatorArr);
             }else {
                uAnimatorSet.playSequentially(uAnimatorArr);
             }
          }
          break ;
       }
       return ointArray;
    }
    public static Keyframe c(Keyframe p0,float p1){
       if (p0.getType() == Float.TYPE) {
          p0 = Keyframe.ofFloat(p1);
       }else if(p0.getType() == Integer.TYPE){
          p0 = Keyframe.ofInt(p1);
       }else {
          p0 = Keyframe.ofObject(p1);
       }
       return p0;
    }
    public static void d(Keyframe[] p0,float p1,int p2,int p3){
       p1 = p1 / (float)((p3 - p2) + 2);
       for (; p2 <= p3; p2++) {
          int i = p2 - 1;
          float f = p0[i].getFraction() + p1;
          p0[p2].setFraction(f);
       }
       return;
    }
    public static PropertyValuesHolder e(TypedArray p0,int p1,int p2,int p3,String p4){
       Object[] objArray;
       PropertyValuesHolder propertyValu1;
       f uof;
       float dimension1;
       int i3;
       int i4;
       int i5;
       TypedValue typedValue = p0.peekValue(p2);
       boolean b = (typedValue != null)? true: false;
       typedValue = (b)? typedValue.type: 0;
       TypedValue typedValue1 = p0.peekValue(p3);
       int i = (typedValue1 != null)? 1: 0;
       typedValue1 = (i)? typedValue1.type: 0;
       int i1 = 3;
       if (p1 == 4) {
          p1 = (!b || (e.h(typedValue) || (i && e.h(typedValue1))))? 3: 0;
       }
    label_0037 :
       int i2 = (!p1)? 1: 0;
       PropertyValuesHolder propertyValu = null;
       if (p1 == 2) {
          String str = p0.getString(p2);
          String str1 = p0.getString(p3);
          d$b[] uobArray = d.d(str);
          d$b[] uobArray1 = d.d(str1);
          if (uobArray != null || uobArray1 != null) {
             if (uobArray != null) {
                e$a uoa = new e$a();
                if (uobArray1 != null) {
                   if (d.b(uobArray, uobArray1)) {
                      objArray = new Object[]{uobArray,uobArray1};
                      propertyValu1 = PropertyValuesHolder.ofObject(p4, uoa, objArray);
                   }else {
                      throw new InflateException(" Can\'t morph from "+str+" to "+str1);
                   }
                }else {
                   objArray = new Object[]{uobArray};
                   propertyValu1 = PropertyValuesHolder.ofObject(p4, uoa, objArray);
                }
                propertyValu = propertyValu1;
             }else if(uobArray1 != null){
                Object[] objArray1 = new Object[]{uobArray1};
                propertyValu = PropertyValuesHolder.ofObject(p4, new e$a(), objArray1);
             }
          }
       }else if(p1 == i1){
          uof = f.a();
       }else {
          uof = propertyValu;
       }
       if (i2) {
          if (b) {
             float dimension = (typedValue == 5)? p0.getDimension(p2, 0): p0.getFloat(p2, 0);
             if (i) {
                dimension1 = (typedValue1 == 5)? p0.getDimension(p3, 0): p0.getFloat(p3, 0);
                float[] uofloatArray = new float[]{dimension,dimension1};
                propertyValu1 = PropertyValuesHolder.ofFloat(p4, uofloatArray);
             }else {
                float[] uofloatArray1 = new float[]{dimension};
                propertyValu1 = PropertyValuesHolder.ofFloat(p4, uofloatArray1);
             }
          }else if(typedValue1 == 5){
             dimension1 = p0.getDimension(p3, 0);
          }else {
             dimension1 = p0.getFloat(p3, 0);
          }
          float[] uofloatArray2 = new float[]{dimension1};
          propertyValu1 = PropertyValuesHolder.ofFloat(p4, uofloatArray2);
          propertyValu = propertyValu1;
       }else if(b){
          if (typedValue == 5) {
             p2 = (int)p0.getDimension(p2, 0);
          }else if(e.h(typedValue)){
             p2 = p0.getColor(p2, 0);
          }else {
             p2 = p0.getInt(p2, 0);
          }
          if (i) {
             if (typedValue1 == 5) {
                i3 = (int)p0.getDimension(p3, 0);
             }else if(e.h(typedValue1)){
                i3 = p0.getColor(p3, 0);
             }else {
                i3 = p0.getInt(p3, 0);
             }
             int[] ointArray = new int[]{p2,i3};
             propertyValu = PropertyValuesHolder.ofInt(p4, ointArray);
          }else {
             int[] ointArray1 = new int[]{p2};
             propertyValu = PropertyValuesHolder.ofInt(p4, ointArray1);
          }
       }else if(i){
          if (typedValue1 == 5) {
             i3 = (int)p0.getDimension(p3, 0);
          }else if(e.h(typedValue1)){
             i3 = p0.getColor(p3, 0);
          }else {
             i3 = p0.getInt(p3, 0);
          }
          int[] ointArray2 = new int[]{i3};
          propertyValu = PropertyValuesHolder.ofInt(p4, ointArray2);
       }
       if (propertyValu != null && uof != null) {
          propertyValu.setEvaluator(uof);
       }
    label_0167 :
       return propertyValu;
    }
    public static int f(TypedArray p0,int p1,int p2){
       int i3;
       TypedValue typedValue = p0.peekValue(p1);
       int i = 1;
       int i1 = 0;
       int i2 = (typedValue != null)? 1: 0;
       typedValue = (i2)? typedValue.type: 0;
       TypedValue typedValue1 = p0.peekValue(p2);
       if (typedValue1 == null) {
          i = 0;
       }
       typedValue1 = (i)? typedValue1.type: 0;
       if (!i2 || (e.h(typedValue) || (i && e.h(typedValue1)))) {
          i1 = 3;
       }
       return i1;
    }
    public static int g(Resources p0,Resources$Theme p1,AttributeSet p2,XmlPullParser p3){
       TypedArray typedArray = g.k(p0, p1, p2, a.j);
       int i = 0;
       TypedValue typedValue = g.l(typedArray, p3, "value", i);
       int i1 = (typedValue != null)? 1: 0;
       if (i1 && e.h(typedValue.type)) {
          i = 3;
       }
       typedArray.recycle();
       return i;
    }
    public static boolean h(int p0){
       boolean b = (p0 >= 28 && p0 <= 31)? true: false;
       return b;
    }
    public static Animator i(Context p0,int p1){
       Animator uAnimator = (Build$VERSION.SDK_INT >= 24)? AnimatorInflater.loadAnimator(p0, p1): e.j(p0, p0.getResources(), p0.getTheme(), p1);
       return uAnimator;
    }
    public static Animator j(Context p0,Resources p1,Resources$Theme p2,int p3){
       return e.k(p0, p1, p2, p3, 0x3f800000);
    }
    public static Animator k(Context p0,Resources p1,Resources$Theme p2,int p3,float p4){
       XmlResourceParser xmlResourceP = null;
       try{
          xmlResourceP = p1.getAnimation(p3);
          xmlResourceP.close();
          return e.a(p0, p1, p2, xmlResourceP, p4);
       }catch(org.xmlpull.v1.XmlPullParserException e2){
          Resources$NotFoundException notFoundExce = new Resources$NotFoundException(v0+Integer.toHexString(p3));
          notFoundExce.initCause(e2);
          throw notFoundExce;
       }catch(java.io.IOException e2){
          notFoundExce = new Resources$NotFoundException(v0+Integer.toHexString(p3));
          notFoundExce.initCause(e2);
          throw notFoundExce;
       }
    }
    public static ValueAnimator l(Context p0,Resources p1,Resources$Theme p2,AttributeSet p3,ValueAnimator p4,float p5,XmlPullParser p6){
       TypedArray typedArray = g.k(p1, p2, p3, a.g);
       TypedArray typedArray1 = g.k(p1, p2, p3, a.k);
       if (p4 == null) {
          p4 = new ValueAnimator();
       }
       e.q(p4, typedArray, typedArray1, p5, p6);
       int i = g.h(typedArray, p6, "interpolator", 0, 0);
       if (i > 0) {
          p4.setInterpolator(d.a(p0, i));
       }
       typedArray.recycle();
       if (typedArray1 != null) {
          typedArray1.recycle();
       }
       return p4;
    }
    public static Keyframe m(Context p0,Resources p1,Resources$Theme p2,AttributeSet p3,int p4,XmlPullParser p5){
       Keyframe keyframe;
       TypedArray typedArray = g.k(p1, p2, p3, a.j);
       int i = 3;
       float f = g.f(typedArray, p5, "fraction", i, 0xbf800000);
       TypedValue typedValue = g.l(typedArray, p5, "value", 0);
       int i1 = (typedValue != null)? 1: 0;
       if (p4 == 4) {
          p4 = (i1 && e.h(typedValue.type))? 3: 0;
       }
    label_002c :
       if (i1) {
          if (p4) {
             keyframe = (p4 != 1 && p4 != i)? null: Keyframe.ofInt(f, g.g(typedArray, p5, "value", 0, 0));
          }else {
             keyframe = Keyframe.ofFloat(f, g.f(typedArray, p5, "value", 0, 0));
          }
       }else if(!p4){
          keyframe = Keyframe.ofFloat(f);
       }else {
          keyframe = Keyframe.ofInt(f);
       }
       i = g.h(typedArray, p5, "interpolator", 1, 0);
       if (i > 0) {
          keyframe.setInterpolator(d.a(p0, i));
       }
       typedArray.recycle();
       return keyframe;
    }
    public static ObjectAnimator n(Context p0,Resources p1,Resources$Theme p2,AttributeSet p3,float p4,XmlPullParser p5){
       ObjectAnimator objectAnimat = new ObjectAnimator();
       e.l(p0, p1, p2, p3, objectAnimat, p4, p5);
       return objectAnimat;
    }
    public static PropertyValuesHolder o(Context p0,Resources p1,Resources$Theme p2,XmlPullParser p3,String p4,int p5){
       Keyframe keyframe;
       float f = 0;
       ArrayList uArrayList = f;
       int i = p3.next();
       String str = 3;
       while (i != str && i != 1) {
          if ((p3.getName()).equals("keyframe")) {
             if (p5 == 4) {
                p5 = e.g(p1, p2, Xml.asAttributeSet(p3), p3);
             }
             keyframe = e.m(p0, p1, p2, Xml.asAttributeSet(p3), p5, p3);
             if (keyframe != null) {
                if (uArrayList == null) {
                   uArrayList = new ArrayList();
                }
                uArrayList.add(keyframe);
             }
             p3.next();
          }
       }
       if (uArrayList != null) {
          int i1 = uArrayList.size();
          if (i1 > 0) {
             int i2 = 0;
             Keyframe keyframe1 = uArrayList.get(i2);
             Keyframe keyframe2 = uArrayList.get((i1 - 1));
             f = keyframe2.getFraction();
             if (f - 0x3f800000 < 0) {
                if (f < 0) {
                   keyframe2.setFraction(0x3f800000);
                }else {
                   uArrayList.add(uArrayList.size(), e.c(keyframe2, 0x3f800000));
                   i1++;
                }
             }
             float fraction = keyframe1.getFraction();
             if (fraction) {
                if (fraction < 0) {
                   keyframe1.setFraction(0);
                }else {
                   uArrayList.add(i2, e.c(keyframe1, 0));
                   i1++;
                }
             }
             Keyframe[] keyframeArra = new Keyframe[i1];
             uArrayList.toArray(keyframeArra);
             while (i2 < i1) {
                object oobject = keyframeArra[i2];
                if (oobject.getFraction() < 0) {
                   if (!i2) {
                      oobject.setFraction(0);
                   }else {
                      int i3 = i1 - 1;
                      if (i2 == i3) {
                         oobject.setFraction(0x3f800000);
                      }else {
                         int i5 = i2;
                         for (int i4 = i2 + 1; i4 < i3 && keyframeArra[i4].getFraction() < 0; i4 = i6) {
                            i5 = i4 + 1;
                            int i6 = i5;
                            i5 = i4;
                         }
                         i4 = i5 + 1;
                         i3 = i2 - 1;
                         fraction = keyframeArra[i4].getFraction() - keyframeArra[i3].getFraction();
                         e.d(keyframeArra, fraction, i2, i5);
                      }
                   }
                }
                i2++;
             }
             f = PropertyValuesHolder.ofKeyframe(p4, keyframeArra);
             if (p5 == str) {
                f.setEvaluator(f.a());
             }
          }
       }
       return f;
    }
    public static PropertyValuesHolder[] p(Context p0,Resources p1,Resources$Theme p2,XmlPullParser p3,AttributeSet p4){
       XmlPullParser xmlPullParse = p3;
       PropertyValuesHolder[] propertyValu = null;
       ArrayList uArrayList = propertyValu;
       int eventType = p3.getEventType();
       int i = 0;
       int i1 = 3;
       while (eventType != i1 && eventType != 1) {
          int i2 = 2;
          if (eventType != i2) {
             p3.next();
          }else if((p3.getName()).equals("propertyValuesHolder")){
             TypedArray typedArray = g.k(p1, p2, p4, a.i);
             String str = g.i(typedArray, xmlPullParse, "propertyName", i1);
             int i3 = g.g(typedArray, xmlPullParse, "valueType", i2, 4);
             int i4 = i3;
             PropertyValuesHolder propertyValu1 = e.o(p0, p1, p2, p3, str, i3);
             if (propertyValu1 == null) {
                propertyValu1 = e.e(typedArray, i4, i, 1, str);
             }
             if (propertyValu1 != null) {
                if (uArrayList == null) {
                   uArrayList = new ArrayList();
                }
                uArrayList.add(propertyValu1);
             }
             typedArray.recycle();
          }else {
             int i5 = p4;
          }
          p3.next();
       }
       if (uArrayList != null) {
          eventType = uArrayList.size();
          propertyValu = new PropertyValuesHolder[eventType];
          for (; i < eventType; i = i + 1) {
             propertyValu[i] = uArrayList.get(i);
          }
       }
       return propertyValu;
    }
    public static void q(ValueAnimator p0,TypedArray p1,TypedArray p2,float p3,XmlPullParser p4){
       long l = (long)g.g(p1, p4, "duration", 1, 300);
       long l1 = (long)g.g(p1, p4, "startOffset", 2, 0);
       int i = g.g(p1, p4, "valueType", 7, 4);
       if (g.j(p4, "valueFrom") && g.j(p4, "valueTo")) {
          int i1 = 6;
          int i2 = 5;
          if (i == 4) {
             i = e.f(p1, i2, i1);
          }
          PropertyValuesHolder propertyValu = e.e(p1, i, i2, i1, "");
          if (propertyValu != null) {
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{propertyValu};
             p0.setValues(propertyValu1);
          }
       }
    label_0042 :
       p0.setDuration(l);
       p0.setStartDelay(l1);
       p0.setRepeatCount(g.g(p1, p4, "repeatCount", 3, 0));
       p0.setRepeatMode(g.g(p1, p4, "repeatMode", 4, 1));
       if (p2 != null) {
          e.r(p0, p2, i, p3, p4);
       }
       return;
    }
    public static void r(ValueAnimator p0,TypedArray p1,int p2,float p3,XmlPullParser p4){
       String str = g.i(p1, p4, "pathData", 1);
       if (str != null) {
          String str1 = g.i(p1, p4, "propertyXName", 2);
          String str2 = g.i(p1, p4, "propertyYName", 3);
          if (str1 != null || str2 != null) {
             e.s(d.e(str), p0, (p3 * 0x3f000000), str1, str2);
          }else {
             throw new InflateException(p1.getPositionDescription()+" propertyXName or propertyYName is needed for PathData");
          }
       }else {
          p0.setPropertyName(g.i(p1, p4, "propertyName", 0));
       }
       return;
    }
    public static void s(Path p0,ObjectAnimator p1,float p2,String p3,String p4){
       Path path = p0;
       ObjectAnimator objectAnimat = p1;
       String str = p3;
       String str1 = p4;
       PathMeasure pathMeasure = new PathMeasure(path, false);
       ArrayList uArrayList = new ArrayList();
       float f = 0;
       uArrayList.add(Float.valueOf(f));
       float f1 = 0;
       do {
          f1 = f1 + pathMeasure.getLength();
          uArrayList.add(Float.valueOf(f1));
       } while (!pathMeasure.nextContour());
       pathMeasure = new PathMeasure(path, false);
       int i = Math.min(100, ((int)(f1 / p2) + 1));
       float[] uofloatArray = new float[i];
       float[] uofloatArray1 = new float[i];
       float[] uofloatArray2 = new float[2];
       f1 = f1 / (float)(i - 1);
       int i1 = 0;
       int i2 = 0;
       float[] uofloatArray3 = null;
       while (i1 < i) {
          float f2 = f - uArrayList.get(i2).floatValue();
          pathMeasure.getPosTan(f2, uofloatArray2, uofloatArray3);
          uofloatArray[i1] = uofloatArray2[0];
          uofloatArray1[i1] = uofloatArray2[1];
          f = f + f1;
          int i3 = i2 + 1;
          if (i3 < uArrayList.size() && f - uArrayList.get(i3).floatValue() > 0) {
             pathMeasure.nextContour();
             i2 = i3;
          }
          i1 = i1 + 1;
          f2 = Float.MIN_VALUE;
       }
       PropertyValuesHolder propertyValu = (str)? PropertyValuesHolder.ofFloat(str, uofloatArray): uofloatArray3;
       if (str1) {
          uofloatArray3 = PropertyValuesHolder.ofFloat(str1, uofloatArray1);
       }
       if (propertyValu == null) {
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{uofloatArray3};
          objectAnimat.setValues(propertyValu1);
       }else {
          int i4 = 1;
          if (uofloatArray3 == null) {
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[i4];
             propertyValu2[0] = propertyValu;
             objectAnimat.setValues(propertyValu2);
          }else {
             PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{propertyValu,uofloatArray3};
             objectAnimat.setValues(propertyValu3);
          }
       }
       return;
    }
}
