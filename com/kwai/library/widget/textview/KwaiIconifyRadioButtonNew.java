package com.kwai.library.widget.textview.KwaiIconifyRadioButtonNew;
import com.yxcorp.gifshow.widget.c$a;
import com.kwai.library.widget.textview.KwaiIconifyTextViewNew;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.lang.CharSequence;
import android.text.TextPaint;
import h27.h;
import java.lang.Runnable;
import ekd.k1;
import java.lang.String;
import android.view.View;

public class KwaiIconifyRadioButtonNew extends KwaiIconifyTextViewNew implements c$a	// class@000a4e
{
    public int U;
    public float U0;
    public boolean V;
    public float W;
    public static final int V0;

    public void KwaiIconifyRadioButtonNew(Context p0){
       super(p0, null);
    }
    public void KwaiIconifyRadioButtonNew(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiIconifyRadioButtonNew(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.n1);
       this.W = (float)typedArray.getDimensionPixelSize(2, 0);
       this.U0 = (float)typedArray.getDimensionPixelSize(3, 0);
       this.F = typedArray.getDimensionPixelSize(8, 0);
       this.G = typedArray.getBoolean(0, 0);
       this.setContentTextSize((float)typedArray.getDimensionPixelSize(7, n.c(p0, 17.00f)));
       ColorStateList colorStateLi = typedArray.getColorStateList(6);
       if (colorStateLi == null) {
          this.setContentTextColor(p0.getResources().getColor(R.color.arg_RES_7f062161));
       }else {
          this.setContentTextColor(colorStateLi);
       }
       this.setTypeface(Typeface.DEFAULT_BOLD);
       typedArray.recycle();
       return;
    }
    public float getMaxTextSize(){
       return this.W;
    }
    public float getMinTextSize(){
       return this.U0;
    }
    public CharSequence getText(){
       return this.getContentText();
    }
    public TextPaint getTextPaint(){
       return this.getContentTextPaint();
    }
    public void l(int p0,boolean p1){
       int i;
       if (this.U == p0) {
          return;
       }
       this.U = p0;
       if (p0 <= 0) {
          if (p1) {
             k1.r(new h(this), 1000);
          }else {
             this.c();
          }
       }else if(p0 < 10){
          i = 4;
       }else {
          i = 2;
       }
       String str = (p0 > 99)? "99+": String.valueOf(p0);
       this.B = str;
       this.M = (float)n.c(this.getContext(), (float)i);
       this.requestLayout();
       this.invalidate();
       this.i();
       this.invalidate();
       return;
    }
    public void setChecked(boolean p0){
       this.refreshDrawableState();
    }
    public void setNumber(int p0){
       if (this.V == null && this.U != p0) {
          this.U = p0;
          if (!p0) {
             this.d();
             this.b();
          }else {
             this.b();
             this.j();
          }
       }
       return;
    }
    public void setUseLiveIcon(boolean p0){
       if (this.V == p0) {
          return;
       }
       this.V = p0;
       if (p0) {
          this.d();
          this.h();
       }else {
          this.b();
       }
       return;
    }
}
