package com.yxcorp.gifshow.detail.view.PriorityLinearLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;

public class PriorityLinearLayout$LayoutParams extends LinearLayout$LayoutParams	// class@001a4d
{
    public int a;

    public void PriorityLinearLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = 0;
    }
    public void PriorityLinearLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PriorityLinearLayout$LayoutParams.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o4);
          if (typedArray != null) {
             this.a = typedArray.getInt(0, 0);
             typedArray.recycle();
          }
       }
       return;
    }
}
