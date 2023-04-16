package com.kuaishou.live.preview.item.view.LivePreviewOverlayAvatarView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import com.yxcorp.gifshow.model.CDNUrl;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LivePreviewOverlayAvatarView extends ViewGroup	// class@000e56
{
    public Context b;
    public LayoutInflater c;
    public int d;
    public int e;
    public int f;

    public void LivePreviewOverlayAvatarView(Context p0){
       super(p0, null);
    }
    public void LivePreviewOverlayAvatarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePreviewOverlayAvatarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePreviewOverlayAvatarView.class, "1")) {
       }else {
          this.b = p0;
          this.c = LayoutInflater.from(p0);
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.U2);
          if (typedArray != null) {
             this.e = typedArray.getInteger(1, 3);
             this.d = typedArray.getDimensionPixelOffset(2, a1.e(7.00f));
             this.f = typedArray.getDimensionPixelOffset(0, a1.e(10.00f));
             typedArray.recycle();
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       LivePreviewOverlayAvatarView tf;
       if (PatchProxy.isSupport(LivePreviewOverlayAvatarView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LivePreviewOverlayAvatarView.class, "3")) {
             return;
          }
       }
       int childCount = this.getChildCount();
       p1 = childCount - 1;
       p3 = 0;
       p4 = 0;
       for (p2 = p1; p2 >= 0; p2--) {
          int i = childCount - p2;
          i = i - 1;
          View childAt = this.getChildAt(i);
          int measuredWidt = childAt.getMeasuredWidth();
          int measuredHeig = childAt.getMeasuredHeight();
          if (p2 == p1) {
             p3 = p3 + measuredWidt;
             tf = this.f;
             int i1 = tf * p2;
             p3 = p3 + i1;
             measuredWidt = tf * p2;
             p4 = p4 + measuredWidt;
          }else {
             tf = this.f;
             p3 = p3 - tf;
             p4 = p4 - tf;
          }
          childAt.layout(p4, 0, p3, measuredHeig);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LivePreviewOverlayAvatarView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LivePreviewOverlayAvatarView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       int size = View$MeasureSpec.getSize(p1);
       int mode = View$MeasureSpec.getMode(p1);
       int mode1 = View$MeasureSpec.getMode(p0);
       int size1 = View$MeasureSpec.getSize(p0);
       int childCount = this.getChildCount();
       int i1 = 0;
       int i2 = 0;
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = this.getChildAt(i);
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          LivePreviewOverlayAvatarView td = this.d;
          int i3 = td * 2;
          layoutParams.width = i3;
          int i4 = td * 2;
          layoutParams.height = i4;
          childAt.setLayoutParams(layoutParams);
          this.measureChild(childAt, p0, p1);
          int measuredWidt = childAt.getMeasuredWidth();
          int measuredHeig = childAt.getMeasuredHeight();
          if (i < this.e) {
             if (i) {
                measuredWidt = this.f;
             }
             i1 = i1 + measuredWidt;
          }
          i2 = Math.max(i2, measuredHeig);
       }
       if (mode1 != 0x40000000) {
          size1 = i1;
       }
       if (mode != 0x40000000) {
          size = i2;
       }
       this.setMeasuredDimension(size1, size);
       return;
    }
    public void setData(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewOverlayAvatarView.class, "4")) {
          return;
       }
       if (p0 != null && p0.length) {
          this.removeAllViews();
          for (int i = Math.min(p0.length, this.e) - 1; i >= 0; i = i - 1) {
             KwaiImageView kwaiImageVie = a.c(this.c, R.layout.arg_RES_7f0d0d41, this, false);
             CDNUrl[] uCDNUrlArray = new CDNUrl[]{p0[i]};
             kwaiImageVie.U(uCDNUrlArray);
             this.addView(kwaiImageVie);
          }
       }
       return;
    }
}
