package com.facebook.yoga.android.YogaLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.SparseArray;
import java.lang.Float;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.util.TypedValue;
import java.lang.String;

public class YogaLayout$LayoutParams extends ViewGroup$LayoutParams	// class@001464
{
    public SparseArray a;
    public SparseArray b;

    public void YogaLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = new SparseArray();
       this.b = new SparseArray();
       if (p0 >= 0) {
          this.a.put(55, Float.valueOf((float)p0));
       }
       if (p1 >= 0) {
          this.a.put(20, Float.valueOf((float)p1));
       }
       return;
    }
    public void YogaLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = new SparseArray();
       this.b = new SparseArray();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.t6);
       ViewGroup$LayoutParams twidth = this.width;
       if (twidth >= null) {
          this.a.put(55, Float.valueOf((float)twidth));
       }
       twidth = this.height;
       if (twidth >= null) {
          this.a.put(20, Float.valueOf((float)twidth));
       }
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          TypedValue typedValue = new TypedValue();
          typedArray.getValue(index, typedValue);
          typedValue = typedValue.type;
          if (typedValue == 5) {
             this.a.put(index, Float.valueOf((float)typedArray.getDimensionPixelSize(index, 0)));
          }else if(typedValue == 3){
             this.b.put(index, typedArray.getString(index));
          }else {
             this.a.put(index, Float.valueOf(typedArray.getFloat(index, 0)));
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
    public void YogaLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       if (p0 instanceof YogaLayout$LayoutParams) {
          this.a = p0.a.clone();
          this.b = p0.b.clone();
       }else {
          this.a = new SparseArray();
          this.b = new SparseArray();
          if (p0.width >= null) {
             this.a.put(55, Float.valueOf((float)this.width));
          }
          if (p0.height >= null) {
             this.a.put(20, Float.valueOf((float)this.height));
          }
       }
       return;
    }
}
