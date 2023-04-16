package com.tachikoma.core.component.anim.TKSpringAnimation;
import com.tachikoma.core.component.anim.TKBasicAnimation;
import gx4.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.view.View;
import h2.c;
import h2.f;
import h2.g;
import java.util.HashMap;
import com.tachikoma.core.component.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import xo8.a;
import java.util.Map;
import java.util.Iterator;
import java.util.Objects;
import java.lang.Exception;
import java.lang.Throwable;
import zp8.a;
import h2.b;

public class TKSpringAnimation extends TKBasicAnimation	// class@000d60
{
    public float damping;
    public float stiffness;

    public void TKSpringAnimation(f p0){
       super(p0);
       this.stiffness = 380.00f;
       this.damping = 20.00f;
    }
    public final float i(float p0,float p1){
       TKSpringAnimation tKSpringAnim = TKSpringAnimation.class;
       if (PatchProxy.isSupport(tKSpringAnim)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKSpringAnim, "8");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (float)((double)p0 / (Math.sqrt((double)p1) * 2.00f));
    }
    public final void j(View p0,c p1,float p2,float p3,float p4){
       TKSpringAnimation tKSpringAnim = TKSpringAnimation.class;
       if (PatchProxy.isSupport(tKSpringAnim)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, tKSpringAnim, "6")) {
             return;
          }
       }
       f uof = new f(p0, p1, p2);
       uof.r().g(p4);
       uof.r().e(p3);
       uof.n();
       return;
    }
    public void setDamping(float p0){
       this.damping = p0;
    }
    public void setStiffness(float p0){
       this.stiffness = p0;
    }
    public void start(String p0){
       String str;
       Object obj1;
       float f1;
       int i1;
       b$s s;
       TKSpringAnimation tKSpringAnim1;
       View view2;
       TKSpringAnimation tKSpringAnim2;
       TKSpringAnimation tKSpringAnim = TKSpringAnimation.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKSpringAnim, "1")) {
          return;
       }
       int i = 2;
       if (this.newVersionEnable()) {
          TKBasicAnimation tmBaseView = this.mBaseView;
          if (!PatchProxy.applyVoidTwoRefs(tmBaseView, p0, this, tKSpringAnim, "2")) {
             HashMap animationPro = tmBaseView.getAnimationPropertySnapshot();
             if (animationPro.size() > 0 && !TextUtils.isEmpty(p0)) {
                animationPro = animationPro.get(p0);
                if (animationPro != null && (animationPro.size() > 0 && (!PatchProxy.applyVoidThreeRefs(tmBaseView, p0, animationPro, this, TKSpringAnimation.class, "3") && !animationPro.isEmpty()))) {
                   List list = a.a();
                   Map map = this.diffAnimationProperty(list, animationPro);
                   if (!map.isEmpty()) {
                      float f = this.i(this.damping, this.stiffness);
                      View view = tmBaseView.getView();
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         str = iterator.next();
                         HashMap hashMap = map.get(str);
                         if (hashMap == null || 1 >= hashMap.size()) {
                            continue ;
                         }else {
                            Object obj = hashMap.get(Float.valueOf(0));
                            obj1 = hashMap.get(Float.valueOf(0x3f800000));
                            if (!obj1 instanceof Number || !obj instanceof Number) {
                               continue ;
                            }else {
                               float obj2 = obj.floatValue();
                               f1 = 0;
                               Objects.requireNonNull(str);
                               switch (str.hashCode()){
                                   case 0xb588e09a:
                                     if (!str.equals("rotationX")) {
                                     label_011c :
                                        i1 = -1;
                                     }else {
                                        i1 = 0;
                                     }
                                     break;
                                   case 0xb588e09b:
                                     if (!str.equals("rotationY")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 1;
                                     }
                                     break;
                                   case 0xb6f463c7:
                                     if (!str.equals("translationX")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 2;
                                     }
                                     break;
                                   case 0xb6f463c8:
                                     if (!str.equals("translationY")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 3;
                                     }
                                     break;
                                   case 0xc9de204e:
                                     if (!str.equals("scaleX")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 4;
                                     }
                                     break;
                                   case 0xc9de204f:
                                     if (!str.equals("scaleY")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 5;
                                     }
                                     break;
                                   case 0xfd990f7e:
                                     if (!str.equals("rotation")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 6;
                                     }
                                     break;
                                   case 0x589b15e:
                                     if (!str.equals("alpha")) {
                                        goto label_011c ;
                                     }else {
                                        i1 = 7;
                                     }
                                     break;
                                   default:
                                     goto label_011c ;
                               }
                               switch (i1){
                                   case 0:
                                     view.setRotationX(obj2);
                                     s = b.s;
                                  label_015c :
                                     f1 = s;
                                     break;
                                   case 1:
                                     view.setRotationY(obj2);
                                     s = b.t;
                                     goto label_015c ;
                                     break;
                                   case 2:
                                     view.setTranslationX(obj2);
                                     s = b.m;
                                     goto label_015c ;
                                     break;
                                   case 3:
                                     view.setTranslationY(obj2);
                                     s = b.n;
                                     goto label_015c ;
                                     break;
                                   case 4:
                                     view.setScaleX(obj2);
                                     s = b.p;
                                     goto label_015c ;
                                     break;
                                   case 5:
                                     view.setScaleY(obj2);
                                     s = b.q;
                                     goto label_015c ;
                                     break;
                                   case 6:
                                     view.setRotation(obj2);
                                     s = b.r;
                                     goto label_015c ;
                                     break;
                                   case 7:
                                     view.setAlpha(obj2);
                                     s = b.x;
                                     goto label_015c ;
                                     break;
                                   default:
                                     a.g("startAnimation", new Exception("unknown property"));
                               }
                               if (f1 == null) {
                                  continue ;
                               }
                            }
                         }
                         this.j(view, f1, obj1.floatValue(), f, this.stiffness);
                      }
                   }
                }
             }
          }
       }else {
          View view1 = this.mBaseView.getView();
          if (!PatchProxy.applyVoidOneRefs(view1, this, tKSpringAnim, "4") && this.animValue != null) {
             float f2 = this.i(this.damping, this.stiffness);
             TKSpringAnimation tstiffness = this.stiffness;
             if (!PatchProxy.isSupport(tKSpringAnim) || !PatchProxy.applyVoidThreeRefs(view1, Float.valueOf(f2), Float.valueOf(tstiffness), this, TKSpringAnimation.class, "5")) {
                str = "position";
                if (this.animValue.containsKey(str)) {
                   String[] stringArray1 = this.trans2StringArray(this.animValue.get(str));
                   if (stringArray1 != null && stringArray1.length == i) {
                      float[] uofloatArray1 = new float[i]{0,0};
                      uofloatArray1[0] = this.parsePxValue(stringArray1[0]);
                      uofloatArray1[1] = this.parsePxValue(stringArray1[1]);
                      tKSpringAnim1 = this;
                      view2 = view1;
                      f1 = f2;
                      tKSpringAnim2 = tstiffness;
                      tKSpringAnim1.j(view2, b.m, uofloatArray1[0], f1, tKSpringAnim2);
                      tKSpringAnim1.j(view2, b.n, uofloatArray1[1], f1, tKSpringAnim2);
                   }
                }
             }
             tstiffness = this.stiffness;
             if (!PatchProxy.isSupport(tKSpringAnim) || !PatchProxy.applyVoidThreeRefs(view1, Float.valueOf(f2), Float.valueOf(tstiffness), this, TKSpringAnimation.class, "7")) {
                String str1 = "scale";
                if (this.animValue.containsKey(str1)) {
                   String[] stringArray = this.trans2StringArray(this.animValue.get(str1));
                   if (stringArray != null && stringArray.length == i) {
                      float[] uofloatArray = new float[i]{0,0};
                      uofloatArray[0] = this.parseFloatValue(stringArray[0]);
                      uofloatArray[1] = this.parseFloatValue(stringArray[1]);
                      tKSpringAnim1 = this;
                      view2 = view1;
                      f1 = f2;
                      tKSpringAnim2 = tstiffness;
                      tKSpringAnim1.j(view2, b.p, uofloatArray[0], f1, tKSpringAnim2);
                      tKSpringAnim1.j(view2, b.q, uofloatArray[1], f1, tKSpringAnim2);
                   }
                }
             }
          }
       }
    label_0251 :
       return;
    }
}
