package com.yxcorp.gifshow.widget.density.KwaiDrawableScaleTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import bzc.a;
import android.widget.TextView;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;

public class KwaiDrawableScaleTextView extends AppCompatTextView	// class@001970
{
    public a f;

    public void KwaiDrawableScaleTextView(Context p0){
       super(p0, null);
    }
    public void KwaiDrawableScaleTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiDrawableScaleTextView(Context p0,AttributeSet p1,int p2){
       boolean booleanx;
       super(p0, p1, p2);
       p2 = 0;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.I1);
          booleanx = typedArray.getBoolean(p2, p2);
          typedArray.recycle();
       }else {
          booleanx = false;
       }
       a uoa = new a(this);
       this.f = uoa;
       uoa.b = booleanx;
       if (booleanx && uoa.a.getContext().getResources().getConfiguration().fontScale - 0x3f800000) {
          Drawable[] compoundDraw = uoa.a.getCompoundDrawables();
          Drawable[] compoundDraw1 = uoa.a.getCompoundDrawablesRelative();
          uoa.a.setCompoundDrawables(compoundDraw[p2], compoundDraw[1], compoundDraw[2], compoundDraw[3]);
          uoa.a.setCompoundDrawablesRelative(compoundDraw1[p2], compoundDraw1[1], compoundDraw1[2], compoundDraw1[3]);
       }
       return;
    }
    public void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       KwaiDrawableScaleTextView tf = this.f;
       if (tf != null) {
          tf.b(p0, p1, p2, p3);
       }
       super.setCompoundDrawables(p0, p1, p2, p3);
       return;
    }
    public void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       KwaiDrawableScaleTextView tf = this.f;
       if (tf != null) {
          tf.b(p0, p1, p2, p3);
       }
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       return;
    }
    public void setFollowFontScale(boolean p0){
       this.f.b = p0;
       this.invalidate();
    }
}
