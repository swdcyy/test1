package com.kwai.library.widget.textview.IconifyRadioButtonNew;
import com.yxcorp.gifshow.widget.c$a;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;

public class IconifyRadioButtonNew extends IconifyTextViewNew implements c$a	// class@000a3d
{
    public int Y0;
    public boolean Z0;
    public float a1;
    public float b1;

    public void IconifyRadioButtonNew(Context p0){
       super(p0, null);
    }
    public void IconifyRadioButtonNew(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void IconifyRadioButtonNew(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.n1);
       this.a1 = (float)typedArray.getDimensionPixelSize(2, 0);
       this.b1 = (float)typedArray.getDimensionPixelSize(3, 0);
       this.N = typedArray.getDimensionPixelSize(8, 0);
       this.O = typedArray.getBoolean(0, 0);
       this.setTextSize((float)typedArray.getDimensionPixelSize(7, n.c(p0, 17.00f)));
       ColorStateList colorStateLi = typedArray.getColorStateList(6);
       if (colorStateLi == null) {
          this.setTextColor(p0.getResources().getColor(R.color.arg_RES_7f062161));
       }else {
          this.setTextColor(colorStateLi);
       }
       this.setTypeface(Typeface.DEFAULT_BOLD);
       typedArray.recycle();
       return;
    }
    public float getMaxTextSize(){
       return this.a1;
    }
    public float getMinTextSize(){
       return this.b1;
    }
    public void setChecked(boolean p0){
       this.refreshDrawableState();
    }
    public void setNumber(int p0){
       if (this.Z0 == null && this.Y0 != p0) {
          this.Y0 = p0;
          if (!p0) {
             this.c();
             this.a();
          }else {
             this.a();
             this.h();
          }
       }
       return;
    }
    public void setUseLiveIcon(boolean p0){
       if (this.Z0 == p0) {
          return;
       }
       this.Z0 = p0;
       if (p0) {
          this.c();
          this.e();
       }else {
          this.a();
       }
       return;
    }
}
