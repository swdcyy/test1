package com.kuaishou.live.core.show.wishlight.spring.view.c;
import android.view.View;
import java.lang.Object;
import java.util.LinkedList;
import android.animation.AnimatorSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.wishlight.spring.view.c$a;
import java.util.List;
import java.util.ArrayList;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public class c	// class@0012bf
{
    public View a;
    public List b;
    public AnimatorSet c;

    public void c(View p0){
       PropertyValuesHolder[] propertyValu;
       float[] uofloatArray;
       float[] uofloatArray1;
       ObjectAnimator objectAnimat;
       c uoc = c.class;
       super();
       this.b = new LinkedList();
       this.c = new AnimatorSet();
       this.a = p0;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
       }else {
          this.b.add(new c$a(0x3f99999a, 0x3f99999a, 467));
          this.b.add(new c$a(0x3f6147ae, 0x3f6147ae, 467));
          this.b.add(new c$a(0x3f947ae1, 0x3f947ae1, 400));
          long l = 333;
          this.b.add(new c$a(0x3f666666, 0x3f666666, l));
          this.b.add(new c$a(0x3f800000, 0x3f800000, l));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          ArrayList uArrayList = new ArrayList();
          for (int i = 0; i < this.b.size(); i = i + 1) {
             int i1 = 2;
             int i2 = 1;
             if (!i) {
                propertyValu = new PropertyValuesHolder[i1];
                uofloatArray = new float[i1];
                uofloatArray[0] = 0x3f800000;
                uofloatArray[i2] = this.b.get(i).a;
                propertyValu[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray);
                uofloatArray1 = new float[i1];
                uofloatArray1[0] = 0x3f800000;
                uofloatArray1[i2] = this.b.get(i).b;
                propertyValu[i2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1);
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.a, propertyValu);
             }else {
                propertyValu = new PropertyValuesHolder[i1];
                uofloatArray = new float[i1];
                int i3 = i - 1;
                uofloatArray[0] = this.b.get(i3).a;
                uofloatArray[i2] = this.b.get(i).a;
                propertyValu[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray);
                uofloatArray1 = new float[i1];
                uofloatArray1[0] = this.b.get(i3).b;
                uofloatArray1[i2] = this.b.get(i).b;
                propertyValu[i2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1);
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.a, propertyValu);
             }
             objectAnimat.setDuration(this.b.get(i).c);
             if (!PatchProxy.applyVoidOneRefs(objectAnimat, this, uoc, "3")) {
                objectAnimat.setInterpolator(a.b(0.17f, 0.17f, 0x3f2b851f, 0x3f800000));
             }
             uArrayList.add(objectAnimat);
          }
          this.c.playSequentially(uArrayList);
       }
       return;
    }
}
