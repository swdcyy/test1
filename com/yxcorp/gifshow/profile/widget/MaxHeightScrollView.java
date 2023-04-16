package com.yxcorp.gifshow.profile.widget.MaxHeightScrollView;
import android.widget.ScrollView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class MaxHeightScrollView extends ScrollView	// class@0015f7
{
    public int b;
    public boolean c;
    public static final int d;

    static {
       MaxHeightScrollView.d = a1.e(150.00f);
    }
    public void MaxHeightScrollView(Context p0){
       super(p0, null);
    }
    public void MaxHeightScrollView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MaxHeightScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (this.isInEditMode() || (!PatchProxy.applyVoidTwoRefs(p0, p1, this, MaxHeightScrollView.class, "1") && p1 != null)) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i3);
          this.b = typedArray.getDimensionPixelSize(0, MaxHeightScrollView.d);
          typedArray.recycle();
       }
    label_0028 :
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ViewParent obj = PatchProxy.applyOneRefs(p0, this, MaxHeightScrollView.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.getParent();
       View obj1 = PatchProxy.apply(null, this, MaxHeightScrollView.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = 0;
          obj1 = this.getChildAt(b);
          if (obj1 != null && this.getHeight() < obj1.getHeight()) {
             b = true;
          }
       }
       obj.requestDisallowInterceptTouchEvent(b);
       return super.dispatchTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MaxHeightScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MaxHeightScrollView.class, "3")) {
          return;
       }
       if (this.c == null) {
          p1 = View$MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void setDisableMaxHeight(boolean p0){
       if (PatchProxy.isSupport(MaxHeightScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MaxHeightScrollView.class, "2")) {
          return;
       }
       if (this.c != p0) {
          this.requestLayout();
       }
       this.c = p0;
       return;
    }
}
