package com.kuaishou.live.core.voiceparty.playway.shared.widget.GiftCounterView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Rect;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;

public class GiftCounterView extends AppCompatTextView	// class@001895
{
    public int f;
    public int g;
    public Drawable h;
    public boolean i;
    public float j;
    public int k;
    public float l;
    public int m;

    public void GiftCounterView(Context p0){
       super(p0, null);
    }
    public void GiftCounterView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GiftCounterView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = -1;
       this.f = p2;
       this.g = p2;
       this.i = false;
       this.j = 0;
       this.k = 0;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GiftCounterView.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.X0);
          this.f = typedArray.getDimensionPixelSize(3, p2);
          this.g = typedArray.getDimensionPixelSize(2, p2);
          this.h = typedArray.getDrawable(1);
          this.j = this.getTextSize();
          this.k = this.getCurrentTextColor();
          this.i = typedArray.getBoolean(false, false);
          this.l = typedArray.getFloat(4, 0x3f4ccccd);
          this.m = typedArray.getInt(5, 3);
          typedArray.recycle();
          this.setIncludeFontPadding(false);
          this.setGravity(17);
          this.setSingleLine();
          this.setCompoundDrawablesWithIntrinsicBounds(this.h, null, null, null);
          Drawable background = this.getBackground();
          if (background instanceof ColorDrawable) {
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setColor(background.getColor());
             gradientDraw.setCornerRadius(1000.00f);
             this.setBackgroundDrawable(gradientDraw);
          }
       }
       return;
    }
    public int getIconHeight(){
       return this.g;
    }
    public int getIconWidth(){
       return this.f;
    }
    public final void p(Drawable[] p0){
       float f3;
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftCounterView.class, "10")) {
          return;
       }
       if (this.f > null || this.g > null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null) {
                Rect bounds = oobject.getBounds();
                float f = (float)bounds.height() / (float)bounds.width();
                float f1 = (float)bounds.width();
                float f2 = (float)bounds.height();
                GiftCounterView tf = this.f;
                if (tf > null) {
                   f3 = (float)tf;
                   if (f1 - f3 > 0) {
                      f2 = f3 * f;
                      f1 = f3;
                   }
                }
                tf = this.g;
                if (tf > null) {
                   f3 = (float)tf;
                   if (f2 - f3 > 0) {
                      f1 = f3 / f;
                      f2 = f3;
                   }
                }
                int i1 = bounds.left + Math.round(f1);
                bounds.right = i1;
                i1 = bounds.top + Math.round(f2);
                bounds.bottom = i1;
                oobject.setBounds(bounds);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, GiftCounterView.class, "7")) {
          return;
       }
       Drawable[] uDrawableArr = new Drawable[]{p0,p1,p2,p3};
       this.p(uDrawableArr);
       super.setCompoundDrawables(uDrawableArr[0], uDrawableArr[1], uDrawableArr[2], uDrawableArr[3]);
       return;
    }
    public void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, GiftCounterView.class, "8")) {
          return;
       }
       Drawable[] uDrawableArr = new Drawable[]{p0,p1,p2,p3};
       this.p(uDrawableArr);
       super.setCompoundDrawablesRelative(uDrawableArr[0], uDrawableArr[1], uDrawableArr[2], uDrawableArr[3]);
       return;
    }
    public void setEnableTextScale(boolean p0){
       this.i = p0;
    }
    public void setIsShowIcon(boolean p0){
       if (PatchProxy.isSupport(GiftCounterView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GiftCounterView.class, "5")) {
          return;
       }
       if (p0) {
          this.setCompoundDrawablesWithIntrinsicBounds(this.h, null, null, null);
       }else {
          this.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
       }
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GiftCounterView.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, GiftCounterView.class, "9") && (this.j - null && this.i != null)) {
          if (p0.length() <= this.m) {
             this.setTextSize(0, this.j);
          }else {
             this.setTextSize(0, (this.j * this.l));
          }
       }
       super.setText(p0, p1);
       return;
    }
}
