package com.kwai.live.gzone.widget.ViewAnimator2;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import android.view.ViewGroup;
import java.lang.Boolean;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.widget.ViewAnimator2$a;
import java.lang.CharSequence;
import android.widget.ViewAnimator;
import java.lang.Number;

public class ViewAnimator2 extends FrameLayout	// class@000e85
{
    public int b;
    public boolean c;
    public boolean d;
    public ObjectAnimator e;
    public ObjectAnimator f;

    public void ViewAnimator2(Context p0){
       super(p0);
       this.b = 0;
       this.c = true;
       this.d = true;
       this.a(p0, null);
    }
    public void ViewAnimator2(Context p0,AttributeSet p1){
       super(p0, p1);
       int i = 0;
       this.b = i;
       this.c = true;
       this.d = true;
       int[] y5 = c$b.Y5;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, y5);
       if (Build$VERSION.SDK_INT >= 29) {
          this.saveAttributeDataForStyleable(p0, y5, p1, typedArray, 0, 0);
       }
       this.setAnimateFirstView(typedArray.getBoolean(i, true));
       typedArray.recycle();
       this.a(p0, p1);
       return;
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewAnimator2.class, "1")) {
          return;
       }
       if (p1 == null) {
          this.setMeasureAllChildren(true);
       }
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(ViewAnimator2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ViewAnimator2.class, "12")) {
          return;
       }
       super.addView(p0, p1, p2);
       if (this.getChildCount() == 1) {
          p0.setVisibility(0);
       }else {
          p0.setVisibility(8);
       }
       if (p1 >= 0) {
          ViewAnimator2 tb = this.b;
          if (tb >= p1) {
             this.setDisplayedChild((tb + 1));
          }
       }
       return;
    }
    public void b(int p0,boolean p1){
       if (PatchProxy.isSupport(ViewAnimator2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ViewAnimator2.class, "5")) {
          return;
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          int i1 = 1;
          if (i == p0) {
             if (p1 && !PatchProxy.applyVoidOneRefs(childAt, this, ViewAnimator2.class, "10")) {
                childAt.setVisibility(false);
                float[] uofloatArray = new float[2];
                uofloatArray[0] = (float)childAt.getHeight();
                uofloatArray[i1] = 0;
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, uofloatArray);
                this.f = objectAnimat;
                objectAnimat.setDuration(500);
                this.f.setRepeatCount(false);
                this.f.setAutoCancel(i1);
                this.f.start();
             }
             this.c = false;
          }else {
             ViewAnimator2 viewAnimator = null;
             if (p1 && !childAt.getVisibility()) {
                if (!PatchProxy.applyVoidOneRefs(childAt, this, ViewAnimator2.class, "8")) {
                   this.c(childAt, viewAnimator);
                }
             }else {
                ViewAnimator2 obj = PatchProxy.applyOneRefs(childAt, this, ViewAnimator2.class, "7");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.booleanValue();
                }else {
                   obj = this.f;
                   if (obj == null || (!obj.isRunning() || this.f.getTarget() != childAt)) {
                      i1 = false;
                   }
                }
                if (i1 && !PatchProxy.applyVoidOneRefs(childAt, this, ViewAnimator2.class, "6")) {
                   ViewAnimator2 tf = this.f;
                   if (tf != null && tf.getTarget() == childAt) {
                      this.f.cancel();
                      this.f = viewAnimator;
                   }
                   tf = this.e;
                   if (tf != null && tf.getTarget() == childAt) {
                      this.e.cancel();
                      this.e = viewAnimator;
                   }
                }
             }
          }
       label_00d5 :
          i = i + 1;
       }
       return;
    }
    public final void c(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewAnimator2.class, "9")) {
          return;
       }
       float[] uofloatArray = new float[]{0,(float)(- p0.getHeight())};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       this.e = objectAnimat;
       objectAnimat.setDuration(500);
       this.e.setRepeatCount(0);
       this.e.setAutoCancel(1);
       this.e.addListener(new ViewAnimator2$a(this, p0, p1));
       this.e.start();
       return;
    }
    public CharSequence getAccessibilityClassName(){
       Object obj = PatchProxy.apply(null, this, ViewAnimator2.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewAnimator.class.getName();
    }
    public boolean getAnimateFirstView(){
       return this.d;
    }
    public int getBaseline(){
       Object obj = PatchProxy.apply(null, this, ViewAnimator2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int baseline = (this.getCurrentView() != null)? this.getCurrentView().getBaseline(): super.getBaseline();
       return baseline;
    }
    public View getCurrentView(){
       Object obj = PatchProxy.apply(null, this, ViewAnimator2.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getChildAt(this.b);
    }
    public int getDisplayedChild(){
       return this.b;
    }
    public void removeAllViews(){
       if (PatchProxy.applyVoid(null, this, ViewAnimator2.class, "13")) {
          return;
       }
       super.removeAllViews();
       this.b = 0;
       this.c = true;
       return;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewAnimator2.class, "14")) {
          return;
       }
       int i = this.indexOfChild(p0);
       if (i >= 0) {
          this.removeViewAt(i);
       }
       return;
    }
    public void removeViewAt(int p0){
       if (PatchProxy.isSupport(ViewAnimator2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewAnimator2.class, "15")) {
          return;
       }
       super.removeViewAt(p0);
       int childCount = this.getChildCount();
       if (!childCount) {
          this.b = 0;
          this.c = true;
       }else {
          ViewAnimator2 tb = this.b;
          if (tb >= childCount) {
             this.setDisplayedChild((childCount - true));
          }else if(tb == p0){
             this.setDisplayedChild(tb);
          }
       }
       return;
    }
    public void removeViewInLayout(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewAnimator2.class, "16")) {
          return;
       }
       this.removeView(p0);
       return;
    }
    public void removeViews(int p0,int p1){
       if (PatchProxy.isSupport(ViewAnimator2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ViewAnimator2.class, "17")) {
          return;
       }
       super.removeViews(p0, p1);
       if (!this.getChildCount()) {
          this.b = 0;
          this.c = true;
       }else {
          ViewAnimator2 tb = this.b;
          if (tb >= p0 && tb < (p0 + p1)) {
             this.setDisplayedChild(tb);
          }
       }
       return;
    }
    public void removeViewsInLayout(int p0,int p1){
       if (PatchProxy.isSupport(ViewAnimator2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ViewAnimator2.class, "18")) {
          return;
       }
       this.removeViews(p0, p1);
       return;
    }
    public void setAnimateFirstView(boolean p0){
       this.d = p0;
    }
    public void setDisplayedChild(int p0){
       if (PatchProxy.isSupport(ViewAnimator2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewAnimator2.class, "2")) {
          return;
       }
       this.b = p0;
       boolean b = true;
       if (p0 >= this.getChildCount()) {
          this.b = 0;
       }else if(p0 < 0){
          this.b = this.getChildCount() - b;
       }
       p0 = (this.getFocusedChild() != null)? 1: 0;
       ViewAnimator2 tb = this.b;
       if (!PatchProxy.isSupport(ViewAnimator2.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tb), this, ViewAnimator2.class, "11")) {
          if (this.c != null && this.d == null) {
             b = false;
          }
          this.b(tb, b);
       }
       if (p0) {
          this.requestFocus(2);
       }
       return;
    }
}
