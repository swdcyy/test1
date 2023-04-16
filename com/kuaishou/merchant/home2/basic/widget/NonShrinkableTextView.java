package com.kuaishou.merchant.home2.basic.widget.NonShrinkableTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import java.lang.Math;

public final class NonShrinkableTextView extends AppCompatTextView	// class@0016f4
{
    public int f;
    public HashMap g;

    public void NonShrinkableTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NonShrinkableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NonShrinkableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void NonShrinkableTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NonShrinkableTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NonShrinkableTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = Math.max(this.getMeasuredWidth(), this.f);
       this.f = p0;
       this.setMeasuredDimension(p0, this.getMeasuredHeight());
       return;
    }
}
