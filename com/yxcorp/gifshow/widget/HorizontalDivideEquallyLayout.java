package com.yxcorp.gifshow.widget.HorizontalDivideEquallyLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.HorizontalDivideEquallyLayout$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Math;
import android.view.View;
import java.lang.Integer;
import com.daimajia.easing.Skill;
import android.animation.ObjectAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import android.animation.ValueAnimator;
import com.daimajia.easing.Glider;
import java.util.Collection;
import android.animation.Animator$AnimatorListener;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import java.lang.Boolean;

public class HorizontalDivideEquallyLayout extends RelativeLayout	// class@001862
{
    public int b;
    public AnimatorSet c;
    public List d;
    public boolean e;
    public Animator$AnimatorListener f;
    public boolean g;
    public int h;

    public void HorizontalDivideEquallyLayout(Context p0){
       super(p0);
       this.b = -1;
       this.c = new AnimatorSet();
       this.d = new ArrayList();
       this.f = new HorizontalDivideEquallyLayout$a(this);
       this.g = true;
       this.b(p0, null, 0, 0);
    }
    public void HorizontalDivideEquallyLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = -1;
       this.c = new AnimatorSet();
       this.d = new ArrayList();
       this.f = new HorizontalDivideEquallyLayout$a(this);
       this.g = true;
       this.b(p0, p1, 0, 0);
    }
    public void HorizontalDivideEquallyLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = -1;
       this.c = new AnimatorSet();
       this.d = new ArrayList();
       this.f = new HorizontalDivideEquallyLayout$a(this);
       this.g = true;
       this.b(p0, p1, p2, 0);
    }
    public void a(){
       int i4;
       int i7;
       int i8;
       int i9;
       int i11;
       int i12;
       ValueAnimator valueAnimato1;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, HorizontalDivideEquallyLayout.class, "4")) {
          return;
       }
       obj.d.clear();
       obj.c.removeAllListeners();
       int childCount = this.getChildCount();
       int i = Math.min(this.getMaxVisibleChildCount(), this.getCanVisibleChildCount());
       int i1 = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       int height = this.getHeight();
       HorizontalDivideEquallyLayout h = obj.h;
       int i2 = 1;
       int i3 = 0;
       if (obj.g != null) {
          i4 = (i1 - (h * i)) / (i + 1);
       }else if(i <= i2){
          i4 = 0;
       }else {
          i4 = (i1 - (h * i)) / (i - 1);
       }
       int i5 = 0;
       int i6 = 0;
       while (i5 < childCount) {
          View childAt = obj.getChildAt(i5);
          if (i6 >= i) {
             childAt.layout(i3, i3, i3, i3);
          }else if(!childAt.getVisibility()){
             int measuredHeig = childAt.getMeasuredHeight();
             int i10 = height - this.getPaddingBottom();
             i10 = i10 - measuredHeig;
             measuredHeig = measuredHeig + i10;
             if (obj.g != null) {
                i11 = i6 + 1;
                i11 = i11 * i4;
                i12 = h * i6;
                i11 = i11 + i12;
                i12 = this.getPaddingLeft();
             }else {
                i11 = i4 * i6;
                i12 = h * i6;
                i11 = i11 + i12;
                i12 = this.getPaddingLeft();
             }
             i11 = i11 + i12;
             i12 = i11 + h;
             i2 = childAt.getLeft();
             if (i2 != i11 || !i2) {
                i7 = childCount;
                if (obj.e != null) {
                   i12 = 2;
                   if (PatchProxy.isSupport(HorizontalDivideEquallyLayout.class)) {
                      Object[] objArray = new Object[8];
                      objArray[0] = Integer.valueOf(i6);
                      objArray[1] = Integer.valueOf(i1);
                      objArray[i12] = Integer.valueOf(h);
                      objArray[3] = childAt;
                      objArray[4] = Integer.valueOf(i10);
                      objArray[5] = Integer.valueOf(measuredHeig);
                      objArray[6] = Integer.valueOf(i11);
                      objArray[7] = Integer.valueOf(i2);
                      if (PatchProxy.applyVoid(objArray, obj, HorizontalDivideEquallyLayout.class, "5")) {
                         i8 = i;
                         i9 = i5;
                         i12 = 0;
                      }else {
                      label_0104 :
                         String str = "translationX";
                         float f = 0x44fa0000;
                         if (i2 <= 0) {
                            i2 = i1 - h;
                            childAt.layout(i2, i10, i1, measuredHeig);
                            childAt.setAlpha(0);
                            Skill circEaseOut = Skill.CircEaseOut;
                            i8 = i;
                            i12 = 0;
                            BaseEasingMethod$EasingListener[] uEasingListe = new BaseEasingMethod$EasingListener[i12];
                            ValueAnimator valueAnimato = Glider.glide(circEaseOut, f, ObjectAnimator.ofFloat(childAt, "alpha", new float[2]{0,0x3f800000}), uEasingListe);
                            i10 = i6 * 140;
                            i9 = i5;
                            long l = (long)i10;
                            valueAnimato.setStartDelay(l);
                            obj.d.add(valueAnimato);
                            float[] uofloatArray = new float[2];
                            uofloatArray[i12] = 0;
                            i11 = i11 - i2;
                            uofloatArray[1] = (float)i11;
                            uEasingListe = new BaseEasingMethod$EasingListener[i12];
                            valueAnimato1 = Glider.glide(circEaseOut, 0x44fa0000, ObjectAnimator.ofFloat(childAt, str, uofloatArray), uEasingListe);
                            valueAnimato1.setStartDelay(l);
                            obj.d.add(valueAnimato1);
                            i5 = 1;
                         }else {
                            i8 = i;
                            i9 = i5;
                            i12 = 0;
                            float[] uofloatArray1 = new float[2];
                            uofloatArray1[i12] = 0;
                            i11 = i11 - i2;
                            uofloatArray1[1] = (float)i11;
                            BaseEasingMethod$EasingListener[] uEasingListe1 = new BaseEasingMethod$EasingListener[i12];
                            valueAnimato1 = Glider.glide(Skill.BackEaseIn, 0x44fa0000, ObjectAnimator.ofFloat(childAt, str, uofloatArray1), uEasingListe1);
                            i = i6 * 140;
                            valueAnimato1.setStartDelay((long)i);
                            obj.d.add(valueAnimato1);
                         }
                      }
                   }else {
                      goto label_0104 ;
                   }
                   i = 0;
                }else {
                   i8 = i;
                   i9 = i5;
                   childAt.setTranslationX(0);
                   childAt.layout(i11, i10, i12, measuredHeig);
                }
             }else {
                i7 = childCount;
                i8 = i;
                i9 = i5;
                i5 = 1;
             }
             i6 = i6 + 1;
          label_019b :
             childCount = i9 + 1;
             i5 = childCount;
             i = i8;
             childCount = i7;
             i3 = 0;
          }
          i7 = childCount;
          i8 = i;
          i9 = i5;
          i5 = 1;
          goto label_019b ;
       }
       if (obj.e != null && obj.d.size() > 0) {
          obj.c.playTogether(obj.d);
          obj.c.addListener(obj.f);
          obj.c.start();
       }
       return;
    }
    public final void b(Context p0,AttributeSet p1,int p2,int p3){
       if (PatchProxy.isSupport(HorizontalDivideEquallyLayout.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, HorizontalDivideEquallyLayout.class, "1")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.e1, p2, p3);
       this.b = typedArray.getInteger(1, -1);
       this.g = typedArray.getBoolean(2, 1);
       this.h = typedArray.getDimensionPixelSize(0, 0);
       typedArray.recycle();
       return;
    }
    public int getCanVisibleChildCount(){
       Object obj = PatchProxy.apply(null, this, HorizontalDivideEquallyLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = 0;
       while (i < this.getChildCount()) {
          if (!this.getChildAt(i).getVisibility()) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return i1;
    }
    public int getMaxVisibleChildCount(){
       int childCount;
       HorizontalDivideEquallyLayout obj = PatchProxy.apply(null, this, HorizontalDivideEquallyLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj < null) {
          childCount = this.getChildCount();
       }
       return childCount;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, HorizontalDivideEquallyLayout.class, "2")) {
          return;
       }
       this.e = false;
       this.c.removeAllListeners();
       this.c.cancel();
       this.d.clear();
       super.onDetachedFromWindow();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(HorizontalDivideEquallyLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, HorizontalDivideEquallyLayout.class, "3")) {
             return;
          }
       }
       this.a();
       return;
    }
    public void setMaxVisibleChildCount(int p0){
       if (PatchProxy.isSupport(HorizontalDivideEquallyLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HorizontalDivideEquallyLayout.class, "8")) {
          return;
       }
       if (this.b != p0) {
          this.b = p0;
          this.e = true;
          this.requestLayout();
       }
       return;
    }
}
