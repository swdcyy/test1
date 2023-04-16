package com.kwai.widget.customer.foldavatar.KwaiFoldAvatarLayout;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import hx7.b;
import java.lang.Boolean;
import android.view.View$MeasureSpec;

public class KwaiFoldAvatarLayout extends ViewGroup implements View$OnClickListener	// class@00112a
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public b g;
    public int h;
    public int i;

    public void KwaiFoldAvatarLayout(Context p0){
       super(p0, null);
    }
    public void KwaiFoldAvatarLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiFoldAvatarLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!PatchProxy.isSupport(KwaiFoldAvatarLayout.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiFoldAvatarLayout.class, "1")) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.O1, p2, 0);
          this.h = typedArray.getInt(3, 0);
          this.b = typedArray.getResourceId(true, 0x106000d);
          this.c = typedArray.getDimensionPixelSize(2, 0);
          this.d = typedArray.getDimensionPixelSize(0, 0);
          this.e = typedArray.getDimensionPixelSize(5, 0);
          this.f = typedArray.getDimensionPixelSize(6, 0);
          this.i = typedArray.getInt(4, 0);
          typedArray.recycle();
       }
       this.setChildrenDrawingOrderEnabled(true);
       return;
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (PatchProxy.isSupport(KwaiFoldAvatarLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiFoldAvatarLayout.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (this.i == 1)? super.getChildDrawingOrder(p0, p1): (p0 - p1) - 1;
       return p0;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiFoldAvatarLayout.class, "15")) {
          return;
       }
       KwaiFoldAvatarLayout tg = this.g;
       if (tg != null) {
          tg.a(p0, p0.getTag(R.id.widget_customer_fold_avatar_layout));
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Object[] objArray;
       int childCount;
       View childAt;
       int i4;
       View childAt1;
       View childAt2;
       float f;
       int i = 4;
       int i1 = 0;
       int i2 = 5;
       int i3 = 3;
       if (PatchProxy.isSupport(KwaiFoldAvatarLayout.class)) {
          objArray = new Object[i2];
          objArray[i1] = Boolean.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[i3] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, KwaiFoldAvatarLayout.class, "6")) {
             return;
          }
       }
       KwaiFoldAvatarLayout th = this.h;
       if (th != null) {
          if (th != 1) {
             if (th != 2) {
                if (th == i3) {
                   if (PatchProxy.isSupport(KwaiFoldAvatarLayout.class)) {
                      objArray = new Object[i2];
                      objArray[i1] = Boolean.valueOf(p0);
                      objArray[1] = Integer.valueOf(p1);
                      objArray[2] = Integer.valueOf(p2);
                      objArray[i3] = Integer.valueOf(p3);
                      objArray[i] = Integer.valueOf(p4);
                      if (!PatchProxy.applyVoid(objArray, this, KwaiFoldAvatarLayout.class, "10")) {
                      }
                   }else {
                   }
                }
             }else if(PatchProxy.isSupport(KwaiFoldAvatarLayout.class)){
                objArray = new Object[i2];
                objArray[i1] = Boolean.valueOf(p0);
                objArray[1] = Integer.valueOf(p1);
                objArray[2] = Integer.valueOf(p2);
                objArray[i3] = Integer.valueOf(p3);
                objArray[i] = Integer.valueOf(p4);
                if (!PatchProxy.applyVoid(objArray, this, KwaiFoldAvatarLayout.class, "9")) {
                }
             }else {
             }
          }else if(PatchProxy.isSupport(KwaiFoldAvatarLayout.class)){
             objArray = new Object[i2];
             objArray[i1] = Boolean.valueOf(p0);
             objArray[1] = Integer.valueOf(p1);
             objArray[2] = Integer.valueOf(p2);
             objArray[i3] = Integer.valueOf(p3);
             objArray[i] = Integer.valueOf(p4);
             if (!PatchProxy.applyVoid(objArray, this, KwaiFoldAvatarLayout.class, "8")) {
             }
          }else {
          }
       }else if(PatchProxy.isSupport(KwaiFoldAvatarLayout.class)){
          objArray = new Object[i2];
          objArray[i1] = Boolean.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[i3] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (!PatchProxy.applyVoid(objArray, this, KwaiFoldAvatarLayout.class, "7")) {
          }
       }else {
       }
    }
    public void onMeasure(int p0,int p1){
       int size;
       int mode;
       int mode1;
       int size1;
       int childCount;
       int i1;
       View childAt;
       int measuredHeig;
       int i2;
       if (PatchProxy.isSupport(KwaiFoldAvatarLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiFoldAvatarLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       KwaiFoldAvatarLayout th = this.h;
       int i = 0;
       if (th != null) {
          if (th != 1) {
             if (th == 2 || (th == 3 && (!PatchProxy.isSupport(KwaiFoldAvatarLayout.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiFoldAvatarLayout.class, "5")))) {
                size = View$MeasureSpec.getSize(p1);
                mode = View$MeasureSpec.getMode(p1);
                mode1 = View$MeasureSpec.getMode(p0);
                size1 = View$MeasureSpec.getSize(p0);
                childCount = this.getChildCount();
                KwaiFoldAvatarLayout kwaiFoldAvat = null;
                i1 = 0;
                while (i < childCount) {
                   childAt = this.getChildAt(i);
                   if (childAt.getVisibility() != 8) {
                      this.measureChild(childAt, p0, p1);
                      int measuredWidt = childAt.getMeasuredWidth();
                      measuredHeig = childAt.getMeasuredHeight();
                      if (i) {
                         i2 = kwaiFoldAvat + this.e;
                         measuredWidt = measuredWidt + i2;
                      }
                      if (i) {
                         i1 = i1 + this.f;
                         measuredHeig = measuredHeig + i1;
                      }
                      i1 = measuredHeig;
                      kwaiFoldAvat = measuredWidt;
                   }
                   i = i + 1;
                }
                if (mode1 != 0x40000000) {
                   size1 = (this.getPaddingLeft() + kwaiFoldAvat) + this.getPaddingRight();
                }
                if (mode != 0x40000000) {
                   size = (this.getPaddingTop() + i1) + this.getPaddingBottom();
                }
                this.setMeasuredDimension(size1, size);
             }
          }else if(PatchProxy.isSupport(KwaiFoldAvatarLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiFoldAvatarLayout.class, "4")){
             size = View$MeasureSpec.getSize(p1);
             mode = View$MeasureSpec.getMode(p1);
             mode1 = View$MeasureSpec.getMode(p0);
             size1 = View$MeasureSpec.getSize(p0);
             childCount = this.getChildCount();
             i2 = 0;
             i1 = 0;
             while (i < childCount) {
                childAt = this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                   this.measureChild(childAt, p0, p1);
                   i2 = childAt.getMeasuredWidth();
                   measuredHeig = childAt.getMeasuredHeight();
                   if (!i) {
                      i1 = measuredHeig;
                   }else {
                      i1 = i1 + this.f;
                      i1 = i1 + measuredHeig;
                   }
                }
                i = i + 1;
             }
             if (mode1 != 0x40000000) {
                size1 = (this.getPaddingLeft() + i2) + this.getPaddingRight();
             }
             if (mode != 0x40000000) {
                size = (this.getPaddingTop() + i1) + this.getPaddingBottom();
             }
             this.setMeasuredDimension(size1, size);
          }
       }else if(PatchProxy.isSupport(KwaiFoldAvatarLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiFoldAvatarLayout.class, "3")){
          size = View$MeasureSpec.getSize(p1);
          mode = View$MeasureSpec.getMode(p1);
          mode1 = View$MeasureSpec.getMode(p0);
          size1 = View$MeasureSpec.getSize(p0);
          childCount = this.getChildCount();
          i2 = 0;
          i1 = 0;
          while (i < childCount) {
             childAt = this.getChildAt(i);
             if (childAt.getVisibility() != 8) {
                this.measureChild(childAt, p0, p1);
                i1 = childAt.getMeasuredWidth();
                measuredHeig = childAt.getMeasuredHeight();
                if (i) {
                   i2 = i2 + this.e;
                   i1 = i1 + i2;
                }
                i2 = i1;
                i1 = measuredHeig;
             }
             i = i + 1;
          }
          if (mode1 != 0x40000000) {
             size1 = (this.getPaddingLeft() + i2) + this.getPaddingRight();
          }
          if (mode != 0x40000000) {
             size = (this.getPaddingTop() + i1) + this.getPaddingBottom();
          }
          this.setMeasuredDimension(size1, size);
       }
       return;
    }
}
