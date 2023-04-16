package com.yxcorp.gifshow.profile.widget.ProfileEntranceLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public class ProfileEntranceLinearLayout extends LinearLayout	// class@0015f8
{
    public int b;
    public int c;

    public void ProfileEntranceLinearLayout(Context p0){
       super(p0);
       this.c = 1;
    }
    public void ProfileEntranceLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 1;
       this.a(p0, p1, 0);
    }
    public void ProfileEntranceLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 1;
       this.a(p0, p1, p2);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       if (PatchProxy.isSupport(ProfileEntranceLinearLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ProfileEntranceLinearLayout.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.p4, p2, 0);
       this.b = typedArray.getDimensionPixelSize(1, 0);
       this.c = Math.max(typedArray.getInteger(0, 1), 1);
       typedArray.recycle();
       return;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, ProfileEntranceLinearLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.min(this.getChildCount(), this.c);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ProfileEntranceLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProfileEntranceLinearLayout.class, "2")) {
          return;
       }
       if (this.getOrientation()) {
          super.onMeasure(p0, p1);
       }else if(PatchProxy.isSupport(ProfileEntranceLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProfileEntranceLinearLayout.class, "3")){
          p0 = LinearLayout.resolveSizeAndState(View$MeasureSpec.getSize(p0), p0, 0);
          int i = ((p0 - this.getPaddingLeft()) - this.getPaddingRight()) - ((this.b() - 1) * this.b);
          if (this.b() > 0) {
             i = i / this.b();
          }
          int i1 = 0;
          int i2 = 0;
          while (i1 < this.getChildCount()) {
             View childAt = this.getChildAt(i1);
             if (childAt.getVisibility() != 8) {
                LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
                int i3 = layoutParams.topMargin + layoutParams.bottomMargin;
                childAt.measure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), LinearLayout.getChildMeasureSpec(p1, i3, layoutParams.height));
                ProfileEntranceLinearLayout tb = (i1 > 0)? this.b: 0;
                layoutParams.leftMargin = tb;
                layoutParams.rightMargin = 0;
                int i4 = childAt.getMeasuredHeight() + layoutParams.topMargin;
                i4 = i4 + layoutParams.bottomMargin;
                i2 = Math.max(i2, i4);
             }
             i1 = i1 + 1;
          }
          this.setMeasuredDimension(p0, i2);
       }
       return;
    }
    public void setItemMargin(int p0){
       if (PatchProxy.isSupport(ProfileEntranceLinearLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfileEntranceLinearLayout.class, "4")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
}
